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
public class diaDeLaSemana {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean laboral=true;
        String dia;
        System.out.println("introduzca un día de la semana");
        dia=sc.next();
        
        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral");
                break;
            case "sabado":
            case "SABADO":
            case "domingo":
            case "DOMINGO":
                System.out.println("Es un día de fin de semana");
                break;
            default:
            System.out.println("Introduzca un día de la semana");
    }                           
}
}