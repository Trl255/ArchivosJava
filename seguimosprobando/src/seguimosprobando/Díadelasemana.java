/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;

import java.util.Scanner;

/**
 *
 * @author IFC303-1
 */
public class Díadelasemana {

    public static void main(String args[]) {
        

        Scanner entrada = new Scanner(System.in);
         System.out.println("Introduce un día");
        int dia=entrada.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Ese día no existe");

        }
        System.out.println("Introduce el mes");
        int mes=entrada.nextInt();
        if (mes>12)
            System.out.println("Ese mes no existe");
        else
        {
            if(mes>=1 && mes<2)
                System.out.println("Este es el mes de enero");
            
            if(mes>=2 && mes<3)
                System.out.println("Este es el mes de febrero");
            if (mes>=3 && mes<4)           
                System.out.println("Este es el mes de marzo");
            if (mes<=4 && mes<5)
                System.out.println("Este es el mes de abril");
            if (mes<=5 && mes<6)
                System.out.println("Este es el mes de mayo");
            if (mes<=6 && mes<7)
                System.out.println("Este es el mes de junio");
            if (mes<=7 && mes<8)
                System.out.println("Este es el mes de julio");
            if (mes<=8 && mes<9)
                System.out.println("Este es el mes de agosto");
            if (mes<=9 && mes<10)
                System.out.println("Este es el mes de septiembre");
            if (mes<=10 && mes<11)
                System.out.println("Este es el mes de octubre");
            if (mes<=11 && mes<12)
                System.out.println("Este es el mes de noviembre");
            if (mes<=12 && mes<13)
                System.out.println("Este es el mes de diciembre");
            
            
                
        }

    }
}
