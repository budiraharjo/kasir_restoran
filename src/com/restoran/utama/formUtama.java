/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.restoran.utama;

import com.restoran.koneksi.koneksi;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Les Cules
 */
public class formUtama extends javax.swing.JFrame {

    Statement stt;
    Statement stt2;
    ResultSet rss;
    DefaultTableModel model;
    String tgl;
    public formUtama() {
        initComponents();
        jPanel1.setVisible(true);
        makanan.setVisible(false);
        tabel_makanan();
        tampil_tabel();
        tabel_transaksi();
        tampil_tabel_transaksi();
        tglskrg();
        no_transaksi();
        kode_makanan();
        this.setLocationRelativeTo(null);
    }

    public JTextField id_kasir(){
        return txt_id_kasir;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        makanan = new javax.swing.JPanel();
        btn_simpan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtidmakanan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_makanan = new javax.swing.JTable();
        txtharga = new javax.swing.JTextField();
        txtnamapaket = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtketerangan = new javax.swing.JTextArea();
        transaksi = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tgl_transaksi = new javax.swing.JTextField();
        txt_no_transaksi = new javax.swing.JTextField();
        txt_nama_paket = new javax.swing.JTextField();
        cmb_kode = new javax.swing.JComboBox();
        txt_jumlah_t = new javax.swing.JTextField();
        txt_harga_t = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_transaksi = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txt_id_kasir = new javax.swing.JTextField();
        txt_total_semua = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        makanan.setPreferredSize(new java.awt.Dimension(600, 500));
        makanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        makanan.add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel1.setText("FORM PAKET MAKANAN");
        makanan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 34, -1, -1));

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        makanan.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 66, -1));

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        makanan.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        jLabel4.setText("Harga");
        makanan.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtidmakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidmakananActionPerformed(evt);
            }
        });
        makanan.add(txtidmakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 110, 220, 30));

        jLabel2.setText("ID Paket Makanan");
        makanan.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 113, -1, -1));

        jLabel3.setText("Nama Paket Makanan");
        makanan.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 141, -1, -1));

        tbl_makanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_makanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_makananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_makanan);

        makanan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 315, 509, 179));

        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthargaKeyTyped(evt);
            }
        });
        makanan.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 220, 30));
        makanan.add(txtnamapaket, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 144, 220, -1));

        jLabel5.setText("Keterangan");
        makanan.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 182, -1, -1));

        txtketerangan.setColumns(20);
        txtketerangan.setRows(5);
        jScrollPane3.setViewportView(txtketerangan);

        makanan.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 176, 220, 70));

        getContentPane().add(makanan, "card2");

        transaksi.setPreferredSize(new java.awt.Dimension(600, 500));
        transaksi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Tanggal Transaksi");
        transaksi.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel13.setText("No Transaksi");
        transaksi.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel14.setText("Kode Paket Makanan");
        transaksi.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel15.setText("Nama Paket");
        transaksi.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel16.setText("Harga");
        transaksi.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel17.setText("Jumlah");
        transaksi.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        tgl_transaksi.setEditable(false);
        tgl_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl_transaksiActionPerformed(evt);
            }
        });
        transaksi.add(tgl_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 250, -1));

        txt_no_transaksi.setEditable(false);
        transaksi.add(txt_no_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 93, -1));

        txt_nama_paket.setEnabled(false);
        transaksi.add(txt_nama_paket, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 250, -1));

        cmb_kode.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_kodeItemStateChanged(evt);
            }
        });
        transaksi.add(cmb_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 250, -1));

        txt_jumlah_t.setText("1");
        txt_jumlah_t.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_jumlah_tKeyTyped(evt);
            }
        });
        transaksi.add(txt_jumlah_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 250, -1));

        txt_harga_t.setEnabled(false);
        transaksi.add(txt_harga_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 250, -1));

        jButton7.setText("Beli");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        transaksi.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        tbl_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbl_transaksi);

        transaksi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 495, 95));
        transaksi.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 420, 10));

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jLabel6.setText("FORM TRANSAKSI MAKANAN");
        transaksi.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jButton4.setText("Transaksi Selanjutnya");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        transaksi.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 150, -1));

        txt_id_kasir.setEditable(false);
        transaksi.add(txt_id_kasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 50, -1));

        txt_total_semua.setEditable(false);
        transaksi.add(txt_total_semua, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 142, -1));

        jLabel18.setText("Total");
        transaksi.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        jButton5.setText("Hapus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        transaksi.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jButton6.setText("Cetak");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        transaksi.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jLabel7.setText("Id Admin");
        transaksi.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        getContentPane().add(transaksi, "card4");

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/restoran/gambar/me_as_colonel_sanders__kfc_logo__refaced__by_allampanato-d5wdcom2.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 510));

        getContentPane().add(jPanel1, "card3");

        jMenu1.setText("Kasir");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Laporan Penjualan");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Log Out");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Makanan");

        jMenuItem4.setText("Daftar Paket");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Transaksi");

        jMenuItem1.setText("Transaksi Penjualan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jPanel1.setVisible(false);
        makanan.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txtidmakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidmakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidmakananActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        Connection con = koneksi.getConnection();
        try {
         if(btn_simpan.getText().equals("Batal")){
             clear();
             btn_simpan.setText("Simpan");
         }
         else{
            if(txtidmakanan.getText().equals("")||txtnamapaket.getText().equals("")||txtketerangan.getText().equals("")||txtharga.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Mohon diisi data yang kosong", "Pesan", JOptionPane.WARNING_MESSAGE);
            }
            else{    
            stt = con.createStatement();
            String sql = "INSERT INTO paket_makanan VALUES('"+txtidmakanan.getText()+"', '"+txtnamapaket.getText()+"','"+txtketerangan.getText()+"','"+txtharga.getText()+"')";   
            stt.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Berhasil Masuk");
            tabel_makanan();
            tampil_tabel();
            clear();
           }
         }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal");
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void tbl_makananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_makananMouseClicked
        int row = tbl_makanan.getSelectedRow();
        txtidmakanan.setText(tbl_makanan.getValueAt(row, 0).toString());
        txtnamapaket.setText(tbl_makanan.getValueAt(row, 1).toString());
        txtketerangan.setText(tbl_makanan.getValueAt(row, 2).toString());
        txtharga.setText(tbl_makanan.getValueAt(row, 3).toString());
        txtidmakanan.setEnabled(false);
        btn_simpan.setText("Batal");
    }//GEN-LAST:event_tbl_makananMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection con = koneksi.getConnection();
        int row = tbl_makanan.getSelectedRow();
        try {
            stt = con.createStatement();
            if(row == -1){
                JOptionPane.showMessageDialog(this, "Mohon pilih tabel terlebih dahulu","Pesan",JOptionPane.WARNING_MESSAGE);
            }
            else{
                String sql = "UPDATE paket_makanan SET nama_paket = '"+txtnamapaket.getText()+"'"
                        + ", keterangan = '"+txtketerangan.getText()+"', harga = '"+txtharga.getText()+"' WHERE id_paket = '"+txtidmakanan.getText()+"'";
                stt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil Diubah");
                tabel_makanan();
                tampil_tabel();
                clear();
                btn_simpan.setText("Simpan");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public void clear(){
    txtharga.setText("");
    txtidmakanan.setText("");
    txtketerangan.setText("");
    txtnamapaket.setText("");
    txtidmakanan.setEnabled(true);
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection con = koneksi.getConnection();
        int row = tbl_makanan.getSelectedRow();
        try {
            stt = con.createStatement();
            if(row == -1){
                JOptionPane.showMessageDialog(this, "Mohon pilih tabel terlebih dahulu","Pesan",JOptionPane.WARNING_MESSAGE);
            }
            else{
                String sql = "DELETE FROM paket_makanan WHERE id_paket = '"+txtidmakanan.getText()+"'";
                stt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                tabel_makanan();
                tampil_tabel();
                clear();
                btn_simpan.setText("Simpan");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        transaksi.setVisible(true);
        makanan.setVisible(false);
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        no_transaksi();
        tabel_transaksi();
        tampil_tabel_transaksi();
        txt_total_semua.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmb_kodeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_kodeItemStateChanged
        Connection con = koneksi.getConnection();
        ResultSet rss2;
        String sql = "SELECT * FROM paket_makanan WHERE id_paket = '"+cmb_kode.getSelectedItem().toString()+"'";
        try {
            stt = con.createStatement();
            rss2 = stt.executeQuery(sql);
            if(rss2.next()){
                txt_nama_paket.setText(rss2.getString("nama_paket"));
                txt_harga_t.setText(rss2.getString("harga"));
            }
            rss2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmb_kodeItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Connection con = koneksi.getConnection();
        if(txt_jumlah_t.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Data tidak boleh kosong");
        }
        else{
            int total = Integer.parseInt(txt_harga_t.getText()) * Integer.parseInt(txt_jumlah_t.getText());
            int simpan2 = 0;
            if(txt_total_semua.getText().equals("")){
                simpan2 = 0;
            }
            else
                simpan2 = Integer.valueOf(txt_total_semua.getText());

            String sql2 = "INSERT INTO detail_transaksi(id_transaksi,id_paket,harga,jumlah,total_harga) VALUES('"+txt_no_transaksi.getText()+"','"+cmb_kode.getSelectedItem().toString()+"','"+txt_harga_t.getText()+"','"+txt_jumlah_t.getText()+"','"+total+"')";
            try {
                    simpan_no();
                    stt2 = con.createStatement();
                    stt2.executeUpdate(sql2);
                    txt_total_semua.setText(String.valueOf(simpan2+total));
                    JOptionPane.showMessageDialog(this, "Barang Berhasil Dibeli");
                    tabel_transaksi();
                    tampil_tabel_transaksi();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Connection con = koneksi.getConnection();
        int row = tbl_transaksi.getSelectedRow();
        try {
            stt = con.createStatement();
            if(row == -1){
                JOptionPane.showMessageDialog(this, "Anda Belum Memilih Tabel");
            }
            else{
                int harga = Integer.parseInt((String) tbl_transaksi.getModel().getValueAt(row, 5));
                int total = Integer.parseInt(txt_total_semua.getText());
                String sql = "DELETE FROM detail_transaksi WHERE id_detail_transaksi = '"+tbl_transaksi.getModel().getValueAt(row, 0)+"'";
                stt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                txt_total_semua.setText(String.valueOf(total-harga));
                tabel_transaksi();
                tampil_tabel_transaksi();
                clear();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        login lgn = new login();
        this.setVisible(false);
        lgn.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tgl_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tgl_transaksiActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Connection con = koneksi.getConnection();
            String NamaFile = "/com/restoran/report/Struk_Pembayaran.jasper";
            HashMap hash = new HashMap();
        try {
            hash.put("idtransaksi", txt_no_transaksi.getText());
            runReportDefault(NamaFile,hash);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Connection con = koneksi.getConnection();
            String NamaFile = "/com/restoran/report/laporan_penjualan.jasper";
            HashMap hash = new HashMap();
        try {
            hash.put("idkasir", txt_id_kasir.getText());
            runReportDefault(NamaFile,hash);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

private void txthargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyTyped
char c = evt.getKeyChar();
if (!((c >= '0') && (c <= '9') && txtharga.getText().length() < 10
|| (c == KeyEvent.VK_BACK_SPACE)
|| (c == KeyEvent.VK_DELETE))) {
getToolkit().beep();
evt.consume();
}
}//GEN-LAST:event_txthargaKeyTyped

private void txt_jumlah_tKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_jumlah_tKeyTyped
char c = evt.getKeyChar();
if (!((c >= '0') && (c <= '9') && txt_jumlah_t.getText().length() < 10
|| (c == KeyEvent.VK_BACK_SPACE)
|| (c == KeyEvent.VK_DELETE))) {
getToolkit().beep();
evt.consume();
}
}//GEN-LAST:event_txt_jumlah_tKeyTyped
    public void runReportDefault(String sourcefilename, HashMap hash) {
        Connection con = koneksi.getConnection();
        try {
            InputStream report;
            report = getClass().getResourceAsStream(sourcefilename);
            JasperPrint jprint = JasperFillManager.fillReport(report,hash, con);
            JasperViewer viewer = new JasperViewer(jprint, false);
            viewer.setFitPageZoomRatio();
            viewer.setVisible(true);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    public void simpan_no(){
    Connection con = koneksi.getConnection();
        String sql = "INSERT INTO transaksi VALUES('"+txt_no_transaksi.getText()+"','"+txt_id_kasir.getText()+"','"+tgl+"')";
        try {
            stt = con.createStatement();
            stt.executeUpdate(sql);
        } catch (Exception e) {
        }
    }    private void tabel_makanan(){
        model = new DefaultTableModel();
        tbl_makanan.setModel(model);
        model.addColumn("Id Paket Makanan");
        model.addColumn("Nama Paket Makanan");
        model.addColumn("Keterangan Paket");
        model.addColumn("Harga");
    }
    private void tampil_tabel(){
       Connection con = koneksi.getConnection();
       try {
           stt = con.createStatement();
           String sql = "SELECT * FROM paket_makanan";
           rss = stt.executeQuery(sql);
           while(rss.next()){
               Object[] o;
               o = new Object[4];
               o[0] = rss.getString("id_paket");
               o[1] = rss.getString("nama_paket");
               o[2] = rss.getString("keterangan");
               o[3] = rss.getString("harga");
               model.addRow(o);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    //FORM TRANSAKSI
    public void tglskrg(){
        Date skrg= new Date();
        SimpleDateFormat format= new SimpleDateFormat("dd MMMM yyyy");
        SimpleDateFormat format2= new SimpleDateFormat("yyyy-MM-dd");
        tgl = format2.format(skrg);
        tgl_transaksi.setText(format.format(skrg));
    }
    public void no_transaksi(){
        Connection con = koneksi.getConnection();
        String sql = "SELECT id_transaksi FROM transaksi";
        try {
            stt = con.createStatement();
            rss = stt.executeQuery(sql);
            if(rss.last()){
                txt_no_transaksi.setText(String.valueOf(rss.getInt(1)+1));
            }
            else
                txt_no_transaksi.setText("1");
        } catch (Exception e) {
        }
    }
    public void kode_makanan(){
        Connection con = koneksi.getConnection();
        String sql = "SELECT * FROM paket_makanan";
        try {
         stt = con.createStatement();
         rss= stt.executeQuery(sql);
         while(rss.next()){
             cmb_kode.addItem(rss.getString("id_paket"));
         }
        } catch (Exception e) {
        }
    }
    private void tabel_transaksi(){
        model = new DefaultTableModel();
        tbl_transaksi.setModel(model);
        model.addColumn("Id Detail Transaksi");
        model.addColumn("No Transaksi");
        model.addColumn("Id paket");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Total Harga");
    }
    private void tampil_tabel_transaksi(){
       Connection con = koneksi.getConnection();
       try {
           stt = con.createStatement();
           String sql = "SELECT * FROM detail_transaksi WHERE id_transaksi = '"+txt_no_transaksi.getText()+"'";
           rss = stt.executeQuery(sql);
           while(rss.next()){
               Object[] o;
               o = new Object[6];
               o[0] = rss.getString(1);
               o[1] = rss.getString(2);
               o[2] = rss.getString(3);
               o[3] = rss.getString(4);
               o[4] = rss.getString(5);
               o[5] = rss.getString(6);
               model.addRow(o);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
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
            java.util.logging.Logger.getLogger(formUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox cmb_kode;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel makanan;
    private javax.swing.JTable tbl_makanan;
    private javax.swing.JTable tbl_transaksi;
    private javax.swing.JTextField tgl_transaksi;
    private javax.swing.JPanel transaksi;
    private javax.swing.JTextField txt_harga_t;
    private javax.swing.JTextField txt_id_kasir;
    private javax.swing.JTextField txt_jumlah_t;
    private javax.swing.JTextField txt_nama_paket;
    private javax.swing.JTextField txt_no_transaksi;
    private javax.swing.JTextField txt_total_semua;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtidmakanan;
    private javax.swing.JTextArea txtketerangan;
    private javax.swing.JTextField txtnamapaket;
    // End of variables declaration//GEN-END:variables
}
