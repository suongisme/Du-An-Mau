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
public class NhanVien {
    private String maNhanVien;
    private String matKhau;
    private String hoTen;
    private boolean vaiTro;

    public NhanVien() {
        vaiTro = true;
    }

    public NhanVien(String maNv, String matKhau, String hoTen, boolean vaiTro) {
        this.maNhanVien = maNv;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.vaiTro = vaiTro;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNv) {
        this.maNhanVien = maNv;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
    
    
           
}
