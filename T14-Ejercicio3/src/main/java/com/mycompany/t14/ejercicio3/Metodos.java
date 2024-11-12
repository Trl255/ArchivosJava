/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t14.ejercicio3;

import static com.mycompany.t14.ejercicio3.Metodos.sc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author josea
 */
public class Metodos implements Serializable {

    static Scanner sc = new Scanner(System.in);

    static void mostrarLista(Set<Socio> socios) {
        Set<Socio> sociosMostrar = new TreeSet<>();
        if (!(socios.isEmpty())) {

            /*if (fichero.exists()) {
                ObjectInputStream ois = null;
                try {
                    ois = new ObjectInputStream(new FileInputStream(fichero));
                    while (true) {

                        Socio c = (Socio) ois.readObject();
                        sociosMostrar.add(c);
                        //Lo leo objeto por objeto y lo añado a la lista sociosMostrar luego lo muestro en un for each pero me muestra sólo un cliente, en el archivo se añade bien
                        //porque se actualia la hora de modificación en el sistema.
                        
                    }
                    
                } catch (FileNotFoundException ex) {
                    System.out.println("Archivo no encontrado " + ex);
                } catch (IOException ex) {
                    System.out.println("Error al establecer conexión " + ex);
                } catch (ClassNotFoundException ex) {
                    System.out.println("Clase no encontrada " + ex);
                } finally {
                    
                    }
                    try {
                        ois.close();
                    } catch (IOException ex) {
                        System.out.println("Error al cerrar el arhivo");
                    }
                }*/
        } else {
            System.out.println("Debes crear el fichero");
        }
        for (Socio e : sociosMostrar) {
            System.out.println(e.toString());
        }
    }

    static void modificarSocio(int opcModificar, Set<Socio> socios) {
        int dia = 0, mes = 0, anne = 0;
        Socio modificar = null;
        Iterator<Socio> it = socios.iterator();
        while (opcModificar < 0 || opcModificar > 3) {
            System.out.println("Opción no válida, debe de ser entre 1 y 3\n\n1-Nombre.\n2-Fecha de alta.\n3-DNI.");
            opcModificar = Metodos.comprobarEntero();
        }

        it = socios.iterator();
        System.out.println("Opción 1-Nombre\nIntroduzca el DNI para comprobar que existe");
        String comprobarDni = sc.next();
        while (it.hasNext()) {
            modificar = it.next();

            if (comprobarDni.equals(modificar.getDni())) {
                System.out.println("Se ha encontrado correctamente el DNI: " + comprobarDni);

                if (opcModificar == 1) {
                    System.out.println("Indroduzca el nuevo nombre para el DNI: " + comprobarDni);
                    String nombModificar = sc.next();
                    modificar.modificarNombre(nombModificar);
                    System.out.println("CAMBIO REALIZADO\nSe ha modificado correctamente nombre para el DNI: " + comprobarDni);

                
            }
            if (opcModificar == 2) {

                System.out.println("Nueva fecha para el DNI: " + comprobarDni + "\nIndroduzca la nueva fecha de alta\nIntroduzca el día");
                dia = Metodos.comprobarDia();

                System.out.println("Nueva fecha para el DNI: " + comprobarDni + "\nIndroduzca la nueva fecha de alta\nIntroduzca el mes");
                mes = Metodos.comprobarMes();

                System.out.println("Nueva fecha para el DNI: " + comprobarDni + "\nIndroduzca la nueva fecha de alta\nIntroduzca el año");
                anne = Metodos.comprobarAnne();
                //Date fechaNueva= new Date(dia, mes, anne);
                modificar.setFechaAlta(dia, mes, anne);
                System.out.println("CAMBIO REALIZADO\nSe ha modificado correctamente la fecha de alta para el DNI: " + comprobarDni);

            }
            if (opcModificar == 3) {
                System.out.println("Indroduzca el nuevo nombre para el DNI: " + comprobarDni);
                String dniModificar = sc.next();
                modificar.setDni(dniModificar);
                System.out.println("CAMBIO REALIZADO\nSe ha modificado correctamente el DNI: " + comprobarDni);

            }
            if (socios.size() < 1) {
                System.out.println("No se ha encontrado el DNI: " + comprobarDni + " la lista está vacía");
            }

        }else {
                System.out.println("Este DNI: " + comprobarDni + ", no existe en la base de datos");
            
        }
        }
        it = socios.iterator();
    }

    static void eliminarSocio(String dni, Set<Socio> socios) {
        Iterator<Socio> it = socios.iterator();
        boolean eliminado = false;

        it = socios.iterator();

        while (it.hasNext()) {
            Socio eliminar = it.next();
            if (dni.equals(eliminar.getDni())) {
                it.remove();
                eliminado = true;
                System.out.println("Se ha eliminador correctamente el DNI: " + dni);
            }
        }

        if (eliminado == false) {
            System.out.println("No se ha podido eliminar el DNI: " + dni + ", no esta en la base de datos");
        }

        it = socios.iterator();

    }

