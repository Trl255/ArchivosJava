/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listasclientet14;

import java.util.Comparator;

/**
 *
 * @author IFC303-1
 */
public class OrdenarPorEdad implements Comparator <Cliente>{


    
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.edad-o2.edad;
    }

    
    
}
