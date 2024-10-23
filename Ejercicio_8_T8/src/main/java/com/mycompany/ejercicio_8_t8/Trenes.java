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
public class Trenes extends Maquinaria{
    Locomotoras locomotora;
    Vagones [] vagon;
    Maquinistas maquinista;
    
    Trenes(String id, Locomotoras locom, Vagones [] vag, Maquinistas maquinista){
        super(id);
        this.locomotora=locom;
        this.vagon=vag;
        this.maquinista=maquinista;
    }
    void infoVagones(Vagones[]vagones){
        
    }
            
            
    @Override
    public String toString(){
        String resultado= "El tren con id "+id+", lo lleva el maquinista"+maquinista.mostrar()+", está formado por la locomotora"+locomotora.mostrar()+"y los vagones: ";
        String valorVagon="";
        for(int i=0;i<vagon.length;i++)
                valorVagon+=vagon[i].toString();
        return resultado+=valorVagon;
    }
}