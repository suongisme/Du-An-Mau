/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import laptrinhcity.entity.HocVien;
import laptrinhcity.entity.KhoaHoc;
import laptrinhcity.jdbchepper.JDBCHelper;
import laptrinhcity.utils.XDate;

/**
 *
 * @author SuongNguyen
 */
public class KhoaHocDAO extends DAO<KhoaHoc, Integer>{
    private final String SQL_INSERT = "INSERT INTO khoahoc(macd,hocphi,thoiluong,ngaykg,ghichu,manv,ngaytao) VALUES (?,?,?,?,?,?,?)";
    private final String SQL_UPDATE = "UPDATE khoahoc SET macd = ?, hocphi = ?, thoiluong = ?, ngaykg = ?, ghichu = ?, manv = ?, ngaytao = ? WHERE makh = ?";
    private final String SQL_DELETE = "DELETE FROM khoahoc WHERE makh = ?";
    private final String SQL_SELECT = "SELECT * FROM khoahoc";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM khoahoc WHERE makh = ?";
    
    
    @Override
    public void insert(KhoaHoc entity) {
        try {
            JDBCHelper.update(SQL_INSERT, entity.getMaChuyenDe(), 
                                          entity.getHocPhi(), 
                                          entity.getThoiLuong(), 
                                          XDate.createSqlDate(entity.getNgayKhaiGiang()),
                                          entity.getGhiChu(), 
                                          entity.getMaNhanVien(), 
                                          XDate.createSqlDate(entity.getNgayTao()));
        } catch (SQLException e) {
            throw new RuntimeException("Thêm thất bại");
        }
    }

    @Override
    public void update(KhoaHoc entity) {
        try {
            JDBCHelper.update(SQL_UPDATE, entity.getMaChuyenDe(), 
                                          entity.getHocPhi(), 
                                          entity.getThoiLuong(), 
                                          XDate.createSqlDate(entity.getNgayKhaiGiang()), 
                                          entity.getGhiChu(), 
                                          entity.getMaNhanVien(), 
                                          XDate.createSqlDate(entity.getNgayTao()),
                                          entity.getMaKhoaHoc());
        } catch (SQLException e) {
            throw new RuntimeException("Cập nhật thất bại");
        }
    }

    @Override
    public void delete(Integer maKhoaHoc) {
        try {
            JDBCHelper.update(SQL_DELETE, maKhoaHoc);
        } catch (SQLException e) {
            throw new RuntimeException("Xóa thất bại");
        }
    }

     @Override
    public KhoaHoc selectById(Integer id) {
        List<KhoaHoc> KhoaHocList = selectBySQL(SQL_SELECT_BY_ID, id);
        if (!KhoaHocList.isEmpty()) return KhoaHocList.get(0);
        return null;
    }

    @Override
    public List<KhoaHoc> selectAll() {
        return selectBySQL(SQL_SELECT);
    }

    @Override
    public List<KhoaHoc> selectBySQL(String sql, Object... x) {
        List<KhoaHoc> KhoaHocList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResultSet(sql, x);
            while (rs.next()) {
                KhoaHocList.add(
                   new KhoaHoc(
                        rs.getInt("makh"),
                        rs.getDouble("hocphi"), 
                        rs.getInt("thoiluong"), 
                        rs.getDate("ngaykg"), 
                        rs.getString("ghichu"), 
                        rs.getString("macd"),
                        rs.getString("manv"),
                        rs.getDate("ngaytao")
                   )
                );
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return KhoaHocList;
    }
    
    public List<KhoaHoc> selectByMaChuyenDe(String macd) {
        return selectBySQL("select * from khoahoc where macd = ?", macd);
    }
    
    
}
