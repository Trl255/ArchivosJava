/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;

/**
 *Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 * @author josea
 */
public class divisible_2y3 {
    public static void main(String args[]){
        int num1=1;
        /*while (num1<=100){
        if (num1%2==0 || num1%3==0){
        System.out.println("este es el resultado "+num1);
        }num1++;*/
    while (num1<=100){
     if (num1%2==0 || num1%3==0) {  
        System.out.println(""+num1);
     }        num1++;
    }
}
}