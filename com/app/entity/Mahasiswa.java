/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.entity;

/**
 *
 * @author Parzival
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private String alamat;
    private String no_telp;
    private String email;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String jurusan, String alamat, String no_telp, String email) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.no_telp = no_telp;
        this.email = email;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Object getValue(int index){
        switch(index){
            case 0:
                return nim;
            case 1:
                return nama;
            case 2:
                return jurusan;
            case 3:
                return alamat;
            case 4:
                return no_telp;
            case 5:
                return email;
            default :
                return null;
        }
    }
    
}
