/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.entity;

import java.util.Date;

/**
 *
 * @author SuongNguyen
 */
public class NguoiHoc {
    private String maNguoiHoc;
    private String hoTen;
    private String dienThoai;
    private String email;
    private String ghiChu;
    private String maNv;
    private Date ngaySinh;
    private Date ngayDangKy;
    private boolean gioiTinh;

    public NguoiHoc() {
        gioiTinh = true;
    }

    public NguoiHoc(String maNguoiHoc, String hoTen, String dienThoai, String email, String ghiChu, String maNv, Date ngaySinh, Date ngayDangKy, boolean gioiTinh) {
        this.maNguoiHoc = maNguoiHoc;
        this.hoTen = hoTen;
        this.dienThoai = dienThoai;
        this.email = email;
        this.ghiChu = ghiChu;
        this.maNv = maNv;
        this.ngaySinh = ngaySinh;
        this.ngayDangKy = ngayDangKy;
        this.gioiTinh = gioiTinh;
    }

    public String getMaNguoiHoc() {
        return maNguoiHoc;
    }

    public void setMaNguoiHoc(String maNguoiHoc) {
        this.maNguoiHoc = maNguoiHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
