
package bodymassındex;

import java.util.Scanner;
public class BodyMassIndex {
    
    static double BodyMassIndex(double w, double h) {
        return w/(h*h);
    }

    

    public static void main(String[] args) {
        Scanner scn= new Scanner (System.in);
        System.out.println("Enter your mass:");
        double w=scn.nextDouble();
        System.out.println("Enter your height:");
        double h=scn.nextDouble();
        
        double i= BodyMassIndex(w,h);
        if(i<=25) {
            System.out.println("Your mass is normal " + BodyMassIndex(w,h));
        }
        else {
            System.out.println("Your mass is too much for your health " + BodyMassIndex(w,h));
        }
        
        
    }
    
}
