
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * El resgistro de empleados de mi banco, la información que guardo es dni,
 * nombre y el sueldo. Yo puedo dar de alta, eliminar, modicar un empleado Y
 * salir. Toda la información asociada a mis empleados la guardaremos en fichero
 * binario.
 */
public class Principal {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Empleado[] empleados = null;
        ObjectInputStream fichero = null;
        try {
            fichero = new ObjectInputStream(new FileInputStream("fichero_empleados.dat"));
            try {
                //readObject lee un Objeto, pero nosotros queremos que sea un array de Empleado
                empleados = (Empleado[]) fichero.readObject();
                System.out.println(empleados.toString());
                
            } catch (ClassNotFoundException ex) {
                System.out.println("El fichero no contiene un objeto de ese tipo");;
            }fichero.close();

        } catch (FileNotFoundException ex) {
            System.out.println("El fichero no existe");;
        } catch (IOException e) {
            System.out.println("El problema es de lectura");
        }
        int seleccion;
        do {
            seleccion = Metodos.menu();

            if (seleccion == 1) {
                System.out.println("Introduce el dni");
                String dni = entrada.nextLine();
                System.out.println("Introduce el nombre");
                String nombre = entrada.nextLine();
                System.out.println("Introduce el sueldo");
                double sueldo = Metodos.leerDouble();
                Empleado empleadoNuevo = new Empleado(dni, nombre, sueldo);
                int esta = Metodos.buscarEmpleado(empleadoNuevo, empleados);
                if (esta != -1) {
                    System.out.println("El usuario ya existe");
                } else {
                    empleados = Metodos.nuevoUsuario(empleadoNuevo, empleados);
                }

            } else if (seleccion == 2) {
                System.out.println("Introduce el dni del empleado que queremos quitar");
                String dni = entrada.nextLine();
                Empleado empleado = new Empleado(dni, "", 0);
                int indice = Metodos.buscarEmpleado(empleado, empleados);
                if (indice != -1) {
                    empleados = Metodos.borrarEmpleado(indice, empleados);

                } else {
                    System.out.println("El empleado no existe");
                }

            } else if (seleccion == 3) {
                System.out.println("Introduce el dni del empleado que queremos modificar");
                String dni = entrada.nextLine();
                Empleado empleado = new Empleado(dni, "", 0);
                int indice = Metodos.buscarEmpleado(empleado, empleados);
                if (indice == -1) {
                    System.out.println("Ese usuario no existe");
                } else {
                    Metodos.modificarEmpleado(indice, empleados);
                }

            } else if (seleccion == 4) {
                if (empleados != null) {
                    for (Empleado nombreInventado : empleados) {
                        System.out.printf("El empleado se llama %s tiene"
                                + "este dni %s y su sueldo es tiene %.2f\n",
                                 nombreInventado.getNombre(), nombreInventado.getDni(),
                                nombreInventado.getSueldo());
                    }
                } else {
                    System.out.println("No hay ningun empleado");
                }
            }

        } while (seleccion != 5);

        try {
            ObjectOutputStream datosEmpleados = new ObjectOutputStream(new FileOutputStream("fichero_empleados.dat", true));
            datosEmpleados.writeObject(empleados);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
