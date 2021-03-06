/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.desktop.myagenda.gui;

import com.fajar.desktop.myagenda.Agenda;
import com.fajar.desktop.myagenda.App;
import com.fajar.desktop.myagenda.utils.ReportUtil;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import jxl.write.WriteException;

/**
 *
 * @author fajar
 */
public class MyAgenda extends javax.swing.JFrame {

    /**
     * Creates new form AcaraPanitia
     */
//    private List<Agenda> agendaList = new ArrayList<>();
//    private boolean isAddNew = true;
//    private Agenda selectedAgenda = new Agenda();
//    private int beginningHour = 0, beginningMinute = 0;
//    private int currentHour = 0, currentMinute = 0;
//    private int durationHour = 0, durationMinute = 0;
//    private String loadedExcelFilePath = "";
    private final App app = new App();
    DefaultTableModel model;

    public MyAgenda() {
        initComponents();
        initBeginningTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxHour = new javax.swing.JComboBox<>();
        comboBoxMinute = new javax.swing.JComboBox<>();
        textBoxDuration = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textBoxAgendaName = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_update_mulai = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        comboBoxPrevious = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        textBoxDurationHour = new javax.swing.JTextField();
        textBoxDurationMinute = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtFilePath = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        agendaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rundown");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Durasi ");

        jLabel2.setText("Mulai");

        comboBoxHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        comboBoxHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHourActionPerformed(evt);
            }
        });

        comboBoxMinute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        comboBoxMinute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxMinuteActionPerformed(evt);
            }
        });

        textBoxDuration.setEnabled(false);
        textBoxDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBoxDurationActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Kegiatan*");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_tambah.setText("Tambah Baru");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_update_mulai.setText("Ok");
        btn_update_mulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_mulaiActionPerformed(evt);
            }
        });

        jButton1.setText("Hapus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        comboBoxPrevious.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none" }));
        comboBoxPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPreviousActionPerformed(evt);
            }
        });

        jLabel5.setText("Kegiatan Sebelumnya");

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        textBoxDurationHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBoxDurationHourKeyReleased(evt);
            }
        });

        textBoxDurationMinute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textBoxDurationMinuteKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("jam");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("min");

        jButton3.setText("Cetak");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Load Excel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("min");

        jButton5.setText("Pilih File");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("File Path");

        txtFilePath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_simpan)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32)
                                .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBoxHour, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textBoxDurationHour, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textBoxDurationMinute, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(comboBoxMinute, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textBoxDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addComponent(btn_update_mulai, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBoxPrevious, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textBoxAgendaName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(comboBoxHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_update_mulai))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(textBoxDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textBoxDurationHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textBoxDurationMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(9, 9, 9))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(27, 27, 27)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textBoxAgendaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_simpan)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jLabel8)
                    .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        agendaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        agendaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agendaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(agendaTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void textBoxDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBoxDurationActionPerformed

    }//GEN-LAST:event_textBoxDurationActionPerformed

    private void replacePrev(Agenda move, Agenda previousAgenda) {

        int idPrevOld = move.getPreviousId();
        Agenda oldPredecessor = app.getAgendaByPrevId(move.getId());
        System.out.println("MOVE " + move);
        System.out.println("has prev " + previousAgenda);
        System.out.println("OLD SUCCESSOR " + oldPredecessor);
        if (oldPredecessor != null) {
            oldPredecessor.setPreviousId(idPrevOld);
        }

        if (previousAgenda != null) {
            move.setPreviousId(previousAgenda.getPreviousId());
            previousAgenda.setPreviousId(move.getId());

        }

        System.out.println("--new move " + move);
        System.out.println("--new hasprev " + previousAgenda);
        System.out.println("--new oldSuccessor " + oldPredecessor);

        for (Agenda k : app.getAgendaList()) {
            if (k.getId().equals(move.getId())) {
                k = move;
            } else if (previousAgenda != null && k.getId().equals(previousAgenda.getId())) {
                k = previousAgenda;
            } else if (oldPredecessor != null && k.getId().equals(oldPredecessor.getId())) {
                k = oldPredecessor;
            }
        }

    }

    private void saveNewAgenda() {

        int newAgendaId = 1000 + new Random().nextInt(9000);
        if (app.isAddNew()) {
            app.getSelectedAgenda().setId(newAgendaId);
        }
        int durasi;
        try {
            durasi = Integer.parseInt(textBoxDuration.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
            durasi = 0;
        }
        String agendaName = textBoxAgendaName.getText();
        Agenda prev = app.getAgendaByName(comboBoxPrevious.getSelectedItem().toString());
        if (prev != null && prev.getId().equals(app.getSelectedAgenda().getId())) {
            JOptionPane.showMessageDialog(null, "Pilih kegiatan lain");
            return;
        }
        int idPrev = prev == null ? 0 : prev.getId();
        Agenda hasPrev = app.getAgendaByPrevId(idPrev);

        if (hasPrev != null && app.selectedAgenda.getPreviousId() != idPrev) {
            replacePrev(app.selectedAgenda, hasPrev);
        } else if (hasPrev == null && app.getAgendaByPrevId(app.selectedAgenda.getId()) != null) {
            replacePrev(app.selectedAgenda, hasPrev);
        }

        if (app.isAddNew()) {
            app.selectedAgenda = new Agenda(newAgendaId, durasi, agendaName);
            app.selectedAgenda.setPreviousId(idPrev);
            if (idPrev == 0 && app.getAgendaByPrevId(0) != null) {
                replacePrev(app.selectedAgenda, app.getAgendaByPrevId(0));
            }
            if (!app.checkNameAvailability(app.selectedAgenda)) {
                JOptionPane.showConfirmDialog(null, "Nama tidak boleh sama !");
                return;
            }
            app.getAgendaList().add(app.selectedAgenda);
        } else {
            app.selectedAgenda.setDuration(durasi);
            app.selectedAgenda.setAgendaName(agendaName);
            app.selectedAgenda.setPreviousId(idPrev);
            if (!app.checkNameAvailability(app.selectedAgenda)) {
                JOptionPane.showConfirmDialog(null, "Nama tidak boleh sama !");
                return;
            }
            app.updateAgenda(app.selectedAgenda);
            app.setAddNew(true);
        }
        resetField();
        refreshTable(app.getAgendaList());
    }

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed

        saveNewAgenda();

    }//GEN-LAST:event_btn_simpanActionPerformed

    private void resetField() {
        textBoxDurationHour.setText("0");
        textBoxDurationMinute.setText("0");
        textBoxDuration.setText("0");

        app.setDurationHour(0);
        app.setDurationMinute(0);

        textBoxAgendaName.setText("");
        app.selectedAgenda = new Agenda();
    }

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed

        app.setAddNew(true);
        resetField();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void agendaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agendaTableMouseClicked

        int row = agendaTable.getSelectedRow();
        int id = Integer.parseInt(agendaTable.getModel().getValueAt(row, 1).toString());
        setSelectedAgenda(id);
    }//GEN-LAST:event_agendaTableMouseClicked

    private void comboBoxHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHourActionPerformed

        app.setBeginningHour(Integer.parseInt(comboBoxHour.getSelectedItem().toString()));

    }//GEN-LAST:event_comboBoxHourActionPerformed

    private void comboBoxMinuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxMinuteActionPerformed

        app.setBeginningMinute(Integer.parseInt(comboBoxMinute.getSelectedItem().toString()));
    }//GEN-LAST:event_comboBoxMinuteActionPerformed

    private void btn_update_mulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_mulaiActionPerformed
        refresh();

    }//GEN-LAST:event_btn_update_mulaiActionPerformed

    private void refresh() {
        refreshTable(app.getAgendaList());
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        deleteSelectedAgenda();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteSelectedAgenda() {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to delete agenda?");
        if (confirm == 0) {
            app.deleteSelectedAgenda();
            refresh();
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clear() {
        app.getAgendaList().clear();
        refresh();
    }

    private void updateGUIDuration() {
        Integer durationInMinute = app.getDurationHour() * 60 + app.getDurationMinute();
        textBoxDuration.setText(durationInMinute.toString());
    }

    private void textBoxDurationHourKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxDurationHourKeyReleased

        setDurationHour(textBoxDurationHour.getText());
    }//GEN-LAST:event_textBoxDurationHourKeyReleased

    private void setDurationHour(String duration) {
        app.setDurationHour(duration.equals("") ? 0 : Integer.parseInt(duration));
        updateGUIDuration();
    }

    private void setDurationMinute(String duration) {
        app.setDurationMinute(duration.equals("") ? 0 : Integer.parseInt(duration));
        updateGUIDuration();
    }

    private void textBoxDurationMinuteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBoxDurationMinuteKeyReleased

        setDurationMinute(textBoxDurationMinute.getText());
    }//GEN-LAST:event_textBoxDurationMinuteKeyReleased

    private void comboBoxPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPreviousActionPerformed

    }//GEN-LAST:event_comboBoxPreviousActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            ReportUtil.printReport(agendaTable);
        } catch (WriteException | IOException ex) {
            Logger.getLogger(MyAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        loadAgenda();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        chooseFileToLoad();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyAgenda().setVisible(true);
            }
        });

    }

    private void updateComboBox(List<Agenda> agendas) {
        comboBoxPrevious.removeAllItems();
        comboBoxPrevious.addItem("none");
        for (Agenda k : agendas) {
            comboBoxPrevious.addItem(k.getAgendaName());

        }
    }

    private void refreshTable(List<Agenda> agendas) {
        for (Agenda k : agendas) {
            System.out.println(k);
        }
        System.out.println("---------tabel---------");
        model = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "No", "Id", "Mulai", "Durasi(Menit)", "Selesai", "Nama", "Prev"
                }
        );
        int no = 0;
        app.setCurrentHour(app.getBeginningHour());
        app.setCurrentMinute(app.getBeginningMinute());
        Agenda currentAgenda = new Agenda();
        for (int i = 0; i < agendas.size(); i++) {
            System.out.print("i " + i + ". ");
            if (i == 0) {
                currentAgenda = app.getAgendaByPrevId(0);
            } else {
                int idPrev = currentAgenda.getId();
                currentAgenda = app.getAgendaByPrevId(idPrev);
            }
            System.out.println(currentAgenda);

            Object[] o = new Object[8];
            no++;
            o[0] = no;
            o[1] = currentAgenda.getId();
            o[2] = app.getCurrentHour() + ":" + app.getCurrentMinute();
            o[3] = app.updateHourAndMinute(currentAgenda.getDuration());
            o[4] = app.getCurrentHour() + ":" + app.getCurrentMinute();
            o[5] = currentAgenda.getAgendaName();
            Agenda prev = app.getAgendaById(currentAgenda.getPreviousId());

            o[6] = currentAgenda.getPreviousId() != 0 ? prev.getAgendaName() : "-";

            model.addRow(o);
            // System.out.println(o);
        }
        agendaTable.setModel(model);
        updateComboBox(agendas);
    }

    private void initBeginningTime() {
        for (Integer i = 1; i <= 23; i++) {
            comboBoxHour.addItem(i.toString());
        }
        for (Integer i = 1; i <= 59; i++) {
            comboBoxMinute.addItem(i.toString());
        }
        resetField();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable agendaTable;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_update_mulai;
    private javax.swing.JComboBox<String> comboBoxHour;
    private javax.swing.JComboBox<String> comboBoxMinute;
    private javax.swing.JComboBox<String> comboBoxPrevious;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField textBoxAgendaName;
    private javax.swing.JTextField textBoxDuration;
    private javax.swing.JTextField textBoxDurationHour;
    private javax.swing.JTextField textBoxDurationMinute;
    private javax.swing.JTextField txtFilePath;
    // End of variables declaration//GEN-END:variables

    private void setSelectedAgenda(int id) {
        app.selectedAgenda = app.getAgendaById(id);
        if (app.selectedAgenda != null) {
            app.setAddNew(false);
            app.setDurationHour(app.selectedAgenda.getDuration() / 60);
            app.setDurationMinute(app.selectedAgenda.getDuration() % 60);
            textBoxDurationHour.setText(String.valueOf(app.getDurationHour()));
            textBoxDurationMinute.setText(String.valueOf(app.getDurationMinute()));
            textBoxDuration.setText(app.selectedAgenda.getDuration().toString());
            textBoxAgendaName.setText(app.selectedAgenda.getAgendaName());
            int idPrev = app.selectedAgenda.getPreviousId();

            Agenda prev = idPrev != 0 ? app.getAgendaById(idPrev) : null;
            System.out.println(app.selectedAgenda + " prev= " + prev);
            comboBoxPrevious.setSelectedItem(app.selectedAgenda.getPreviousId() != 0 ? prev.getAgendaName() : "none");
        }
    }

    private void loadAgenda() {
        List<Agenda> agendas = ReportUtil.loadAgenda(app.getLoadedExcelFilePath());
        if (agendas.size() > 0) {
            app.setAgendaList(agendas);
            refresh();
        } else {
            JOptionPane.showMessageDialog(null, "FILE TIDAK VALID");
        }
    }

    private void chooseFileToLoad() {
        JFileChooser fileChooser = new JFileChooser();
        FileFilter ff_xls = new FileNameExtensionFilter("xls", "xls");
        FileFilter ff_xlsx = new FileNameExtensionFilter("xlsx", "xlsx");
        fileChooser.addChoosableFileFilter(ff_xls);
        fileChooser.addChoosableFileFilter(ff_xlsx);
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            app.setLoadedExcelFilePath(fileChooser.getSelectedFile().getAbsolutePath());
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("Cancel was selected");
        }
        txtFilePath.setText(app.getLoadedExcelFilePath());
    }
}
