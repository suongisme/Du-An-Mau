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
import laptrinhcity.entity.NhanVien;
import laptrinhcity.jdbchepper.JDBCHelper;

/**
 *
 * @author SuongNguyen
 */
public class NhanVienDAO extends DAO<NhanVien, String> {

    private final String SQL_INSERT = "INSERT INTO nhanvien(manv,hoten,matkhau,vaitro) VALUES (?,?,?,?)";
    private final String SQL_UPDATE = "UPDATE nhanvien SET hoten = ?, matkhau = ?, vaitro = ? WHERE manv = ?";
    private final String SQL_DELETE = "DELETE FROM nhanvien WHERE manv = ?";
    private final String SQL_SELECT = "SELECT * FROM nhanvien";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM nhanvien WHERE manv = ?";
    @Override
    public void insert(NhanVien entity) {
        try {
            JDBCHelper.update(SQL_INSERT, entity.getMaNhanVien(), entity.getHoTen(), entity.getMatKhau(), entity.isVaiTro());
        } catch (SQLException e) {
            throw new RuntimeException("Thêm thất bại");
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
            JDBCHelper.update(SQL_UPDATE, entity.getHoTen(), entity.getMatKhau(), entity.isVaiTro(), entity.getMaNhanVien());
        } catch (SQLException e) {
            throw new RuntimeException("Cập nhật thất bại");
        }
    }

    @Override
    public void delete(String maNhanVien) {
        try {
            JDBCHelper.update(SQL_DELETE, maNhanVien);
            System.out.println("thanh cong");
        } catch (SQLException e) {
            throw new RuntimeException("Xóa thất bại");
        }
    }

    @Override
    public NhanVien selectById(String id) {
        try {
            List<NhanVien> employeeList = selectBySQL(SQL_SELECT_BY_ID, id);
            
            if (!employeeList.isEmpty()) return employeeList.get(0);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySQL(SQL_SELECT);
    }

    @Override
    public List<NhanVien> selectBySQL(String sql, Object... x) {
        List<NhanVien> employeeList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResultSet(sql, x);
            while (rs.next()) {
                employeeList.add(
                    new NhanVien(rs.getString("manv"), 
                                 rs.getString("matkhau"), 
                                 rs.getString("hoten"), 
                                 rs.getBoolean("vaitro"))
                );
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return employeeList;
    }
    
}
