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
import laptrinhcity.jdbchepper.JDBCHelper;

/**
 *
 * @author SuongNguyen
 */
public class ThongKeDAO {
    public List<Object[]> getArray(String sql, String[] cols, Object...x) {
        List<Object[]> objectLisit = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.queryResultSet(sql, x);
            while (rs.next()) {
                Object[] obArray = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    obArray[i] = rs.getObject(cols[i]);
                }
                objectLisit.add(obArray);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return objectLisit;
    }
    
    public List<Object[]> getBangDiem(Integer maKhoaHoc) {
        String[] cols = {"makh","hoten","diem"};
        List<Object[]> obList = getArray("{CALL sp_bangdiem(?)}", cols, maKhoaHoc);
        return obList;
    }
    
    public List<Object[]> getLuongNguoiHoc() {
        String[] cols = {"soluong","nam","somnhat","muonnhat"};
        return getArray("{CALL sp_luongnguoihoc}", cols);
    }
    
    public List<Object[]> getDiemChuyenDe() {
        String[] cols = {"soluong","thapnhat","caonhat","trungbinh"};
        return getArray("{CALL sp_diemchuyende}", cols);
    }
    
    public List<Object[]> getDoanhThu(Integer year) {
        String[] cols = {"tencd","soluongkh","soluonghv","tonghocphi","thapnhat","caonhat","trungbinh"};
        return getArray("{CALL sp_doanhthu(?)}", cols, year);
    }
}

