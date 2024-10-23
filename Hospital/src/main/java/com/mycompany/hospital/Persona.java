/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital;

import java.time.LocalDate;

/**
 •	Persona: DNI, nombre, apellido, fecha de nacimiento, dirección y ciudad de procedencia.
•	
 */
public class Persona {
    String dni;
    String nombre;
    String apellido;
    LocalDate fechaNacimiento;
    String direccion;
    String procedencia;
    
    Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento,String direccion,String procedencia){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellidos;
        this.fechaNacimiento = LocalDate.of(fechaNacimiento.getYear(),fechaNacimiento.getMonth(),fechaNacimiento.getDayOfMonth());
        this.direccion=direccion;
        this.procedencia=procedencia;
    }
    public String toString(){
        return "DNI: "+dni+
                " Nombre: "+nombre+
                " Apellidos: "+apellido+
                " Fecha nacimiento: "+fechaNacimiento.getDayOfMonth()+"/"+fechaNacimiento.getMonth()+"/"+fechaNacimiento.getYear()+
                " Dirección: "+ direccion+
                " Ciudad de procedencia "+procedencia;
        
    }
}
