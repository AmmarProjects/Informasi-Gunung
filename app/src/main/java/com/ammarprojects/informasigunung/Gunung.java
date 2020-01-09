package com.ammarprojects.informasigunung;

public class Gunung {
    private String namaGunung, lokasi, deskripsi,  ketinggian;
    private int ulasan, foto;
    private float rating;

    public Gunung(String namaGunung, String lokasi, String deskripsi, int foto, String ketinggian, int ulasan, float rating) {
        this.namaGunung = namaGunung;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.foto = foto;
        this.ketinggian = ketinggian;
        this.ulasan = ulasan;
        this.rating = rating;
    }

    public int getUlasan() {
        return ulasan;
    }

    public void setUlasan(int ulasan) {
        this.ulasan = ulasan;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getNamaGunung() {
        return namaGunung;
    }

    public void setNamaGunung(String namaGunung) {
        this.namaGunung = namaGunung;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKetinggian() {
        return ketinggian;
    }

    public void setKetinggian(String ketinggian) {
        this.ketinggian = ketinggian;
    }
}
