/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 //nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 
Ejercicio1. Crea tres tablas de cinco elementos: una de enteros, otra de doubles y otra de booleanos.*/
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Ejercicio_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int [] tabla1= new int[5];
        int numero=0, i=0, x=0, y=0, contador=1;
        double [] tabla2=new double [5];
        boolean []tabla3=new boolean [5];
        
        for(i=0; i<5; i++){
        System.out.println("Introduzca el dato en entero "+(i+1));
        tabla1[i]=sc.nextInt();
        }
        
        for(x=0; x<5; x++){
        System.out.println("Introduzca el dato en decimal "+(x+1));
        tabla2[x]=sc.nextDouble();   
        contador++;
        }
        for (y=0; y<5; y++){
            System.out.println("Introduzca verdadero o falso "+(y+1) );
        tabla3[y]=sc.nextBoolean();
        }
        for(i=0; i<5; i++)
        System.out.println("El dato entero mostrado es: "+tabla1[i]);
        

         for(x=0; x<5; x++)
        System.out.println("El número en decimal es : "+tabla2[x]);
        
        
        for (y=0; y<5; y++)
            System.out.println("El valor verdadero o falso: "+tabla3[y] );
        
        }
    }
    
