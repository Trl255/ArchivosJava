/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class ejercicio2_Examen {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=0, y=0;
        System.out.println("\"PROGRAMA PARA SABER SI ERES O CUANTO TE QUEDA PARA SER MAYOR DE EDAD\"\n Por favor introduce tú edad");
        x=sc.nextInt();
        if (x>=18)
            System.out.println("Enhorabuena, ya eres mayor de edad ");
        else if (x>0 && x<12)
            System.out.println("Ten paciencia aún eres menor de edad y te queda muchos años, exactemente "+ (18-x)+ " año para ser mayor de edad");
        else
            System.out.println("Aún eres menor de edad, pero no te preocupes te quedan sólo "+ (18-x)+ " año para ser mayor de edad");
       
    }
}
