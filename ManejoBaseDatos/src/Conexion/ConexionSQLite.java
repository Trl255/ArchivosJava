/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author josea
 */
public class ConexionSQLite extends ConexionDB {

    public ConexionSQLite(String ruta) {
        super("org.sqlite.JDBC", "jdbc:sqlite:" + ruta);
    }
}