/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alimentos;

import java.time.LocalDate;

/**
 *
 * @author profesor
 */
public class Alimentos {
    private String lote;
    private LocalDate fechaEnvasado;
    private LocalDate fechaCaducidad;
    private String pais;
    
    Alimentos(String lote, LocalDate fechaEnvasado, LocalDate fechaCaducidad, String pais){
        this.lote=lote;
        this.fechaEnvasado=fechaEnvasado;
        this.fechaCaducidad=fechaCaducidad;
        this.pais =pais;
    }
    Alimentos(String lote, String pais){
        this.lote=lote;
        this.pais=pais;
    }

    public String getLote() {
        return lote;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getPais() {
        return pais;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
     public String toString(){
        return("El lote es: "+lote+ " El pais es: "+pais+"La fecha de caducidad es:"+fechaCaducidad );
        
    }
    
}
