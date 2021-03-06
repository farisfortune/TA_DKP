/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta_pdkp;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VivoBook S430F
 */
public class Home extends javax.swing.JFrame {

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    DefaultTableModel model;
    
    
    /**
     * Creates new form TA_pembayaran_iuran
     */
    public Home() {
        initComponents();
        
        model = (DefaultTableModel) listtable.getModel();
        datet.setText(" " + dateFormat.format(date));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jenis = new javax.swing.JComboBox<>();
        Harga = new javax.swing.JTextField();
        Nomor = new javax.swing.JTextField();
        Bulan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listtable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        datet = new javax.swing.JTextField();
        Hapus = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ta_pdkp/mosaic.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KOST FORTUNE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 180, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jenis Kamar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bulan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Harga");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nomor Kamar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, 20));

        Jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1. Ber AC", "2. Tidak AC" }));
        Jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisActionPerformed(evt);
            }
        });
        jPanel1.add(Jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 160, -1));

        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        jPanel1.add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 160, -1));

        Nomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomorActionPerformed(evt);
            }
        });
        jPanel1.add(Nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 160, -1));

        Bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1. Januari", "2. Februari", "3. Maret", "4. April", "5. Mei", "6. Juni", "7. Juli", "8. Agustus", "9. September", "10. Oktober", "11. November", "12. Desember" }));
        jPanel1.add(Bulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 160, -1));

        jButton1.setText("BAYAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 150, 40));

        Reset.setText("Reset");
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel1.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 150, 40));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        listtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Jenis Kamar", "Bulan", "Harga", "Nomor Kamar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 460, 360));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("History");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 160, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        datet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetActionPerformed(evt);
            }
        });
        jPanel1.add(datet, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 160, -1));

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 430, 80, 30));

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 430, 80, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 470);

        setSize(new java.awt.Dimension(996, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisActionPerformed
        if(Jenis.getSelectedItem().toString().equalsIgnoreCase("1. BER AC")){
            Harga.setText("1000000");
        }else if(Jenis.getSelectedItem().toString().equalsIgnoreCase("2. Tidak AC")){
            Harga.setText("750000");
        }
    }//GEN-LAST:event_JenisActionPerformed
    
    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void NomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomorActionPerformed
      
    }//GEN-LAST:event_NomorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      model.insertRow(model.getRowCount(),new Object[]{datet.getText(),Jenis.getSelectedIndex(),Bulan.getSelectedIndex(),Harga.getText(),Nomor.getText()});
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:    
        Jenis.setSelectedIndex(0);
        Bulan.setSelectedIndex(0);
        Nomor.setText("");
        Harga.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void datetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datetActionPerformed

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetMouseClicked

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        int row = listtable.getSelectedRow();
        if(row>=0){
        int ok=JOptionPane.showConfirmDialog(null, "Yakin Mau Hapus?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok==0){
        model.removeRow(row);
        }
        }
    }//GEN-LAST:event_HapusActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Yakin Mau Keluar?","Konfirmasi",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_KeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Bulan;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Harga;
    private javax.swing.JComboBox<String> Jenis;
    private javax.swing.JButton Keluar;
    private javax.swing.JTextField Nomor;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField datet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listtable;
    // End of variables declaration//GEN-END:variables

    

