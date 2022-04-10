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
//Her defasında 1 birim ilerler. Azman’a dokunursa oyuncu 5
//puan kaybeder. Gargamel’a dokunursa oyuncu 15 puan kaybeder.
//*/
//
//public class Tembel_Sirin extends Oyuncu{
//    //Constructorlar
//    public Tembel_Sirin() {
//        
//    }
//    
//    public Tembel_Sirin(int oyuncuID, String oyuncuAd, int oyuncuTur, int skor, int karakterID, String karakterAd, int karakterTur) {
//        super(oyuncuID, oyuncuAd, oyuncuTur, skor, karakterID, karakterAd, karakterTur);
//    }
//
//    public Tembel_Sirin(int oyuncuID, String oyuncuAd, int oyuncuTur, int skor) {
//        super(oyuncuID, oyuncuAd, oyuncuTur, skor);
//    }
//
////    
////    //Override Edilen Methodlar
////    @Override
////    public void Ilerle() {//Oyuncu 1 birim ilerler.
////        
////    }
////    
////    @Override
////    public void OyuncuAzmanaDokundu() {//Oyuncu 5 puan kaybeder.
////        
////    }
////    
////    @Override
////    public void OyuncuGargameleDokundu() {//Oyuncu 15 puan kaybeder.
////        
////    }
////
////    @Override
////    public void PuaniGoster() {
////        
////    }
//
//    @Override
//    public void OyuncuAzmanaDokundu() {
//        
//    }
//
//    @Override
//    public void OyuncuGargameleDokundu() {
//        
//    }
//
//    @Override
//    public void PuaniGoster() {
//        
//    }
//}
package prolab_2_proje_1;
public class Tembel_Sirin extends Karakter{

	private int puan=20;

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}


	public void Tembel_Sirin() {

	}

  
	

}
