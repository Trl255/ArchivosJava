/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
Programa Java que llene un array con 10 números enteros que se leen por teclado. A  
continuación calcula y muestra la media de los valores positivos y la de los valores 
negativos del array.  */
package T_5;
import java.util.Scanner;
public class Arrays_4 {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);    
int numS[]=new int [10];
int x=0, mediaP=0, mediaN=0, sumaP=0,sumaN=0, contadorP=0, contadorN=0;
for(x=0 ; x<10 ; x++){
System.out.println("Indtroduzca el número "+(x+1));
numS[x]=sc.nextInt();
}
for (x=0 ; x<10 ; x++){
    if (numS[x]>0){
        contadorP++;
        sumaP +=numS[x];
    
}else{
        contadorN++;
        sumaN+=numS[x];
    }
}
mediaP=sumaP/contadorP;
mediaN=sumaN/contadorN;
System.out.println("La media de los números positivos es: "+ mediaP+" y la media de los negativos es: "+mediaN);
 
    }
    }          
    
