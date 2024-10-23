/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1y2;


/**
 *
 * @author profesor
 */
public class Metodos {
    static boolean esPrimo(int n){
        boolean primo = true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0) 
                primo=false; 
            break;
        }
        return primo;
    }
   
    
}
