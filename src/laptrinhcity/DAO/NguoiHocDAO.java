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
import laptrinhcity.entity.NguoiHoc;
import laptrinhcity.jdbchepper.JDBCHelper;
import laptrinhcity.utils.XDate;

/**
 *
 * @author SuongNguyen
 */
public class NguoiHocDAO extends DAO<NguoiHoc, String>{
    private final String SQL_INSERT = "INSERT INTO nguoihoc(manh,hoten,ngaysinh,gioitinh,dienthoai,email,ghichu,manv,ngaydk) VALUES (?,?,?,?,?,?,?,?,?)";
    private final String SQL_UPDATE = "UPDATE nguoihoc SET hoten = ?, ngaysinh = ?, gioitinh = ?, dienthoai = ?, email = ?, ghichu = ?, manv = ? WHERE manh = ?";
    private final String SQL_DELETE = "DELETE FROM nguoihoc WHERE manh = ?";
    private final String SQL_SELECT = "SELECT * FROM nguoihoc";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM nguoihoc WHERE manh = ?";

    @Override
    public void insert(NguoiHoc entity) {
        try {
            JDBCHelper.update(SQL_INSERT, entity.getMaNguoiHoc(), 
                                          entity.getHoTen(), 
                                          XDate.createSqlDate(entity.getNgaySinh()),
                                          entity.isGioiTinh(), 
                                          entity.getDienThoai(), 
                                          entity.getEmail(), 
                                          entity.getGhiChu(), 
                                          entity.getMaNv(), 
                                          XDate.createSqlDate(entity.getNgayDangKy()));
        } catch (SQLException e) {
            throw new RuntimeException("Thêm thất bại");
        }
    }

    @Override
    public void update(NguoiHoc entity) {
        try {
            JDBCHelper.update(SQL_UPDATE, entity.getHoTen(), 
                                          XDate.createSqlDate(entity.getNgaySinh()), 
                                          entity.isGioiTinh(), 
                                          entity.getDienThoai(), 
                                          entity.getEmail(), 
                                          entity.getGhiChu(), 
                                          entity.getMaNv(), 
                                          entity.getMaNguoiHoc());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Cập nhật thất bại");
        }
    }

    @Override
    public void delete(String maNguoiHoc) {
        try {
            JDBCHelper.update(SQL_DELETE, maNguoiHoc);
        } catch (SQLException e) {
            throw new RuntimeException("Xóa thất bại");
        }
    }

    @Override
    public NguoiHoc selectById(String id) {
        try {
            List<NguoiHoc> employeeList = selectBySQL(SQL_SELECT_BY_ID, id);
            
            if (!employeeList.isEmpty()) return employeeList.get(0);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return selectBySQL(SQL_SELECT);
    }

    @Override
    public List<NguoiHoc> selectBySQL(String sql, Object... x) {
        List<NguoiHoc> employeeList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResultSet(sql, x);
            while (rs.next()) {
                employeeList.add(
                    new NguoiHoc(rs.getString("manh"), 
                                 rs.getString("hoten"), 
                                 rs.getString("dienthoai"), 
                                 rs.getString("email"),
                                 rs.getString("ghichu"),
                                 rs.getString("manv"),
                                 rs.getDate("ngaysinh"),
                                 rs.getDate("ngaydk"),
                                 rs.getBoolean("gioitinh"))
                );
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return employeeList;
    }
    
    public List<NguoiHoc> selectByKeyWord(String hoTen) {
        return selectBySQL("SELECT * FROM nguoihoc WHERE hoten LIKE ?","%"+hoTen+"%");
    }
    
    public List<NguoiHoc> selectNotHocVien(String keyword, Integer makh) {
        String sql = "SELECT * FROM nguoihoc WHERE hoten LIKE ? AND manh NOT IN (SELECT manh FROM hocvien where makh = ?)";
        return this.selectBySQL(sql,"%"+keyword+"%", makh);
    }
    
    public List<NguoiHoc> selectByMaNhanVien(String manv) {
        return selectBySQL("select * from nguoihoc where manv = ?", manv);
    }
}
