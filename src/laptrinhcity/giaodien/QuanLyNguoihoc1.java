/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptrinhcity.giaodien;

import java.awt.Component;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import laptrinhcity.DAO.NguoiHocDAO;
import laptrinhcity.entity.NguoiHoc;
import laptrinhcity.utils.Auth;
import laptrinhcity.utils.MsgBox;
import laptrinhcity.utils.XDate;

/**
 *
 * @author SuongNguyen
 */
public class QuanLyNguoihoc1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyNguoihoc1
     */
    public QuanLyNguoihoc1(int i) {
        initComponents();
        setLocation(236, 0);
        tabs.setSelectedIndex(i);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblQuanLyNguoiHoc = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        lblMaNguoiHoc = new javax.swing.JLabel();
        txtMaNguoiHoc = new javax.swing.JTextField();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        lblGhiChu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        pnlNutBam = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        pnlDiChuyen = new javax.swing.JPanel();
        btnDau = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        btnTien = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        lblNgayTao1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblNgayTao2 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        lblTimKiem = new javax.swing.JLabel();

        setClosable(true);

        lblQuanLyNguoiHoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuanLyNguoiHoc.setForeground(new java.awt.Color(255, 0, 0));
        lblQuanLyNguoiHoc.setText("QUẢN LÝ NGƯỜI HỌC");

        lblMaNguoiHoc.setText("Mã người học");

        txtMaNguoiHoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMaNguoiHoc.setForeground(new java.awt.Color(255, 0, 0));
        txtMaNguoiHoc.setMargin(new java.awt.Insets(2, 8, 2, 2));

        lblHoTen.setText("Họ Tên");

        txtHoTen.setMargin(new java.awt.Insets(2, 8, 2, 2));

        lblGioiTinh.setText("Giới tính");

        lblNgaySinh.setText("Ngày sinh");

        txtNgaySinh.setMargin(new java.awt.Insets(2, 8, 2, 2));

        lblGhiChu.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setLineWrap(true);
        txtGhiChu.setRows(5);
        txtGhiChu.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtGhiChu);

        pnlNutBam.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        pnlNutBam.add(btnThem);

        btnSua.setText("Sửa");
        btnSua.setEnabled(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        pnlNutBam.add(btnSua);

        btnXoa.setText("Xóa");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        pnlNutBam.add(btnXoa);

        btnLamMoi.setText("Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        pnlNutBam.add(btnLamMoi);

        pnlDiChuyen.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnDau.setText("|<");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });
        pnlDiChuyen.add(btnDau);

        btnLui.setText("<<");
        btnLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuiActionPerformed(evt);
            }
        });
        pnlDiChuyen.add(btnLui);

        btnTien.setText(">>");
        btnTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienActionPerformed(evt);
            }
        });
        pnlDiChuyen.add(btnTien);

        btnCuoi.setText(">|");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });
        pnlDiChuyen.add(btnCuoi);

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        lblNgayTao1.setText("Địa chỉ email");

        txtEmail.setMargin(new java.awt.Insets(2, 8, 2, 2));

        lblNgayTao2.setText("Điện thoại");

        txtDienThoai.setMargin(new java.awt.Insets(2, 8, 2, 2));

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNguoiHoc)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHoTen)
                            .addComponent(lblGioiTinh)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoNu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgaySinh)))
                    .addComponent(txtHoTen)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNgayTao2)
                            .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(lblNgayTao1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGhiChu)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(pnlNutBam, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnlDiChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNguoiHoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNgaySinh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblGioiTinh)))
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNgayTao2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNgayTao1)
                        .addGap(7, 7, 7)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlDiChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlNutBam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pnlCapNhatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDienThoai, txtEmail, txtHoTen, txtMaNguoiHoc, txtNgaySinh});

        tabs.addTab("Cập nhật", pnlCapNhat);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NH", "Họ Tên", "Giới tính", "Ngày sinh", "SĐT", "Email", "Ma NV", "Ngày Tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        jScrollPane1.setViewportView(tblNguoiHoc);
        if (tblNguoiHoc.getColumnModel().getColumnCount() > 0) {
            tblNguoiHoc.getColumnModel().getColumn(0).setMaxWidth(50);
            tblNguoiHoc.getColumnModel().getColumn(1).setMinWidth(100);
            tblNguoiHoc.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 520, 24));

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        jPanel1.add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 14, 70, -1));

        lblTimKiem.setText("Tìm kiếm");

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDanhSachLayout.createSequentialGroup()
                        .addComponent(lblTimKiem)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimKiem)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách", pnlDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabs)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblQuanLyNguoiHoc)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblQuanLyNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void tblNguoiHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNguoiHocMouseClicked
        index = tblNguoiHoc.getSelectedRow();
        edit();
        tabs.setSelectedIndex(0);
    }//GEN-LAST:event_tblNguoiHocMouseClicked

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        first();
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuiActionPerformed
        previous();
    }//GEN-LAST:event_btnLuiActionPerformed

    private void btnTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienActionPerformed
        next();
    }//GEN-LAST:event_btnTienActionPerformed

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        last();
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        fillTable();
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLui;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTien;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNguoiHoc;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblNgayTao1;
    private javax.swing.JLabel lblNgayTao2;
    private javax.swing.JLabel lblQuanLyNguoiHoc;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JPanel pnlDiChuyen;
    private javax.swing.JPanel pnlNutBam;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNguoiHoc;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    NguoiHocDAO nguoiHocDao;
    DefaultTableModel tableModel;
    int index;
    String pattern;
    
    public void init() {
        index = -1;
        pattern = "dd-MM-yyyy";
        nguoiHocDao = new NguoiHocDAO();
        
        tableModel = (DefaultTableModel) tblNguoiHoc.getModel();
        fillTable();
    }

    private void fillTable() {
        tableModel.setRowCount(0);
        List<NguoiHoc> nguoiHocList = nguoiHocDao.selectByKeyWord(txtTimKiem.getText());
        nguoiHocList.forEach((x)
                -> {
            String gioiTinh = x.isGioiTinh() ? "Nam" : "Nữ";
            tableModel.addRow(new Object[]{
                x.getMaNguoiHoc(), x.getHoTen(), gioiTinh,
                XDate.toString(x.getNgaySinh(), pattern), x.getDienThoai(), x.getEmail(),
                x.getMaNv(), XDate.toString(x.getNgayDangKy(), pattern)
            });
        }
        );
    }

    private void insert() {
        try {
            if (isError()) {
                return;
            }
            nguoiHocDao.insert(getForm());
            fillTable();
            MsgBox.alert(this, "Thêm thành công");
            changeEnable(true);
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
    }

    private void update() {
        try {
            if (isError()) {
                return;
            }
            nguoiHocDao.update(getForm());
            fillTable();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
    }

    private void delete() {
        try {
            if (!MsgBox.confirm(this, "bạn có chắc chắn không!")) {
                return;
            }
            nguoiHocDao.delete(txtMaNguoiHoc.getText());
            fillTable();
            changeEnable(false);
            MsgBox.alert(this, "Xóa thành công");
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
    }

    private NguoiHoc getForm() {
        String maNguoiHoc = txtMaNguoiHoc.getText();
        String hoTen = txtHoTen.getText();
        Date ngaySinh = XDate.getDate(txtNgaySinh.getText(), pattern);
        String dienThoai = txtDienThoai.getText();
        String email = txtEmail.getText();
        String ghiChu = txtGhiChu.getText();
        Date ngayDk = XDate.getDateNow();
        String maNv = Auth.user.getMaNhanVien();
        boolean gioiTinh = rdoNam.isSelected();

        return new NguoiHoc(maNguoiHoc, hoTen, dienThoai, email, ghiChu, maNv, ngaySinh, ngayDk, gioiTinh);
    }

    private void setForm(NguoiHoc x) {
        txtMaNguoiHoc.setText(x.getMaNguoiHoc());
        txtHoTen.setText(x.getHoTen());
        rdoNam.setSelected(x.isGioiTinh());
        rdoNu.setSelected(!x.isGioiTinh());
        txtNgaySinh.setText(XDate.toString(x.getNgaySinh(), pattern));
        txtDienThoai.setText(x.getDienThoai());
        txtEmail.setText(x.getEmail());
        txtGhiChu.setText(x.getGhiChu());
    }

    private void edit() {
        NguoiHoc nguoihoc = new NguoiHocDAO().selectById(tblNguoiHoc.getValueAt(index, 0) + "");
        setForm(nguoihoc);
        changeEnable(true);
        tblNguoiHoc.setRowSelectionInterval(index, index);
    }

    private void first() {
        index = 0;
        edit();
    }

    private void previous() {
        index--;
        if (index < 0) {
            index = tableModel.getRowCount() - 1;
        }
        edit();
    }

    private void next() {
        index++;
        if (index == tableModel.getRowCount()) {
            index = 0;
        }
        edit();
    }

    private void last() {
        index = tableModel.getRowCount() - 1;
        edit();
    }

    private void clearForm() {
        NguoiHoc nh = new NguoiHoc();
        this.setForm(nh);
        changeEnable(false);
    }

    private boolean isError() {
        if (isEmpty()) {
            MsgBox.alert(this, "Thông tin không được để trống");
            return true;
        }
        
        if (!isDate()) {
            MsgBox.alert(this, "Ngày tháng năm sai định dạng!");
            return true;
        }
        
        if (!isEmail()) {
            MsgBox.alert(this, "Email sai định dạng!");
            return true;
        }
        
        if (!isPhoneNumber()) {
            MsgBox.alert(this, "Số điện thoại sai định dạng!");
            return true;
        }
        
        return false;
    }

    private boolean isEmpty() {
        for (Component x : this.pnlCapNhat.getComponents()) {
            if (x instanceof JTextField && ((JTextField) x).getText().length() <= 0) {
                x.requestFocus();
                return true;
            }
        }
        return false;
    }

    private boolean isEmail() {
        String regex = "^[a-z]+@[a-z]+(\\.[a-z]+){1,2}";
        if (txtEmail.getText().matches(regex)) {
            return true;
        }
        return false;
    }

    private boolean isPhoneNumber() {
        String regex = "0[1-9]{9}";
        if (txtDienThoai.getText().matches(regex)) {
            return true;
        }
        return false;
    }
    
    private boolean isDate() {
        try {
            XDate.format.parse(txtNgaySinh.getText());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private void changeEnable(boolean x) {
        if (Auth.isManager()) {
            btnXoa.setEnabled(x);
        } 
        btnSua.setEnabled(x);
        btnThem.setEnabled(!x);
        txtMaNguoiHoc.setEnabled(!x);
    }
}
