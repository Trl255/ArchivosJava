/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listasclientet14;

import java.util.Objects;

/**
 *
 * @author profesor
 */
public class Cliente implements Comparable {
    String dni;
    String nombre;
    int edad;
    public Cliente(){
        
    }
    public Cliente(String dni,String nombre){
        this.dni=dni;
        this.nombre=nombre;
    }
    
    public String toString(){
        return "El cliente "+ this.nombre + " tiene un dni "+dni;
    } 
    @Override
    public int hashCode(){
        int hash=7;
        hash = 56 * hash+ Objects.hashCode(this.dni);
        return hash;
    }
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o ==null)
            return false;
        if(getClass()!=o.getClass())
                return false;
        Cliente otro=(Cliente)o;
        if(!dni.equals(otro.dni))
            return false;
        return true;
    }

    @Override
    public int compareTo(Object o) {
        return dni.toLowerCase().compareTo((((Cliente)o).dni.toLowerCase()));
    }
    
 
}
