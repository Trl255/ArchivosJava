
package com.mycompany.examen_ejercicio_2;


public class Lavadoras extends Electrodomesticos{ 
  
    private int capacidadCarga;   
    private String lugarCarga;
    Electrodomesticos electrodomestico;
   
Lavadoras (int capacidadCarga, String lugarCarga, Electrodomesticos electrodomestico){
    this.capacidadCarga=capacidadCarga;
    this.lugarCarga=lugarCarga;
    electrodomestico=new Electrodomesticos();
    
    }
Lavadoras (int capacidadCarga,Electrodomesticos electrodomestico){
     this.capacidadCarga=capacidadCarga;
    electrodomestico=new Electrodomesticos();
}
    void modificaCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    void modificaLugarCarga(String lugarCarga) {
        this.lugarCarga = lugarCarga;
    }

    int dameCapacidadCarga() {
        return capacidadCarga;
    }

    String dameLugarCarga() {
        return lugarCarga;
    }

    @Override
    public String toString() {
        String resultadoE=super.toString();
        if (capacidadCarga>0)
            resultadoE+="La capacidad de carga es:\n" + capacidadCarga; 
        if(lugarCarga!=null)
            resultadoE+="\nSe cargará" + lugarCarga;
        return resultadoE;
    }
    
    
    
}
