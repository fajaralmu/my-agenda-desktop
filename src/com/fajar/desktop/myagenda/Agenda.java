/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fajar.desktop.myagenda;

/**
 *
 * @author fajar
 */
public class Agenda {
    private int id = 0, duration;
    private String agendaName;
    private int previousId  = 0;
    public Agenda(){
        
    }
    
    public Agenda(Integer id, Integer durasi,String namaAcara){
        this.id = id;
        this.duration = durasi;
        this.agendaName = namaAcara;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer durasi) {
        this.duration = durasi;
    }

    public String getAgendaName() {
        return agendaName;
    }

    public void setAgendaName(String agendaName) {
        this.agendaName = agendaName;
    }

    public Integer getPreviousId() {
        return previousId;
    }

    public void setPreviousId(Integer idPrev) {
        this.previousId = idPrev;
    }

    @Override
    public String toString() {
        return "Kegiatan{" + "id=" + id + ", durasi=" + duration + ", namaAcara=" + agendaName + ", idPrev=" + previousId + '}';
    }
    
    

  
}
