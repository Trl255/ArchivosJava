
package Tema_12;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int eleccion=0, num1=0, num2=0;
        
        
        System.out.println("Introduzca una opción\n1-SUMA\n2-RESTA\n3-MULTIPLICACIÓN\n4-DIVISIÓN");
        eleccion=sc.nextInt();
        operaciones(eleccion);
        
    }static void operaciones(int opcion){
        Scanner sc=new Scanner(System.in);
        int numero1, numero2, resultado;
        
        System.out.println("Introduzca el primer número");
        numero1=sc.nextInt();
        
        System.out.println("Introduzca el segundo número");
        numero2=sc.nextInt();
        
        if (opcion==1){
            resultado=numero1+numero2;
        }
        if (opcion==2){
            resultado=numero2-numero2;
        }
        if (opcion==3){
            resultado=numero1*numero2;
        }
        if (opcion==4){
            resultado=numero1/numero2;
        }
    }
    
}
