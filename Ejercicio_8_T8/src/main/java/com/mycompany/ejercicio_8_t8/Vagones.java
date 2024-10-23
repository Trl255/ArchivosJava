/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08_T08;

/**
 *
 * @author IFC303-1
 */
public class Vagones extends Maquinaria{
    double cargaMaxima;
    double cargaActual;
    String tipoMercancia;
    
    Vagones(String id, String mercancia){
        super(id);
        this.tipoMercancia=mercancia;
    }
    Vagones(String id, double cMax){
        super(id);
        this.cargaMaxima=cMax;
    }

    public String toString(){
        return "la carga maxima de este vagón es "+cargaMaxima;
    }

}
