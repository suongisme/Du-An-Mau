/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import laptrinhcity.entity.HocVien;
import laptrinhcity.jdbchepper.JDBCHelper;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SuongNguyen
 */
public class HocVienDAO extends DAO<HocVien, Integer>{
    private final String SQL_INSERT = "INSERT INTO hocvien(makh,manh,diem) VALUES (?,?,?)";
    private final String SQL_UPDATE = "UPDATE hocvien SET makh = ?, manh = ?, diem = ? WHERE mahv = ?";
    private final String SQL_DELETE = "DELETE FROM hocvien WHERE mahv = ?";
    private final String SQL_SELECT = "SELECT * FROM hocvien";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM hocvien WHERE mahv = ?";
    
    
    @Override
    public void insert(HocVien entity){
        try {
            JDBCHelper.update(SQL_INSERT, entity.getMaKhoaHoc(),entity.getMaNguoiHoc(),entity.getDiem());
        } catch (SQLException ex) {
            throw new RuntimeException("Thêm thất bại");
        }
    }

    @Override
    public void update(HocVien entity) {
        try {
            JDBCHelper.update(SQL_UPDATE, entity.getMaKhoaHoc(),entity.getMaNguoiHoc(),entity.getDiem(), entity.getMaHocVien());
        } catch (SQLException e) {
            throw new RuntimeException("Cập nhật thất bại");
        }
    }

    @Override
    public void delete(Integer maHocVien) {
        try {
            JDBCHelper.update(SQL_DELETE, maHocVien);
        } catch (SQLException e) {
            throw new RuntimeException("Xóa thất bại");
        }
    }

     @Override
    public HocVien selectById(Integer id) {
        List<HocVien> HocVienList = selectBySQL(SQL_SELECT_BY_ID, id);
        if (!HocVienList.isEmpty()) return HocVienList.get(0);
        return null;
    }

    @Override
    public List<HocVien> selectAll() {
        return selectBySQL(SQL_SELECT);
    }

    @Override
    public List<HocVien> selectBySQL(String sql, Object... x) {
        List<HocVien> HocVienList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResultSet(sql, x);
            while (rs.next()) {
                HocVienList.add(
                   new HocVien(
                        rs.getString("manh"),
                        rs.getInt("mahv"),
                        rs.getInt("makh"),
                        rs.getDouble("diem")
                   )
                );
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return HocVienList;
    } 
    
    public List<HocVien> selectByMaKhoaHoc(Integer maKhoaHoc) {
        return this.selectBySQL("select * from hocvien where makh = ?", maKhoaHoc);
    }
    
    
}
