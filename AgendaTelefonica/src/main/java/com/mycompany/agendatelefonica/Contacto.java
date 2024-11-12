/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica;

import java.io.Serializable;

/**
 *
 * @author josea
 */
public class Contacto implements Serializable {
    
    private static final long serialVersionUID = -1L;
    
    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public boolean equals (Contacto c){
        if (this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())){
            return true;
           } 
            return false;
            }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nTeléfono:" + telefono ;
    }
    
    
    
}
