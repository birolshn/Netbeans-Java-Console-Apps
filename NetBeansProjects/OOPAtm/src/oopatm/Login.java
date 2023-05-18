/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopatm;

import java.util.Scanner;

/**
 *
 * @author Birol Sahin
 */
public class Login {
    
      public boolean login(Hesap hesap){
        
        Scanner scn = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.print("Kullanıcı Adı : ");
        kullanici_adi = scn.nextLine();
        System.out.print("Parola : ");
        parola = scn.nextLine();
        
        if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
