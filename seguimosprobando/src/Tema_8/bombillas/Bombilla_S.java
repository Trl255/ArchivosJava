/*Ejercicio7. Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o
apagar individualmente. Para ello, hacer una clase Bombilla con una variable privada que indique si
está encendida o apagada, así como un método que nos diga el estado de una bombilla concreta.
Además, queremos poner un interruptor general, de forma que si este se apaga, todas las bombillas
quedan apagadas. Cuando el interruptor general se activa, las bombillas vuelven a estar encendidas o
apagadas, según estuvieran antes. Cada bombilla se enciende y apaga individualmente, pero solo
responde que está encendida si su interruptor particular está activado y además hay luz general.*/
package Tema_8.bombillas;
public class Bombilla_S {
    
    private boolean bombilla=false;
    private boolean estadoBombilla=false;
    private boolean estadoGeneral=true;

void getEstadoGeneral(){
    if (estadoGeneral==true){
    System.out.println("El interruptor general esta encendido");
    }
    else{
        System.out.println("El interruptor general está apagado");
    }
    }
    
String setEstadoBombilla( String estado){
    if (estadoGeneral==true && estado.equalsIgnoreCase("Si")){
        estadoBombilla=true;
        return "La bombilla está encendida";
    }else{
        estadoBombilla=false;
    }return "La bombilla está apagada";
}
String setApagarBombilla(String estado){
    if (estadoGeneral==true && estado.equalsIgnoreCase("si")){
        estadoBombilla=false;
        return "La bombilla está apagada";
    }else{
        estadoBombilla=false;
    }return "La bombilla está encendida";
}

}
