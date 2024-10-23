/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.*;
/**
 *
 * @author josea
 */
public class BD_Principal {
    
    public static void main(String[] args) {
        try {

            //Creo la conexión
            ConexionDB conexion = new ConexionDB("empresafecha", "jdbc:mysql://localhost:3306/empresafecha", "root","");

            //Ejecuto la consulta
            conexion.ejecutarConsulta("select * from empleados");

            //Recojo el ResultSet
            ResultSet rs = conexion.getResultSet();

            //Muestro la consulta
            while (rs.next()) {
                System.out.println(rs.getString("Nombre"));
            }

        } catch (SQLException ex) {
            System.out.println("Error en la conexión"+ex.getMessage());
        }

    }


}
