/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_6;
import java.util.Scanner;
public class Ejercicio_4_CP {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
       int hora=0;
       int segundos=0;
       int minutos=0;
       int n=0;
       
       
        System.out.println("Introduzca la hora");
        hora=sc.nextInt();
       while (hora<0 && hora>23){
           hora=sc.nextInt();
           System.out.println("La hora esta entre 0 y 23");
       } 
        System.out.println("Introduzca los minutos");
        minutos=sc.nextInt();
        
        System.out.println("Introduzca los segundos");
        segundos=sc.nextInt();
        
        System.out.println("Introduzca los segundos que quiere incrementar");
        n=sc.nextInt();
       
        hora=hora<24? hora:0;
        minutos=minutos<60? minutos:0;
       segundos=segundos<60? segundos:0;
       
        if (segundos>60){
           minutos++;
           
           }
        if (minutos>60){
            hora++;
        } 
       
       
       hora=hora;
       minutos=minutos;
       segundos+=n;;
       
            System.out.println(+hora+" "+minutos+" "+segundos);
        
        
    }
 
   
    
}
