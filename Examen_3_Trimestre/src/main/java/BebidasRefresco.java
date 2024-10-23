/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IFC303-1
 */
public class BebidasRefresco extends Bebida implements ImpuestoRe {

    Bebida bebidasRefresco;
    
    
    
    BebidasRefresco(String nombre, String marca, double precio, String tipo) {
        super(nombre, marca, precio, tipo);

    }
    

    @Override
    public double setPrecio() {

        double precioFinal = super.getPrecio();

        if (super.tipo.trim().equalsIgnoreCase("Refresco")) {
            precioFinal = super.getPrecio() + (super.getPrecio() * ImpuestoRe.impuestoRefresco());
            return precioFinal;
        } else {

            return precioFinal;
        }

    }

}
