/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author IFC303-1
 */
public class Propietario {
    private String nombre;
    private String apellidos;
    private String dni;
    
    Propietario(){}
    Propietario(String dni){
        this.dni=dni;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    void setDni(String dni) {
        this.dni = dni;
    }

    String getNombre() {
        return nombre;
    }
    String getApellidos() {
        return apellidos;
    }
    String getDni() {
        return dni;
    }
    
    
    
}
