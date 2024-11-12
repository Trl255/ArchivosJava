/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletarusa;

/**
 *
 * @author josea
 */
public class Revolver {

    private int posicionBalaActual;
    private int posicionBala;

    public Revolver() {
        posicionBalaActual = Metodos.generarNumeroAleatorio(1, 6);
        posicionBala = Metodos.generarNumeroAleatorio(1, 6);
    }

    boolean disparar() {
        boolean exito = false;
        if (posicionBalaActual == posicionBala) {
            exito = true;
        }
        siguienteBala();

        return exito;
    }

    public void siguienteBala() {

        if (posicionBalaActual == 6) {
            posicionBalaActual = 1;

        } else {

            posicionBalaActual++;
        }
    }

    @Override
    public String toString() {
        return "Posición de la bala actual: " + posicionBalaActual + ", Posicion bala: " + posicionBala;
    }
    
}
