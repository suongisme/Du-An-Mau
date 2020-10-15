/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author SuongNguyen
 */
public class MsgBox {
    public static void alert(Component x, String message) {
        JOptionPane.showMessageDialog(x, message, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(Component x, String message) {
        return JOptionPane.showConfirmDialog(x, message, 
                                                "Xác nhận", 
                                                JOptionPane.YES_NO_OPTION, 
                                                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION;
        
    }
    
    public static String prompt(Component x, String message) {
        return JOptionPane.showInputDialog(x, message, "Nhập", JOptionPane.INFORMATION_MESSAGE);
    }
}
