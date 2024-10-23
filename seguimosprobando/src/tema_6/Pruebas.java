/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema_6;
import java.util.Scanner;
public class Pruebas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String palabraSecreta="", intento="";
        boolean fin=false;
        
        
    while(palabraSecreta==""){    
            System.out.println("Introduzca sólo una palabra");
            palabraSecreta=sc.nextLine();
    }    
    
        char []palabraGuionesM=palabraGuiones (palabraSecreta);    
        System.out.println(palabraGuionesM);    
           
            System.out.println("Introduzca la letra");
            char caracter=sc.nextLine().charAt(0);
            
    for (int i=0;i<palabraSecreta.length(); i++){
        if (palabraSecreta.charAt(i)==caracter){
            palabraGuionesM[i]=caracter;
        
        System.out.println("La letra introducida no esta en la palabra secreta");
    }
         
   }System.out.println(palabraGuionesM);   
   
        
        
        
   }
   static char [] palabraGuiones (String palabra){
        char [] caracter=palabra.toCharArray();
        for (int i=0; i<palabra.length(); i++){
        caracter[i]='_';
   }
        return caracter;
   }
    
   }

