/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08_T08;

import java.time.LocalDate;

/**
 *
 * @author IFC303-1
 */
public class Locomotoras extends Maquinaria{
    double potencia;
    int antiguedad;
    Mecanicos mecanico;
    
    Locomotoras(String id, double potencia, int antiguedad, Mecanicos mecanico){
        super(id);
        this.potencia=potencia;
        this.antiguedad=antiguedad;
        this.mecanico=mecanico;
    }
    
    String mostrar(){
        return "con una potencia de "+potencia;
    }
}
