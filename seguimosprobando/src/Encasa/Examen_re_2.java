/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
public class Examen_re_2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int []arrays=new int [20];
        
        for (int i=0; i<arrays.length; i++){
        arrays[i]=(int) (Math.random()*99+1);
            
            System.out.println("Introduzca un valor");
            int a=sc.nextInt();
            
            comprobacion (arrays, a);
            
        }

    }public static void comprobacion(int []valores, int a){
        int i=0, x=0;
        for(i=0;i<valores.length; i++){
            if (valores[i]==a){
                x=a;
        }System.out.println("El valor "+valores[i]+  " se encuentra dentro de los número generados "+a);
    }
}
}   
          