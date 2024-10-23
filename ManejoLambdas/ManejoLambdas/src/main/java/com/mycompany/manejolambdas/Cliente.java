/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.mycompany.manejolambdas;
import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author mama
 */
public class Cliente implements Comparable <Cliente>{
    String dni;
    String nombre;
    String apellidos;
    int edad;
    
    public Cliente(){
    }
     
    public Cliente(String dni, String nombre,int edad){
       this.dni = dni;
       this.nombre= nombre;
       this.edad = edad;
    }
   
    
    @Override
    public String toString(){
        return this.nombre + " tiene un dni de "+ this.dni+ "su edad "+this.edad+"\n";
    }
    //Este lo usamos para saber cuando dos elementos son iguales
   @Override
    public int compareTo(Cliente o) {
        return dni.compareTo(o.dni);
    }
    @Override
    
    public int hashCode(){
    int hash=5;
    hash = 97 * hash + Objects.hashCode(this.dni);
    return hash;
    }
    public boolean equals(Object ob){
        if(this == ob)
            return true;
        if(ob == null)
            return false;
        if (getClass() != ob.getClass())
             return false;
        Cliente other = (Cliente) ob;
        if (!dni.equals(other.dni))
          return false;
        return true;
    }
}
 /*   class comparaNombre implements Comparator <Cliente>{

        @Override
        public int compare(Cliente o1, Cliente o2) {
            return o1.nombre.compareTo(o2.nombre);
        }
        
    }*/
    
