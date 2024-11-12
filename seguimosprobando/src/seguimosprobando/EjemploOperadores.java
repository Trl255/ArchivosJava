/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;   
        
/**
 *
 * @author IFC303-1
 */
public class EjemploOperadores {
    public static void main(String args[]){
        Scanner entrada=new Scanner(System.in);
        int x,y;
        System.out.println("Introduce el primer valor");
        x=entrada.nextInt();
        System.out.println("Introduce el segundo valor");
        y=entrada.nextInt();
        System.out.println("La suma de x e y es:"+ (x+y));
        System.out.println("La resta de x e y es:"+(x-y));
        System.out.println("La multiplicación de x e y es:"+(x*y));
        System.out.println("La división de x e y es:"+((float)x/y));
    }
}
