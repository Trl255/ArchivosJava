/**
 * Ejercicio4. Hacer una aplicación que gestione las existencias de una tienda
 * de ropa. Cada producto se identifica por un valor alfanumérico. Se podrá dar
 * de alta, de baja los productos; y modificar el número de elementos de cada
 * producto. Los datos se mantendrán en un fichero, que se actualizará al cerrar
 * la aplicacion
 *
 * @author josea
 */
package com.mycompany.t14.ejercicio04;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author josea
 */
public class PrincipalArticulos {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        LinkedList<Articulo> articulos = new LinkedList();
        articulos = MetodosArticulos.serializarPrincipal(articulos);

        while (!salir) {
            try {

                System.out.println("\nINTRODUCE LA OPCIÓN A REALIZAR");
                System.out.println("1. Alta articulos\n2. Baja articulos\n3. Modificación de articulos\n4. Listado\n5. Salir");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:

                        MetodosArticulos.altaArticulo(articulos);
                        break;
                    case 2:

                        MetodosArticulos.eliminarArticulo(articulos);
                        break;
                    case 3:

                        MetodosArticulos.modificarArticulo(articulos);
                        break;
                    case 4:

                        MetodosArticulos.listarArticulos(articulos);
                        break;
                    case 5:

                        MetodosArticulos.guardarFihero(articulos);
                        salir = true;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número de las opciones" + e.getMessage());
                sc.next();
            }

        }

    }

}
