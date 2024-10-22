/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerciciorepaso;

/**
 *
 * @author profesor
 */
public class Cliente {
    String nombre;
    String apellidos;
    String dni;
    
    Cliente(){
        
    }
    Cliente(String nombre, String apellidos, String dni){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }
    String mostrar(){
        return "El cliente es: "+nombre+" "+apellidos+ " y su dni es "+dni;
    }
    
    
    
}
