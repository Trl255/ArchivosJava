/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;

import java.util.Scanner;

/**
 *
 * @author IFC303-1
 */
 
public class ejercicio22 {
public static void main (String args[]){
  Scanner entrada=new Scanner(System.in);    
    int resultado=0;
    
    
    System.out.println("introduzca un número entre el 1 y el 10");
    int valor=entrada.nextInt();
    if (valor>1 && valor<=10){    
    
     for (int x=1;x<=10; x++)  {
      resultado=valor*10;
     
    System.out.println("La tabla del número introducido es:"+resultado);}
    }else{
        
        System.out.println("El número introducido no es valido");
    }
}    
}

