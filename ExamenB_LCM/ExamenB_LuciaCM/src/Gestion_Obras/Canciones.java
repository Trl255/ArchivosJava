/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion_Obras;

import java.time.LocalDateTime;

/**
 *
 * @author IFC303-1
 */
public class Canciones extends Obras{
    protected String interprete;
    public LocalDateTime duracion;

    
    Canciones(String autor, String interprete){
        super(autor);
        this.interprete=interprete;
    }
    Canciones(String titulo, String autor, String genero, LocalDateTime duracion){
        super(titulo, autor, genero);
        this.duracion=duracion;
    }
    
    void setInterprete(String interprete) {
        this.interprete = interprete;
    }
    void setDuradion(LocalDateTime duracion) {
        this.duracion = duracion;
    }

    String getInterprete() {
        return interprete;
    }
    
    @Override
    String mostrar(){
        String resultado="";
        if(super.mostrar()!=null){
            if(interprete!=null && duracion!=null)
                resultado=super.mostrar()+"\nTiene una duración de "+duracion+" y la interpreta "+interprete;
            if(interprete==null && duracion==null)
                resultado=super.mostrar();
            if(interprete==null && duracion!=null)
                resultado=super.mostrar()+"\nTiene una duración de "+duracion;
            if(interprete!=null && duracion==null)
                resultado=super.mostrar()+"\nFue interpretada por "+interprete;
        }else{
            if(interprete!=null && duracion!=null)
                resultado="Tiene una duración de "+duracion+" y la interpreta "+interprete;
            if(interprete==null && duracion!=null)
                resultado="Tiene una duración de "+duracion;
            if(interprete!=null && duracion==null)
                resultado="\nFue interpretada por "+interprete;
        }
            return resultado;
    }
    
}
