
package Tema11;
import java.util.Scanner;
      
public class Prueba2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        System.out.println("introduce el dividendo");
        int dividendo=sc.nextInt();
        
        System.out.println("Introduce el divisor");
        int divisor=sc.nextInt();
        
        try{
            
        double resultado=(double)dividendo/divisor;
            System.out.println(resultado);
            
        }catch(Exception e){
                sc.nextLine();
                System.out.println("No se puede dividir por cero");
                System.out.println(e);
                
            }
        
    }
}
