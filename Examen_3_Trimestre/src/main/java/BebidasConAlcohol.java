/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author IFC303-1
 */
public class BebidasConAlcohol extends Bebida implements ImpuestoAl {
    
    
    Bebida bebidasAlcohol;
    
    
    
    BebidasConAlcohol(String nombre, String marca, double precio, String tipo) {
        super(nombre,  marca,  precio,  tipo);
        
    }    
    
    
    
    @Override
    public double setPrecio() {
        
        double precioFinal = super.getPrecio()+(ImpuestoAl.impuestoGraducion());
        
        if (super.tipo.trim().equalsIgnoreCase("Cerveza")) {
            precioFinal = super.getPrecio() + (super.getPrecio() * ImpuestoAl.impuestoCerveza());
            return precioFinal;
        }else {
        precioFinal = super.getPrecio() + (super.getPrecio() * ImpuestoAl.impuestoLicores());
            return precioFinal;
    }
    
}

}
