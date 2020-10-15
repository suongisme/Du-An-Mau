/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.jdbchepper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SuongNguyen
 */
public class JDBCHelper {
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String URL = "jdbc:sqlserver://localhost:1433;databasename=laptrinhcity";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "nguyenvansuong";
    private static Connection con;
    
    public static void openConnection() throws SQLException, ClassNotFoundException{
        Class.forName(DRIVER);
        con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    
    public static PreparedStatement getPreparedStament(String sql, Object...x) throws SQLException{
        PreparedStatement prsm = compareStatement(sql);        

        addParameterSQLStatement(prsm, x);

        return prsm;
    }
    
    public static PreparedStatement compareStatement(String sql) throws SQLException {
        return sql.trim().startsWith("{") ? con.prepareCall(sql) : con.prepareStatement(sql);
    }
    
    public static void addParameterSQLStatement(PreparedStatement prsm,Object...x) throws SQLException{
        for (int i = 0; i < x.length; i++){
            prsm.setObject(i+1, x[i]);
        }
    }
    
    public static ResultSet queryResultSet(String sql, Object...x) throws SQLException{
        PreparedStatement prsm = getPreparedStament(sql, x);
        return prsm.executeQuery();
    }
    
    public static int update(String sql, Object...x) throws SQLException{
        PreparedStatement prsm = getPreparedStament(sql, x);
        return prsm.executeUpdate();
    }
}
