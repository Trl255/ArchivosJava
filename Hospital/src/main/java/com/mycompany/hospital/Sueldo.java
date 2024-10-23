/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hospital;

/**
 *
 * @author mama
 */
public interface Sueldo {
    double obtenerSueldo();
    void calculoSueldo();
    static double datosIrpf(){
        return 0.18;
    }
    
}
