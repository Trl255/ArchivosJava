package com.mycompany.tema12;

/*Leer un fichero por medio del scanner,también solicitar al usuario que se muestre
solo los numero mayores que el número del usuario*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Dr_6_Scanner {

    public static void main(String[] args) {
        File f = new File("numeros.txt");
        int num = 0, suma = 0, numUsuario = 0;

        try ( Scanner sc = new Scanner(f);  
                Scanner scUsuario = new Scanner(System.in)) {

            System.out.println("Introduce un numero");
            numUsuario = scUsuario.nextInt();

            while (sc.hasNext()) {
                num = sc.nextInt();

                if (numUsuario < num) {
                    System.out.println(num);
                    suma += num;
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error, archivo no encontrado" + ex.getMessage());
        }
        System.out.println("\nLa suma es:\n" + suma);
    }

}
