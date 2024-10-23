/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaCorriente;

/**
 *
 * @author profesor
 */
public class Gestor {
    public String nombre;
    private String telefono;
    double importeMaximo;
    
   
    Gestor(String nombre, String telefono,double importe){
        this.nombre=nombre;
        this.telefono=telefono;
        this.importeMaximo=importe;
    }
    Gestor(String nombre, String telefono){
        this(nombre, telefono,10000);
    }
    public String getTelefono(){
        return telefono;
    }
    void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Telefono: "+telefono);
        System.out.println("importeMaximo: "+importeMaximo);
    }
    
    
    
    
    
}
