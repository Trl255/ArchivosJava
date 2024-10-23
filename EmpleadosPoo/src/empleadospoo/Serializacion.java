/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleadospoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josea
 */
public class Serializacion {
    public static void main(String[] args) throws ClassNotFoundException {
       
        
        try( ObjectInputStream ois=new ObjectInputStream (new FileInputStream("Empleado.dat"))){
         
            
            //while( true){
                Empleado [] empleados=(Empleado[])ois.readObject();
                
                //System.out.println(aux.toString());
                for (Empleado e: empleados){
                    System.out.println(e.toString());
                }
                //System.out.println("");
            
             //}           
            } catch (ClassNotFoundException ex1) {
                System.out.println(ex1.getMessage());
            
            } catch (EOFException ex1) {
                System.out.println(ex1.getMessage());
            
            } catch (IOException ex1) {
                System.out.println(ex1.getMessage());
            }
        
        
    }
    
}
