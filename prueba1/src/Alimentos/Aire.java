/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alimentos;

/**
 *
 * @author profesor
 */
public class Aire extends Congelado{
    
    double vapor;
    double nitrogeno;
    double oxigeno;
    double dioxido;
    
    Aire(String lote, String pais,double temperatura){
        super(lote,pais,temperatura);
    }
    Aire(String lote,String pais, double temperatura, double vapor){
        super(lote,pais,temperatura);
        this.vapor=vapor;
    }

    public void setVapor(double vapor) {
        this.vapor = vapor;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public void setDioxido(double dioxido) {
        this.dioxido = dioxido;
    }

    public double getVapor() {
        return vapor;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public double getDioxido() {
        return dioxido;
    }
            
}
