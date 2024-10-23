/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bombillas;

/**
Modelar una casa con muchas bomillas, de forma que cada bombilla se pueda encender o apagar 
* individualmente. Para ello, haremos una clase Bomilla con una variable privada que indque si 
* está encendida o apagada, así como un método que nos diga el estado de una bomilla concreta.
* Además, podremos un interruptor general, de forma que si se apaga, todas las bomillas se
* apagan. cuando el interruptor general se activa, las bombillas vuelven a la posición en que
* estaban antes. Cada bombilla se enciende y apaga individualmente, pero solo responde que
* está encendida si su interruptor particular está activdao y además hay luz general.
 */
public class Bombilla {
    
    private boolean interruptorIndividual=true;
    static boolean interruptorGeneral=true;
    
    
    Bombilla(boolean interruptor){
        
        this.interruptorIndividual=interruptor;
    }
    Bombilla(){
        
    }
    void valorBombillas(boolean valorI, boolean valorG){
        interruptorIndividual= valorI;
        interruptorGeneral=valorG;
    }
    void valorGeneral(boolean valorG){
        interruptorIndividual=valorG;
    }
    static void apagarLuz(){
      interruptorGeneral=false;
    }

     static void apgarLuzGeneral(boolean interruptorGeneral) {
        Bombilla.interruptorGeneral = interruptorGeneral;
    }

    
    static void encenderLuz(){
        interruptorGeneral=true;
    }
    public String toString(){
        if(interruptorGeneral && interruptorIndividual)
           return "La bombilla está encendida";
        else
            return "La bombilla está apagada";
    }
}
