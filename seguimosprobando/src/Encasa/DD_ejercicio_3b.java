/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class DD_ejercicio_3b {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        
        System.out.println("Introduzca el tamaño");
        a=sc.nextInt();
        int []arrays=new int [a];
        int []valores=numeros(arrays);
        int []primo=primos (valores);
        System.out.println("Estos son los valores primos: ");
        primos(valores);
        mayor (primo);
        
        
    }public static int [] numeros (int []arrays){
        int rnd[]=new int [arrays.length];
        for (int i=0; i<arrays.length; i++){
            rnd[i]=(int) (Math.random()*99+1);
            System.out.println(""+rnd[i]);
            }
            return rnd;
            
            
    } public static int [] primos(int []valores){
        int cont=0;
        for (int i=0;i<valores.length; i++){
            if (valores[i]%2==1){
                cont++;
                System.out.println(""+valores[i]);
            } 
        /*}
         int []primo=new int [cont];
         int indice=0;
        
        for (int i=0;i<valores.length; i++){
            if (valores[i]%2==1){
                primo[indice]=valores[i];
                indice++;
                System.out.println(""+primo[indice]);
            }  */  
        }return valores;
    
        
    }public static int mayor(int []primo){
           int mayor=0;
        for (int i=0; i<primo.length; i++){
            if (mayor<primo[i]){
             mayor=primo [i];
            
        }
    }System.out.println("El valor máximo: "+mayor);   
        return mayor;
    
}
    
}
    