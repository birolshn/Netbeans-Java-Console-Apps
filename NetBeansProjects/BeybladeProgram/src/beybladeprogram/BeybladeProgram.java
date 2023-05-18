
package beybladeprogram;

import java.util.Scanner;


public class BeybladeProgram {

    
    public static void main(String[] args) {
        System.out.println("Beyblade Programına Hoşgeldiniz");
        System.out.println("Çıkış için q'ya basın...");
        
        Scanner scn = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi beyblade'i üretmek istiyorsunuz? ");
            String islem = scn.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                if(beyblade == null){
                    System.out.println("Lütfen geçerli bir beyblade girin...");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
                
       
    }
    
}
