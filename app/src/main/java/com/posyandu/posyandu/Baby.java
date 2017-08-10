package com.posyandu.posyandu;

/**
 * Created by ILUSTRATOR on 8/10/2017.
 */

public class Baby {
    private int id_baby;
    private String nama_baby;
    private String usia_baby;

    public int getId_baby() {
        return id_baby;
    }

    public void setId_baby(int id_baby) {
        this.id_baby = id_baby;
    }

    public String getNama_baby() {
        return nama_baby;
    }

    public void setNama_baby(String nama_baby) {
        this.nama_baby = nama_baby;
    }

    public String getUsia_baby() {
        return usia_baby;
    }

    public void setUsia_baby(String usia_baby) {
        this.usia_baby = usia_baby;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public int getBerat_badan() {
        return berat_badan;
    }

    public void setBerat_badan(int berat_badan) {
        this.berat_badan = berat_badan;
    }

    private String tgl_lahir;
    private int berat_badan;

}
