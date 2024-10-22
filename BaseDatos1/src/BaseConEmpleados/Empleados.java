/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseConEmpleados;

import java.util.Date;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Empleados {

    final int TAM_NOMBRE = 30;//para indicar el tamaño máximo del nombre en la base
//de datos esta definido a VARCHAR (30)

    private int codigo;
    private Date fecha_nacimiento;
    private double salario;
    private int numeroHijos;
    private String nombre;

    public Empleados(int codigo, Date fecha_nacimiento, double salario, int numeroHijos, String nombre) {
        this.codigo = codigo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.salario = salario;
        this.numeroHijos = numeroHijos;
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.substring(0, Math.min(TAM_NOMBRE, nombre.length()));
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public static Connection conexion() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/empresafecha";
        try {
            con = DriverManager.getConnection(url, "root", "");

        } catch (SQLException ex) {
            System.out.println("Error en la conexión");;
        }
        return con;
    }

    public void create() {
        Connection con = conexion();
        String sql = "INSERT INTO empleados (Cod,Fecha_nacimiento,Salario,Num_hijos,Nombre)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, codigo);
            sentencia.setDate(2, new java.sql.Date(fecha_nacimiento.getTime()));
            sentencia.setDouble(3, salario);
            sentencia.setInt(4, numeroHijos);
            sentencia.setString(5, nombre);
            sentencia.executeUpdate();
            sentencia.close();
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    static public Empleados read(int cod) {
        Empleados miEmpleado = null;
        boolean hay = true;
        Connection con = conexion();
        // String sql="SELECT * FROM empleados WHERE Cod="+cod;
        String sql = "SELECT * FROM empleados WHERE Cod=?";
        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, cod);
            ResultSet tabla = sentencia.executeQuery();
            while (tabla.next()) {
                miEmpleado.codigo = tabla.getInt(1);
                miEmpleado.fecha_nacimiento = tabla.getDate(2);
                miEmpleado.salario = tabla.getDouble("Salario");
                miEmpleado.numeroHijos = tabla.getInt(4);
                miEmpleado.nombre = tabla.getString(5);

            }
            sentencia.close();
        } catch (SQLException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miEmpleado;
    }

    public void update() {
        try {
            String sql = "UPDATE empleados SET Fecha_nacimiento = ?, Salario = ?,"
                    + " Num_hijos = ?, Nombre = ? WHERE Cod = ?";

            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setDate(1, new java.sql.Date(this.getFecha_nacimiento().getTime()));
            sentencia.setDouble(2, this.getSalario());
            sentencia.setInt(3, this.getNumeroHijos());
            sentencia.setString(4, this.getNombre());
            sentencia.setInt(5, this.getCodigo());

            sentencia.executeUpdate();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error en la conexión a la hora de UPDATE " + ex.getMessage());;
        }

    }
    //Eliminamos el registro asociado al código       

    public void delete() {
        String sql = "DELETE FROM empleados WHERE Cod= ?";
        try {
            Connection con = conexion();
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, this.codigo);//Asignamos el código a buscar
            sentencia.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error a la hora de ELIMINAR " + ex.getMessage());

        }
    }

    @Override
    public String toString() {
        return "Código de cliente: " + codigo + "\nNombre: " + nombre + "  fecha de nacimiento: " + fecha_nacimiento + "\nsalario: " + salario + "  tiene " + numeroHijos + " hijos";
    }

}
