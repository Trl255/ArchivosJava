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
public class Congelado extends Alimentos {
    double temperatura;
               
    Congelado(String lote, String pais, double temperatura){
        super(lote,pais);
        this.temperatura=temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }
}
