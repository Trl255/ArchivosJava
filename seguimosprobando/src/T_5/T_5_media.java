/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;

import java.util.Scanner;

public class T_5_media {
 public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    int valores=0;
    
    System.out.println("Introduzca la cantidad de personas");
    valores=sc.nextInt();
    int []arrayC=new int [valores];
    rellenarValores(arrayC);
    float media=media1(arrayC);
    System.out.println("La media es "+media);
    mayor(arrayC,media);
   }
 
 static void rellenarValores(int []valores){
      Scanner sc=new Scanner(System.in);
       for (int i=0; i<valores.length ; i++){
        System.out.println("Introduzca el valor ");
        valores[i]=sc.nextInt();
    }
       
 }
static  float media1(int resultado[]){
    float imedia=0;
    float suma=0, contador=0;
    for (int i=0; i<resultado.length ; i++){
        suma+=resultado[i];
        contador++;
    }
    imedia=suma/contador;
    return  imedia;
}
static void mayor(int []valorar, float media1){
    int contP=0, contN=0;
    for (int i=0 ; i<valorar.length;i++ ){
        if(valorar[i]>media1){
            contP++;
            
        }else{
            contN++;
        }
    }
    System.out.println("Los numeros mayores que la media "+contP);
    System.out.println("Los numeros menores que la media "+contN);
    
    
}

}
