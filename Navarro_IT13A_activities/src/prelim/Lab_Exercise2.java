package prelim;

import java.util.Scanner;

public class Lab_Exercise2 {

 public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  
   System.out.println("Enter first number: ");
        int dodo = scan.nextInt();
        
        System.out.println("Enter second number: ");
        int huntz = scan.nextInt();
        
        System.out.println("Enter third number: ");
        int navarro = scan.nextInt();
        
        int greatest = dodo;
        
        if (huntz > greatest) {
            greatest = huntz;
        }
        
        if (navarro > greatest) {
            greatest = navarro;
        }
        
        
        System.out.println("The greatest number is: " + greatest);
        
     
        
        

    }
}
