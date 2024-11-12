/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencias;

/**
 *
 * @author profesor
 */
public class Persona {
     String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    protected String correo;
    
    Persona(String nombre,String dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    
    Persona(String dni,String nombre,String correo){
        
    }

    public String getTelefono() {
        return telefono;
    }
    /* @Override
    public String toString(){
        return "Hola";
    }*/
    void mostrar(){
        System.out.println("El nombre es "+this.nombre);
        System.out.println("El telefono es "+this.telefono);
        System.out.println("El dni es "+this.dni);
        System.out.println("El correo es "+this.correo);
        System.out.println("La dirección es "+this.direccion);
    }
    
}
