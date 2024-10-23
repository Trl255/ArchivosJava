/*/**
 * Ejercicio4. Hacer una aplicación que gestione las existencias de una tienda
 * de ropa. Cada producto se identifica por un valor alfanumérico. Se podrá dar
 * de alta, de baja los productos; y modificar el número de elementos de cada
 * producto. Los datos se mantendrán en un fichero, que se actualizará al cerrar
 * la aplicacion*/
package com.mycompany.t14.ejercicio04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class MetodosArticulos implements Serializable {

    static Scanner sc = new Scanner(System.in);

    static int comprobarEntero() {
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

    static void altaArticulo(LinkedList<Articulo> articulos) {
        sc.useDelimiter("\n");
        System.out.println("1-ALTA\nIntroduzca el nombre del articulo");
        String nombre = sc.next();
        sc.nextLine();
        System.out.println("Introduzca el stock inicial");
        int cantidad = MetodosArticulos.comprobarEntero();

        Articulo nuevoArticulo = new Articulo(nombre, cantidad);
        Collections.sort(articulos);
        int existe = Collections.binarySearch(articulos, nuevoArticulo);
        boolean anadido = 0 > existe ? true : false;
        if (anadido){
            articulos.add(nuevoArticulo);
                System.out.println("Articulo añadido correctamente\n"+nuevoArticulo.toString());
        }else if (anadido){
            System.out.println("El Articulo introducido ya existe en la basse de datos");            
        }else{
            System.out.println("No se ha podido añadir el articulo a la base de datos");            
            
        }
        
        
    }

    static void eliminarArticulo(LinkedList<Articulo> articulos) {
        System.out.println("2-BAJA\nIntroduzca la referencia del articulo");
        String consultaNombre = MetodosArticulos.peticionString();
        boolean borrado = articulos.remove(new Articulo((consultaNombre.toUpperCase())));
        System.out.println(borrado ? "El articulo ha sido borrado." : "El articulo no existe en la base de datos");
    }

    static void modificarArticulo(LinkedList<Articulo> articulos) {
        Articulo modificar = null;
        boolean encontrado = false;
        System.out.println("3.MODIFICACIÓN\n1-Cambiar el nombre.\n2-Modificar el stock.");
        int opcModificar = MetodosArticulos.comprobarEntero();
        ListIterator<Articulo> it = articulos.listIterator();

        while (opcModificar < 0 || opcModificar > 2) {
            System.out.println("Opción no válida, debe de ser entre 1 y 2\nn1-Cambiar el nombre.\n2-Modificar el stock.");
            opcModificar = MetodosArticulos.comprobarEntero();
            sc.nextLine();
        }

        it = articulos.listIterator();
        System.out.println("Opción 1-Nombre\nIntroduzca el código del artículo comprobar que existe");
        String comprobarArticulo = sc.next();
        while (comprobarArticulo.equals("")) {
            System.out.println("No puede estar vacio, introduzca el código del articulo");
            comprobarArticulo = sc.nextLine();
        }
        while (it.hasNext()) {
            modificar = it.next();

            if (comprobarArticulo.trim().equalsIgnoreCase(modificar.getId())) {
                System.out.println("Se ha encontrado el articulo en la base de datos: " + modificar.toString() + "\n");
                encontrado = true;

                if (opcModificar == 1) {
                    System.out.println("Indroduzca el nuevo nombre para el articulo: " + modificar.getDescripcion());
                    String nombModificado = sc.next();
                    while (nombModificado.equals("")) {
                        System.out.println("El campo no puede estar vacío");
                        nombModificado = sc.nextLine();
                    }

                    modificar.setDescripcion(nombModificado);
                    System.out.println("CAMBIO REALIZADO\nSe ha modificado correctamente nombre para el articulo:\n " + modificar.toString());
                }
                if (opcModificar == 2) {

                    System.out.println("Nueva cantdidad de stock para: " + comprobarArticulo + "\nIndroduzca la nueva cantidad");
                    int cantidad = MetodosArticulos.comprobarEntero();
                    modificar.setCantidad(cantidad);

                    System.out.println("Se ha actualizado existosamente el stock para el articulo:\n " + modificar.toString());
                }
            }

        }
        if (!encontrado) {
            System.out.println("No se ha encontrado el id en la base de datos");
        }
        it = articulos.listIterator();
    }

    static void listarArticulos(LinkedList<Articulo> articulos) {
        int listar = 0;
        while (listar < 1 || listar > 2) {
            System.out.println("4.LISTAR\n¿En qué orden desea listar?\n1-Descripción\n2-Código");
            listar = MetodosArticulos.comprobarEntero();
            if (articulos.isEmpty()) {
                System.out.println("No se puede mostrar\nLa lista está vacia");

            } else if (listar == 1) {
                MetodosArticulos.cantidadArticulos(articulos);
                Collections.sort(articulos, (o1, o2) -> {
                    return o1.getDescripcion().compareTo(o2.getDescripcion());
                });
                System.out.println("Ordenado por descripción");
                articulos.stream().forEach(a -> System.out.println(a));

            } else if (listar == 2) {
                MetodosArticulos.cantidadArticulos(articulos);
                System.out.println("\nOrdenado por código");
                Collections.sort(articulos, (o1, o2) -> {
                    return o1.getId().compareTo(o2.getId());
                });
                articulos.stream().forEach(a -> System.out.println(a));
            } else {
                System.out.println("Seleccione una opción correcta");
            }

        }

    }

    static void cantidadArticulos(LinkedList<Articulo> articulos) {
        System.out.println("\nActualmente hay " + articulos.stream().count() + " articulos registrados en la base de datos");
    }

    static String peticionString() {
        String nombre = "";
        System.out.println("Dime el ID del articulo");
        nombre = sc.next();
        while (nombre.equals("")) {
            System.out.println("Dime el ID del articulo");
            System.out.println("El campo no puede estar vacío");
            nombre = sc.nextLine();
        }
        return nombre;
    }

    static LinkedList serializarPrincipal(LinkedList articulos) {
        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Articulos.dat"))) {
            try {
                articulos = (LinkedList<Articulo>) ois.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al leer");
                articulos = null;
            }
        } catch (IOException ex) {
            System.out.println("Problemas en el archivo");
        }
        boolean mostrar = articulos.isEmpty();

        System.out.println(mostrar ? "\nLa lista esta vacía" : "Hay registros en la base de datos.");

        return articulos;
    }

    static void guardarFihero(LinkedList articulos) {
        System.out.println("5.Has elegido salir");
        try ( ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Articulos.dat"))) {
            salida.writeObject(articulos);
            System.out.println("Se ha guardado correctamente");
        } catch (IOException ex) {
            System.out.println("ERROR\nNo se ha podido grabar el archivo");
        }

        System.out.println(
                "Fin del menú");

    }
}
