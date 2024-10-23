/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_4;
import java.util.Scanner;
/**PEDIR AL USUARIO 10 VALORES Y CONTAR LOS QUE SON PARES
 *
 * @author IFC303-1
 */
public class Ejercicio13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int valores[]=new int[10], contador=0, suma=0, media=0;
        
        for (int i=0; i<10; i++){
        System.out.println("introduce el valor "+(i+1));
        valores [i]=sc.nextInt();
        if (valores[i]%2==0){
            contador++;
          suma=valores[i]+suma;
        }
        media=suma/10;
        
        }
               
        System.out.println("La cantidad de los número pares es "+contador+" la media es: "+media);
        System.out.println("La suma es "+suma);
        
        
        
        
    }
}
