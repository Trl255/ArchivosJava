/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basedatos1.baseDeDatosProducto;

import java.sql.*;

/**
 *
 * @author josea
 */
public class ProductoPinform {
    public static void main(String[] args) {
        conexion();
        
    }
    



static Connection conexion() {
        java.sql.Connection con = null;
        String url = "jdbc:mysql://localhost:3306/empresafecha";
        try {
            con = DriverManager.getConnection(url, "root", "");

        } catch (SQLException ex) {
            System.out.println("Error en la conexión");
        }
        return con;
}
}