/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;
import java.util.Scanner;
/**
 *Que lea 10 números por teclado, los almacene en un array y los ordene de forma ascendente.
 * @author IFC303-1
 */
public class Ejercicio_9array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de número que quiera introducir");
        int x=sc.nextInt();
        int []peticion=new int[x];
        solicitud(peticion);
        orden(peticion);
        
    }static void solicitud (int []salida){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<salida.length; i++){
            System.out.println("Introduzca el valor "+ (i+1));
            salida[i]=sc.nextInt();
           }
        
    }
    static void orden(int []resultado){
        for(int i=0; i<resultado.length; i++){
            for (int y=0; y<resultado.length; y++){
                int aux=0;
                if (resultado [y+1]<resultado [y])
                    aux=resultado [y+1];
                resultado [y+1]=y;
                y=aux;
                    
            }
                
    }
}}
