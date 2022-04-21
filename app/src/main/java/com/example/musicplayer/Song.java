package com.example.musicplayer;

public class Song {
    private int anh;
    private String tenBH;
    private String caSi;

    public Song(int anh, String tenBH, String nhacSi) {
        this.anh = anh;
        this.tenBH = tenBH;
        this.caSi = nhacSi;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTenBH() {
        return tenBH;
    }

    public void setTenBH(String tenBH) {
        this.tenBH = tenBH;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }
}
