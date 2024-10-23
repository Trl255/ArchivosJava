
package com.mycompany.henrenciaproducto;

/**
 *
 * @author josea
 */
public class Productos {


    private double precio;
    private String nombre;

    public Productos(String nombre, double precio) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "El nombre del productos es: " + "\nEl precio es:" + precio;
        
     }
    public double calcular (int cantidad){
        
        return cantidad*precio;
        
        
    }   
    }
     
    

