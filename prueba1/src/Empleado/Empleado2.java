
package Empleado;

import java.util.Date;
import java.util.GregorianCalendar;



class Empleado2 extends Persona{
     
 
private double sueldo;
private Date altaContrato;
private int id;
private static int iPx=1;

Empleado2(String nombre, double sueldo, int anne, int mes, int dia){
    super(nombre);
    this.sueldo=sueldo;
    GregorianCalendar calendar= new GregorianCalendar(anne, mes-1, dia);
    altaContrato=calendar.getTime();
    id=iPx;
    iPx++;
 
}
int dimeId(){
    return id;
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
    
/*}public String toString(){
return "Nombre: "+nombre+" su ID es: " +id+" su sueldo es:  "+sueldo+""
        + " y su fecha de contrato es: " +altaContrato;    */
}

    @Override
    public String dameDescripcion() {
        return "Este empleado tiene un id= "+id+", con un sueldo "+ sueldo;
        
    }
}

    


