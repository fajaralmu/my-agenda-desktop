/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.desktop.myagenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Republic Of Gamers
 */
public class App {

    private List<Agenda> agendaList = new ArrayList<>();
    private boolean addNew = true;
    public Agenda selectedAgenda = new Agenda();
    private int beginningHour = 0, beginningMinute = 0;
    private int currentHour = 0, currentMinute = 0;
    private int durationHour = 0, durationMinute = 0;
    private String loadedExcelFilePath = "";

    public Agenda getAgendaById(int id) {
        for (Agenda k : agendaList) {
            if (k.getId() == id) {
                return k;
            }
        }
        return null;
    }

    public Agenda getAgendaByName(String nama) {
        for (Agenda k : agendaList) {
            if (k.getAgendaName().equals(nama)) {
                return k;
            }
        }
        return null;
    }

    public Agenda getAgendaByPrevId(int id) {
        for (Agenda k : agendaList) {
            if (k.getPreviousId().equals(id)) {
                return k;
            }
        }
        return null;
    }

    public boolean updateAgenda(Agenda agenda) {
        for (Agenda k : agendaList) {
            if (Objects.equals(k.getId(), agenda.getId())) {
                k = agenda;
                return true;
            }
        }
        return false;
    }

    public boolean checkNameAvailability(Agenda agenda) {
        for (Agenda k : agendaList) {
            if (k.getAgendaName().equals(agenda.getAgendaName())) {
                if (!k.getId().equals(agenda.getId())) {
                    return false;
                }
            }
        }
        return true;
    }

    public int updateHourAndMinute(int duration) {
        int hour = currentHour;
        int minute = currentMinute;
        for (int i = 1; i <= duration; i++) {
            minute++;
            // System.out.println("menit " + menit);
            if (minute % 60 == 0) {
                hour++;
                if (hour > 23) {
                    hour = 0;
                }
                minute = 0;
            }
        }

        currentHour = hour;
        currentMinute = minute;

        return duration;
    }
    
    public void deleteSelectedAgenda(){
        deleteAgenda(selectedAgenda);
    }

    public void deleteAgenda(Agenda kg) {
        Agenda kAfter = getAgendaByPrevId(kg.getId());
        if (kAfter != null) {
            kAfter.setPreviousId(kg.getPreviousId());
        }

        for (Agenda k : agendaList) {
            if (k.getId().equals(kg.getId())) {
                agendaList.remove(k);
                break;
            }
        }
        if (kAfter != null) {
            for (Agenda k : agendaList) {
                if (k.getId().equals(kAfter.getId())) {
                    k = kAfter;
                }
            }
        }
    }

    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    public boolean isAddNew() {
        return addNew;
    }

    public void setAddNew(boolean isAddNew) {
        this.addNew = isAddNew;
    }

    public Agenda getSelectedAgenda() {
        return selectedAgenda;
    }

    public void setSelectedAgenda(Agenda selectedAgenda) {
        this.selectedAgenda = selectedAgenda;
    }

    public int getBeginningHour() {
        return beginningHour;
    }

    public void setBeginningHour(int beginningHour) {
        this.beginningHour = beginningHour;
    }

    public int getBeginningMinute() {
        return beginningMinute;
    }

    public void setBeginningMinute(int beginningMinute) {
        this.beginningMinute = beginningMinute;
    }

    public int getCurrentHour() {
        return currentHour;
    }

    public void setCurrentHour(int currentHour) {
        this.currentHour = currentHour;
    }

    public int getCurrentMinute() {
        return currentMinute;
    }

    public void setCurrentMinute(int currentMinute) {
        this.currentMinute = currentMinute;
    }

    public int getDurationHour() {
        return durationHour;
    }

    public void setDurationHour(int durationHour) {
        this.durationHour = durationHour;
    }

    public int getDurationMinute() {
        return durationMinute;
    }

    public void setDurationMinute(int durationMinute) {
        this.durationMinute = durationMinute;
    }

    public String getLoadedExcelFilePath() {
        return loadedExcelFilePath;
    }

    public void setLoadedExcelFilePath(String loadedExcelFilePath) {
        this.loadedExcelFilePath = loadedExcelFilePath;
    }

}
