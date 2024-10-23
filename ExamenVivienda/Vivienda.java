/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenVivienda;

public class Vivienda {
    private String numeroCatastral;
    private String tipoVivienda;
    private double precio;
    private int numeroHabitaciones;

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

    public Vivienda(String numeroCatastral, String tipoVivienda, double precio, int numeroHabitaciones) {
        this.numeroCatastral = numeroCatastral;
        this.tipoVivienda = tipoVivienda;
        this.precio = precio;
        this.numeroHabitaciones = numeroHabitaciones;
    }
}
