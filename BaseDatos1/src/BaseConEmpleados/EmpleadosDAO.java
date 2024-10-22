/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseConEmpleados;

import java.util.Date;
import java.sql.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpleadosDAO {

    static Connection conexionDAO() {
        java.sql.Connection con = null;
        String url = "jdbc:mysql://localhost:3306/empresafecha";
        try {
            con = DriverManager.getConnection(url, "root", "");

        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
        return con;
    }

    static Empleados solicitudDAtos() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        Empleados empleado = null;
        System.out.println("Alta empleado\nIntroduzca el código");
        int Codigo = EmpleadosDAO.comprobarEntero();
        System.out.println("Introduzca la fecha de nacimiento del empleado");
        System.out.println("Introduzca el día");
        int dia = EmpleadosDAO.comprobardia();
        System.out.println("Introduzca el mes");
        int mes = EmpleadosDAO.comprobarMes();
        System.out.println("Introduzca el año");
        int anne = EmpleadosDAO.comprobarAnne();
        Date fecha_nacimiento = new Date(anne, mes, dia);

        System.out.println("Introduzca el salario");
        double Salario = EmpleadosDAO.comprobarDouble();
        System.out.println("Introduzca la cantidad de hijos");
        int Numero_hijos = EmpleadosDAO.comprobarEntero();
        System.out.println("Introduzca el nombre del empleado");
        String nombre = sc.nextLine();

        empleado = new Empleados(Codigo, fecha_nacimiento, Salario, Numero_hijos, nombre);

        boolean creado = createDAO(empleado);
        if (creado) {
            System.out.println("El siguiente empleado se ha creado correctamente:\n" + empleado.toString());
        } else {
            System.out.println("No se ha podido crear el empleado");

        }
        return empleado;
    }

    public static boolean createDAO(Empleados empleado) {
        boolean creado = false;
        Connection con = conexionDAO();
        String sql = "INSERT INTO empleados (Cod,Fecha_nacimiento,Salario,Num_hijos,Nombre)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, empleado.getCodigo());
            sentencia.setDate(2, new java.sql.Date(empleado.getFecha_nacimiento().getTime()));
            sentencia.setDouble(3, empleado.getSalario());
            sentencia.setInt(4, empleado.getNumeroHijos());
            sentencia.setString(5, empleado.getNombre());
            sentencia.executeUpdate();
            creado = true;
            sentencia.close();
        } catch (SQLException ex) {
            System.out.println("Error a la hora de Crear el empleado " + ex.getMessage());
            creado = false;
        }
        return creado;
    }

    static public Empleados readDAO() {
        Scanner sc = new Scanner(System.in);
        Empleados empleado = null;
        boolean encontrado = false;

        System.out.println("Introduzca el usuario al buscar");
        int Cod = comprobarEntero();

        String sql = "SELECT * FROM empleados WHERE Cod=?";
        try {
            Connection con = conexionDAO();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, Cod);
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                String Nombre = rs.getString("Nombre");
                Date Fecha_nacimiento = rs.getDate("Fecha_nacimiento");
                Double Salario = rs.getDouble("Salario");
                Integer NumeroHijos = rs.getInt("Num_hijos");
                empleado = new Empleados(Cod, Fecha_nacimiento, Salario, NumeroHijos, Nombre);
                encontrado = true;
                if (encontrado) {
                    System.out.println(empleado.toString());
                } else if (encontrado = false) {
                    System.out.println("No se ha encontrado un empleado asociado con el código: " + Cod);
                }

            }
            sentencia.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error en la conexión de la base de datos");
        }
        return empleado;
    }

    public static Empleados updateDAO(Empleados empleado) {
        double nuevoSalario = empleado.getSalario();
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        int filas = 0, opcion = 0, codigoOriginal=0;
        boolean salir = false, codCambiado = false;

        Connection con = conexionDAO();
        String sql = "UPDATE empleados SET Fecha_nacimiento = ?, Salario = ?,"
                + " Num_hijos = ?, Nombre = ? WHERE Cod = ?";

        while (!salir) {
            try {
                PreparedStatement sentencia = con.prepareStatement(sql);
                System.out.println("\n***********SUBMENU***********\n\nQue desea actualizar:\n1-Fecha de nacimiento\n2-Salario.\n3-Número de hijos\n4-Nombre.\n5-Código\n6-Toda la información.\n7-Atrás y guardar.\n8-Atrás y NO guardar.");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca la nueva fecha de nacimiento");
                        System.out.println("Introduzca el día");
                        int dia = EmpleadosDAO.comprobardia();

                        System.out.println("Introduzca el mes");
                        int mes = EmpleadosDAO.comprobarMes();
                        System.out.println("Introduzca el año");
                        int anne = EmpleadosDAO.comprobarAnne();

                        Date nuevaFecha = new Date(anne, mes, dia);
                        empleado.setFecha_nacimiento(nuevaFecha);

                        break;
                    case 2:
                        System.out.println("Introduzca el nuevo salario");
                        nuevoSalario = EmpleadosDAO.comprobarDouble();
                        empleado.setSalario(nuevoSalario);
                        System.out.println("Salario actualizado correctamente");

                        break;
                    case 3:
                        System.out.println("Introduzca la nueva cantidad de hijos");
                        int nuevaCantidadHijos = EmpleadosDAO.comprobarEntero();
                        empleado.setNumeroHijos(nuevaCantidadHijos);
                        System.out.println("Salario actualizado correctamente");

                        break;
                    case 4:
                        System.out.println("Introduzca el nuevo nombre del empleado con código: " + empleado.getCodigo());
                        String nuevoNombre = sc.next();

                        empleado.setNombre(nuevoNombre);
                        System.out.println("Nombre actualizado correctamente");
                        break;
                    case 5:
                        System.out.println("Introduzca la nueva cantidad de hijos");
                        int codigo = EmpleadosDAO.comprobarEntero();
                        empleado.setCodigo(codigo);
                        //System.out.println("Salario actualizado correctamente");

                        break;
                    case 6:
                        System.out.println("Introduzca la nueva fecha de nacimiento");
                        System.out.println("Introduzca el día");
                        dia = EmpleadosDAO.comprobardia();
                        System.out.println("Introduzca el mes");
                        mes = EmpleadosDAO.comprobarMes();
                        System.out.println("Introduzca el año");
                        anne = EmpleadosDAO.comprobarAnne();

                        nuevaFecha = new Date(anne, mes, dia);
                        empleado.setFecha_nacimiento(nuevaFecha);

                        System.out.println("Introduzca el nuevo salario");
                        nuevoSalario = EmpleadosDAO.comprobarDouble();
                        empleado.setSalario(nuevoSalario);

                        System.out.println("Introduzca la nueva cantidad de hijos");
                        nuevaCantidadHijos = EmpleadosDAO.comprobarEntero();
                        empleado.setNumeroHijos(nuevaCantidadHijos);

                        System.out.println("Introduzca el nuevo nombre del empleado con código: " + empleado.getCodigo());
                        nuevoNombre = sc.next();
                        empleado.setNombre(nuevoNombre);
                        
                        codigoOriginal=empleado.getCodigo();
                        System.out.println("Introduzca el nuevo codigo del empleado " + empleado.getNombre());
                        codigo = EmpleadosDAO.comprobarEntero();
                        if (codigo != empleado.getCodigo()) {
                            codCambiado = true;
                        }
                        empleado.setCodigo(codigo);
                        break;
                    case 7:
                        
                        sentencia.setDate(1, new java.sql.Date(empleado.getFecha_nacimiento().getTime()));
                        sentencia.setDouble(2, empleado.getSalario());
                        sentencia.setInt(3, empleado.getNumeroHijos());
                        sentencia.setString(4, empleado.getNombre());
                        sentencia.setInt(5, empleado.getCodigo());
                        filas = sentencia.executeUpdate();
                        System.out.println("Se han actualizado " + filas + " filas");
                        con.close();
                        sentencia.close();
                        if (codCambiado==true){
                            EmpleadosDAO.deleteDAO(codigoOriginal);
                            System.out.println("Cambios guardados satisfactoriamente");
                        }
                        
                        salir = true;
                        break;
                    case 8:
                        System.out.println("No se han guardado los cambios realizados");
                        salir = true;
                        break;
                }

            } catch (SQLException ex) {
                System.out.println("Error en la conexión a la hora de UPDATE " + ex.getMessage());
            }

        }
        return empleado;
    }

    //Eliminamos el registro asociado al código       
    public static int deleteDAO() {
        String sql = "DELETE FROM empleados WHERE Cod= ?";
        int eliminados = 0;
        System.out.println("Introduzca el codigo de cliente que desea eliminar");
        int Cod = EmpleadosDAO.comprobarEntero();
        try {
            Connection con = conexionDAO();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, Cod);//Asignamos el código a buscar

            eliminados = sentencia.executeUpdate();
            if (eliminados > 0) {
                System.out.println("Se han eliminado " + eliminados + " registros");
            } else {
                System.out.println("No se ha encontrado el empleado con el código introducido");
            }
            sentencia.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error a la hora de ELIMINAR " + ex.getMessage());

        }
        return eliminados;
    }
    public static int deleteDAO(int codigo) {
        String sql = "DELETE FROM empleados WHERE Cod= ?";
        int eliminados = 0;
        try {
            Connection con = conexionDAO();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, codigo);//Asignamos el código a buscar

            eliminados = sentencia.executeUpdate();
            if (eliminados > 0) {
                System.out.println("Se han eliminado " + eliminados + " registros");
            } else {
                System.out.println("No se ha encontrado el empleado con el código introducido");
            }
            sentencia.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error a la hora de ELIMINAR " + ex.getMessage());

        }
        return eliminados;
    }

    //Construir una lista con los empleados de nuestra BD
    static ArrayList<Empleados> crearLista() {
        Connection con = conexionDAO();
        ArrayList<Empleados> empleados = new ArrayList<>();
        Empleados empleado = null;
        String sql = "SELECT * FROM empleados";
        try {

            Statement sentencia = con.createStatement();
            ResultSet it = sentencia.executeQuery(sql);
            while (it.next()) {
                int Cod = it.getInt("Cod");
                String Nombre = it.getString("Nombre");
                Date Fecha_nacimiento = it.getDate("Fecha_nacimiento");
                Double Salario = it.getDouble("Salario");
                Integer Num_hijos = it.getInt("Num_hijos");
                empleado = new Empleados(Cod, Fecha_nacimiento, Salario, Num_hijos, Nombre);
                empleados.add(empleado);
            }
            empleados.stream().forEach(e -> System.out.println(e));
            con.close();
            sentencia.close();

        } catch (SQLException ex) {
            System.out.println("Error en la lectura de la base de datos " + ex.getMessage());
        }
        return empleados;
    }

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

    static int comprobardia() {
        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();
        while (dia > 31 || dia < 1) {
            try {
                System.out.println("Introduzca un día válido");
                dia = sc.nextInt();

            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("El día debe ser entre 1 y 31");
            }
        }
        return dia;
    }

    static int comprobarMes() {
        Scanner sc = new Scanner(System.in);
        int mes = 0;
        mes = sc.nextInt();
        while (mes > 12 || mes < 1) {
            try {
                System.out.println("Introduzca un mes válido");
                mes = sc.nextInt();

            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("El mes debe ser entre 1 y 12");
            }
        }
        return mes;
    }

    static int comprobarAnne() {
        Scanner sc = new Scanner(System.in);
        int anne = 0;
        anne = sc.nextInt();
        while (anne > 2010 || anne < 0) {
            try {
                System.out.println("Introduzca un añó válido");
                anne = sc.nextInt();

            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("El año introducido no es correcto");
            }
        }
        anne = anne - 1900;
        return anne;
    }

    static double comprobarDouble() {
        Scanner sc = new Scanner(System.in);
        double valor = -1;
        valor = sc.nextDouble();
        while (valor < 0) {
            try {
                System.out.println("Introduzca un valor válido");
                valor = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("No has introducido un valor correcto, debe ser de tipo positivo");
            }
        }
        return valor;
    }

}
