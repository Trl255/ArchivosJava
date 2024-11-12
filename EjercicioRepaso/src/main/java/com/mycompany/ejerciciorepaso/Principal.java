/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciorepaso;

/**
 *
 * @author profesor
 */
public class Principal {
    public static void main(String [] args){
        Vehiculo vehiculo1=new Vehiculo();
        Vehiculo vehiculo2=new Vehiculo("1587-POL",50);
        Vehiculo vehiculo3=new Vehiculo(50,"Perico de los palotes");
        Cliente cliente1=new Cliente();
        Cliente cliente2=new Cliente("Maite","Garcia","14785968Z");
        VehiculoAlquilado vA1=new VehiculoAlquilado(vehiculo2,cliente2);
        
        Cliente cliente3=vA1.getCliente();
        System.out.println(cliente3.mostrar());
        cliente3.apellidos="Perez";
        System.out.println(cliente3.mostrar());
        System.out.println(vA1.cliente.mostrar());
        
       
    }
    
}
