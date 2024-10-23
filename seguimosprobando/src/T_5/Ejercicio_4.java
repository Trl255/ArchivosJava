/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Programa Java que llene un array con 10 números enteros que se leen por teclado. A  
continuación calcula y muestra la media de los valores positivos y la de los valores 
negativos del array. */
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Ejercicio_4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numero[]= new int[10];
        int x=0, ContP=0, ContN=0, Ceros=0, MediaP=0, MediaN=0, SumaP=0, SumaN=0, contador=0;
        
        for (x=0; x<10; x++){
            System.out.println("Introduzca el valor "+ (x+1));
            numero[x]=sc.nextInt();
        }
        for (x=0; x<10 ; x++){
        if (numero[x]>0){
            SumaP+=numero[x];
            ContP++;
        }else if (numero[x]<0){
            SumaN+=numero[x];
            ContN++;
    }else if (numero[x]==0){
            contador++;
    }
            
        
        }
        if(ContP>0){
              MediaP=SumaP/ContP;  
              System.out.println("La media de los números positivos es: "+MediaP);
              
        }
        if(ContN>0){
              MediaN=SumaN/ContN;  
              System.out.println("La media de los números negativos es: "+MediaN);
                            
        }            
        if (contador>0){
            System.out.println("La cantidad de ceros introducidos es "+contador);
        }System.out.println("La cantidad de números positivos introducidos es: "+ContP+" \nLa cantidad de números negativos son: "+ContN);
    }   
}
