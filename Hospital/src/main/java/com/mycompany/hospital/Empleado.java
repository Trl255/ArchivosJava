/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital;

import java.time.LocalDate;

/**
•  Empleado: código de Empleado, numero de horas extras, fecha de alta, área, cargo.
 */
public class Empleado extends Persona {
    String codigoEmpleado;
    int horasExtras;
    LocalDate fechaAlta;
    String area;
    String cargo;
    
    Empleado (String codigo,int horas,LocalDate fechaAlta,String area, String cargo,String dni, String nombre, String apellidos,
        LocalDate fechaNacimiento,String direccion,String procedencia){
            
        super(dni,nombre,apellidos,fechaNacimiento,direccion,procedencia);
        this.codigoEmpleado=codigo;
        this.horasExtras=horas;
        this.fechaAlta=fechaAlta;
        this.area=area;
        this.cargo=cargo;
       
    }
    
}
