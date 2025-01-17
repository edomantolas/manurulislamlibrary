/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.model;

import com.manurul.lib.DBConfig;
import com.manurul.lib.GenKode;
import static com.manurul.lib.GenKode.getTimeMiliSecond;
import com.manurul.lib.SqlTime;
import com.manurul.view.Dashboard;
import com.manurul.view.modal.getDaftarBukuTRANSAKSI;
import com.manurul.view.modal.getPeminjamTRANSAKSI;
import com.manurul.view.modal.konfirmasiTransaksiPinjam;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.Timer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author caesarhome
 */

public class TransaksiModel extends DBConfig{
    
    private Connection conn = (Connection)DBConfig.getConnection();
   
    // dashboard
    DefaultTableModel table_pinjam_model = new DefaultTableModel();
    
    // getPeminjamTransaksi
    DefaultTableModel table_model = new DefaultTableModel();
    
    // getDaftarBukuTransaksi
    
    // var global for data transaksi
    private String id_transaksi;
    private String nis;
    private String nama;
    private String kode_pengurus;
    private String jenis_buku;
    private String status_transaksi;
    private int jumlah_buku_dipinjam;
    private String createdAt;
    private String updatedAt;
    
    private String message;
    
    public void setId(String id){
        this.id_transaksi = id;
    }
    
    public String getId(){
        return this.id_transaksi;
    }
    
    public void setNis(String nis){
        this.nis = nis;
    }
    
    public String getNis(){
        return this.nis;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setKodePengurus(String id){
        this.kode_pengurus = id;
    }
    
    public String getKodePengurus(){
        return this.kode_pengurus;
    }
    
    public void setJenisBuku(String jenis){
        this.jenis_buku = jenis;
    }
    
    public String getJenisBuku(){
        return this.jenis_buku;
    }
    
    public void setStatusTransaksi(String status){
        this.status_transaksi = status;
    }
    
    public String getStatusTransksi(){
        return this.status_transaksi;
    }
    
    public void setJumlahBukuDipinjam(int jumlah){
        this.jumlah_buku_dipinjam = jumlah;
    }
    
    public int getJumlahBukuDipinjam(){
        return this.jumlah_buku_dipinjam;
    }
    
    public void setCreated(String created){
        this.createdAt = created;
    }
    
    public String getCreated(){
        return this.createdAt;
    }
    
    public void setUpdated(String updated){
        this.updatedAt = updated;
    }
    
    public String getUpdated(){
        return this.updatedAt;
    } 
    
    public void setMessage(String msg){
        this.message = msg;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    public static void setDateNowTransaksi(){
    
        Dashboard.PJ_INPUT_ID_TRANSAKSI.setText(GenKode.Transaksi());
        
    }
    
    // get realtime
    public void getDateRealTime(){
    
        Timer timer;
        
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
              String date = GenKode.TransaksiGetDate();
              Dashboard.PJ_INPUT_TGL_PINJAM.setText(date);
            }
        });
        
