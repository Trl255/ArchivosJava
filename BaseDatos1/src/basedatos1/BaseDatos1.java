/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos1;

/**
 *
 * @author profesor
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BaseDatos1 {

   
    public static void main(String[] args) {
          
         String url="jdbc:mysql://localhost:3306/empresafecha";
         
        try {
            
         Connection con=DriverManager.getConnection(url, "root", "");
         Statement sentencia=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql="SELECT * FROM empleados";
            ResultSet valores = sentencia.executeQuery(sql);
           
            while(valores.next()){
                
                System.out.println(valores.getString("Cod"));
                System.out.println(valores.getString("Nombre"));
                System.out.println("Número de hijos:");
                System.out.println(valores.getInt("Num_hijos"));    
                
            }
            valores.close();
            sentencia.close();
            
            
            /* valores.next();
            valores.updateInt(1, 15);
            valores.rowUpdated();
            valores.beforeFirst();
            while(valores.next()){
                int codigo=valores.getInt("Cod");
                int telefono=valores.getInt(3);
                String nombre=valores.getString("Nombre");
                System.out.println("El codigo es: "+codigo+" El nombre es: "+nombre +" y el telefono es "+telefono);
           
            }
            while(valores.previous()){
                
            }*/System.out.println("conexion correcta");
        }catch (SQLException ex) {
            System.out.println("El error ha sido "+ex.getMessage());;
        }
    }
    
}
