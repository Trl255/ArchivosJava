
package prueba1;
import java.util.Scanner;
public class Do_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero=0;
        
        do{
            System.out.println("introduzca un número entre 0 y 10");
            numero=sc.nextInt();
        
        
        }while(!(numero<=10 && numero>=0));
                
            System.out.println("El número introducido ha sido "+numero);
        
    }
}
