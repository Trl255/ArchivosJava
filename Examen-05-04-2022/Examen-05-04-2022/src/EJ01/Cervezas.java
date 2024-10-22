/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ01;

/**
 *
 * @author IFC303-1
 */
public class Cervezas extends Bebidas implements impuestoAlc{
    double precioFinal;

    public Cervezas(String nombre, String marca, double precio) {
        super(nombre, marca, precio);
    }

    @Override
    double calcularIVA(double precio) {
        double IVA = 1.14; //EL IVA PARA CERVEZAS ES DEL 14%
        double precioConIVA = precio*IVA;
        return precioConIVA;
    }

    @Override
    public double calcularImpuestoAlc(double precio) {
        double impuesto = 1.08; //EL IMPUESTO ES DEL 8%
        double precioConIMP = precio*impuesto;
        return precioConIMP;
    }

    
}
