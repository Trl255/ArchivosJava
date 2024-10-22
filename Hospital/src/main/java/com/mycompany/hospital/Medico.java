/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital;

import java.time.LocalDate;

/**
Los médicos (un tipo especial Persona) se encargan de las atenciones de las consultas médicas.
• Médico: especialidad ( cirujano, oftalmólogo), servicio (cirugía, oftalmología, etc.), número de consultorio.
 */
public class Medico extends Persona {
    String especialidad;
    String servicio;
    int numeroConsultorio;
    
    Medico(String especialidad, String servicio, int numeroConsultorio, String dni, 
         String nombre, String apellidos, LocalDate fechaNacimiento,String direccion,String procedencia){
        super(dni,nombre,apellidos,fechaNacimiento,direccion,procedencia);
        this.especialidad=especialidad;
        this.numeroConsultorio=numeroConsultorio;
     }
    
    
}
