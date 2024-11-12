/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author IFC303-1
 */
public class Vivienda implements Comparator<Vivienda> {

    private String numeroCatastral;
    private String tipoVivienda;
    private double precio;
    private int numeroHabitaciones;

    public Vivienda(String numeroCatastral, String tipoVivienda, double precio, int numeroHabitaciones) {
        this.numeroCatastral = numeroCatastral;
        this.tipoVivienda = tipoVivienda;
        this.precio = precio;
        this.numeroHabitaciones = numeroHabitaciones;
    }
 public Vivienda(String numeroCatastral) {
        this.numeroCatastral = numeroCatastral;
 }
    public void setNumeroCatastral(String numeroCatastral) {
        this.numeroCatastral = numeroCatastral;
    }

    public void setTipoVivienda(String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getNumeroCatastral() {
        return numeroCatastral;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    @Override
    public int hashCode() {
        int hash = 8;
        hash = 78 * hash + Objects.hashCode(this.numeroCatastral);
        return hash;
    }

    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null) {
            return false;
        }
        if (getClass() != ob.getClass()) {
            return false;
        }
        Vivienda other = (Vivienda) ob;
        if (!numeroCatastral.equals(other.numeroCatastral)) {
            return false;
        }
        return true;
    }

    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return o2.getNumeroHabitaciones() - o1.getNumeroHabitaciones();
    }

    @Override
    public String toString() {
        return "La vivienda, con número Catastral: " + numeroCatastral + "\nTipoVivienda: " + tipoVivienda + "\nTiene un precio:" + precio + "\nNúmero de habitaciones:" + numeroHabitaciones + "\n";
    }

}
