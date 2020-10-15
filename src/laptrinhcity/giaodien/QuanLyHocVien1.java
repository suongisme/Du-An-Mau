/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.giaodien;

import laptrinhcity.qlNguoiHoc.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import laptrinhcity.DAO.ChuyenDeDAO;
import laptrinhcity.DAO.HocVienDAO;
import laptrinhcity.DAO.KhoaHocDAO;
import laptrinhcity.DAO.NguoiHocDAO;
import laptrinhcity.entity.ChuyenDe;
import laptrinhcity.entity.HocVien;
import laptrinhcity.entity.KhoaHoc;
import laptrinhcity.entity.NguoiHoc;
import laptrinhcity.utils.Auth;
import laptrinhcity.utils.MsgBox;

/**
 *
 * @author SuongNguyen
 */
public class QuanLyHocVien1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyHocVien1
     */

    public QuanLyHocVien1() {
        initComponents();
        setLocation(245, 0);
        
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblChuyenDe = new javax.swing.JLabel();
        lblKhoaHoc = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlHocVien = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        pnlNguoiHoc = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        lblTimKiem = new javax.swing.JLabel();
        pnlTimkiem = new javax.swing.JPanel();
        txtTimkiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        btnThemVaoKhoaHoc = new javax.swing.JButton();
        cboChuyenDe = new javax.swing.JComboBox<>();
        cboKhocHoc = new javax.swing.JComboBox<>();

        setClosable(true);

        lblChuyenDe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblChuyenDe.setText("Chuyên đề");

        lblKhoaHoc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblKhoaHoc.setText("Khóa học");

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TT", "Mã HV", "Mã NH", "Họ Tên", "Điểm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHocVien.setRowHeight(30);
        tblHocVien.setRowMargin(6);
        tblHocVien.getTableHeader().setReorderingAllowed(false);
        tblHocVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHocVienMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblHocVien);

        btnCapNhat.setText("Cập nhật điểm");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa khỏi khóa học");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHocVienLayout = new javax.swing.GroupLayout(pnlHocVien);
        pnlHocVien.setLayout(pnlHocVienLayout);
        pnlHocVienLayout.setHorizontalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHocVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(pnlHocVienLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlHocVienLayout.setVerticalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHocVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnXoa))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tabs.addTab("Học Viên", pnlHocVien);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NH", "Họ Tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNguoiHoc.setRowHeight(30);
        tblNguoiHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNguoiHocMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblNguoiHoc);

        lblTimKiem.setText("Tìm kiếm");

        pnlTimkiem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimkiemKeyReleased(evt);
            }
        });

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTimkiemLayout = new javax.swing.GroupLayout(pnlTimkiem);
        pnlTimkiem.setLayout(pnlTimkiemLayout);
        pnlTimkiemLayout.setHorizontalGroup(
            pnlTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlTimkiemLayout.setVerticalGroup(
            pnlTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnThemVaoKhoaHoc.setText("Thêm vào khóa học");
        btnThemVaoKhoaHoc.setEnabled(false);
        btnThemVaoKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNguoiHocLayout = new javax.swing.GroupLayout(pnlNguoiHoc);
        pnlNguoiHoc.setLayout(pnlNguoiHocLayout);
        pnlNguoiHocLayout.setHorizontalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                        .addComponent(lblTimKiem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addComponent(pnlTimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNguoiHocLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThemVaoKhoaHoc)))
                .addContainerGap())
        );
        pnlNguoiHocLayout.setVerticalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNguoiHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimKiem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemVaoKhoaHoc)
                .addContainerGap())
        );

        tabs.addTab("Người học", pnlNguoiHoc);

        cboChuyenDe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboChuyenDeItemStateChanged(evt);
            }
        });

        cboKhocHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhocHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblChuyenDe)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboChuyenDe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKhoaHoc)
                            .addComponent(cboKhocHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKhoaHoc)
                    .addComponent(lblChuyenDe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboKhocHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(cboChuyenDe))
                .addGap(21, 21, 21)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblNguoiHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNguoiHocMouseClicked
        selectIndexTableNguoiHoc = tblNguoiHoc.getSelectedRow();
        btnThemVaoKhoaHoc.setEnabled(true);
    }//GEN-LAST:event_tblNguoiHocMouseClicked

    private void tblHocVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHocVienMouseClicked
        changeEnable(true);
        selectIndexTableHocVien = tblHocVien.getSelectedRow();
    }//GEN-LAST:event_tblHocVienMouseClicked

    private void cboChuyenDeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboChuyenDeItemStateChanged
        loadKhoaHoc();
    }//GEN-LAST:event_cboChuyenDeItemStateChanged

    private void cboKhocHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhocHocActionPerformed
        fillHocVien();
        fillNguoiHoc();
    }//GEN-LAST:event_cboKhocHocActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        fillNguoiHoc();
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnThemVaoKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoKhoaHocActionPerformed
        themVaoKhoaHoc();
    }//GEN-LAST:event_btnThemVaoKhoaHocActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xoaKhoaHoc();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        capNhatDiem();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void txtTimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimkiemKeyReleased
        fillNguoiHoc();
    }//GEN-LAST:event_txtTimkiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThemVaoKhoaHoc;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhocHoc;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblChuyenDe;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnlHocVien;
    private javax.swing.JPanel pnlNguoiHoc;
    private javax.swing.JPanel pnlTimkiem;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
    
    private HocVienDAO hocVienDAO;
    private ChuyenDeDAO chuyenDeDAO;
    private KhoaHocDAO khoaHocDAO;
    private NguoiHocDAO nguoiHocDAO;
    private int selectIndexTableNguoiHoc;
    private int selectIndexTableHocVien;
    private DefaultComboBoxModel chuyenDeCombo;
    private DefaultComboBoxModel khoaHocCombo;
    private DefaultTableModel nguoiHocModel;
    private DefaultTableModel hocVienModel;

    public void init() {
        selectIndexTableHocVien = 0;
        selectIndexTableNguoiHoc = 0;

        hocVienDAO = new HocVienDAO();
        chuyenDeDAO = new ChuyenDeDAO();
        khoaHocDAO = new KhoaHocDAO();
        nguoiHocDAO = new NguoiHocDAO();
        chuyenDeCombo = (DefaultComboBoxModel) cboChuyenDe.getModel();
        khoaHocCombo = (DefaultComboBoxModel) cboKhocHoc.getModel();
        nguoiHocModel = (DefaultTableModel) tblNguoiHoc.getModel();
        hocVienModel = (DefaultTableModel) tblHocVien.getModel();
        
        loadChuyenDe();
    }

    private void loadChuyenDe() {

        chuyenDeCombo.removeAllElements();
        List<ChuyenDe> chuyenDeList = chuyenDeDAO.selectAll();

        chuyenDeList.forEach((x) -> 
            chuyenDeCombo.addElement(x)
        );
    }

    public void loadKhoaHoc() {
        khoaHocCombo.removeAllElements();
        ChuyenDe cd = (ChuyenDe) cboChuyenDe.getSelectedItem();
        List<KhoaHoc> khoaHocList = khoaHocDAO.selectByMaChuyenDe(cd.getMaCd());

        khoaHocList.forEach((x)
            -> khoaHocCombo.addElement(x)
        );
    }

    private void fillNguoiHoc() {
        nguoiHocModel.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cboKhocHoc.getSelectedItem();
        if (kh == null) {
            return;
        }
        
        List<NguoiHoc> nguoiHocList = nguoiHocDAO.selectNotHocVien(txtTimkiem.getText(), kh.getMaKhoaHoc());

        nguoiHocList.forEach((x)
                -> {
            String gioiTinh = x.isGioiTinh() ? "Nam" : "Nữ";
            nguoiHocModel.addRow(new Object[]{
                x.getMaNguoiHoc(), x.getHoTen(), gioiTinh, x.getNgaySinh(), x.getDienThoai(), x.getEmail()
            });
        }
        );
    }
    int stt;
    private void fillHocVien() {
        
        
        stt = 1;
        hocVienModel.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cboKhocHoc.getSelectedItem();
        if (kh == null) {
            return;
        }
        List<HocVien> hocVienList = hocVienDAO.selectByMaKhoaHoc(kh.getMaKhoaHoc());
        
        hocVienList.forEach((x) -> {
            
            NguoiHoc nh = nguoiHocDAO.selectById(x.getMaNguoiHoc());
            hocVienModel.addRow(new Object[]{
                stt+++"", x.getMaHocVien()+"", x.getMaKhoaHoc()+"", nh.getHoTen(), x.getDiem()+""
            });
        }
        );
        
        
    }
    
    private void themVaoKhoaHoc() {
        try {
            hocVienDAO.insert(getHocVien());
            MsgBox.alert(this, "Thêm thành công");
            fillHocVien();
            fillNguoiHoc();
            btnThemVaoKhoaHoc.setEnabled(false);
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
    }
    
    private HocVien getHocVien() {
        String maNguoiHoc = (String) tblNguoiHoc.getValueAt(selectIndexTableNguoiHoc, 0);
        int maKhoaHoc = ((KhoaHoc) cboKhocHoc.getSelectedItem()).getMaKhoaHoc();
        double diem = 0;
        return new HocVien(maNguoiHoc, 0, maKhoaHoc, diem);
    }

    private void xoaKhoaHoc() {
        try {
            if (MsgBox.confirm(this, "Bạn có chắc chắn không!")) {
                HocVien hv = getHocVienById();
                hocVienDAO.delete(hv.getMaHocVien());
                fillHocVien();
                fillNguoiHoc();
                MsgBox.alert(this, "Xóa thành công");
                changeEnable(false);
            }
            
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
    }
    private HocVien getHocVienById() {
        HocVien hv = hocVienDAO.selectById((Integer)tblHocVien.getValueAt(selectIndexTableHocVien, 1));
        return hv;
    }

    private void capNhatDiem() {
        try {
            for (int row = 0; row < tblHocVien.getRowCount(); row++) {
                HocVien hv = hocVienDAO.selectById((Integer) tblHocVien.getValueAt(row, 1));
                hv.setDiem(this.getDiemBy(row));
                hocVienDAO.update(hv);
            }
            fillHocVien();
            MsgBox.alert(this, "Cập nhật thành công");
            changeEnable(false);
        } catch (Exception x) {
            MsgBox.alert(this, x.getMessage());
        }
    }
    
    
    
    private double getDiemBy(int line) {
        try {
            return Double.parseDouble(String.valueOf(tblHocVien.getValueAt(line, 4)));
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private void changeEnable(boolean x) {
        if (Auth.isManager()) {
            btnXoa.setEnabled(x);
        } 
    }
}
