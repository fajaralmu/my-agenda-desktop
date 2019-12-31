/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.desktop.myagenda.utils;

import com.fajar.desktop.myagenda.Agenda;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.VerticalAlignment;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 

/**
 *
 * @author fajar
 */
public class ReportUtil {

    public static void printReport(JTable tabel) throws WriteException, IOException {
        String title = JOptionPane.showInputDialog("Masukkan nama file");
        if (title == "") {
            title = "tabel";
        }
        String f = title + ".xls";
        WritableWorkbook wb;

        WritableCellFormat commonFormat = new WritableCellFormat();
        commonFormat.setBorder(Border.ALL, BorderLineStyle.THIN);
        commonFormat.setAlignment(Alignment.CENTRE);
        commonFormat.setVerticalAlignment(VerticalAlignment.CENTRE);

        wb = Workbook.createWorkbook(new File(f));
        WritableSheet sheet = wb.createSheet("tabel", 0);
        int columnSize = tabel.getColumnCount();
        int rowSize = tabel.getRowCount();
        for (int col = 0; col < columnSize; col++) {
            Label label = new Label(col + 2, 3, tabel.getColumnName(col));
            label.setCellFormat(commonFormat);
            sheet.addCell(label);
        }
        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < columnSize; col++) {
                if (tabel.getValueAt(row, col) instanceof Number) {
                    jxl.write.Number n;
                    if (tabel.getValueAt(row, col).getClass().equals(Double.class)) {
                        n = new jxl.write.Number(col + 2, row + 4, (Double) tabel.getValueAt(row, col));

                    } else {
                        n = new jxl.write.Number(col + 2, row + 4, (Integer) tabel.getValueAt(row, col));
                    }
                    n.setCellFormat(commonFormat);
                    sheet.addCell(n);
                } else {
                    String val = tabel.getValueAt(row, col) == null ? "" : tabel.getValueAt(row, col).toString();
                    Label label = new Label(col + 2, row + 4, val);
                    label.setCellFormat(commonFormat);
                    sheet.addCell(label);
                }
            }
        }

        wb.write();
        wb.close();
        if (Desktop.isDesktopSupported()) {
            File myFile = new File(f);
            Desktop.getDesktop().open(myFile);
        }
    }

    public static List<Agenda> loadAgenda(String namaFile) {

        FileInputStream file = null;
        List<Agenda> agendaList = new ArrayList<Agenda>();

        try {
            file = new FileInputStream(new File( namaFile));
            //Create Workbook instance holding reference to .xlsx file
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            //Get first/desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            //Iterate through each rows one by one

            Iterator<Row> rowIterator = sheet.iterator();
            int colId = 3, columnForDuration = 5, columnForName = 7;
            int indexRow = 0;
            int currentAgendaId = 0;
            while (rowIterator.hasNext()) {
                indexRow++;
                Row row = rowIterator.next();
                if(indexRow==1){
                    row = rowIterator.next();
                }
                if (indexRow > 0) {
                    
                    Cell cellForId = row.getCell(colId);
                    Cell cellForDuration = row.getCell(columnForDuration);
                    Cell cellForName = row.getCell(columnForName);

                    String nama = cellForName.getStringCellValue();
                    int id_int = (int)(cellForId.getNumericCellValue());
                    int dur_int = (int)(cellForDuration.getNumericCellValue());
                    Agenda k = new Agenda(id_int, dur_int, nama);
                    if (indexRow > 1) {
                        k.setPreviousId(currentAgendaId);
                    }
                    currentAgendaId =  id_int;
                    agendaList.add(k);
                    System.out.println("k: "+k);
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(ReportUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(ReportUtil.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                file.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(ReportUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return agendaList;

    }

}
