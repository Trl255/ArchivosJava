/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IFC303-1
 */
public abstract class Bebida {

    String nombre;
    String marca;
    double precio;
    String tipo;

    enum tipo {
        Refresco, Licor
    }

    Bebida() {

    }

    Bebida(String nombre, String marca, double precio,  
        enum tipo){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;

    }

    String getNombre() {
        return nombre;
    }

    String getMarca() {
        return marca;
    }

    double getPrecio() {
        return precio;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract double setPrecio();

    @Override
    public String toString() {
        return "El nombre de la bebida: " + nombre + "\nMarca: " + marca + "\nPrecio: " + precio;
    }
}
