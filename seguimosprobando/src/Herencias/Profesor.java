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
public class Profesor extends Persona {
    
    String titulacion;
    String guardiaRecreo;
    
    Profesor(String titulacion,String guardiaRecreo,String nombre,String dni){
        super(nombre,dni);
        this.titulacion=titulacion;
        this.guardiaRecreo=guardiaRecreo;
    }
    Profesor(String valordni,String valornombre){
        super(valornombre,valordni);
    }
    
    @Override
    public String toString(){
        return "hola";
    }
    @Override
    void mostrar(){
        super.mostrar();
        System.out.println("La titulacion es"+this.titulacion);
        System.out.println("La guardia de recreo es"+this.guardiaRecreo);
    }
    
    
}
