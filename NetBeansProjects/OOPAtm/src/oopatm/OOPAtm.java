
package oopatm;


public class OOPAtm {

   
    public static void main(String[] args) {
       
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("Birol Sahin","12345", 2000);
        
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
        
    }
    
}
