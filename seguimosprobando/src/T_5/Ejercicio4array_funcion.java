/*Programa Java que llene un array con 10 números enteros que se leen por teclado. A  
continuación calcula y muestra la media de los valores positivos y la de los valores 
negativos del array.*/
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;
import java.util.Scanner;
 public class Ejercicio4array_funcion {
 public static void main (String args []){
Scanner sc=new Scanner (System.in);
int []array=new int [10];    
solicitud(array);
calculo (array);
orden (array);
     
 }static void solicitud(int array[]){
     Scanner sc=new Scanner (System.in);
      for (int i=0; i<array.length; i++){
         System.out.println("Introduzca el valor "+(i+1));
         array[i]=sc.nextInt();
         }
     
     
 }static void calculo(int array []){
     int sumaP=0, sumaN=0, mediaP=0, mediaN=0, contP=0, contN=0, cont0=0;
     for (int i=0;i<array.length; i++ ){
         if (array[i]<0){
             sumaN+=array[i];
             contN++;
         }if (array[i]>0){
             sumaP+=array[i];
             contP++;
             }
         if (array[i]==0){
             cont0++;
         }
     }mediaN=sumaN/contN;
     mediaP=sumaP/contP;
  if (contP>0){
      System.out.println("La media de la suma de los números positivos es: "+mediaP);
  } if (contN>0){
             System.out.println("La media de los número negativos es: "+mediaN);
  }  System.out.println("Se han introducido "+cont0+" ceros ");
 }static void orden(int array[]){
     for (int x=0; x<array.length; x++){
         for (int y=x+1; y<array.length; y++){
             int aux=0;
             if (array[y]<array [x]){
                 aux=array [y];
                 array[y]=array[x];
                 array[x]=aux;
                 
             }
         }
     }for (int i=0; i<array.length; i++){
          System.out.println(+array[i]);   
     }
         
 }
 }








 /**    int numeros[]=new int [10];
     Scanner sc=new Scanner(System.in);
     peticion(numeros);
     valoracion (numeros);
     
 }   static void peticion(int []numA){
     Scanner sc=new Scanner(System.in);
     for (int i=0; i<numA.length ;i++){
     System.out.println("introduzca el valor");
     numA[i]=sc.nextInt();
     }
 }static void valoracion(int []NP){
     int sumaP=0, sumaN=0, contN=0, contP=0, medN=0, medP=0,cont0=0;
     for (int i=0; i<NP.length; i++){
         
         if (NP[i]==0){
             cont0++;
         }
         else if (NP[i]<0){
             sumaN+=NP[i];         
             contN++;
         }
         else if  (NP[i]>0){
             sumaP+=NP[i];
             contP++;
             
     }
         }
         if (contP>0){
               System.out.println("La media de los numero positivos es "+(sumaP/contP));
         }
       
         if (contN>0){
             System.out.println("La media de los numero negativos es "+(sumaN/contN));
         }
     
         
     System.out.println("La cantidad de 0 introducidos es  "+cont0);
     
     
 }
         
         
}*/
