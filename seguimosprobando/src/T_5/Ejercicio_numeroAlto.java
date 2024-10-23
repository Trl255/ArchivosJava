/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Ejercicio_numeroAlto {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int elementos=0;
    /*int valores[]=new int [n];*/
    System.out.println("Introduce el número de elmentos que tienes");
    elementos=sc.nextInt();
    int []valores=new int [elementos];
    //RELLENAR EL ARRAY
    for (int i=0; i<valores.length; i++){
        System.out.println("Introduce un elemento");
        valores [i]=sc.nextInt();
        }
        int resultado=maxim(valores);
       System.out.println("El número mayor es: "+resultado);
     
    
    }
static int maxim (int []referencia){
    int mayor=referencia[0];//GUARDAR EL VALOR MAYOR
    for (int i=1; i<referencia.length; i++)
         if (mayor<referencia[i])
             mayor=referencia[i];
    return mayor;
    
}
}
