/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Menampilkan output handphone
 */
public class outputHandphone {

    public static void main(String[] args) {
        
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : "+android.getKeyStore());
        
        System.out.println("");
        BlackBerry bb = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        
        System.out.println("");
        Nokia nokia = new Nokia("Nokia", "Win8", "Lumia", 1000000);
        nokia.setWpKeyStore("UUUQIJWORJ");
        nokia.displayProduct();
        System.out.println("Wp Key Store : "+nokia.getWpKeyStore());
    }
    
}
