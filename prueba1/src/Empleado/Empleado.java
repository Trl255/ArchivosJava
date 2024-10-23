
package Empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {

private String nombre;
private double sueldo;
private Date altaContrato;
private int id;
private static int iPx=1;

Empleado(String nombre, double sueldo, int anne, int mes, int dia){
    this.nombre=nombre;
    this.sueldo=sueldo;
    GregorianCalendar calendar= new GregorianCalendar(anne, mes-1, dia);
    altaContrato=calendar.getTime();
    id=iPx;
    iPx++;
 
}
Empleado (String nombre){
    this (nombre, 3000, 2000, 01, 01);
    
}
int dimeId(){
    return id;
}
String dimeNombre(){
    return nombre;
}
double dimeSueldo(){
    return sueldo;
}
Date dimeFechaDeAlta(){
    return altaContrato;
}

void subeSueldo(double porcentaje){
    double aumento=sueldo*porcentaje/100;
    sueldo+=aumento;
    
}public String toString(){
return "Nombre: "+nombre+" su ID es: " +id+" su sueldo es:  "+sueldo+""
        + " y su fecha de contrato es: " +altaContrato;    
}

    
}
