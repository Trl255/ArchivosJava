
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Ejercicio2.  Escribir  una  función  a  la  que  le  pasemos  dos  enteros  y  nos  muestre  todos  los  números 
comprendidos entre ellos. 
* 
 * @author IFC303-1
 */
public class Ejercicio2 {
public static void main(String args[])    {
int num1,num2;
/**
    mostrar(diferencia);
}
static void mostrar(int diferencia){
if (num1=num1; num1<num2;num2++)
      System.out.println(""+diferencia);
      
else (num2=num2; num2<num1; num2++){
    System.out.println(""+diferencia);*/
Scanner sc=new Scanner(System.in);
System.out.println("Introduce el número 1");
num1=sc.nextInt();
System.out.println("Introduce el número 2");
num2=sc.nextInt();

mostrar(num1,num2);
}
static void mostrar(int numero1, int numero2){
 System.out.println("El primer número introducido es "+numero1+"\nEl segundo número introducido es "+numero2);
    if (numero1>numero2){
        int aux=numero1;
        numero1=numero2;
        numero2=aux;
        
    }
   while(numero1<numero2){
        System.out.println(numero1);
        numero1++;
   
        
    }
    
}
        
}

