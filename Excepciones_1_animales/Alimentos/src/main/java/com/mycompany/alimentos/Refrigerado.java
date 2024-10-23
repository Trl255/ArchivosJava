/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alimentos;

import java.time.LocalDate;

/**
 *
 * @author profesor
 */
public class Refrigerado extends Alimentos {
    private String organismo;
    private double temperatura;
    
    Refrigerado(String lote, LocalDate fechaEnvasado,LocalDate fechaCaducidad, String pais,String organismo, double temperatura){
        super(lote,fechaEnvasado,fechaCaducidad,pais);
        this.organismo=organismo;
        this.temperatura=temperatura;
    }
     Refrigerado(String lote, String pais,String organismo, double temperatura){
        super(lote,pais);
        this.organismo=organismo;
        this.temperatura=temperatura;
    }

    public void setOrganismo(String organismo) {
        this.organismo = organismo;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getOrganismo() {
        return organismo;
    }

    public double getTemperatura() {
        return temperatura;
    }
    @Override
    public String toString(){
        return super.toString()+"El organismo es: "+organismo;
    }
    
}
