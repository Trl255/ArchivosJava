/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;
import java.util.Scanner;
/**Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. 
 * El programa debe mostrarlo con letras, por ejemplo, para 56, se verá: “cincuenta y seis”.
 *
 * @author josea
 */
public class Ejercicio_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int numero=0, x=0;
       int iUnidad = 0, iDecena = 0;
       
        System.out.println("Introduzca un número entre 0 y 99");
        numero=sc.nextInt();
        if (numero<10){
            iUnidad=numero;
        switch (iUnidad){
            case 1-> 
                    System.out.println("uno");
            case 2-> 
                    System.out.println("dos");
            case 3-> 
                    System.out.println("tres");
            case 4-> 
                    System.out.println("cuatro");
            case 5-> 
                    System.out.println("cinco");
            case 6-> 
                    System.out.println("seis");
            case 7-> 
                    System.out.println("siete");
            case 8->
                    System.out.println("ocho");
            case 9->
                    System.out.println("nueve");
            case 0-> 
                    System.out.println("cero");
                    
         }
        }else if (numero>9 && numero<100){
            iDecena=numero;
            switch (iDecena){
            case 10-> 
                    System.out.println("diez");
            case 11-> 
                    System.out.println("once");
            case 12-> 
                    System.out.println("doce");
            case 13-> 
                    System.out.println("trece");
            case 14-> 
                    System.out.println("catorce");
            case 15-> 
                    System.out.println("quince");
            case 16-> 
                    System.out.println("deiciseis");
            case 17->
                    System.out.println("decisiete");
            case 18->
                    System.out.println("dieciocho");
            case 19-> 
                    System.out.println("diecinueve");
            }
            
        }else if (numero>19 && numero<100){
                   iDecena=numero;
                
           switch (iDecena){
               case 20->
                   System.out.println(iDecena+iUnidad);
           }
           
        /*
        }else if(numero<100){
        switch (iDecena){*/
         
        }        

      
        }
           }
    

 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* String iUnidad[]=  {"cero,uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve"};
        String iCentena1[]={"diez, once, doce, trece, catorce, quince, dieciseis, diecisiete, dieciocho, diecinueve"}; 
        String iCentena[]={"veinte, treinta, cuarenta, cincuenta, sesenta, setenta, ochenta, noventa"};
        String unidad, decimal;
        
        System.out.println("Introduzca un número entre 0 y 99");
        numero=sc.nextInt();
               if (numero<10)
               while (x!=numero)
                 x++;
                  x=numero;
                System.out.println("s"+iUnidad[x]);*/
