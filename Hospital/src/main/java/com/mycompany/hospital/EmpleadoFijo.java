/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital;

import java.time.LocalDate;

/**
• Empleado fijo: salario mensual, porcentaje adicional por hora extra.
 */
public class EmpleadoFijo extends Empleado implements Sueldo {
    
    double salarioMensual;
    int porcentaje;
    
    EmpleadoFijo(double salarioMensual,int porcentaje,String codigo,int horas,LocalDate fechaAlta,String area, String cargo,String dni, String nombre, String apellidos,
        LocalDate fechaNacimiento,String direccion,String procedencia){
          super ( codigo, horas, fechaAlta, area,  cargo, dni,  nombre,  apellidos,
         fechaNacimiento, direccion, procedencia);
          this.salarioMensual=salarioMensual;
          this.porcentaje=porcentaje;
                  }

    @Override
    public double obtenerSueldo() {
        return salarioMensual;
    }

    @Override
    public void calculoSueldo() {
        salarioMensual=salarioMensual+porcentaje*salarioMensual;
        salarioMensual=salarioMensual*(1-Sueldo.datosIrpf());
    }
}
