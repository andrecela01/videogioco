
package javaapplication25;
import java.util.*;

public class JavaApplication25 {

    public static void main(String[] args) {
     int a = 0,b = 0,c = 0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Inserisci il primo numnero");
     a=sc.nextInt();
     System.out.println("\nInserisci il secondo numnero");
     b=sc.nextInt();
     System.out.println("\nInserisci il terzo numnero");
     c=sc.nextInt();
     stampa(a,b,c);
     if(a!=b||a!=c||b!=c)
     {
         System.out.println("Almeno uno è diverso");
     }
    }

    private static void stampa(int a,int b,int c) {
        
        
        if(a==b&&b==c)
        {
            System.out.println("i tre numeri inseriti sono uguali");
        }
    }
    
    
}
