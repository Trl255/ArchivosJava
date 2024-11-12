/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Metodos {
    static int comprobarEntero() {
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        while (true) {
            try {
                valor = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("No has introducido un valor correcto, debe ser de tipo entero");
            }
        }
        return valor;
    }
}
