/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.utils;

import laptrinhcity.entity.NhanVien;

/**
 *
 * @author SuongNguyen
 */
public class Auth {
    public static NhanVien user;
    static {
        user = null;
    }
    
    public static void clear() {
        user = null;
    }
    
    public static boolean isLogin() {
        return user != null;
    }
    
    public static boolean isManager() {
        return Auth.isLogin() && user.isVaiTro();
    }
}
