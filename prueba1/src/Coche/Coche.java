
package Coche;

public class Coche {

private int id;
private static int idPx=1;
private int ruedas;
private int largo;
private int ancho;
private int motor;
private int pesoPlataforma;
private String color;
private int pesoTotal;
private boolean asientosCuero, climatizador;

Coche(){
    ruedas=4;
    largo=2000;
    ancho= 300;
    motor=1200;
    pesoPlataforma=500;
    id=idPx;
    idPx++;
    
}
String dimeDatosGenerales(){
    return "La plataforma del vehículo tiene "+ruedas+" ruedas, mide "+
largo/1000+ " metros con un ancho de "+ancho+" cm y un peso de plataforma de "
+pesoPlataforma+" kg";            
}

String estableceColor(String color){
    return this.color=color;
}


String dimeColor(){
    return "El color del coche es: "+color;
}
void configuraAsientos(String asientosCuero){
    if (asientosCuero.equalsIgnoreCase("si")){
        this.asientosCuero=true;
    }else{
        this.asientosCuero=false;
    }
}
String dimeAsientos(){
    if (asientosCuero==true){
        return "El coche tiene asientos de cuero";
    }else{
        return "El coche tiene asientos de serie";
    }
}
void configuraClimatizador(String climatizador){
    if(climatizador.equalsIgnoreCase("si")){
        this.climatizador=true;
    }else{
        this.climatizador=false;
    }
}
String dimeClimatizador(){
    if (climatizador==true){
        return "El coche tiene climatizador";
    }else{
        return "El coche lleva aire acondicionado";
    }
}
void establecePesoCoche (){
    int pesoCarroceria=500;
    pesoTotal=pesoCarroceria;
    
    if(asientosCuero==true){
        pesoTotal+=50;
    }
    if (climatizador==true){
        pesoTotal+=20;
    }
    
}
String dimePesoTotal(){
    return "El del coche es: "+pesoTotal;
}
}
