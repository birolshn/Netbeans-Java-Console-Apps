
package advancedcalculator;

import java.util.Scanner;


public class AdvancedCalculator {
    public static int subtraction(int a, int b){
        return (a-b);
    }
    public static double division (int a, int b){
        return (a/b);
    }
    public static int addition (int a, int b){
        return (a+b);
    }
    public static int addition (int a, int b, int c){
        return (a + b + c);
    }
    public static int multiplication (int a, int b){
        return a*b;
    }
    public static int multiplication (int a, int b, int c){
        return a*b*c;
    }
    

  
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String transactions = "1. Addition\n"
                              +"2. Subtraction\n"
                              +"3. Multiplication\n"
                              +"4. Division\n"
                              +"Click the q to exit.";
        System.out.println("*******************************");
        System.out.println(transactions);
        System.out.println("*******************************");
        
        while (true) {
            System.out.println("Choice the transaction:");
            String transaction = scn.nextLine();
            
            if (transaction.equals("q")) {
                System.out.println("Closing the program...");
                break;
            }
            else if (transaction.equals("1")) {
                System.out.println("How many value will you edd ? (2 or 3): ");
                int howManyValue = scn.nextInt();
                
                if (howManyValue == 2) {
                    System.out.print("a: ");
                    int a = scn.nextInt();
                     System.out.print("b: ");
                    int b = scn.nextInt();
                    scn.nextLine();
                    
                    System.out.println("Addition of the numbers: "+(addition(a,b)));
                    
                            
                }
                else if (howManyValue == 3) {
                    System.out.print("a: ");
                    int a = scn.nextInt();
                     System.out.print("b: ");
                    int b = scn.nextInt();
                    System.out.print("c: ");
                    int c = scn.nextInt();
                    scn.nextLine();
                    
                    System.out.println("Addition of the numbers: "+(addition(a,b,c)));
                    
                    
                    
                }
                else {
                    System.out.println("There is not suitable transaction...");
                    
                }
                
            }
            else if (transaction.equals("2")) {
                System.out.print("a: ");
                int a = scn.nextInt();
                System.out.print("b: ");
                int b = scn.nextInt();
                scn.nextLine();
                
                 System.out.println("Subtraction of the numbers: "+(subtraction(a,b)));
                 
                
                
            }
            else if (transaction.equals("3")) {
               System.out.println("How many value will you multiplication ? (2 or 3): ");
                int howManyValue = scn.nextInt();
                
                if (howManyValue == 2) {
                    System.out.print("a: ");
                    int a = scn.nextInt();
                     System.out.print("b: ");
                    int b = scn.nextInt();
                    scn.nextLine();
                    
                    System.out.println("Multiplication of the numbers: "+(multiplication(a,b)));
                    
                            
                }
                else if (howManyValue == 3) {
                    System.out.print("a: ");
                    int a = scn.nextInt();
                     System.out.print("b: ");
                    int b = scn.nextInt();
                    System.out.print("c: ");
                    int c = scn.nextInt();
                    scn.nextLine();
                    
                    System.out.println("Multiplication of the numbers: "+(multiplication(a,b,c)));
                    
                    
                    
                }
                else {
                    System.out.println("There is not suitable transaction...");  
            }
            
        }
            else if (transaction.equals("4")){
               System.out.print("a: ");
               int a = scn.nextInt();
               System.out.print("b: ");
               int b = scn.nextInt();
               scn.nextLine();
               
              System.out.println("Division of the numbers: "+ division(a,b));
                
                      
            }
            else {
                System.out.println("Invalid transaction...");
            }
        

        
                
      
    }
    
}
}
