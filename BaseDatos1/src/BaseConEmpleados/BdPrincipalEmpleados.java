/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseConEmpleados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class BdPrincipalEmpleados {

    public static void main(String[] args) {
        boolean salir = false;
        java.sql.Connection con = null;
        EmpleadosDAO.conexionDAO();
        Empleados empleado = null;
        ArrayList<Empleados> listaEmpleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        sc.delimiter();

        while (!salir) {
            try {
                System.out.println("\n**********BD EMPLEADOS**********\n**********MENU PRINCIPAL**********");
                System.out.println("\n**********OPCIONES A REALIZAR:************\n1-Alta empleados\n2-Busqueda por ID\n3-Baja empleados\n4-Listar BD\n5-Actualizar empleado\n6-Salir");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        EmpleadosDAO.solicitudDAtos();
                        break;

                    case 2:
                        EmpleadosDAO.readDAO();

                        break;

                    case 3:
                        EmpleadosDAO.deleteDAO();
                        break;

                    case 4:
                        //EmpleadosDAO.crearLista(listaEmpleados);//Da error pasarlo por parametro
                        EmpleadosDAO.crearLista();
                        break;
                    case 5:
                        empleado = EmpleadosDAO.readDAO();
                        if (empleado == null) {
                            System.out.println("No se ha encontrado el codígo introducido");
                        } else {
                            EmpleadosDAO.updateDAO(empleado);
                        }

                        break;
                    case 6:
                        salir = true;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Introducir una de las siguientes opciones:" + ex.getMessage());
                sc.next();
            }

        }

    }

}
