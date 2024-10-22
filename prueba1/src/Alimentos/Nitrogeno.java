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
public class Nitrogeno extends Congelado {
    String tipoCongelacion;
    int tiempo;

    public Nitrogeno(String tipoCongelacion, String lote, String pais, double temperatura) {
        super(lote, pais, temperatura);
        this.tipoCongelacion = tipoCongelacion;
    }

    public String getTipoCongelacion() {
        return tipoCongelacion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTipoCongelacion(String tipoCongelacion) {
        this.tipoCongelacion = tipoCongelacion;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
