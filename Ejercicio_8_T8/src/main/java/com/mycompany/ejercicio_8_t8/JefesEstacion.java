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
public class JefesEstacion extends Personal{
    String dni;
    LocalDate fNombramiento;
    
    JefesEstacion(String nombre, LocalDate fNomb){
        super(nombre);
        this.fNombramiento=fNomb;
        
    }

    
}
