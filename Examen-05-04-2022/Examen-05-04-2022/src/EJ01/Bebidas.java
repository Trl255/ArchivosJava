/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ01;

/**
 *
 * @author IFC303-1
 */
public abstract class Bebidas {
    String nombre;
    String marca;
    double precio;

    Bebidas(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }
    
    abstract double calcularIVA(double precio);
    
    
}
