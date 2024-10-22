/*Ejercicio7. Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o
apagar individualmente. Para ello, hacer una clase Bombilla con una variable privada que indique si
está encendida o apagada, así como un método que nos diga el estado de una bombilla concreta.
Además, queremos poner un interruptor general, de forma que si este se apaga, todas las bombillas
quedan apagadas. Cuando el interruptor general se activa, las bombillas vuelven a estar encendidas o
apagadas, según estuvieran antes. Cada bombilla se enciende y apaga individualmente, pero solo
responde que está encendida si su interruptor particular está activado y además hay luz general.*/
package Tema_8.bombillas;
public class Bombilla_S {

    private boolean interruptorIndividual;
    static boolean interruptorGeneral;
    boolean interruptor;
    
    Bombilla_S(boolean interruptor){
        this.interruptorIndividual=interruptor;
    }
    Bombilla_S(boolean interruptorG, boolean interruptorI){
        this.interruptorIndividual=interruptorI;
        this.interruptorGeneral=interruptorG;
        
    }   
    void encenderLuces(boolean encenderG, boolean encenderI){
        interruptorGeneral= encenderG;
        interruptorIndividual=encenderI;
        
    }
    void apagarBombilla(){
        interruptorIndividual=true;
    }
    static void apagarLuz(){
        interruptorGeneral=false;
    }
    static void encenderLuz(){
        interruptorGeneral=true;
    }
    String estadoBombilla(){
        String resultado="";
        if(interruptorGeneral && interruptorIndividual)
            resultado="La bombilla está encendida";
        else
            resultado="La bombilla está apagada";
        return resultado;
    }
}
