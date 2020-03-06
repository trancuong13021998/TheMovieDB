package com.example.themoviedbapplication.model;

public class Movie {
    private String maphim;
    private String tenphim;
    private String anhphim;
    private String thoiluong;
    private String mota;

    public Movie(String maphim, String tenphim, String anhphim, String thoiluong, String mota) {
        this.maphim = maphim;
        this.tenphim = tenphim;
        this.anhphim = anhphim;
        this.thoiluong = thoiluong;
        this.mota = mota;
    }

    public String getMaphim() {
        return maphim;
    }

    public void setMaphim(String maphim) {
        this.maphim = maphim;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }

    public String getAnhphim() {
        return anhphim;
    }

    public void setAnhphim(String anhphim) {
        this.anhphim = anhphim;
    }

    public String getThoiluong() {
        return thoiluong;
    }

    public void setThoiluong(String thoiluong) {
        this.thoiluong = thoiluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
