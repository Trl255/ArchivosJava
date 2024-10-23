/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;

import java.util.Scanner;

/**
 *Escribe un programa que tome como entrada un número entero e indique qué cantidad hay
que sumarle para que el resultado se múltiplo de 7. Un ejemplo:
• A 3 hay que sumarle 4 para que el resultado (3+4 = 7) sea múltiple de 7.
• A 12 hay que sumarle 2 para que el resultado sea múltiplo de 7.
 * @author josea
 */
public class multiplox7 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
int num1=0, diferencia=0, verificador=7, calculo=0, x=0 ;

System.out.println("\"Programa del multiplo del 7\"\n Introduzca un número");
num1=sc.nextInt();
for (x=7 ; x<num1; x+=7){
  
if (num1/7!=0)
    /*diferencia=num1%7;*/
    diferencia=x-num1;
    
/*    diferencia=((num1%7)*7);*/

}
System.out.println("La cantidad a sumar es: "+(x-num1)+" valor de x "+x);

    }
}
