/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 * Solicita al usuario tres distanticas:
a. La priemra, medida en milímetros.
b. La segunda, medida en centímetros.
c. La última, medida en metros.
Diseña un programa que sume las tres longitudes y nos muestre su valor en centímetros
 * @author josea
 */
public class medidasEnCentimetros {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double milimetros=0, centimetros=0, metros=0, resultadoM=0;
        
        System.out.println("Introduzca las medidas en milímetros");
        milimetros=sc.nextInt();
        System.out.println("Introduzca las medidas en centímetros");
        centimetros=sc.nextInt();
        System.out.println("Introduzca las medidas en metros");
        metros=sc.nextInt();
        
        resultadoM=((centimetros/10)+(centimetros)+(metros*100));
        
        System.out.println("Las medidas en centimetros es:"+resultadoM);
        
        
    }
    /*static int calculo(int mil, int cent, int met){
        int mMil=mil/0,001;*/
        
    }

