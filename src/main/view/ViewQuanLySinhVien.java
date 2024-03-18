/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.model.SinhVien;
import main.repository.SinhVienRepository;

/**
 *
 * @author hangnt
 */
public class ViewQuanLySinhVien extends javax.swing.JFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private List<SinhVien> lists = new ArrayList<>();
    private final SinhVienRepository sinhVienService = new SinhVienRepository();

    public ViewQuanLySinhVien() {
        initComponents();
        dtm = (DefaultTableModel) tbHienThi.getModel();
        lists = sinhVienService.getAll();
        showDataTable(lists);
        detailSinhVien(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtKyHoc = new javax.swing.JTextField();
        txtDiemTrungBinh = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        cbbNganhHoc = new javax.swing.JComboBox<>();
        rdNu = new javax.swing.JRadioButton();
        rdNam = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHienThi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        jLabel2.setText("Mã");

        jLabel3.setText("Tên");

        jLabel4.setText("Tuổi");

        jLabel5.setText("Kỳ học");

        jLabel6.setText("Ngành học");

        jLabel7.setText("Điểm trung bình");

        jLabel8.setText("Giới tinh");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        cbbNganhHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kỹ thuật phần mềm", "Phát triển phần mềm", "Xử lý dữ liệu", "Ứng dụng phần mềm", "An toàn thông tin" }));

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        buttonGroup1.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("Nam");

        tbHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Tuổi", "Kỳ học", "Ngành học", "Giới tính", "Điểm trung bình"
            }
        ));
        tbHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHienThi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate)
                                .addGap(235, 235, 235)
                                .addComponent(btnRemove)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(55, 55, 55)
                                        .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbbNganhHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rdNu)
                                                    .addComponent(rdNam))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(175, 175, 175)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtKyHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDiemTrungBinh, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbbNganhHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtKyHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(rdNam)
                    .addComponent(txtDiemTrungBinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(23, 23, 23)
                .addComponent(rdNu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        boolean addSinhVien = sinhVienService.add(getFormData());
        lists = sinhVienService.getAll();
        showDataTable(lists);
        if (addSinhVien) {
            JOptionPane.showMessageDialog(this, "Add thanh cong");
        } else {
            JOptionPane.showMessageDialog(this, "Add that bai");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tbHienThi.getSelectedRow();
        boolean updateSinhVien = sinhVienService.update(getFormData(), lists.get(row).getId());
        lists = sinhVienService.getAll();
        showDataTable(lists);
        if (updateSinhVien) {
            JOptionPane.showMessageDialog(this, "Update thanh cong");
        } else {
            JOptionPane.showMessageDialog(this, "Update that bai");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int row = tbHienThi.getSelectedRow();
        boolean removeSinhVien = sinhVienService.delete(lists.get(row).getId());
        lists = sinhVienService.getAll();
        showDataTable(lists);
        if (removeSinhVien) {
            JOptionPane.showMessageDialog(this, "Remove thanh cong");
        } else {
            JOptionPane.showMessageDialog(this, "Remove that bai");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tbHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHienThiMouseClicked
        int row = tbHienThi.getSelectedRow();
        detailSinhVien(row);
    }//GEN-LAST:event_tbHienThiMouseClicked

    private SinhVien getFormData() {
        String ma = txtMa.getText();
        String ten = txtTen.getText();
        int tuoi = Integer.parseInt(txtTuoi.getText());
        int kyHoc = Integer.parseInt(txtKyHoc.getText());
        String nganhHoc = cbbNganhHoc.getSelectedItem().toString();
        boolean gioiTinh = rdNam.isSelected();
        float diemTrungBinh = Float.parseFloat(txtDiemTrungBinh.getText());
        return new SinhVien(ma, ten, tuoi, kyHoc, nganhHoc, diemTrungBinh, gioiTinh);
    }

    private void detailSinhVien(int index) {
        SinhVien sv = lists.get(index);
        txtMa.setText(sv.getMaSinhVien());
        txtTen.setText(sv.getTenSinhVien());
        txtDiemTrungBinh.setText(String.valueOf(sv.getDiemTrungBinh()));
        txtKyHoc.setText(String.valueOf(sv.getKyHoc()));
        txtTuoi.setText(String.valueOf(sv.getTuoi()));
        cbbNganhHoc.setSelectedItem(sv.getNganhHoc());
        boolean gioiTinh = sv.getGioiTinh();
        if (gioiTinh) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
    }

    private void showDataTable(List<SinhVien> listSinhVien) {
        dtm.setRowCount(0);
        listSinhVien.forEach(s -> dtm.addRow(new Object[]{s.getMaSinhVien(),
            s.getTenSinhVien(), s.getTuoi(), s.getKyHoc(), s.getNganhHoc(),
            s.getGioiTinh() == true ? "Nam" : "Nữ", s.getDiemTrungBinh()}));
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new ViewQuanLySinhVien().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbNganhHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbHienThi;
    private javax.swing.JTextField txtDiemTrungBinh;
    private javax.swing.JTextField txtKyHoc;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
