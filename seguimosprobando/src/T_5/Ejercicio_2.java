/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Crea un array de números donde le indicamos por teclado el tamaño del array, 
rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por 
pantalla el valor de cada posición y la suma de todos los valores. */
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Ejercicio_2 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int x, puesto=0, suma=0;
        
        System.out.println("Introduzca una cantidad de número entre el 0 y el 9 que desea que le muestre");
        x=sc.nextInt();
        int array1[]=new int [x];
            for (int i=0; i<array1.length; i++){
                int y=(int)(Math.random()*9)+1;
            System.out.println("El número "+y+" corresponde a la posición "+(i+1));
            }}}     
            
            
            
            /*
            
            System.out.println("Introduzca el número "+y);
            array1[i]=sc.nextInt();
            suma+=array1[i];
        }
        for (int j=0; j<array1.length; j++){
        System.out.println("El número "+array1[j]+" corresponde a la posición "+puesto);
        }
        System.out.println("y la suma de todos los número es: "+suma);
        
}}
}*/