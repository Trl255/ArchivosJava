/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08_T08;

/**
 *
 * @author IFC303-1
 */
public class Maquinistas extends Personal{
    String dni;
    String cargo;
    double sueldo;
    
    Maquinistas(String nombre, String dni){
        super(nombre);
        this.dni=dni;
    }
    
    String mostrar(){
        return nombre+" con dni: "+dni;
    }
}
