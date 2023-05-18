
package ıdmanprogram;

import java.util.Scanner;


public class IdmanProgram {

 
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Idman Programına Hoşgeldiniz...");
        
        String idmanlar = "Geçerli Hareketler...\n"+
                "Burpee\n"+
                "Pushup(şınav)\n"
                +"Situp(Mekik)\n"
                +"Squat\n";
        
        System.out.println(idmanlar);
        
        System.out.println("Bir idman oluşturun...");
        
        System.out.println("Burpee Sayısı : ");
        int burpee = scn.nextInt();
        System.out.println("Pushup Sayısı : ");
        int pushup = scn.nextInt();
        System.out.println("Situp Sayısı : ");
        int situp = scn.nextInt();
        System.out.println("Squat Sayısı : ");
        int squat = scn.nextInt();
        scn.nextLine();
        
        Idman idman = new Idman(burpee, pushup, situp, squat);
        
        System.out.println("İdmanınız başlıyor...");
        
        while(idman.idmanBİttiMi()==false){
            System.out.println("Hareket Türü (Burpee, Pushup , Situp, Squat) : ");
            String tur = scn.nextLine();
            System.out.println("Bu hareketi kaç tane yapacaksınız ? : ");
            int sayi = scn.nextInt();
            scn.nextLine();
            idman.hareketYap(tur, sayi);
        }
        
        System.out.println("İdmanını başarılı bir şekilde tamamladın.");
                
                            
        
    }
    
}
