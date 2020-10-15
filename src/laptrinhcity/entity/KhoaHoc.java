/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.entity;

import java.util.Date;
import laptrinhcity.utils.XDate;

/**
 *
 * @author SuongNguyen
 */
public class KhoaHoc {
    private int maKhoaHoc;
    private double hocPhi;
    private int thoiLuong;
    private Date ngayKhaiGiang;
    private String ghiChu;
    private String maChuyenDe;
    private String maNhanVien;
    private Date ngayTao;

    public KhoaHoc() {
    }

    public KhoaHoc(int maKhoaHoc,double hocPhi, int thoiLuong, Date ngayKhaiGiang, String ghiChu, String maChuyenDe, String maNhanVien, Date ngayTao) {
        this.maKhoaHoc = maKhoaHoc;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.ngayKhaiGiang = ngayKhaiGiang;
        this.ghiChu = ghiChu;
        this.maChuyenDe = maChuyenDe;
        this.maNhanVien = maNhanVien;
        this.ngayTao = ngayTao;
    }

    

    public String getMaChuyenDe() {
        return maChuyenDe;
    }

    public void setMaChuyenDe(String maChuyenDe) {
        this.maChuyenDe = maChuyenDe;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(int maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayKhaiGiang() {
        return ngayKhaiGiang;
    }

    public void setNgayKhaiGiang(Date ngayKhaiGiang) {
        this.ngayKhaiGiang = ngayKhaiGiang;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    @Override
    public String toString() {
        return this.ghiChu+" ("+XDate.toString(this.ngayKhaiGiang, "dd-MM-yyyy")+")";
    }
}
