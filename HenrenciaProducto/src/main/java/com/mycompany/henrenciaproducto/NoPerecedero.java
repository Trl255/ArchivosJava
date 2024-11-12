/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.henrenciaproducto;

/**
 *
 * @author josea
 */
public class NoPerecedero extends Productos{
    
    private String tipo;

    public NoPerecedero(String tipo, String nombre, double precio ) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n el tipo=" + tipo ;
    }
    
    
     
    
}
