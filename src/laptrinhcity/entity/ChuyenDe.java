/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.entity;


/**
 *
 * @author SuongNguyen
 */
public class ChuyenDe {
    private String maCd;
    private String tenCd;
    private String mota;
    private String hinh;
    private double hocPhi;
    private int thoiLuong;

    public ChuyenDe() {
    }

    public ChuyenDe(String maCd, String tenCd, String mota, String hinh, double hocPhi, int thoiLuong) {
        this.maCd = maCd;
        this.tenCd = tenCd;
        this.mota = mota;
        this.hinh = hinh;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
    }

    public String getMaCd() {
        return maCd;
    }

    public void setMaCd(String maCd) {
        this.maCd = maCd;
    }

    public String getTenCd() {
        return tenCd;
    }

    public void setTenCd(String tenCd) {
        this.tenCd = tenCd;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    @Override
    public String toString() {
        return this.getTenCd();
    }
}
