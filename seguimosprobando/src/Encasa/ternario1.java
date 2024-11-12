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
public class ternario1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
int num, resultado;
        

System.out.println("Introduzca un número");
num=sc.nextInt();

resultado=num<0 ? num--:num++;

System.out.println("El resultado es: "+ resultado);
/*
resultado=num<0 ? num-=num:num-1;
System.out.println("Si el nñumero es negativo es igual a :  "+resultado);*/


        
            
            
        }
        
    }
    
