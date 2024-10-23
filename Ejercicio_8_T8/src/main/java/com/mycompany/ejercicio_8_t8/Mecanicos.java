/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08_T08;

/**
 *
 * @author IFC303-1
 */
public class Mecanicos extends Personal{
    String tlf;
  //  String especialidad;
    
    enum Especialidad {
        frenos, hidráulica, electricidad, motor
    }
    
    Mecanicos(String nombre, String tlf){
        super(nombre);
        this.tlf=tlf;
    }
    
}
