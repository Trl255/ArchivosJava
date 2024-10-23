/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class Recursividad{
    public static void main(String []args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = scr.nextInt();
        System.out.println("Introduce el exponente");
        int exponente=scr.nextInt();
        if(numero>0){
           System.out.println( sumarhastacero(numero));
        }
        if(exponente>0){
            System.out.println(elevado(numero,exponente));
        }
       
        
        
    }
   static int elevado(int a,int b){
       int resultado=1;
       if(b!=0){
       resultado=a*elevado(a,b-1);
       }
       return resultado;
   }
  

static int sumarhastacero(int a){
    int resultado=0;
    if(a!=0){
        resultado=a+sumarhastacero(a-1);
        
    }
    return resultado;
    
}
/*static int elevado(int a, int b){
    int resultado=1;
    if(b!=0){
        resultado=a*elevado(a,b-1);
    }
 return resultado;   */  
}