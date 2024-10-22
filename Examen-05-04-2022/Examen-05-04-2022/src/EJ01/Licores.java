/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ01;

/**
 *
 * @author IFC303-1
 */
public class Licores extends Bebidas implements impuestoAlc{
    double precioFinal;

    public Licores(String nombre, String marca, double precio) {
        super(nombre, marca, precio);
    }

    @Override
    double calcularIVA(double precio) {
        double IVA = 1.34; //EL IVA PARA LOS LICORES ES DEL 34%
        double precioConIVA = precio*IVA;
        return precioConIVA;
    }

    @Override
    public double calcularImpuestoAlc(double precio) {
        double impuesto = 1.08; //EL IMPUESTO DEL ALCHOOL ES DEL 8%
        double precioConIMP = precio*impuesto;
        return precioConIMP;
    }
}
