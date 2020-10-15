/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SuongNguyen
 */
public class XDate {
    public static SimpleDateFormat format;
    static {
        format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
    }
    
    public static Date getDate(String date, String pattern) {
        try {
            format.applyPattern(pattern);
            return format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException("Ngày tháng không đúng định dạng");
        }
    }
    
    public static String toString(Date date, String pattern) {
        if (date == null) return "null";
        format.applyPattern(pattern);
        return format.format(date);
    }
    
    public static Date addDays(Date date, long days) {
        if (date == null) return null;
        date.setTime(date.getTime()+ days*24*60*60*1000);
        return date;
    }
    
    public static Date getDateNow() {
        return new Date();
    }
    
    public static java.sql.Date createSqlDate(Date date) {
        return new java.sql.Date(date.getTime());
    }
}
