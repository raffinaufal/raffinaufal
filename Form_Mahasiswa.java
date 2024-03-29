/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package P4AgusRonaldo_15010;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agus Ronaldo
 */
public class Form_Mahasiswa extends javax.swing.JFrame {
    
    /*private Connection conn;
    private Statement stt;
    private ResultSet res;*/

    /**
     * Creates new form Form_Mahasiswa
     */
    public Form_Mahasiswa() {
        initComponents();
        tabelmhs();
        //koneksi();
    }
    
    public void tabelmhs(){
        DefaultTableModel tabbrg = new DefaultTableModel();
        tabbrg.addColumn("ID Mahasiswa");
        tabbrg.addColumn("Nama Mhs");
        tabbrg.addColumn("Alamat");
        
        jTable1_tabmhs.setModel(tabbrg);
        
        try {
            Statement stat = (Statement)koneksi.getConnection().createStatement();
            ResultSet result = stat.executeQuery("SELECT * FROM mahasiswa");
            while (result.next()){
                tabbrg.addRow(new Object[]{
                    result.getString("ID_MHS"),
                    result.getString("NAMA_MHS"),
                    result.getString("ALAMAT_MHS"),              
                });
                jTable1_tabmhs.setModel(tabbrg);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Ditampilkan");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    /*private void koneksi(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dB1","dB1");
            stt = conn.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi gagal");
        }
    } */
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1_txtNO_ID = new javax.swing.JTextField();
        jTextField2_NAMA = new javax.swing.JTextField();
        jTextField3_ALAMAT = new javax.swing.JTextField();
        jButton1_CARI = new javax.swing.JButton();
        TUTUP = new javax.swing.JButton();
        jButton3_TAMBAH = new javax.swing.JButton();
        jButton4_EDIT = new javax.swing.JButton();
        jButton5_HAPUS = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_tabmhs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA MAHASISWA");

        jLabel2.setText("No ID");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jButton1_CARI.setText("CARI");
        jButton1_CARI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_CARIMouseClicked(evt);
            }
        });
        jButton1_CARI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CARIActionPerformed(evt);
            }
        });

        TUTUP.setText("TUTUP");
        TUTUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUTUPActionPerformed(evt);
            }
        });

        jButton3_TAMBAH.setText("TAMBAH");
        jButton3_TAMBAH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_TAMBAHActionPerformed(evt);
            }
        });

        jButton4_EDIT.setText("EDIT");
        jButton4_EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_EDITActionPerformed(evt);
            }
        });

        jButton5_HAPUS.setText("HAPUS");
        jButton5_HAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_HAPUSActionPerformed(evt);
            }
        });

        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TUTUP, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3_ALAMAT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jTextField2_NAMA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1_txtNO_ID, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1_CARI, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_TAMBAH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4_EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5_HAPUS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(TUTUP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1_txtNO_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1_CARI))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2_NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3_ALAMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3_TAMBAH)
                    .addComponent(jButton4_EDIT)
                    .addComponent(jButton5_HAPUS)
                    .addComponent(RESET))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("MENU");

        jButton1.setText("MAHASISWA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("MATAKULIAH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("NILAI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTable1_tabmhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1_tabmhs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_tabmhsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_tabmhs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_CARIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CARIActionPerformed
        try {
            String cari = jTextField1_txtNO_ID.getText();
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String username = "dB1";
            String password = "dB1";
            
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            Connection conn = DriverManager.getConnection(url,username,password);
            Statement stt = conn.createStatement();
            String sql = "SELECT * FROM mahasiswa WHERE ID_MHS = '"+cari+"'";
            ResultSet rs = stt.executeQuery(sql);
            if(rs.next()){
                jTextField1_txtNO_ID.setText(rs.getString(1));
                jTextField2_NAMA.setText(rs.getString(2));
                jTextField3_ALAMAT.setText(rs.getString(3));
            }else{
                JOptionPane.showMessageDialog(null, "Data Tidak ada");
            }
            stt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan Data");
            
        }
   
    }//GEN-LAST:event_jButton1_CARIActionPerformed

    private void jButton1_CARIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_CARIMouseClicked
     
    }//GEN-LAST:event_jButton1_CARIMouseClicked

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
    jTextField1_txtNO_ID.setText("");
    jTextField2_NAMA.setText("");
    jTextField3_ALAMAT.setText("");
    }//GEN-LAST:event_RESETActionPerformed

    private void TUTUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUTUPActionPerformed
    System.exit(0);
    }//GEN-LAST:event_TUTUPActionPerformed

    private void jButton3_TAMBAHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_TAMBAHActionPerformed
    eMhs mhs = new eMhs();
    mhs.setidmhs(jTextField1_txtNO_ID.getText());
    mhs.setnama(jTextField2_NAMA.getText());
    mhs.setalamat(jTextField3_ALAMAT.getText());
    
    cCari control = new cCari();
    control.tambahmhs(mhs);
    
    tabelmhs();
        RESETActionPerformed(evt);
    }//GEN-LAST:event_jButton3_TAMBAHActionPerformed

    private void jButton4_EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_EDITActionPerformed
    eMhs mhs = new eMhs();
    mhs.setidmhs(jTextField1_txtNO_ID.getText());
    mhs.setnama(jTextField2_NAMA.getText());
    mhs.setalamat(jTextField3_ALAMAT.getText());
    
    cCari control= new cCari();
    control.ubahmhs(mhs);
    tabelmhs();
        RESETActionPerformed(evt);
    }//GEN-LAST:event_jButton4_EDITActionPerformed

    private void jButton5_HAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_HAPUSActionPerformed
    eMhs mhs = new eMhs();
    mhs.setidmhs(jTextField1_txtNO_ID.getText());
    
    cCari control = new cCari();
    control.hapusmhs(mhs);
    tabelmhs();
        RESETActionPerformed(evt);
    }//GEN-LAST:event_jButton5_HAPUSActionPerformed

    private void jTable1_tabmhsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_tabmhsMouseClicked
    int baris = jTable1_tabmhs.getSelectedRow();
    if(baris==-1){
        JOptionPane.showMessageDialog(this, "Pilih Data");
    }else{
     jTextField1_txtNO_ID.setText((String)jTable1_tabmhs.getValueAt(baris, 0));
     jTextField2_NAMA.setText((String)jTable1_tabmhs.getValueAt(baris, 1));
     jTextField3_ALAMAT.setText((String)jTable1_tabmhs.getValueAt(baris, 2));
    }
    }//GEN-LAST:event_jTable1_tabmhsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Form_Mahasiswa tampil;
    tampil=new Form_Mahasiswa();
    tampil.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Form_MatKul tampil;
    tampil=new Form_MatKul();
    tampil.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Form_Nilai tampil;
    tampil=new Form_Nilai();
    tampil.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RESET;
    private javax.swing.JButton TUTUP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_CARI;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3_TAMBAH;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton4_EDIT;
    private javax.swing.JButton jButton5_HAPUS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_tabmhs;
    private javax.swing.JTextField jTextField1_txtNO_ID;
    private javax.swing.JTextField jTextField2_NAMA;
    private javax.swing.JTextField jTextField3_ALAMAT;
    // End of variables declaration//GEN-END:variables
}
