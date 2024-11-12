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
public class Alumno extends Persona {
   
    String ciclo;
    int curso;
    Alumno(String nombre,String dni,int curso){
        super(nombre,dni);
        this.curso=curso;
    }
    
    
}