        timer.start();
    }
    
    // set datatable dashboad - pinjam
    public void setHeadTableDashboardPinjam(){
        table_pinjam_model.setColumnCount(0);
        table_pinjam_model.addColumn("ISBN");
        table_pinjam_model.addColumn("Judul Buku");
        table_pinjam_model.addColumn("Masa Pinjam");
        
        table_pinjam_model.setRowCount(0);
        table_pinjam_model.addRow(new String[]{
            "",
            "",
            ""
        });
        
        Dashboard.TABLE_LIST_PINJAM.setModel(table_pinjam_model);
    }
    
    // set datatable dashboard - pinjam - addrow
    public void setRowTableDashboardPinjam(String[] rowData, boolean started){
        
        DefaultTableModel addModel = (DefaultTableModel)table_pinjam_model;
        if(started){
            addModel.setRowCount(0);
        }
        addModel.addRow(rowData);
        
    }
    
    // set datatable from request
    public void setDataAnggota(String Keyword){
        
        // SET COLUMN TABLE
        table_model.setColumnCount(0);
        table_model.addColumn("NIS");
        table_model.addColumn("Nama");
        table_model.addColumn("Jurusan");
        table_model.addColumn("Skor");
        table_model.addColumn("Ksmptn Pinjam");
        
        table_model.setRowCount(0);
        
        try{
        
            String sql = "SELECT ma_anggota.nis, ma_anggota.nama_lengkap, ma_anggota.jurusan, ma_anggota.skor, "
                    + "ma_setting.max_pinjam_buku_umum - ma_anggota.jumlah_buku_dipinjam as kesempatan_pinjam FROM ma_anggota JOIN"
                    + " ma_setting"
                    + " WHERE ma_anggota.nis LIKE '%"+Keyword+"%' OR ma_anggota.nama_lengkap LIKE '%"+Keyword+"%'";
            if(Keyword.equals("")){
                sql = "SELECT ma_anggota.nis, ma_anggota.nama_lengkap, ma_anggota.jurusan, ma_anggota.skor,"
                        + " ma_setting.max_pinjam_buku_umum - ma_anggota.jumlah_buku_dipinjam as kesempatan_pinjam"
                        + " FROM ma_anggota JOIN ma_setting";
            }
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            
            while(res.next()){
                table_model.addRow(new Object[]{
                    res.getString("nis"),
                    res.getString("nama_lengkap"),
                    res.getString("jurusan"),
                    res.getString("skor"), 
                    res.getString("kesempatan_pinjam"), 
                });
            }
            
            getPeminjamTRANSAKSI.TABLE_LIST_PEMINJAM.setModel(table_model);
            
            int rowCount = getPeminjamTRANSAKSI.TABLE_LIST_PEMINJAM.getRowCount();
            
            if(rowCount > 0){
                getPeminjamTRANSAKSI.TABLE_LIST_PEMINJAM.setRowSelectionInterval(0, 0);
            }else{
                table_model.addRow(new Object[]{
                    "",
                    "Tidak Ditemukan",
                    "",
                    "",
                    ""
                });
                getPeminjamTRANSAKSI.TABLE_LIST_PEMINJAM.setModel(table_model);
            }
            
        }catch(SQLException error){
            
            JOptionPane.showMessageDialog(null, error.getMessage(), "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    //
    public void setDataBuku(String Keyword, String Jenis){
    
        // SET COLUMN TABLE
        table_model.setColumnCount(0);
        table_model.addColumn("ISBN");
        table_model.addColumn("Judul");
        table_model.addColumn("Kategori");
        table_model.addColumn("Maksimal Pinjam");
        
        table_model.setRowCount(0);
        
        try{
        
            String jenis = "'UMUM'";
            if(Jenis.contains("PAKET")){
                jenis = "'PAKET'";
            }
            
            String sql = "SELECT ma_buku.isbn, ma_buku.judul, ma_kategori.nama as kategori, ma_buku.max_hari_pinjam FROM ma_buku"
                    + " JOIN ma_kategori ON ma_buku.kategori = ma_kategori.kode"
                    + " WHERE isbn LIKE '%"+Keyword+"%' OR judul LIKE '%"+Keyword+"%' AND jenis = " + jenis + " AND stok != 0";
            if(Keyword.equals("")){
                sql = "SELECT ma_buku.isbn, ma_buku.judul, ma_kategori.nama as kategori, ma_buku.max_hari_pinjam"
                        + " FROM ma_buku JOIN ma_kategori ON ma_buku.kategori = ma_kategori.kode AND jenis = " + jenis + " AND stok != 0";
            }
            
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet res = pst.executeQuery();
            
            while(res.next()){
                table_model.addRow(new Object[]{
                    res.getString("isbn"),
                    res.getString("judul"),
                    res.getString("kategori"),
                    res.getString("max_hari_pinjam") + " Hari"
                });
            }
            
            getDaftarBukuTRANSAKSI.TABLE_LIST_BUKU.setModel(table_model);
            
            int rowCount = getDaftarBukuTRANSAKSI.TABLE_LIST_BUKU.getRowCount();
            
            if(rowCount > 0){
                getDaftarBukuTRANSAKSI.TABLE_LIST_BUKU.setRowSelectionInterval(0, 0);
            }else{
                table_model.addRow(new Object[]{
                    "",
                    "Tidak Ditemukan",
                    "",
                    ""
                });
                getDaftarBukuTRANSAKSI.TABLE_LIST_BUKU.setModel(table_model);
            }
            
        }catch(SQLException error){
            
            JOptionPane.showMessageDialog(null, error.getMessage(), "Terjadi Kesalahaan!", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
    }
    
    // cetak transaksi pinjam
    public void konfirmasiTransaksiPinjam(){
     
        String id_transaksi = Dashboard.PJ_INPUT_ID_TRANSAKSI.getText();
        String nis_peminjam = Dashboard.TM.getNis();
        String nama_peminjam = Dashboard.TM.getNama();
        String jenis_buku = Dashboard.PJ_INPUT_JENIS_BUKU.getSelectedItem().toString();
        String nama_pengurus = Dashboard.nama_user;
                
        konfirmasiTransaksiPinjam formKonfirmasi = new konfirmasiTransaksiPinjam();
        formKonfirmasi.LABEL_ID_TRANSAKSI.setText("#" + id_transaksi);
        formKonfirmasi.INPUT_NAMA_PEMINJAM.setText(nis_peminjam + " - " + nama_peminjam);
        formKonfirmasi.INPUT_JENIS_BUKU.setText(jenis_buku);
        formKonfirmasi.LABEL_PENGURUS.setText(nama_pengurus);
        
        // get model table konfirmasi
        DefaultTableModel konfirmasi_model_pinjam = (DefaultTableModel)formKonfirmasi.TABLE_LIST_BUKU_PINJAM.getModel();
        
        // set row to null
        konfirmasi_model_pinjam.setRowCount(0);
        
        // set rows with max hari pinjam
        int countRowsMainPinjam = Dashboard.TABLE_LIST_PINJAM.getRowCount();
        for(int i = 0; i < countRowsMainPinjam; i++){
            konfirmasi_model_pinjam.addRow(new String[]{
                Dashboard.TABLE_LIST_PINJAM.getValueAt(i, 0).toString() + " -  " + Dashboard.TABLE_LIST_PINJAM.getValueAt(i, 1).toString(),
                Dashboard.TABLE_LIST_PINJAM.getValueAt(i, 2).toString(),
                getDateTglPengembalian(Dashboard.TABLE_LIST_PINJAM.getValueAt(i, 2).toString().replaceAll("[a-zA-Z]", "").trim())
            });
        }
        
        formKonfirmasi.setVisible(true);
        
    }
    
    public String getDateTglPengembalian(String date){
    
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
    
        // get epoc now
        Long epoch = Long.parseLong(GenKode.getTimeMiliSecond());
        
        // merge epoc now with length pinjam
        Long hari = Long.parseLong(date);
        hari = (86400000 * hari) + epoch;
        
        Date max_hari_pinjam = new Date(hari);
        return dateFormater.format(max_hari_pinjam);
        
    }
    
    public Long getEpochTglPengembalian(String hari){
    
        // get epoc now
        Long epoch = Long.parseLong(GenKode.getTimeMiliSecond());
        
        Long jml_hari = Long.parseLong(hari);
        return (86400000 * jml_hari) + epoch;
        
    }
    
    public boolean cetakPinjam(){
    
        try{
        
            // insert transaksi
            
            String id_transaksi = Dashboard.PJ_INPUT_ID_TRANSAKSI.getText();
            String nis_peminjam = getNis();
            String jenis_buku = Dashboard.PJ_INPUT_JENIS_BUKU.getSelectedItem().toString();
            String kode_pengurus = Dashboard.id_kode;
            
            Timestamp dateNow =  new SqlTime().getTimeStamp();
            
            String sql_transaksi = "INSERT INTO ma_transaksi VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst_transaksi = conn.prepareStatement(sql_transaksi);
            pst_transaksi.setString(1, id_transaksi);
            pst_transaksi.setString(2, nis_peminjam);
            pst_transaksi.setString(3, kode_pengurus);
            
            if(jenis_buku.contains("UMUM")){
                jenis_buku = "UMUM";
            }else{
                jenis_buku = "PAKET";
            }
            
            pst_transaksi.setString(4, jenis_buku);
            pst_transaksi.setString(5, "DIPINJAM");
            pst_transaksi.setTimestamp(6, dateNow);
            pst_transaksi.setTimestamp(7, dateNow);
           
            if(pst_transaksi.execute()){
                
                throw new SQLException("Gagal menambahkan transaksi !");
                
            }else{
            
                // insert detail_transaksi
                
                int getCountDaftarBuku = Dashboard.TABLE_LIST_PINJAM.getRowCount();
                
                String sql_detail_transaksi = "INSERT INTO ma_detail_transaksi VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst_detail_transaksi = conn.prepareStatement(sql_detail_transaksi);
                
                for(int i = 0; i < getCountDaftarBuku; i++){
                    
                    pst_detail_transaksi.setString(1, id_transaksi);
                    pst_detail_transaksi.setString(2, Dashboard.TABLE_LIST_PINJAM.getValueAt(i, 0).toString());
                    pst_detail_transaksi.setLong(3, getEpochTglPengembalian(Dashboard.TABLE_LIST_PINJAM.getValueAt(i, 2).toString().replaceAll("[a-zA-Z]", "").trim()));
                    pst_detail_transaksi.setString(4, "Dipinjam");
                    pst_detail_transaksi.setString(5, "Baik");
                    pst_detail_transaksi.setTimestamp(6, dateNow);
                    pst_detail_transaksi.setTimestamp(7, dateNow);
                    
                    if(pst_detail_transaksi.execute()){
                        throw new SQLException("Gagal membuat transaksi !");
                    }
                    
                }
                
            }            
            return true;
        }catch(SQLException error){
        
            System.out.println(error.getMessage());
            return false;
        }
    }
    
}
