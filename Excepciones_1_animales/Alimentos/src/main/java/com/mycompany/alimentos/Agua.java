/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alimentos;

/**
 *
 * @author profesor
 */
public class Agua extends Congelado {
    double salinidad;
    
    Agua(String lote,String pais,double temperatura){
        super(lote,pais,temperatura);
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }
    
}
