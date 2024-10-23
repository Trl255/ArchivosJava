/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ01;

/**
 *
 * @author IFC303-1
 */
public class Refrescos extends Bebidas {
    double precioFinal;
    
    public Refrescos(String nombre, String marca, double precio) {
        super(nombre, marca, precio);
    }

    @Override
    double calcularIVA(double precio) {
        double IVA = 1.21; //EL IVA PARA LOS REFRESCOS ES DEL 21%
        double precioConIVA = precio*IVA;
        return precioConIVA;
    }
    
}
