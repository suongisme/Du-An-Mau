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
public class HocVien {
    private String maNguoiHoc;
    private int maHocVien;
    private int maKhoaHoc;
    private double diem;

    public HocVien() {
    }

    public HocVien(String maNguoiHoc, int maHocVien, int maKhoaHoc, double diem) {
        this.maNguoiHoc = maNguoiHoc;
        this.maHocVien = maHocVien;
        this.maKhoaHoc = maKhoaHoc;
        this.diem = diem;
    }

    public String getMaNguoiHoc() {
        return maNguoiHoc;
    }

    public void setMaNguoiHoc(String maNguoiHoc) {
        this.maNguoiHoc = maNguoiHoc;
    }

    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }

    public int getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(int maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        if (diem > 10) diem = 10;
        if (diem < 0) diem = 0;
        this.diem = diem;
    }
}
