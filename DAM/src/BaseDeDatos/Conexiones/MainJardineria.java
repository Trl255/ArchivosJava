/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos.Conexiones;

import java.util.Scanner;

/**
 *
 * @author josea
 */
public class MainJardineria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreBaseDatos = "jardineria";
        int numero = 0;

        Metodos.connectionDDBB(nombreBaseDatos);

        numero = Metodos.numberInteger(sc, "Edad");

        System.out.println("Numero introducido " + numero);

        Metodos.showMenu();
    }

}
