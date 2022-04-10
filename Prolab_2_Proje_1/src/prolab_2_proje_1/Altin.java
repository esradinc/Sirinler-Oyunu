///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package prolab_2_proje_1;
//
///**
// *
// * @author ranadudukabak
// */
//
///*
//   Her bir altin 5 puan degerindedir. Ek olarak altin sayisini tutmak icin altin
//   degiskeni tutulacak. Random olarak (maksimum 10 saniye olacak sekilde) herhangi bir
//   yerde ayni anda 5 altin olusacak (farkli sayida altin olusmayacaktir) ve 5 sn ekranda
//   gorunecektir. Eger Oyuncu altini alabilirse her bir altin icin 5 puan kazanir. Oyuncu altini
//   alamazsa altin kaybolur.
//*/
//
//public class Altin extends Obje {
//    //Degiskenler
//    int altinSayisi;
//    
//    
//    //Constructorlar
//    public Altin() {
//        
//    }
//    
//    public Altin(int altinSayisi) {
//        this.altinSayisi = altinSayisi;
//    }
//    
//    
//    //Methodlar
//    public void ObjeAlindi() {//Oyuncunun skoruna 5 puan eklenecek.
//        altinSayisi++;
//        
//    }
//    
//    public void ObjeyiOlustur() {//Ekranda 5 saniyeligine 5 altin olustur.
//        
//    }
//    
//    public void ObjeyiYokEt() {//Olusturulan altini yok et.
//        
//    }
//
//    
//    //Get Set Methodlari
//    public int getAltinSayisi() {
//        return altinSayisi;
//    }
//
//    public void setAltinSayisi(int altinSayisi) {
//        this.altinSayisi = altinSayisi;
//    }
//}




package prolab_2_proje_1;


import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.Timer;

public class Altin extends Obje implements ActionListener {
Timer timer = new Timer(5000, this);
   private BufferedImage altinImage;
   Random random;
   Graphics2D g;
    public Altin() throws IOException {
    altinImage = ImageIO.read(new FileImageInputStream(new File("Altın.jpg")));
    }
    
    public void ObjeyiOlustur(Graphics2D g ,int x, int y,Karakter iyikarakter ,int matris[][])  {
//      int[][] matris = {
//            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0},
//            {0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0},
//            {0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0},
//            {0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0},
//            {0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0},
//            {1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0},
//            {0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0},
//            {0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//            {0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0},
//            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
//            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
// };
      
       Random random=new Random();
       ArrayList<Integer> eklex = new ArrayList<Integer>();
       ArrayList<Integer> ekley = new ArrayList<Integer>();
       
       while(eklex.size()<=5 && ekley.size()<=5){
           int a=random.nextInt(13);
           int b =random.nextInt(11);
           
           if(iyikarakter.getName().equalsIgnoreCase("gozluklusirin")){
               
               if(matris[a][b]==1 && a!=iyikarakter.currentlocation.getX() && b!=iyikarakter.currentlocation.getY() ){
                   if(a!=x && b!=y){
                       eklex.add(a);
                       ekley.add(b);
                   }
               }
           }
             if(iyikarakter.getName().equalsIgnoreCase("tembelsirin")){
               
               if(matris[a][b]==1 && a!=iyikarakter.currentlocation.getX() && b!=iyikarakter.currentlocation.getY() ){
                   if(a!=x && b!=y){
                       eklex.add(a);
                       ekley.add(b);
                   }
               }
           }
           
           
       }
  
        for (int i = 0; i < 5; i++) {
            g.drawImage(this.getAltinImage(), eklex.get(i)*50+200, ekley.get(i)*50+75,50,50,null);
        }
        
    
    
  }
    

    /**
     * @return the altinImage
     */
    public BufferedImage getAltinImage() {
        return altinImage;
    }

    /**
     * @param altinImage the altinImage to set
     */
    public void setAltinImage(BufferedImage altinImage) {
        this.altinImage = altinImage;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        timer.start();
    }
    
    

    
    
}












































