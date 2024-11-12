/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.henrenciaproducto;

/**
 *
 * @author josea
 */
public class Perecedero extends Productos {

    private int diaCaduca;

    public Perecedero(int diaCaduca, String nombre, double precio ) {
        super(nombre, precio );
        this.diaCaduca = diaCaduca;
    }

    public int getDiaCaduca() {
        return diaCaduca;
    }

    public void setDiaCaduca(int diaCaduca) {
        this.diaCaduca = diaCaduca;
    }

    @Override
    public String toString() {
        return super.toString() + "\n los días que le quedan para caducar son: " + diaCaduca;
    }

    public double calcular(int cantidad) {

        double precioFinal = super.calcular(cantidad);

        switch (diaCaduca) {

            case 1:

                precioFinal /= 4;

                break;
            case 2:

                precioFinal /= 3;
                break;

            case 3:

                precioFinal /= 2;
                break;

        }

        return precioFinal;
    }

}
