
package Repaso;

public class Vehiculo {

String matricula;
String marca;
String modelo;
String color;
double tarifa;
boolean disponible;



Vehiculo(){
}

Vehiculo(String matricula, double tarifa){
    this.matricula=matricula;
    this.tarifa=tarifa;
}
Vehiculo(double tarifa, String marca){
    this.tarifa=tarifa;
    this.marca=marca;
}
String dameMatricula(){
    return matricula;
}

String dameMarca(){
    return marca;
}
String dameModelo(){
    return modelo;
 }
String dameColor(){
    return color;
}
double dameTarifa(){
    return tarifa;
}
boolean dameDisponible(){
    return disponible;
}
String mostrar(){
    String resultado="";
    if (!matricula.equals("")&&matricula!=null)
        resultado+="Los atributos son: \n"+matricula;
    
    if (!marca.equals("")&&marca!=null)
        resultado+=" la marca es:\n"+marca;
    
    if (!modelo.equals("")&&modelo!=null)
        resultado+="El modelo es:\n"+modelo;
    
    if (!color.equals("")&&color!=null)
        resultado+="El color es:\n"+color;
    
    if (tarifa>0)
    resultado+="Y la tarifa es:\n"+tarifa;
    return resultado;
}
}