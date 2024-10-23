package Ferroviaria;

public class Vagones {

private int cargaMax=50000;
private int cargaActual=10000;
private String tipoMercancia="Minerales";
private int id;
public static int idPx=1;

Vagones(int cargaActual){
this.cargaMax=cargaMax;
this.cargaActual=cargaActual;
this.tipoMercancia=tipoMercancia;
this.id=idPx;
idPx++;
 }
void modificaCargaActual(int carga){
    cargaActual=carga+10000;
}
void modificaCargaMax(int valor){
    cargaMax=valor;
}
String dimeCargaMax(){
    return "La carga máxima del vagón con ID: "+id+ " es: "+cargaMax;
}
void modificatipoMercancia(String tipoMercancia){
    this.tipoMercancia=tipoMercancia;
}


String dimeDatos(){
    return "El vagón con número de identificador: "+id+" con carga actual: "+cargaActual+" tiene una carga máxima de: "
            +cargaMax+", tiene un tipo de mecánica: "+tipoMercancia;
}
}
