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
import laptrinhcity.entity.ChuyenDe;
import laptrinhcity.jdbchepper.JDBCHelper;

/**
 *
 * @author SuongNguyen
 */
public class ChuyenDeDAO extends DAO<ChuyenDe, String>{
    
    private final String SQL_INSERT = "INSERT INTO chuyende(macd, tencd, mota, hinh, hocphi, thoiluong) VALUES (?,?,?,?,?,?)";
    private final String SQL_UPDATE = "UPDATE chuyende SET tencd = ?, mota = ?, hinh = ?, hocphi = ?, thoiluong = ? WHERE macd = ?";
    private final String SQL_DELETE = "DELETE FROM chuyende WHERE macd = ?";
    private final String SQL_SELECT = "SELECT * FROM chuyende";
    private final String SQL_SELECT_BY_ID = "SELECT * FROM chuyende WHERE macd = ?";
    
    
    @Override
    public void insert(ChuyenDe entity) {
        try {
            JDBCHelper.update(SQL_INSERT, entity.getMaCd(), entity.getTenCd(), entity.getMota(), entity.getHinh(), entity.getHocPhi(), entity.getThoiLuong());
        } catch (SQLException e) {
            throw new RuntimeException("Thêm thất bại");
        }
    }

    @Override
    public void update(ChuyenDe entity) {
        try {
            JDBCHelper.update(SQL_UPDATE, entity.getTenCd(), entity.getMota(), entity.getHinh(), entity.getHocPhi(), entity.getThoiLuong(), entity.getMaCd());
        } catch (SQLException e) {
            throw new RuntimeException("Cập nhật thất bại");
        }
    }

    @Override
    public void delete(String maChuyenDe) {
        try {
            JDBCHelper.update(SQL_DELETE, maChuyenDe);
        } catch (SQLException e) {
            throw new RuntimeException("Xóa thất bại");
        }
    }

     @Override
    public ChuyenDe selectById(String id) {
        List<ChuyenDe> chuyenDeList = selectBySQL(SQL_SELECT_BY_ID, id);
        if (!chuyenDeList.isEmpty()) return chuyenDeList.get(0);
        return null;
    }

    @Override
    public List<ChuyenDe> selectAll() {
        List<ChuyenDe> chuyenDeList = selectBySQL(SQL_SELECT);
        return chuyenDeList;
    }

    @Override
    public List<ChuyenDe> selectBySQL(String sql, Object... x) {
        List<ChuyenDe> chuyenDeList = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResultSet(sql, x);
            while (rs.next()) {
                chuyenDeList.add(
                   new ChuyenDe(
                        rs.getString("macd"),
                        rs.getString("tencd"), 
                        rs.getString("mota"), 
                        rs.getString("hinh"), 
                        rs.getDouble("hocphi"), 
                        rs.getInt("thoiluong")
                   )
                );
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return chuyenDeList;
    }
    
}
