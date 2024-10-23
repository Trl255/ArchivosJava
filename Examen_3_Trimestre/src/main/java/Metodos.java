package com.mycompany.examen_3_3_trimestre;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author josea
 */
public class Metodos {

    static Scanner sc = new Scanner(System.in);

    public static int generaNumeroAleatorio(int minimo, int maximo) {

        int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
        return num;
    }
    
    

    public static int generaNumeroAleatorio() {

        int num = (int) Math.floor(Math.random() * (1 - (99 + 1)) + (99 + 1));
        return num;
    }
   
    
    public static String generarDNI() {
        final int divisor = 23;

        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);

        //Pasamos el DNI a String
       String DNI = Integer.toString(numDNI) + letraDNI;
        return  DNI;
    }

    private static  char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];

    }

    static double leerDouble() {
        double valor = 0;
        boolean valido = true;
        while (valido){
        //System.out.println("Introduzca el número double");
        try {
            
            valor = sc.nextDouble();
            sc.nextLine();
            valido = false;
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Debe introducir un número double");
            valido = false;
        }
        }
        return valor;

    }

    static int leerEntero() {
        int valor = 0;
        boolean valido = true;
        while (valido){
            
        try {
            //System.out.println("Introduzca el número entero");
            valor = sc.nextInt();
            sc.nextLine();
            valido = false;
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Debe introducir un número entero");
        }
     
    }return valor;
    }   

    //static int Menu() throws DNIException {
  /*    //  Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;

        while (!salir) {

            System.out.println("--------------1. Opción 1-----------------------");
            System.out.println("--------------2. Opción 2-----------------------");
            System.out.println("--------------3. Opción 3-----------------------");
            System.out.println("--------------4. Opción 4-----------------------");
            System.out.println("--------------5. Opción 5-----------------------");
            System.out.println("--------------6. Opción 6-----------------------");
            System.out.println("--------------7. Opción 7-----------------------");
            System.out.println("--------------8. Opción 8-----------------------");
            System.out.println("--------------9. salir-----------------------");

            try {

                System.out.println("Introducela opción a realizar");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        int x = 0,
                         y = 0,
                         suma = 0;
                        System.out.println("suma");
                        System.out.println("Introduzca el primer dígito");
                        x = sc.nextInt();
                        
                        System.out.println("Introduzca el primer dígito");
                        y = sc.nextInt();
                        suma = x + y;
                        System.out.println(suma);
                        break;
                        
                    case 2:
                        
                        System.out.println("introduzca el DNI");
                        String dni=sc.next();
                        System.out.println(dni);
                        
                        
                        break;
                    case 3:
                        System.out.println("Esta es la opcion 3");

                        break;
                    case 4:
                        System.out.println("Esta es la opcion 4");

                        break;
                    case 5:
                        System.out.println("Esta es la opcion 5");

                        break;
                    case 6:
                        System.out.println("Esta es la opcion 6");

                        break;
                    case 7:
                        System.out.println("Esta es la opcion 7");

                        break;
                    case 8:
                        System.out.println("Esta es la opcion 8");

                        break;
                    case 9:

                        System.out.println("Has elegido salir");
                        salir = true;
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número de las opciones" + e.getMessage());
                sc.next();
            }

        }
        System.out.println("Fin del menú");
        return opcion;
    }*/
}
