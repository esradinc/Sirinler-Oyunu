package prolab_2_proje_1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author esradinc
 */
public class Giris_Ekrani extends javax.swing.JFrame {

    public static boolean hangisi;
    BufferedImage tembelSirinImage = null;
    int tembelSirinX = 500;
    int tembelSirinY = 325;

    /**
     * Creates new form Giris_Ekrani
     */
    public Giris_Ekrani() {
        initComponents();

        try {
            tembelSirinImage = ImageIO.read(new FileImageInputStream(new File("Tembel_Sirin.png")));
        } catch (IOException ex) {
            Logger.getLogger(Giris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Gozluklu_Sirin_Butonu = new javax.swing.JButton();
        Tembel_Sirin_Butonu = new javax.swing.JButton();
        Cikis_Butonu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        Gozluklu_Sirin_Butonu.setBackground(new java.awt.Color(153, 204, 255));
        Gozluklu_Sirin_Butonu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Gozluklu_Sirin_Butonu.setText("GOZLUKLU SIRIN");
        Gozluklu_Sirin_Butonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Gozluklu_Sirin_ButonuMousePressed(evt);
            }
        });
        getContentPane().add(Gozluklu_Sirin_Butonu);
        Gozluklu_Sirin_Butonu.setBounds(10, 380, 180, 60);

        Tembel_Sirin_Butonu.setBackground(new java.awt.Color(153, 204, 255));
        Tembel_Sirin_Butonu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Tembel_Sirin_Butonu.setText("TEMBEL SIRIN");
        Tembel_Sirin_Butonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tembel_Sirin_ButonuMousePressed(evt);
            }
        });
        getContentPane().add(Tembel_Sirin_Butonu);
        Tembel_Sirin_Butonu.setBounds(220, 380, 180, 60);

        Cikis_Butonu.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        Cikis_Butonu.setForeground(new java.awt.Color(153, 153, 255));
        Cikis_Butonu.setText("CIKIS");
        getContentPane().add(Cikis_Butonu);
        Cikis_Butonu.setBounds(479, 381, 120, 50);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("    OYUNA BASLAMAK ICIN SIRININIZI SECIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 330, 390, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Gozluklu_Sirin_ButonuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gozluklu_Sirin_ButonuMousePressed
        setVisible(false);
        //dispose();

        hangisi = true;

        Prolab_2_Proje_1 ekran = null;
        try {
            ekran = new Prolab_2_Proje_1();
        } catch (IOException ex) {
            Logger.getLogger(Giris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        ekran.setFocusable(false);
        ekran.setBounds(300, 0, 1000, 1000);
//        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AnaEkran labirent = null;
        try {
            labirent = new AnaEkran();
        } catch (IOException ex) {
            Logger.getLogger(Giris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        labirent.requestFocus();
        labirent.addKeyListener(labirent);
        labirent.setFocusable(true);
        labirent.setFocusTraversalKeysEnabled(false);

        ekran.add(labirent);

        ekran.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Gozluklu_Sirin_ButonuMousePressed

    private void Tembel_Sirin_ButonuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tembel_Sirin_ButonuMousePressed
        setVisible(false);
        //dispose();

        hangisi = false;

        Prolab_2_Proje_1 ekran = null;
        try {
            ekran = new Prolab_2_Proje_1();
        } catch (IOException ex) {
            Logger.getLogger(Giris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        ekran.setFocusable(false);
        ekran.setBounds(300, 0, 1000, 1000);
//        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AnaEkran labirent = null;
        try {
            labirent = new AnaEkran();
        } catch (IOException ex) {
            Logger.getLogger(Giris_Ekrani.class.getName()).log(Level.SEVERE, null, ex);
        }

        labirent.requestFocus();
        labirent.addKeyListener(labirent);
        labirent.setFocusable(true);
        labirent.setFocusTraversalKeysEnabled(false);

        ekran.add(labirent);

        ekran.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_Tembel_Sirin_ButonuMousePressed

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
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris_Ekrani().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cikis_Butonu;
    private javax.swing.JButton Gozluklu_Sirin_Butonu;
    private javax.swing.JButton Tembel_Sirin_Butonu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
