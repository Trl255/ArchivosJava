/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class tabla_de_multiplicar {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int numero=0, contador=1, resultado=0;
    
    System.out.println("Introduzca un número para multiplicar");
    numero=sc.nextInt();
    
   do 
   {
    resultado=numero*contador;
    
    System.out.println(+contador+ " x "+ numero+ " = "+ resultado);
    contador++;
   }
    
    while (contador<=10); 
           {    System.out.println("Se han multiplicado "+--contador+" veces");
    }
}    
}
