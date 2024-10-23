/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital;

import java.time.LocalDate;

/**
•	Empleado eventual: honorarios por hora, 
* numero de horas totales (normales + extras) trabajadas, fecha de termino del contrato.
 */
public class EmpleadoEventual extends Empleado implements SueldoEventual {
    int horas;
    double precioHora;
    LocalDate fechaFin;
    double sueldoFinal;
    EmpleadoEventual(int horasExtras,double precioHora,LocalDate fechaFin,String codigo,int horas,LocalDate fechaAlta,String area, String cargo,String dni, String nombre, String apellidos,
        LocalDate fechaNacimiento,String direccion,String procedencia){
        super( codigo, horas, fechaAlta, area,  cargo, dni,  nombre,  apellidos,
         fechaNacimiento, direccion, procedencia);
        this.horasExtras=horasExtras;
        this.precioHora=precioHora;
        this.fechaFin=fechaFin;
        
    }

    @Override
    public int horasTotales() {
        int horasTotal=this.horasExtras+this.horas;
        return horasTotal;
    }

    @Override
    public void calculoSueldo() {
        sueldoFinal=this.horasTotales()*this.precioHora;
        sueldoFinal=sueldoFinal*(1-SueldoEventual.irpf);
        
    }
    
    
}
