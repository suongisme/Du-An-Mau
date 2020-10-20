/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.language;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author SuongNguyen
 */
public class Language {
    public static ResourceBundle language;
    
    static {
        language = ResourceBundle.getBundle("laptrinhcity\\language\\Bundle",Locale.US);
    }
    
    public static void changeLanguageEnglish() {
        language = ResourceBundle.getBundle("laptrinhcity\\language\\Bundle",Locale.US);
    }
    
    public static void chagneLanguageVietnamese() {
        language = ResourceBundle.getBundle("laptrinhcity\\language\\Bundle", new Locale("vi","vi"));
    }
    
    public static ResourceBundle getLanguage() {
        return language;
    }
}