    static void anadirAfichero(Socio socioNuevo, File fichero, Set<Socio> socios) {
        ObjectOutputStream oos = null;

        try {

            oos = new ObjectOutputStream(new FileOutputStream(fichero, true));
            oos.writeObject(socioNuevo);
            //No sé, si se puede incluir directamente la lista?? Así:  oos.writeObject(socios.add(socioNuevo));

            oos.close();
            System.out.println("Añadido al fichero correctamente");
        } catch (FileNotFoundException ex) {
            System.out.println("Arhivo no encontrado " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error, no se ha podido establecer conexión con el archivo " + ex.getMessage());
        }

    }

    static int comprobarDia() {
        int dia = 0;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        while (!correcto) {
            try {

                dia = sc.nextInt();
                if (!(dia > 31 || dia < 1)) {
                    correcto = true;
                } else {
                    System.out.println("El día debe ser entre 0 y 31");

                }

            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("El dato introducido no es correcto\nIntroduzca el día correcto");

            }

        }
        return dia;

    }

    static int comprobarMes() {
        int mes = 0;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        while (!correcto) {
            try {

                mes = sc.nextInt();
                if (!(mes > 12 || mes < 1)) {
                    correcto = true;
                } else {
                    System.out.println("El mes introducido no es correcto");
                }

            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("Lo introducido no es entero");

            }
        }
        return mes;
    }

    static int comprobarAnne() {
        int anne = 0;
        boolean valido = false;

        while (!valido) {
            try {

                anne = sc.nextInt();
                if (anne >= 1918 && anne <= 2010) {
                    valido = true;
                } else {
                    System.out.println("El año introducido no es válido");
                    System.out.println("Introduzca un año válido");
                }
            } catch (InputMismatchException ex) {
                sc.nextLine();
                System.out.println("Valor introducido no válido");
            }
        }

        return anne;
    }

    static void listarSocios(int listar, Set<Socio> socios) {
        while (listar < 1 || listar > 2) {
            System.out.println("Introduzca una opcíion valida:\n¿En qué orden desea listar?\n1-DNI\n2-Nombre");
            listar = Metodos.comprobarEntero();
        }

        if (socios.isEmpty()) {
            System.out.println("No se puede mostrar\nLa lista está vacia");

        } else if (listar == 1) {
            for (Socio e : socios) {
                System.out.println(e.toString());

            }

        } else if (listar == 2) {
            List<Socio> listaNombre = new ArrayList<Socio>(socios);
            Collections.sort(listaNombre, new OrdeNombreSocio());

            System.out.println("Ordenado por nombre");
            for (Socio valor : listaNombre) {
                System.out.println(valor);

            }
        } else {
            System.out.println("No se ha podido mostrar la lista");
        }
    }

    static int comprobarEntero() {
        sc = new Scanner(System.in);
        int valor = 0;
        while (true) {
            //System.out.println("Introduce un valor entero");

            try {
                valor = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("No has introducido un valor correcto, debe ser de tipo entero");
            }
        }

        return valor;

    }

    static File comprobarYcrearFichero(String nombre) {
        File fichero = new File(nombre + ".dat");
        if (fichero.exists()) {
            System.out.println("El fichero ya esta creado");
        } else {
            try {
                if (fichero.createNewFile()) {
                    System.out.println("Se ha creado el fichero");
                } else {
                    System.out.println("Error al crear el fichero");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return fichero;

    }

}

class Datos {

    static Socio solicitudDatos(Set<Socio> socios) {
        int dia = 0, mes = 0, anne = 0;
        
        System.out.println("Opción 1\nintroduzca el DNI");
        String dni = sc.next();
        examinaDni(dni);
        System.out.println("Introduzca el Nombre");
        String nombre = sc.next();
        System.out.println("Introduzca la fecha de alta");

        System.out.println("Introduzca el día");
        dia = Metodos.comprobarDia();

        System.out.println("Introduzca el mes");
        mes = Metodos.comprobarMes();

        System.out.println("Introduzca el año");
        anne = Metodos.comprobarAnne();
        Date f1 = new Date(dia, mes, anne);

        Socio socio1 = new Socio(dni, nombre, dia, mes, anne);

        System.out.println("Se ha añadido correctamente el socio");

        return socio1;
    }

    static boolean examinaDni(String longitud) {
        int numeros = 0;
        String letra = null;
        boolean valido = false;
        while (!valido) {
            if (longitud.length() > 0 && longitud.length() <= 9) {
                return true;

            } else {
                System.out.println("Longitud no es correcta, introuzca de nuevo");
                System.out.println("Opción 1\nintroduzca el DNI");
                String dni = sc.next();
            }
        }
        return valido;
    }

}
