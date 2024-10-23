
package com.mycompany.examen_ejercicio_2;

public class Electrodomesticos  {
    
    private String marca;
    private String modelo;
    private String tipoEnergetico;
    
    
Electrodomesticos (String marca, String modelo, String tipoEnergetico){
        this.marca=marca;
        this.modelo=modelo;
        this.tipoEnergetico=tipoEnergetico;
        
    }Electrodomesticos(){
        
    }

    String getMarca() {
        return marca;
    }

    String getModelo() {
        return modelo;
    }

    String getTipoEnergetico() {
        return tipoEnergetico;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setTipoEnergetico(String tipoEnergetico) {
        this.tipoEnergetico = tipoEnergetico;
    }

    @Override
    public String toString() {
        String resultado="";
        if (marca!=null)
            resultado+="El electrodomestico, con marca:\n " + marca;
        if (modelo!=null)
            resultado+="\nEl modelo es\n" + modelo;
        if (tipoEnergetico!=null)
            resultado+="\nEl tipo energético es:\n"+tipoEnergetico;
        
        return resultado;
    }
            
        
    
    
}
