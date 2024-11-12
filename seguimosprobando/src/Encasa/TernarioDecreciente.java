/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class TernarioDecreciente {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int x=0, y=0;
        
     System.out.println("Introduzca el primer valor ");
     x=sc.nextInt();
     System.out.println("Introduzca el segundo valor ");
     y=sc.nextInt();
     
     System.out.println("Estos son los número del "+x+" hasta el "+y);
     if (x<y)
     for (x=x; x<=y; x++){
     System.out.println(+x+"");
    }
     else 
     for (y=y; y<x; y++){
    System.out.println(+y+"");
     }
    }
     
             }
      /*System.out.println("Introduzca un número para mostrarle la tabla de multiplicar hasta el 10");
        x=sc.nextInt();
            for (int y=1; y<=10; y++){
            System.out.println(x+  " * " + y + " = " + x*y);
            
            }   }         }
             
       /*  System.out.print("Introduce un número entero: ");                                                         
        x = sc.nextInt();
        System.out.println("Tabla del " + x);
        for(int i = 1; i<=10; i++){
             System.out.println(x + " * " + i + " = " + x*i); */
       
     /*if (x<y){
         System.out.println(+x+"");
         x++;
     }
         
     if (y<x){
             System.out.println(+y+" ");
          y++;*/  
       
       