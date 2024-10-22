/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una
aplicación que le ayude a contabilizar el número de patas que tienen en total todos los animales
capturados durante la jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación
a la que hay que proporcionar:
a. El número de hormigas capturadas (6 patas)
b. El número de arañas capturadas (8 patas)
c. El número de cochinillas capturadas (14 patas)
La aplicación mostrará el número total de patas.*/

package Encasa;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class cuentaDepatasBiologo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int hormigas=6, aranas=8, cochinillas=14, total=0;
        
        System.out.println("\"Programa para contabilizar el número total de patas de animales capturados\"\n Introduzca el número de hormigas capturadas");
        hormigas=sc.nextInt();
        System.out.println("Introduzca el número de hormigas arañas");
        aranas=sc.nextInt();
        System.out.println("Introduzca el número de hormigas cochinillas");
        cochinillas=sc.nextInt();
        int resultado=total(hormigas, aranas, cochinillas);
        System.out.println("El número total de las patas recogidas el día de hoy son: "+resultado);
        
        
        
    }static int total(int hormi, int ara, int cochi){
    return(int)((hormi*6)+(ara*8)+(cochi*14));
}
}