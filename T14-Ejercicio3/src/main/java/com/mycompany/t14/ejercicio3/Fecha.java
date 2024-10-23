/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t14.ejercicio3;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author josea
 */
public class Fecha implements Serializable {

    private int dia;
    private int mes;
    private int anne;

    public Fecha(int dia, int mes, int anne){

        this.anne = anne;

        this.mes = mes;

        this.dia = dia;

    }
    @Override
    public String toString() {

        String diaCadena = dia + "";
        if (dia < 10) {
            diaCadena = "0" + diaCadena;
        }
        String mesCadena = mes + "";
        if (mes < 10) {
            mesCadena = "0" + mesCadena;
        }
        return diaCadena + "/" + mesCadena + "/" + anne;
    }

}
