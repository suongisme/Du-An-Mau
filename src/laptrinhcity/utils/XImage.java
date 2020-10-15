/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.utils;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import javax.swing.ImageIcon;

/**
 *
 * @author SuongNguyen
 */
public class XImage {

    public XImage() {
    }
    
    public static ImageIcon getImageIcon(String fileName, Size size ) {
        ImageIcon a = new ImageIcon("Image\\"+fileName);
        Image image = a.getImage().getScaledInstance(size.width, size.height , 0);
        return new ImageIcon(image);
    }
    
    public static void copy(File from) {
        try {
            File to = new File("Image\\", from.getName());
            if (to.exists()) return;
            Files.copy(from.toPath(), to.toPath());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    public static void delete(String fileName) {
        File fileWannaDelete = new File("Image\\"+fileName);
        if (!fileWannaDelete.exists()) return;
        
        try {
            Files.delete(fileWannaDelete.toPath());
        } catch (Exception e) {
            throw new RuntimeException("Xóa thất bại");
        }
    }
    
    public class Size {

        public Size(int width, int height) {
            this.width = width;
            this.height = height;
        }
        int width;
        int height;
    }
}
