/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab_2_proje_1;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author ranadudukabak
 */
public class Prolab_2_Proje_1 extends JFrame {

    
    public static String dusmanKarakter1;
    public static String dusmanKarakter1Kapi;
    public static String dusmanKarakter2;
    public static String dusmanKarakter2Kapi;
    
    public static ArrayList<String> arrayList1 = new ArrayList<String>();
    public static ArrayList<String> arrayList2 = new ArrayList<String>();

    AnaEkran labirent;
    /**
     * @param args the command line arguments
     */

    

    public Prolab_2_Proje_1() throws IOException {
        this.labirent = new AnaEkran();
        
    }

    public Prolab_2_Proje_1(String title) throws HeadlessException, IOException {
        super(title);
        this.labirent = new AnaEkran();
    }
    
    public static void main(String[] args) throws IOException {
        	SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
        
        Prolab_2_Proje_1 ekran = new Prolab_2_Proje_1("Sirinler Oyunu");
        
        ekran.setFocusable(false);
        ekran.setBounds(300, 0, 1000, 1500);
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AnaEkran labirent = new AnaEkran();
    
        labirent.requestFocus();
        labirent.addKeyListener(labirent);
        labirent.setFocusable(true);
        labirent.setFocusTraversalKeysEnabled(false);
      
        ekran.add(labirent);
        
        ekran.setVisible(true);
        

    }
}








    

