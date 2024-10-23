/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class operacionrelacio {
    public static void main(String args[]){
        int edad;   boolean resultado;
        String cadena;
                
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor introduzca su edad");
        edad=sc.nextInt();
        
        cadena=(edad>=18) ? "mayor de edad":"menor de edad ";
        System.out.println("Eres "+cadena);
        
        
        
        /*Scanner sc=new Scanner(System.in);
        int x, y;
        String cadena;
        Boolean resultado;
        System.out.println("\nIntroduzca el primer número\n");
        x=sc.nextInt();
        System.out.println("\nIntroduzca el segundo número\n");
        y=sc.nextInt();
        cadena=(x==y)? "iguales":"distintos";
        System.out.println("Los número %d y %d son %s \n");
        resultado=(x!=y);
        System.out.println(""+x+ "!=" +y+ " son " +cadena);
        resultado=(x<y);
        System.out.println(+x+ " x<y " +y+  " es "+resultado);
        resultado=(x>y);
        System.out.println("x > y // es "+resultado);
        resultado=(x<=y);
        System.out.println("x <= y // es "+resultado);
        resultado=(x>=y);
        System.out.println("x >= y // es "+resultado);*/
        
        
        
        
    }
    
}
