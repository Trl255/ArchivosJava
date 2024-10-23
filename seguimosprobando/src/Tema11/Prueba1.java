
package Tema11;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Prueba1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
    System.out.println("Introduce tu edad ");
    int valor=leerEntero();
    
        System.out.println("Fuera del blucle");

    }
    static int leerEntero (){
        int edad;
        Scanner sc= new Scanner(System.in);
        while( true){
        
        try{
            edad=sc.nextInt(); //no entra al bucle
            break;
            
        }catch(InputMismatchException error){
            
            sc.nextLine();
            System.out.println("Debe ser un valor entero");
            
        }
        }
        return edad;
    }
}

