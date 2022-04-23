/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.view.modal;

import com.manurul.lib.InputBorder;
import java.awt.Toolkit;
import com.manurul.lib.RoundedPanel;
import com.manurul.model.KelasModel;
import com.manurul.model.LogModel;
import com.manurul.view.Dashboard;
import static com.manurul.view.modal.JurusanUSER.INPUT_NAMA_JUR;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author caesarhome
 */
public class KelasUSER extends javax.swing.JFrame {

    /**
     * Creates new form JurusanUSER
     */
    private String title = "Edit";
    
    private String Action;
    private String kode;
    
    ImageIcon successIcon;
    
    KelasModel KM = new KelasModel();
    
    public KelasUSER(String Action, String Kode) {
        initComponents();
        System.out.println(Kode);
        
        // INIT STATE
        this.Action = Action;
        this.kode = Kode;
        
        // SET SIZE
        this.setSize(1024, 270);
        
        // SET CENTER LOCATION
        this.setLocationRelativeTo(null);
        
        // SET DISABLE RESIZESABLE
        this.setResizable(false);
        
        // SET ICON
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../src/LOGO_MANURUL.png")));
        
        // INIT INPUT BORDER PADDING
        InputBorder.set(INPUT_KODE_KELAS, 8);
        InputBorder.set(INPUT_CREATED_KELAS, 8);
        InputBorder.set(INPUT_LAST_UPDATED_KELAS, 8);
        
        // SET COMPONENT BASED ON ACTION
        if(Action.equals("ADD")){
            
            this.title = "Tambah";
            
            this.setSize(1024, 270);
            
            LABEL_CREATED_KEL.setVisible(false);
            INPUT_CREATED_KELAS.setVisible(false);
            
            LABEL_LAST_UPDATED_KEL.setVisible(false);
            INPUT_LAST_UPDATED_KELAS.setVisible(false);
            
            BTN_HAPUS_KELAS.setVisible(false);
            
        }else{
            KM.getSelected(Kode);
        }
        
        // SET TITLE
        this.setTitle("MA Nurul Islam Library Management - " + this.title + " Kelas");
        
        // SET SUCCESS ICON
        ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/manurul/src/ICON_SUCCESS.png"));
        this.successIcon = successIcon;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_FRAME = new javax.swing.JPanel();
        CONTAINER = new RoundedPanel(15, Color.WHITE);
        INPUT_KODE_KELAS = new javax.swing.JTextField("", 8);
        LABEL_KODE_KELAS = new javax.swing.JLabel();
        INPUT_LAST_UPDATED_KELAS = new javax.swing.JTextField();
        LABEL_LAST_UPDATED_KEL = new javax.swing.JLabel();
        LABEL_CREATED_KEL = new javax.swing.JLabel();
        INPUT_CREATED_KELAS = new javax.swing.JTextField();
        BTN_HAPUS_KELAS = new javax.swing.JButton();
        BTN_SIMPAN_KELAS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        MAIN_FRAME.setBackground(new java.awt.Color(239, 240, 245));

        CONTAINER.setBackground(new java.awt.Color(239, 240, 245));

        INPUT_KODE_KELAS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_KODE_KELAS.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_KODE_KELAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));
        INPUT_KODE_KELAS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                INPUT_KODE_KELASKeyPressed(evt);
            }
        });

        LABEL_KODE_KELAS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_KODE_KELAS.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_KODE_KELAS.setText("Kode");

        INPUT_LAST_UPDATED_KELAS.setEditable(false);
        INPUT_LAST_UPDATED_KELAS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_LAST_UPDATED_KELAS.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_LAST_UPDATED_KELAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_LAST_UPDATED_KEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_LAST_UPDATED_KEL.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_LAST_UPDATED_KEL.setText("Terakhir Diperbarui");

        LABEL_CREATED_KEL.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_CREATED_KEL.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_CREATED_KEL.setText("Tanggal Dibuat");

        INPUT_CREATED_KELAS.setEditable(false);
        INPUT_CREATED_KELAS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_CREATED_KELAS.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_CREATED_KELAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        javax.swing.GroupLayout CONTAINERLayout = new javax.swing.GroupLayout(CONTAINER);
        CONTAINER.setLayout(CONTAINERLayout);
        CONTAINERLayout.setHorizontalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INPUT_KODE_KELAS, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL_KODE_KELAS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_LAST_UPDATED_KELAS, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(LABEL_LAST_UPDATED_KEL, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_CREATED_KELAS, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(LABEL_CREATED_KEL, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );
        CONTAINERLayout.setVerticalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_KODE_KELAS)
                    .addComponent(LABEL_LAST_UPDATED_KEL)
                    .addComponent(LABEL_CREATED_KEL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INPUT_KODE_KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_CREATED_KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_LAST_UPDATED_KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        BTN_HAPUS_KELAS.setBackground(new java.awt.Color(153, 153, 153));
        BTN_HAPUS_KELAS.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_HAPUS_KELAS.setForeground(new java.awt.Color(255, 255, 255));
        BTN_HAPUS_KELAS.setText("Hapus");
        BTN_HAPUS_KELAS.setBorder(null);
        BTN_HAPUS_KELAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_HAPUS_KELASMouseClicked(evt);
            }
        });

        BTN_SIMPAN_KELAS.setBackground(new java.awt.Color(0, 171, 60));
        BTN_SIMPAN_KELAS.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_SIMPAN_KELAS.setForeground(new java.awt.Color(255, 255, 255));
        BTN_SIMPAN_KELAS.setText("Simpan");
        BTN_SIMPAN_KELAS.setBorder(null);
        BTN_SIMPAN_KELAS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_SIMPAN_KELASMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MAIN_FRAMELayout = new javax.swing.GroupLayout(MAIN_FRAME);
        MAIN_FRAME.setLayout(MAIN_FRAMELayout);
        MAIN_FRAMELayout.setHorizontalGroup(
            MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIN_FRAMELayout.createSequentialGroup()
                .addGroup(MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                        .addContainerGap(420, Short.MAX_VALUE)
                        .addComponent(BTN_HAPUS_KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_SIMPAN_KELAS, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        MAIN_FRAMELayout.setVerticalGroup(
            MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(CONTAINER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_SIMPAN_KELAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_HAPUS_KELAS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean cekValidasi(String Action){
    
        try{
        
            // apakah kode kosong ?
            if(INPUT_KODE_KELAS.getText().equals("")){
                throw new Exception("Nilai input harus terisi!");
            }
            
            // apakah action = delete
            if(!Action.equals("DELETE")){
                if(INPUT_KODE_KELAS.getText().equals(kode)){
                    throw new Exception("Tidak ada perubahan data!");
                }
            }
            
            return true;
            
        }catch(Exception error){
            
            JOptionPane.showMessageDialog(null, error.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        
    }
    
    private void simpan(){
        if(cekValidasi("ADD")){
            KM.setKode(INPUT_KODE_KELAS.getText());
            if(KM.insertData()){
                    JOptionPane.showMessageDialog(null, KM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);
                    new LogModel().Action("TAMBAH KELAS", "Menambahkan kelas "+INPUT_KODE_KELAS.getText(), Dashboard.nama_user);
                    KM.getDataTable("");
                    this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, KM.getMessage(), "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void update(){
    
        if(cekValidasi("UPDATE")){
            KM.setKode(INPUT_KODE_KELAS.getText());
            if(KM.updateData()){
                    JOptionPane.showMessageDialog(null, KM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);
                    new LogModel().Action("UPDATE KELAS", "Memperbarui kelas "+INPUT_KODE_KELAS.getText(), Dashboard.nama_user);
                    KM.getDataTable("");
                    this.dispose();
            }else{
                    JOptionPane.showMessageDialog(null, KM.getMessage(), "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            }
        }
    
    }
    
    private void hapus(){
    
        if(cekValidasi("DELETE")){
            INPUT_KODE_KELAS.setText(KM.getKode());
            if(KM.deleteData()){
                    JOptionPane.showMessageDialog(null, KM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);
                    new LogModel().Action("HAPUS KELAS", "Mengahapus kelas "+INPUT_KODE_KELAS.getText(), Dashboard.nama_user);
                    KM.getDataTable("");
                    this.dispose();
            }else{
                    JOptionPane.showMessageDialog(null, KM.getMessage(), "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
    
    private void BTN_SIMPAN_KELASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_SIMPAN_KELASMouseClicked
        if(this.Action.equals("ADD")){
            simpan(); 
        }else{
            update();
        }
    }//GEN-LAST:event_BTN_SIMPAN_KELASMouseClicked

    private void INPUT_KODE_KELASKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_INPUT_KODE_KELASKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(this.Action.equals("ADD")){
                simpan(); 
            }else{
                update();
            }
        }
    }//GEN-LAST:event_INPUT_KODE_KELASKeyPressed

    private void BTN_HAPUS_KELASMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_HAPUS_KELASMouseClicked
        int hapus = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus kelas ini ?", "Konfirmasi!", JOptionPane.OK_CANCEL_OPTION);
        if(hapus == 0){
            hapus();
        }
    }//GEN-LAST:event_BTN_HAPUS_KELASMouseClicked

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
            java.util.logging.Logger.getLogger(KelasUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelasUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelasUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelasUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelasUSER("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_HAPUS_KELAS;
    private javax.swing.JButton BTN_SIMPAN_KELAS;
    private javax.swing.JPanel CONTAINER;
    public static javax.swing.JTextField INPUT_CREATED_KELAS;
    public static javax.swing.JTextField INPUT_KODE_KELAS;
    public static javax.swing.JTextField INPUT_LAST_UPDATED_KELAS;
    private javax.swing.JLabel LABEL_CREATED_KEL;
    private javax.swing.JLabel LABEL_KODE_KELAS;
    private javax.swing.JLabel LABEL_LAST_UPDATED_KEL;
    private javax.swing.JPanel MAIN_FRAME;
    // End of variables declaration//GEN-END:variables
}
