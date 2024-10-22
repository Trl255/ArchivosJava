/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
 *
 * @author josea
 */
public class suma_resta_x_resta {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double  division, raiz;
        int num1=0, num2=0, resta, suma, mutiplicación, resultado;
        System.out.println("introduzca\n 1-resta\n 2-suma\n 3-multiplicación\n 4-division\n 5-raiz\n");
        resultado=sc.nextInt();
        System.out.println("introduzca un número");
        num1=sc.nextInt();
        System.out.println("introduzca otro  número");
        num2=sc.nextInt();
        if(num1>5 && num2>5){
            System.out.println("La opción seleccionada no es válida");
        }
        else if (resultado==1){
           resultado=num1-num2;
           System.out.printf("El resultado de la resta es: %.0f",resultado); 
        }if (resultado==2){
           resultado=num1+num2;
           System.out.printf("El resultado de la suma es: %.2f",resultado);
         }if (resultado==3){
           resultado=(int)num1*num2;
           System.out.println("El resultado de la multiplicación es: "+-resultado);
        }if (resultado==4){
           resultado=(int)num1/num2;
           System.out.printf("El resultado de la división es: %.2f",resultado);
        }if (resultado==5){
           resultado=(int)Math.sqrt(num1);
           System.out.println("El resultado de la división es: "+resultado+ " raíz de numero 2 es "+Math.sqrt(num2));
        
    }
}}