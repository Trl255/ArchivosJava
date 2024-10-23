/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author josea
 */
public class ConexionMySQL extends ConexionDB {

    public ConexionMySQL(String host, String puerto, String baseDatos, String usuario, String password) {
        super("com.mysql.jdbc.Driver", "jdbc:mysql://" + host + ":" + puerto + "/" + baseDatos, usuario, password);
    }

    public ConexionMySQL(String host, String baseDatos, String usuario, String password) {
        super("com.mysql.jdbc.Driver", "jdbc:mysql://" + host + "/" + baseDatos, usuario, password);
    }

}