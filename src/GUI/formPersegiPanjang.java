/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Data.*;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.*;
/**
 *
 * @author DEWATA
 */
public class formPersegiPanjang extends javax.swing.JFrame {

    /**
     * Creates new form formPersegiPanjang
     */
    public formPersegiPanjang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOutput = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtPanjang = new javax.swing.JTextField();
        txtLebar = new javax.swing.JTextField();
        txtLuas = new javax.swing.JTextField();
        btnHitungLuas = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnTambahkan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnTampilkan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblOutput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "no_bangun", "panjang", "lebar", "luas"
            }
        ));
        jScrollPane1.setViewportView(tblOutput);

        jLabel1.setText("Form Persegi Panjang");

        jLabel2.setText("Id");

        jLabel3.setText("Panjang");

        jLabel4.setText("Lebar");

        jLabel5.setText("Luas");

        btnHitungLuas.setText("Hitung Luas");
        btnHitungLuas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungLuasActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnTambahkan.setText("Tambahkan");
        btnTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahkanActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnTampilkan.setText("Tampilkan");
        btnTampilkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilkanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtLebar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                            .addComponent(txtPanjang)
                                            .addComponent(txtLuas))
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnClear)
                                            .addComponent(btnHitungLuas)))
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnTambahkan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTampilkan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus)))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPanjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnHitungLuas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahkan)
                    .addComponent(btnUpdate)
                    .addComponent(btnTampilkan)
                    .addComponent(btnHapus))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungLuasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungLuasActionPerformed
        // TODO add your handling code here:
        double p = Double.parseDouble(txtPanjang.getText());
        double l = Double.parseDouble(txtLebar.getText());
        PersegiPanjang pp = new PersegiPanjang(p,l);
        double L = pp.hitungLuas();
        txtLuas.setText(String.valueOf(L));
    }//GEN-LAST:event_btnHitungLuasActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtPanjang.setText("");
        txtLebar.setText("");
        txtLuas.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTambahkanActionPerformed(java.awt.event.ActionEvent evt) {                                                                                      
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        double  p = Double.parseDouble(txtPanjang.getText());
        double l = Double.parseDouble(txtLebar.getText());
        double luas = Double.parseDouble(txtLuas.getText());
        try {
            PersegiPanjang p1 = new PersegiPanjang(p,l);
            if ((txtLuas.getText() == null) || (txtId.getText() == null)){
                throw new Exception();
            }else{
                p1.simpanPersegiPanjang(id, luas);
                JOptionPane.showMessageDialog(null, "Insertnya berhasil!");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e + "ID atau Luas harus diisi!");
        }
    }                                            

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(txtId.getText());
        double p = Double.parseDouble(txtPanjang.getText());
        double l = Double.parseDouble(txtLebar.getText());
        double luas = Double.parseDouble(txtLuas.getText());
        try{
            PersegiPanjang p1 = new PersegiPanjang(p, l);
            if(txtLuas.getText() == null || txtId.getText() == null){
                throw new Exception();
            }else{
                try{
                    p1.updatePersegiPanjang(id, luas);
                    JOptionPane.showMessageDialog(null, "Update berhasil!");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Update Gagal!");
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e+ "ID atau Luas harus diisi!");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnTampilkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilkanActionPerformed
        // TODO add your handling code here:
        koneksi db = new koneksi();
        int i = 0;
        ResultSet rs = null;
        try{
            rs = db.getData("select * from persegi_panjang");
//            if(rs.first()==null){
//                
//            }
            while (rs.next()){
                tblOutput.setValueAt(rs.getString("no_bangun"), i, 0);
                tblOutput.setValueAt(rs.getString("panjang"), i, 1);
                tblOutput.setValueAt(rs.getString("lebar"), i, 2);
                tblOutput.setValueAt(rs.getString("luas"), i, 3);
                i++;
            }
            rs.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error " +e.getMessage());
        }
    }//GEN-LAST:event_btnTampilkanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
//        int id = Integer.parseInt(txtId.getText());
//        double p = Double.parseDouble(txtPanjang.getText());
//        double l = Double.parseDouble(txtLebar.getText());
//        double luas = Double.parseDouble(txtLuas.getText());
//        PersegiPanjang p1 = new PersegiPanjang(p,l);
//        p1.hapusPersegiPanjang();
        int ans = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin menghapus ?");
        // 0 : yes
        // 1 : no 
        // 2 : cancel
        PersegiPanjang p1 = new PersegiPanjang(0,0);
        switch (ans) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(this, "Data Anda Terhapus!");
//               ersegiPanjang p1 = new PersegiPanjang(0,0);
                p1.hapusPersegiPanjang();
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(this, "Tidak !");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(this, "Cancel !");
                break;
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formPersegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPersegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPersegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPersegiPanjang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPersegiPanjang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitungLuas;
    private javax.swing.JButton btnTambahkan;
    private javax.swing.JButton btnTampilkan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOutput;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLebar;
    private javax.swing.JTextField txtLuas;
    private javax.swing.JTextField txtPanjang;
    // End of variables declaration//GEN-END:variables
}
