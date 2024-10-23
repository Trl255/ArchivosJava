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
public class VehiculoAlquilado {
    Vehiculo vehiculo;
    Cliente cliente;
    int dia;
    int mes;
    int year;
    int diasAlquiles;
    
    VehiculoAlquilado(){
        
    }
    VehiculoAlquilado(Vehiculo vehiculos,Cliente clientes){
        cliente=new Cliente(clientes.nombre,clientes.apellidos,clientes.dni);
        vehiculo=new Vehiculo(vehiculos.matricula,vehiculos.tarifa);
       // this.cliente=cliente;
       // this.vehiculo=vehiculo;
    }
    VehiculoAlquilado(String nombre,String apellidos,String dni,String matricula,double tarifa){
        vehiculo =new Vehiculo(matricula,tarifa);
        cliente = new Cliente(nombre,apellidos,dni);
    }

    public Vehiculo getVehiculo() {
        
        return vehiculo;
    }

    public Cliente getCliente() {
        Cliente nuevo=new Cliente();
        nuevo.apellidos=cliente.apellidos;
        nuevo.nombre=cliente.nombre;
        nuevo.dni=cliente.dni;
        return nuevo ;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getYear() {
        return year;
    }

    public int getDiasAlquiles() {
        return diasAlquiles;
    }
    String mostrar(){
        return "Los datos del cliente son "+cliente.mostrar()+ "y los del vehiculo son "+vehiculo.mostrar();
    }
    
}
