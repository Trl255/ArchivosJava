/*Ejercicio3. Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que incluirá el
método equals() y la interfaz Comparable basada en el dni. Implementar el programa que permita
gestionar los socios de un club guardando los datos en el fichero socios.dat. Al arrancar la aplicación,
se leerán los datos del fichero y se abre un menú con las opciones: 1. Alta, 2. Baja, 3. Modificaciones,
4. Listado por dni y 6. Salir.*/
package com.mycompany.t14.ejercicio3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author IFC303-1
 */
public class Principal {

    public static void main(String[] args) throws ClassNotFoundException, IOException {

        Scanner sc = new Scanner(System.in);
        int dia = 0, mes = 0, anne = 0;
        boolean salir = false;
        int opcion = 0;
        Socio socioComodin;

        TreeSet<Socio> socios = new TreeSet();
        try ( ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("fichero.dat"))) {
            try {
                socios = (TreeSet<Socio>) entrada.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al leer");
                socios = null;
            }
        } catch (IOException ex) {
            System.out.println("Problemas en el archivo");
        }
        if (socios.size() > 1) {
            Metodos.mostrarLista(socios);
        } else {
            System.out.println(" La lista esta vacía");
        }

        while (!salir) {

            System.out.println("--------------1. Alta-----------------------");
            System.out.println("--------------2. Baja-----------------------");
            System.out.println("--------------3. Modificaciones-----------------------");
            System.out.println("--------------4. Listado-----------------------");
            System.out.println("--------------5. Salir-----------------------");

            try {

                System.out.println("Introducela opción a realizar");
                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        socioComodin = Datos.solicitudDatos(socios);
                        socios.add(socioComodin);

                        break;

                    case 2:
                        System.out.println("Opción 2-BAJA\nIntroduzca el DNI");
                        String valorar = sc.next();

                        Metodos.eliminarSocio(valorar, socios);

                        break;

                    case 3:
                        System.out.println("Opción 3\nQue desea modificar\n1-Nombre.\n2-Fecha de alta.\n3-DNI.");
                        int opcModificar = Metodos.comprobarEntero();
                        Metodos.modificarSocio(opcModificar, socios);

                        break;

                    case 4:
                        int listar = 0;

                        Metodos.listarSocios(listar, socios);

                        break;

                    case 5:
                        System.out.println("Has elegido salir");
                        try ( ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("fichero.dat"))) {
                            salida.writeObject(socios);
                            System.out.println("Se ha guardado correctamente");
                        } catch (IOException ex) {
                            System.out.println("ERROR\nNo se ha podido grabar el archivo");
                        }

                        salir = true;
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número de las opciones" + e.getMessage());
                sc.next();
            }

        }

        System.out.println(
                "Fin del menú");

    }
}
