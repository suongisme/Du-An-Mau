/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.giaodien;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.SwingUtilities;
import javax.swing.JComponent;
import javax.swing.Timer;
import laptrinhcity.utils.XTheme;
import laptrinhcity.utils.Auth;
import laptrinhcity.utils.MsgBox;
import laptrinhcity.utils.XDate;


/**
 *
 * @author SuongNguyen
 */
public class ManChinh extends javax.swing.JFrame {

    /**
     * Creates new form ManChinh
     */
    
    public ManChinh() {
        initComponents();
        lblTrangThai.setText(this.getTitle());
        setLocationRelativeTo(null);
        this.startOclock();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnChuyenDe = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTrangThai = new javax.swing.JLabel();
        lblImageTrangThai = new javax.swing.JLabel();
        lblOclock = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniProfile = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        mniDoimatKhau = new javax.swing.JMenuItem();
        mniThoat = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniChuyenDe = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniNguoiHoc = new javax.swing.JMenuItem();
        mniHocVien = new javax.swing.JMenuItem();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniBangDiem = new javax.swing.JMenuItem();
        mniDoanhThu = new javax.swing.JMenuItem();
        mniDiemChuyenDe = new javax.swing.JMenuItem();
        mniLuongNguoiHoc = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        mniHuongDan = new javax.swing.JMenuItem();
        mniGioiThieu = new javax.swing.JMenuItem();
        mnuGiaoDien = new javax.swing.JMenu();
        mniSang = new javax.swing.JMenuItem();
        mnitoi = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ thống quản lý đào tạo");

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnKetThuc.setText("Kết thúc");
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });

        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });

        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });

        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });

        btnHocVien.setText("Học viên");
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });

        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDangXuat)
                .addGap(18, 18, 18)
                .addComponent(btnKetThuc)
                .addGap(18, 18, 18)
                .addComponent(btnChuyenDe)
                .addGap(18, 18, 18)
                .addComponent(btnNguoiHoc)
                .addGap(18, 18, 18)
                .addComponent(btnKhoaHoc)
                .addGap(18, 18, 18)
                .addComponent(btnHocVien)
                .addGap(18, 18, 18)
                .addComponent(btnHuongDan)
                .addGap(259, 259, 259))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnChuyenDe, btnDangXuat, btnHocVien, btnHuongDan, btnKetThuc, btnKhoaHoc, btnNguoiHoc});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuongDan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnChuyenDe, btnDangXuat, btnKetThuc, btnNguoiHoc});

        lblTrangThai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTrangThai.setText("Hệ thống");

        lblImageTrangThai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/warn1.png"))); // NOI18N

        lblOclock.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOclock.setText("00:00:00");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/clock.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImageTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOclock)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImageTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblOclock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTrangThai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        desktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mnuHeThong.setText("Hệ thống");

        mniProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/profile.png")));
        mniProfile.setText("Profile");
        mniProfile.setPreferredSize(new java.awt.Dimension(77, 40));
        mnuHeThong.add(mniProfile);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/logout.png")));
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.setPreferredSize(new java.awt.Dimension(155, 30));
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);

        mniDoimatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/changepass.png")));
        mniDoimatKhau.setText("Đổi mật khẩu");
        mniDoimatKhau.setPreferredSize(new java.awt.Dimension(115, 30));
        mniDoimatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoimatKhauActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoimatKhau);

        mniThoat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mniThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/exit.png")));
        mniThoat.setText("Thoát");
        mniThoat.setPreferredSize(new java.awt.Dimension(115, 30));
        mniThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThoatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniThoat);

        menuBar.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");

        mniChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        mniChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/paper_40px.png")));
        mniChuyenDe.setText("Chuyên đề");
        mniChuyenDe.setPreferredSize(new java.awt.Dimension(150, 40));
        mniChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyenDeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniChuyenDe);

        mniKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        mniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/course.png")));
        mniKhoaHoc.setText("Khóa học");
        mniKhoaHoc.setPreferredSize(new java.awt.Dimension(150, 40));
        mniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhoaHoc);

        mniNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        mniNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/student.png")));
        mniNguoiHoc.setText("Người học");
        mniNguoiHoc.setPreferredSize(new java.awt.Dimension(150, 40));
        mniNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNguoiHoc);

        mniHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        mniHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/student2.png")));
        mniHocVien.setText("Học viên");
        mniHocVien.setPreferredSize(new java.awt.Dimension(150, 40));
        mniHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHocVien);

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/employee.png")));
        mniNhanVien.setText("Nhân viên");
        mniNhanVien.setPreferredSize(new java.awt.Dimension(150, 40));
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNhanVien);

        menuBar.add(mnuQuanLy);

        mnuThongKe.setText("Thông kê");

        mniBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        mniBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/grade.png")));
        mniBangDiem.setText("Bảng điểm");
        mniBangDiem.setPreferredSize(new java.awt.Dimension(200, 40));
        mniBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangDiemActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniBangDiem);

        mniDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/revenue.png")));
        mniDoanhThu.setText("Doanh thu");
        mniDoanhThu.setPreferredSize(new java.awt.Dimension(200, 40));
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        mniDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        mniDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/grade2.png")));
        mniDiemChuyenDe.setText("Điểm chuyên đề");
        mniDiemChuyenDe.setPreferredSize(new java.awt.Dimension(200, 40));
        mniDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiemChuyenDeActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDiemChuyenDe);

        mniLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mniLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/listpeople.png")));
        mniLuongNguoiHoc.setText("Lượng người học");
        mniLuongNguoiHoc.setPreferredSize(new java.awt.Dimension(200, 40));
        mniLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongNguoiHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniLuongNguoiHoc);

        menuBar.add(mnuThongKe);

        mnuTroGiup.setText("Trợ giúp");

        mniHuongDan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/instruction.png")));
        mniHuongDan.setText("Hướng dẫn");
        mniHuongDan.setPreferredSize(new java.awt.Dimension(149, 40));
        mnuTroGiup.add(mniHuongDan);

        mniGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/product.png")));
        mniGioiThieu.setText("Giới thiệu");
        mniGioiThieu.setPreferredSize(new java.awt.Dimension(149, 40));
        mniGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGioiThieuActionPerformed(evt);
            }
        });
        mnuTroGiup.add(mniGioiThieu);

        menuBar.add(mnuTroGiup);

        mnuGiaoDien.setText("Giao diện");

        mniSang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/sun.png")));
        mniSang.setText("Sáng");
        mniSang.setPreferredSize(new java.awt.Dimension(100, 40));
        mniSang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSangActionPerformed(evt);
            }
        });
        mnuGiaoDien.add(mniSang);

        mnitoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laptrinhcity/giaodien/hinh/moon.png")));
        mnitoi.setText("Tối");
        mnitoi.setPreferredSize(new java.awt.Dimension(100, 40));
        mnitoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitoiActionPerformed(evt);
            }
        });
        mnuGiaoDien.add(mnitoi);

        menuBar.add(mnuGiaoDien);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniSangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSangActionPerformed
        XTheme.lightTheme();
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_mniSangActionPerformed

    private void mnitoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitoiActionPerformed
        XTheme.darkTheme();
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_mnitoiActionPerformed

    private void mniDoimatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoimatKhauActionPerformed
        hienThiManHinh(new CuaSoDoiMK1());
    }//GEN-LAST:event_mniDoimatKhauActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
       
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        exit();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void mniGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGioiThieuActionPerformed
    }//GEN-LAST:event_mniGioiThieuActionPerformed

    private void mniThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThoatActionPerformed
        exit();
    }//GEN-LAST:event_mniThoatActionPerformed

    private void mniHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHocVienActionPerformed
        hienThiManHinh(new QuanLyHocVien1());
    }//GEN-LAST:event_mniHocVienActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        hienThiManHinh(new QuanLyHocVien1());
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        hienThiManHinh(new QuanLyNguoihoc1(1));
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void mniNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiHocActionPerformed
        hienThiManHinh(new QuanLyNguoihoc1(1));
    }//GEN-LAST:event_mniNguoiHocActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        hienThiManHinh(new QuanLyChuyenDe1(1));
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void mniChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyenDeActionPerformed
        hienThiManHinh(new QuanLyChuyenDe1(1));
    }//GEN-LAST:event_mniChuyenDeActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        hienThiManHinh(new QuanLyKhoaHoc1(1));
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void mniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoaHocActionPerformed
        hienThiManHinh(new QuanLyKhoaHoc1(1));
    }//GEN-LAST:event_mniKhoaHocActionPerformed

    private void mniBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangDiemActionPerformed
        hienThiManHinh(new ThongKe1(0));
    }//GEN-LAST:event_mniBangDiemActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xem thu mục này");
            return;
        }
        hienThiManHinh(new ThongKe1(3));
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void mniDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiemChuyenDeActionPerformed
        hienThiManHinh(new ThongKe1(2));
    }//GEN-LAST:event_mniDiemChuyenDeActionPerformed

    private void mniLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongNguoiHocActionPerformed
        hienThiManHinh(new ThongKe1(1));
    }//GEN-LAST:event_mniLuongNguoiHocActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền vào đây!");
            return;
        }
        hienThiManHinh(new QuanLyNhanVien1(1));
    }//GEN-LAST:event_mniNhanVienActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    public javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImageTrangThai;
    private javax.swing.JLabel lblOclock;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniBangDiem;
    private javax.swing.JMenuItem mniChuyenDe;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDiemChuyenDe;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoimatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHocVien;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniLuongNguoiHoc;
    private javax.swing.JMenuItem mniNguoiHoc;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniProfile;
    private javax.swing.JMenuItem mniSang;
    private javax.swing.JMenuItem mniThoat;
    private javax.swing.JMenuItem mnitoi;
    private javax.swing.JMenu mnuGiaoDien;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    // End of variables declaration//GEN-END:variables

    private void dangXuat() {
        Auth.clear();
        new CuaSoDangNhap().setVisible(true);
        this.dispose();
    }

    private void exit() {
        if(MsgBox.confirm(this, "Bạn có chắc muốn thoát không?")) 
            System.exit(0);
    }

    private void hienThiManHinh(JComponent x) {
        desktop.add(x);
        x.setVisible(true);
    }
    
    private void startOclock() {
        new Timer(1, this.oclock).start();
    }
    
    ActionListener oclock = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            lblOclock.setText(XDate.toString(new Date(), "hh:mm:ss"));
        }
    };
}
