/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejobasedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author mama
 */
public class ManejoBaseDatos {

    public static void main(String[] args) {
        Connection con;
        Statement sentencia;
        String sql;
        String url ="jdbc:mysql://localhost:3306/empresax";
          /*Esta conexión la podemos hacer directamente de la siguiente forma:
        String url ="jdbc:mysql://localhost";
            +"database=empresax;"
            +"user=root;"
            +"loginTimeout=30"; //Esta opción es para que intente conectar 30 sg no más
        */      
        try{
        con = DriverManager.getConnection(url,"root","");
        sentencia = con.createStatement();
        }catch(SQLException e){
            System.out.println("Error en la conexión "+e.toString());
        }
    }
    
}
