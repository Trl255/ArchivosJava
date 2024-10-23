
package com.mycompany.examen_ejercicio_2;


public class Frigorifico extends Electrodomesticos{
    
    protected double temperaturaMinima;
    protected int numeroBandejas;
    Electrodomesticos electrodomestico;
        
    
    Frigorifico (double temperaturaMinima, int numeroBandejas, Electrodomesticos electrodomestico){
        this.numeroBandejas=numeroBandejas;
        this.temperaturaMinima=temperaturaMinima;
        electrodomestico=new Electrodomesticos();
        
    }
    Frigorifico (int numeroBandejas, Electrodomesticos electrodomestico){
        this.numeroBandejas=numeroBandejas;
        electrodomestico=new Electrodomesticos();
       
    }   

    void estableceTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    void estableceNumeroBandejas(int numeroBandejas) {
        this.numeroBandejas = numeroBandejas;
    }

    
    public double dimeTemperaturaMinima() {
        return temperaturaMinima;
    }

    public int dimeNumeroBandejas() {
        return numeroBandejas;
    }

     
    @Override
    public String toString() {
        String resultadoF=super.toString();
        
        if(temperaturaMinima!=0.0)
            resultadoF+="\nTiene una temperatura minima: " + temperaturaMinima;
            
        if (numeroBandejas >-1)    
        resultadoF+="\nNúmero bandejas:\n"+ numeroBandejas;
        
        
        return resultadoF;
    }
    }
    
    
    

