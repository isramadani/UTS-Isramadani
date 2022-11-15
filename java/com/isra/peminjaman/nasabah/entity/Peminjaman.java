/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isra.peminjaman.nasabah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author user
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Peminjaman {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long nasabahId;
    private Long peminjamanId;
    private String nama;
    private String kodeNasabah;
    private int jmlPinjaman;
    private int lamaPinjaman;
    private double bungaPerbulan;
    private double bungaPertahun;
    private double angsuranPokok;
    private double angsuranPerbulan;
    private double totalHutang;
    
    public void setAngsuranPokok(double angsuranPokok){
        this.angsuranPokok = angsuranPokok;        
    }
    
    public double getAngsuranPokok(){
        angsuranPokok = jmlPinjaman/lamaPinjaman;
        return angsuranPokok;
    }
    
    public void setAnguranPerbulan(double angsuranPerbulan){
        this.angsuranPerbulan = angsuranPerbulan;
    }
    
    public double getAngsuranPerbulan(){
        angsuranPerbulan = bungaPerbulan + angsuranPokok;
        return angsuranPerbulan;
    }
    
    public void setTotalHutang(double totalHutang){
        this.totalHutang = totalHutang;
    }
    
    public double getTotalHutang(){
        totalHutang = angsuranPokok + bungaPertahun;
        return totalHutang;
    }
}
