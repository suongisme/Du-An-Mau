/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.DAO;

import java.net.PasswordAuthentication;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import laptrinhcity.entity.ChuyenDe;
import laptrinhcity.jdbchepper.JDBCHelper;

/**
 *
 * @author SuongNguyen
 */
public class ChuyenDeDAO extends DAO<ChuyenDe, String> {

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
        if (!chuyenDeList.isEmpty()) {
            return chuyenDeList.get(0);
        }
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

    public static void main(String[] args) {
//        // Recipient's email ID needs to be mentioned.
//        String to = "suongnvph10619@fpt.edu.vn";
//
//        // Sender's email ID needs to be mentioned
//        String from = "suongnguyenytm2001@gmail.com";
//
//        // Assuming you are sending email from localhost
//        String host = "smtp.gmail.com";
//
//        // Get system properties
//        Properties properties = System.getProperties();
//
//        // Setup mail server
//        
//        
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//        properties.put("mail.smtp.host", host);
//        properties.put("mail.smtp.port", 465);
//        Authenticator au = new Authenticator() {
//            @Override
//            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
//                return new javax.mail.PasswordAuthentication("suongnguyenytm2001@gmail.com", "nguyenvansuong2001");
//            }
//        };
//        
//        // Get the default Session object.
//        Session session = Session.getDefaultInstance(properties, au);
//
//        try {
//            // Create a default MimeMessage object.
//            MimeMessage message = new MimeMessage(session);
//
//            // Set From: header field of the header.
//            message.setFrom(new InternetAddress(from));
//
//            // Set To: header field of the header.
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//
//            // Set Subject: header field
//            message.setSubject("This is the Subject Line!");
//
//            // Now set the actual message
//            message.setText("This is actual message");
//
//            // Send message
//            Transport.send(message);
//            System.out.println("Sent message successfully....");
//        } catch (MessagingException mex) {
//            mex.printStackTrace();
//        }
try {
			// thong so gmail
			Properties pr = new Properties();
			pr.put("mail.smtp.starttls.enable", "true");
			pr.put("mail.smtp.auth", "true");
			pr.put("mail.smtp.host", "smtp.gmail.com");
			pr.put("mail.smtp.port", 587);

			// dang nhap gmail
			Authenticator auth = new Authenticator() {
                            @Override
                            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                                return new javax.mail.PasswordAuthentication("suongnvph10619@edu.fpt.vn", "nguyenvansuong2001");
                            }
                            
			};
			
			// session
			Session s = Session.getInstance(pr, auth);
			Message mi = new MimeMessage(s);
			mi.setFrom(new InternetAddress("suongnvph10619@edu.fpt.vn"));
			mi.addRecipients(Message.RecipientType.TO, InternetAddress.parse("nguyenvansuong200@gmail.com"));
			mi.setSubject("test");
			mi.setText("tao la suong");
			Transport.send(mi);
			
			System.out.println("Succeed!");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("ERROR");
		}
    }
}
