/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.utils;

import javax.swing.UIManager;

/**
 *
 * @author SuongNguyen
 */
public class XTheme {
    public static void lightTheme() {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void darkTheme() {
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
