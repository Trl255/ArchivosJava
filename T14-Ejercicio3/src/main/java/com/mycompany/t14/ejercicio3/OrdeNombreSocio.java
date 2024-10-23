/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t14.ejercicio3;

import java.util.Comparator;

/**
 *
 * @author IFC303-1
 */
public class OrdeNombreSocio implements Comparator <Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
        return (o1).getNombre().compareTo(o2.getNombre());
    }
    
}
