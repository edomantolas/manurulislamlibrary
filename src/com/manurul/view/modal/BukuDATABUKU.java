/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.view.modal;

import com.manurul.lib.Characters;
import com.manurul.lib.InputBorder;
import java.awt.Toolkit;
import com.manurul.lib.RoundedPanel;
import com.manurul.model.BukuModel;
import com.manurul.view.Dashboard;
import java.awt.Color;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author RSI-13
 */
public class BukuDATABUKU extends javax.swing.JFrame {

    /**
     * Creates new form BukuDATABUKU
     */
    String title = "Edit";
    String Action;
    ImageIcon successIcon;
    
    String isbn;
    String judul;
    String jenis;
    String kategori;
    String harga;
    String lebar_panjang;
    String jumlah_halaman;
    String tahun_terbit;
    String penulis;
    String penerbit;
    int stok;
    String rak;
    String deskripsi;
    String max_dipinjam;
    
    BukuModel BM = new BukuModel();
    
    
    public BukuDATABUKU(String Action, String Kode) {
        initComponents();
        
        // SET ACTION
        this.Action = Action;
        
        // SET SIZE
        this.setSize(1040, 640);
        
        // SET CENTER LOCATION
        this.setLocationRelativeTo(null);
        
        // SET DISABLE RESIZESABLE
        this.setResizable(false);
        
        // SET ICON
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../src/LOGO_MANURUL.png")));
        
        // INIT INPUT BORDER PADDING
        InputBorder.set(INPUT_ISBN, 8);
        InputBorder.set(INPUT_JUDUL_BUKU, 8);
        InputBorder.set(INPUT_TAHUN_TERBIT, 8);
        InputBorder.set(INPUT_PENULIS, 8);
        InputBorder.set(INPUT_DESKRIPSI, 8);
        InputBorder.set(INPUT_BERMASALAH, 8);
        InputBorder.set(INPUT_DIPINJAM, 8);
        InputBorder.set(INPUT_CREATED, 8);
        InputBorder.set(INPUT_UPDATED, 8);
        
        // set year now
        int year = Calendar.getInstance().get(Calendar.YEAR);
        INPUT_TAHUN_TERBIT.setText(String.valueOf(year));
        
        // set kategori
        BM.getKategoriModel("");
        BM.getPenerbitModel("");
        BM.getRakModel();
        
        // SET VISIBLE COMPONENT BASE ON ACTION
        if(Action.equals("ADD")){
            
            this.setSize(1040, 640);
            this.title = "Tambah";
        
            LABEL_BERMASALAH.setVisible(false);
            INPUT_BERMASALAH.setVisible(false);
            
            LABEL_DIPINJAM.setVisible(false);
            INPUT_DIPINJAM.setVisible(false);
            
            LABEL_CREATED.setVisible(false);
            INPUT_CREATED.setVisible(false);
            
            LABEL_UPDATED.setVisible(false);
            INPUT_UPDATED.setVisible(false);
            
            BTN_HAPUS_BUKU.setVisible(false);
        }else{
        
            BM.getSelectedData(Kode);
            
            INPUT_ISBN.setText(BM.getIsbn());
            this.isbn = BM.getIsbn();
            
            INPUT_JUDUL_BUKU.setText(BM.getJudul());
            this.judul = BM.getJudul();
            
            INPUT_KATEGORI.setSelectedItem(BM.getKategori());
            this.kategori = BM.getKategori();
            
            INPUT_TAHUN_TERBIT.setText(BM.getTahunTerbit());
            this.tahun_terbit = BM.getTahunTerbit();
            
            INPUT_HARGA_BUKU.setValue(Float.parseFloat(BM.getHarga()));
            this.harga = BM.getHarga();
            
            INPUT_JENIS.setSelectedItem(BM.getJenis());
            this.jenis = BM.getJenis();
            
            INPUT_MAX_BATAS_PINJAM.setValue(Integer.parseInt(BM.getMaxDipinjam()));
            this.max_dipinjam = BM.getMaxDipinjam();
            
            INPUT_PENERBIT.setSelectedItem(BM.getPenerbit());
            this.penerbit = BM.getPenerbit();
            
            INPUT_PENULIS.setText(BM.getPenulis());
            this.penulis = BM.getPenulis();
            
            INPUT_STOK.setValue(BM.getStok());
            this.stok = BM.getStok();
            
            INPUT_RAK.setSelectedItem(BM.getRak());
            this.rak = BM.getRak();
            
            INPUT_DESKRIPSI.setText(BM.getDeskripsi());
            this.deskripsi = BM.getDeskripsi();
            
            INPUT_CREATED.setText(BM.getCreated());
            INPUT_UPDATED.setText(BM.getUpdated());
            
        }
        
        // SET TITLE
        this.setTitle("MA Nurul Islam Library Management - "+this.title+" Buku");
        
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

        FRAME_MAIN_ANGGOTA = new javax.swing.JPanel();
        CONTAINER_ANGGOTA = new RoundedPanel(15, Color.WHITE);
        LABEL_ISBN = new javax.swing.JLabel();
        INPUT_ISBN = new javax.swing.JTextField();
        LABEL_MAX_HARI_PINJAM = new javax.swing.JLabel();
        LABEL_JUDUL_BUKU = new javax.swing.JLabel();
        LABEL_DESKRIPSI = new javax.swing.JLabel();
        INPUT_JUDUL_BUKU = new javax.swing.JTextField();
        INPUT_DESKRIPSI = new javax.swing.JTextField();
        LABEL_KATEGORI = new javax.swing.JLabel();
        INPUT_KATEGORI = new javax.swing.JComboBox<>();
        INPUT_BERMASALAH = new javax.swing.JTextField();
        LABEL_BERMASALAH = new javax.swing.JLabel();
        LABEL_TAHUN_TERBIT = new javax.swing.JLabel();
        LABEL_PENERBIT = new javax.swing.JLabel();
        LABEL_HARGA_BUKU = new javax.swing.JLabel();
        LABEL_PENULIS = new javax.swing.JLabel();
        INPUT_PENULIS = new javax.swing.JTextField();
        LABEL_UPDATED = new javax.swing.JLabel();
        INPUT_UPDATED = new javax.swing.JTextField();
        INPUT_DIPINJAM = new javax.swing.JTextField();
        LABEL_DIPINJAM = new javax.swing.JLabel();
        INPUT_CREATED = new javax.swing.JTextField();
        LABEL_CREATED = new javax.swing.JLabel();
        LABEL_STOK = new javax.swing.JLabel();
        LABEL_RAK = new javax.swing.JLabel();
        INPUT_MAX_BATAS_PINJAM = new javax.swing.JSpinner();
        INPUT_STOK = new javax.swing.JSpinner();
        INPUT_RAK = new javax.swing.JComboBox<>();
        INPUT_PENERBIT = new javax.swing.JComboBox<>();
        INPUT_HARGA_BUKU = new javax.swing.JSpinner();
        LABEL_HARGA_BUKU_RP = new javax.swing.JLabel();
        INPUT_JENIS = new javax.swing.JComboBox<>();
        LABEL_JENIS = new javax.swing.JLabel();
        INPUT_TAHUN_TERBIT = new javax.swing.JTextField();
        BTN_SIMPAN_BUKU = new javax.swing.JButton();
        BTN_HAPUS_BUKU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        FRAME_MAIN_ANGGOTA.setBackground(new java.awt.Color(239, 240, 245));
        FRAME_MAIN_ANGGOTA.setPreferredSize(new java.awt.Dimension(1024, 414));

        CONTAINER_ANGGOTA.setBackground(new java.awt.Color(239, 240, 245));

        LABEL_ISBN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_ISBN.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_ISBN.setText("ISBN");

        INPUT_ISBN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_ISBN.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_ISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_MAX_HARI_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_MAX_HARI_PINJAM.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_MAX_HARI_PINJAM.setText("Maksimal Batas Pinjam ( Hari )");

        LABEL_JUDUL_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_JUDUL_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_JUDUL_BUKU.setText("Judul Buku");

        LABEL_DESKRIPSI.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_DESKRIPSI.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_DESKRIPSI.setText("Deskripsi");

        INPUT_JUDUL_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_JUDUL_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_JUDUL_BUKU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        INPUT_DESKRIPSI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_DESKRIPSI.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_DESKRIPSI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_KATEGORI.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_KATEGORI.setText("Kategori");

        INPUT_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_KATEGORI.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_KATEGORI.setBorder(null);

        INPUT_BERMASALAH.setEditable(false);
        INPUT_BERMASALAH.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_BERMASALAH.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_BERMASALAH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_BERMASALAH.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_BERMASALAH.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_BERMASALAH.setText("Bermasalah");

        LABEL_TAHUN_TERBIT.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_TAHUN_TERBIT.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_TAHUN_TERBIT.setText("Tahun Terbit");

        LABEL_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_PENERBIT.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_PENERBIT.setText("Penerbit");

        LABEL_HARGA_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_HARGA_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_HARGA_BUKU.setText("Harga Buku");

        LABEL_PENULIS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_PENULIS.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_PENULIS.setText("Penulis");

        INPUT_PENULIS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_PENULIS.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_PENULIS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_UPDATED.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_UPDATED.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_UPDATED.setText("Terakhir Diperbarui");

        INPUT_UPDATED.setEditable(false);
        INPUT_UPDATED.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_UPDATED.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_UPDATED.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        INPUT_DIPINJAM.setEditable(false);
        INPUT_DIPINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_DIPINJAM.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_DIPINJAM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_DIPINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_DIPINJAM.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_DIPINJAM.setText("Sedang Dipinjam");

        INPUT_CREATED.setEditable(false);
        INPUT_CREATED.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_CREATED.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_CREATED.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_CREATED.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_CREATED.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_CREATED.setText("Tanggal Dibuat");

        LABEL_STOK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_STOK.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_STOK.setText("Stok");

        LABEL_RAK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_RAK.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_RAK.setText("Rak");

        INPUT_MAX_BATAS_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_MAX_BATAS_PINJAM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));

        INPUT_STOK.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_STOK.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        INPUT_RAK.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_RAK.setBorder(null);

        INPUT_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        INPUT_HARGA_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_HARGA_BUKU.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        INPUT_HARGA_BUKU.setBorder(null);

        LABEL_HARGA_BUKU_RP.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_HARGA_BUKU_RP.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_HARGA_BUKU_RP.setText("Rp");

        INPUT_JENIS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_JENIS.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_JENIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UMUM", "PAKET" }));
        INPUT_JENIS.setBorder(null);

        LABEL_JENIS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_JENIS.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_JENIS.setText("Jenis");

        javax.swing.GroupLayout CONTAINER_ANGGOTALayout = new javax.swing.GroupLayout(CONTAINER_ANGGOTA);
        CONTAINER_ANGGOTA.setLayout(CONTAINER_ANGGOTALayout);
        CONTAINER_ANGGOTALayout.setHorizontalGroup(
            CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(INPUT_KATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INPUT_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LABEL_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INPUT_JUDUL_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LABEL_JUDUL_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LABEL_KATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(INPUT_TAHUN_TERBIT)
                            .addComponent(LABEL_HARGA_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(LABEL_TAHUN_TERBIT, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                                .addComponent(LABEL_HARGA_BUKU_RP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(INPUT_HARGA_BUKU)))
                        .addGap(36, 36, 36)))
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(INPUT_MAX_BATAS_PINJAM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LABEL_MAX_HARI_PINJAM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LABEL_PENULIS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(INPUT_PENULIS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                            .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(INPUT_STOK, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LABEL_STOK, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LABEL_RAK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(INPUT_RAK, 0, 130, Short.MAX_VALUE)))
                        .addComponent(INPUT_PENERBIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LABEL_PENERBIT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(INPUT_JENIS, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABEL_JENIS, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_DESKRIPSI, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_BERMASALAH, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABEL_BERMASALAH, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LABEL_DESKRIPSI, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(INPUT_DIPINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LABEL_DIPINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(INPUT_UPDATED, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LABEL_UPDATED, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LABEL_CREATED, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_CREATED, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        CONTAINER_ANGGOTALayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {INPUT_BERMASALAH, INPUT_CREATED, INPUT_DESKRIPSI, INPUT_DIPINJAM, INPUT_ISBN, INPUT_JENIS, INPUT_JUDUL_BUKU, INPUT_KATEGORI, INPUT_MAX_BATAS_PINJAM, INPUT_PENERBIT, INPUT_PENULIS, INPUT_UPDATED, LABEL_BERMASALAH, LABEL_CREATED, LABEL_DESKRIPSI, LABEL_DIPINJAM, LABEL_HARGA_BUKU, LABEL_ISBN, LABEL_JENIS, LABEL_JUDUL_BUKU, LABEL_KATEGORI, LABEL_MAX_HARI_PINJAM, LABEL_PENERBIT, LABEL_PENULIS, LABEL_TAHUN_TERBIT, LABEL_UPDATED});

        CONTAINER_ANGGOTALayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {INPUT_RAK, INPUT_STOK});

        CONTAINER_ANGGOTALayout.setVerticalGroup(
            CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_ISBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_DESKRIPSI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_DESKRIPSI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_JENIS, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_JENIS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_JUDUL_BUKU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INPUT_JUDUL_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INPUT_MAX_BATAS_PINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL_BERMASALAH)
                            .addComponent(LABEL_MAX_HARI_PINJAM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_BERMASALAH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LABEL_KATEGORI)
                            .addComponent(LABEL_PENERBIT, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INPUT_KATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INPUT_PENERBIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_DIPINJAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_DIPINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_TAHUN_TERBIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_TAHUN_TERBIT))
                    .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                            .addComponent(LABEL_PENULIS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(INPUT_PENULIS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                            .addComponent(LABEL_UPDATED)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(INPUT_UPDATED, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_RAK)
                    .addComponent(LABEL_CREATED)
                    .addComponent(LABEL_HARGA_BUKU)
                    .addComponent(LABEL_STOK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(INPUT_STOK)
                    .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(INPUT_RAK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(INPUT_CREATED, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(INPUT_HARGA_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LABEL_HARGA_BUKU_RP)))
                .addGap(25, 25, 25))
        );

        CONTAINER_ANGGOTALayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {INPUT_HARGA_BUKU, INPUT_RAK});

        CONTAINER_ANGGOTALayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {INPUT_KATEGORI, INPUT_PENERBIT});

        CONTAINER_ANGGOTALayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {INPUT_JUDUL_BUKU, INPUT_MAX_BATAS_PINJAM});

        BTN_SIMPAN_BUKU.setBackground(new java.awt.Color(0, 171, 60));
        BTN_SIMPAN_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_SIMPAN_BUKU.setForeground(new java.awt.Color(255, 255, 255));
        BTN_SIMPAN_BUKU.setText("Simpan");
        BTN_SIMPAN_BUKU.setBorder(null);
        BTN_SIMPAN_BUKU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_SIMPAN_BUKUMouseClicked(evt);
            }
        });

        BTN_HAPUS_BUKU.setBackground(new java.awt.Color(153, 153, 153));
        BTN_HAPUS_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_HAPUS_BUKU.setForeground(new java.awt.Color(255, 255, 255));
        BTN_HAPUS_BUKU.setText("Hapus");
        BTN_HAPUS_BUKU.setBorder(null);
        BTN_HAPUS_BUKU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_HAPUS_BUKUMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FRAME_MAIN_ANGGOTALayout = new javax.swing.GroupLayout(FRAME_MAIN_ANGGOTA);
        FRAME_MAIN_ANGGOTA.setLayout(FRAME_MAIN_ANGGOTALayout);
        FRAME_MAIN_ANGGOTALayout.setHorizontalGroup(
            FRAME_MAIN_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRAME_MAIN_ANGGOTALayout.createSequentialGroup()
                .addGroup(FRAME_MAIN_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FRAME_MAIN_ANGGOTALayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CONTAINER_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FRAME_MAIN_ANGGOTALayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_HAPUS_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_SIMPAN_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        FRAME_MAIN_ANGGOTALayout.setVerticalGroup(
            FRAME_MAIN_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRAME_MAIN_ANGGOTALayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CONTAINER_ANGGOTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(FRAME_MAIN_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_SIMPAN_BUKU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_HAPUS_BUKU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FRAME_MAIN_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, 1045, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FRAME_MAIN_ANGGOTA, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private boolean cekValidasi(){
    
        try{
        
            String isbn = INPUT_ISBN.getText().replaceAll("[a-zA-Z]", "");
            String judul = Characters.ucwords(INPUT_JUDUL_BUKU.getText());
            String kategori = INPUT_KATEGORI.getSelectedItem().toString();
            String tahun_terbit = INPUT_TAHUN_TERBIT.getText().replaceAll("[a-zA-Z]", "");
            String harga_buku = INPUT_HARGA_BUKU.getValue().toString();
            String jenis = INPUT_JENIS.getSelectedItem().toString();
            
            int hari_max_pinjam = Integer.parseInt(INPUT_MAX_BATAS_PINJAM.getValue().toString());
            String hari_max_pinjam_str = INPUT_MAX_BATAS_PINJAM.getValue().toString();
            
            String penerbit = INPUT_PENERBIT.getSelectedItem().toString();
            String penulis = Characters.ucwords(INPUT_PENULIS.getText().replaceAll("[0-9]", ""));
            int stok = Integer.parseInt(INPUT_STOK.getValue().toString());
            String rak = INPUT_RAK.getSelectedItem().toString();
            String deskripsi = INPUT_DESKRIPSI.getText();
            
            if(!this.Action.equals("ADD")){
                
                if  (
                        
                        isbn.equals(this.isbn) &&
                        judul.equals(this.judul) &&
                        kategori.equals(this.kategori) &&
                        tahun_terbit.equals(this.tahun_terbit) &&
                        jenis.equals(this.jenis) &&
                        hari_max_pinjam_str.equals(this.max_dipinjam) &&
                        penerbit.equals(this.penerbit) &&
                        penulis.equals(this.penulis) &&
                        stok == this.stok &&
                        rak.equals(this.rak) &&
                        deskripsi.equals(deskripsi)
                        
                    ){
                
                    throw new Exception("Tidak ada perubahan data !");
                
                }
                
            }
            
            if(isbn.equals("")){
                throw new Exception("Nilai ISBN harus terisi dan berisi angka !");
            }
            
            if(judul.equals("")){
                throw new Exception("Nilai judul harus terisi !");
            }
            
            if(tahun_terbit.equals("")){
                throw new Exception("Nilai tahun terbit harus terisi dan berisi tahun !");
            }
            
            if(tahun_terbit.length() < 4 || tahun_terbit.length() > 4){
                throw new Exception("Nilai tahun terbit tidak valid !");
            }
            
            if(penerbit.equals("")){
                throw new Exception("Nilai penerbit harus terisi !");
            }
            
            if(penulis.equals("")){
                throw new Exception("Nilai penulis harus terisi !");
            }
            
            if(hari_max_pinjam <= 0){
                throw new Exception("Nilai hari pinjam terlalu rendah !");
            }
            
            if(stok < 0){
                throw new Exception("Nilai stok terlalu rendah !");
            }
            
            BM.setIsbn(isbn);
            BM.setJudul(judul);
            BM.setKategori(kategori);
            BM.setTahunTerbit(tahun_terbit);
            BM.setHarga(harga_buku);
            BM.setJenis(jenis);
            BM.setMaxDipinjam(String.valueOf(hari_max_pinjam));
            BM.setPenerbit(penerbit);
            BM.setPenulis(penulis);
            BM.setStok(stok);
            BM.setRak(rak);
            BM.setDeskripsi(deskripsi);
            
            return true;
            
        }catch(Exception error){
   
            JOptionPane.showMessageDialog(null, error.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        
        }
        
    }
    
    private void inputRevalidate(){
    
        INPUT_ISBN.setText(this.isbn);
        INPUT_JUDUL_BUKU.setText(this.judul);
        INPUT_KATEGORI.setSelectedItem(this.kategori);
        INPUT_TAHUN_TERBIT.setText(this.tahun_terbit);
        INPUT_HARGA_BUKU.setValue(Float.valueOf(this.harga));
        INPUT_JENIS.setSelectedItem(this.jenis);
        INPUT_MAX_BATAS_PINJAM.setValue(Integer.parseInt(this.max_dipinjam));
        INPUT_PENERBIT.setSelectedItem(this.penerbit);
        INPUT_PENULIS.setText(this.penulis);
        INPUT_STOK.setValue(this.stok);
        INPUT_RAK.setSelectedItem(this.rak);
        INPUT_DESKRIPSI.setText(this.deskripsi);
        
    }
    
    private void insert(){
        if(BM.insertData()){

            JOptionPane.showMessageDialog(null, BM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);

            new BukuModel().setDataTable(Dashboard.SEARCH_BUKU.getText(), Dashboard.KATEGORI_COMBOBOX_BUKU.getSelectedItem().toString(), Dashboard.TAMPILKAN_COMBOBOX_BUKU.getSelectedItem().toString());

            this.dispose();

        }else{

            JOptionPane.showMessageDialog(null, BM.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);

        }
    }
    
    private void update(){
        if(BM.updateData()){
        
            JOptionPane.showMessageDialog(null, BM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);

            new BukuModel().setDataTable(Dashboard.SEARCH_BUKU.getText(), Dashboard.KATEGORI_COMBOBOX_BUKU.getSelectedItem().toString(), Dashboard.TAMPILKAN_COMBOBOX_BUKU.getSelectedItem().toString());

            this.dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, BM.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void delete(){
        
        int hapus = JOptionPane.showConfirmDialog(null, "Apakah anda ingin mengapus buku "+BM.getJudul()+" ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(hapus == 0){
            
            inputRevalidate();

            if(BM.deleteData()){

                JOptionPane.showMessageDialog(null, BM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);

                new BukuModel().setDataTable(Dashboard.SEARCH_BUKU.getText(), Dashboard.KATEGORI_COMBOBOX_BUKU.getSelectedItem().toString(), Dashboard.TAMPILKAN_COMBOBOX_BUKU.getSelectedItem().toString());

                this.dispose();

            }else{
                
                JOptionPane.showMessageDialog(null, BM.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
                
            }
                
        }
        
    }
    
    private void BTN_SIMPAN_BUKUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_SIMPAN_BUKUMouseClicked
        if(cekValidasi()){
            if(this.Action.equals("ADD")){
                insert();
            }else{
                update();
            }
        }
    }//GEN-LAST:event_BTN_SIMPAN_BUKUMouseClicked

    private void BTN_HAPUS_BUKUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_HAPUS_BUKUMouseClicked
        delete();
    }//GEN-LAST:event_BTN_HAPUS_BUKUMouseClicked

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
            java.util.logging.Logger.getLogger(BukuDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukuDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukuDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukuDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukuDATABUKU("", "").setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_HAPUS_BUKU;
    private javax.swing.JButton BTN_SIMPAN_BUKU;
    private javax.swing.JPanel CONTAINER_ANGGOTA;
    private javax.swing.JPanel FRAME_MAIN_ANGGOTA;
    private javax.swing.JTextField INPUT_BERMASALAH;
    private javax.swing.JTextField INPUT_CREATED;
    private javax.swing.JTextField INPUT_DESKRIPSI;
    private javax.swing.JTextField INPUT_DIPINJAM;
    private javax.swing.JSpinner INPUT_HARGA_BUKU;
    private javax.swing.JTextField INPUT_ISBN;
    public static javax.swing.JComboBox<String> INPUT_JENIS;
    private javax.swing.JTextField INPUT_JUDUL_BUKU;
    public static javax.swing.JComboBox<String> INPUT_KATEGORI;
    private javax.swing.JSpinner INPUT_MAX_BATAS_PINJAM;
    public static javax.swing.JComboBox<String> INPUT_PENERBIT;
    private javax.swing.JTextField INPUT_PENULIS;
    public static javax.swing.JComboBox<String> INPUT_RAK;
    private javax.swing.JSpinner INPUT_STOK;
    private javax.swing.JTextField INPUT_TAHUN_TERBIT;
    private javax.swing.JTextField INPUT_UPDATED;
    private javax.swing.JLabel LABEL_BERMASALAH;
    private javax.swing.JLabel LABEL_CREATED;
    private javax.swing.JLabel LABEL_DESKRIPSI;
    private javax.swing.JLabel LABEL_DIPINJAM;
    private javax.swing.JLabel LABEL_HARGA_BUKU;
    private javax.swing.JLabel LABEL_HARGA_BUKU_RP;
    private javax.swing.JLabel LABEL_ISBN;
    private javax.swing.JLabel LABEL_JENIS;
    private javax.swing.JLabel LABEL_JUDUL_BUKU;
    private javax.swing.JLabel LABEL_KATEGORI;
    private javax.swing.JLabel LABEL_MAX_HARI_PINJAM;
    private javax.swing.JLabel LABEL_PENERBIT;
    private javax.swing.JLabel LABEL_PENULIS;
    private javax.swing.JLabel LABEL_RAK;
    private javax.swing.JLabel LABEL_STOK;
    private javax.swing.JLabel LABEL_TAHUN_TERBIT;
    private javax.swing.JLabel LABEL_UPDATED;
    // End of variables declaration//GEN-END:variables
}