
package com.mycompany.examen_ejercicio_2;

public class Principal {
    public static void main(String[] args) {
        
        Electrodomesticos elec1=new Electrodomesticos ("Jaf", "S5", "A++");
       
        Frigorifico frigo1=new Frigorifico (20, elec1);
        Frigorifico frigo=new Frigorifico (2.2,20, elec1);
        
        Lavadoras lava1=new Lavadoras(320,elec1);
        
        System.out.println(frigo1);
        
        
        
        
        
        
        
    }
    




}
