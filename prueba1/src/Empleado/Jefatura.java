package Empleado;

public class Jefatura extends Empleado{
    
    private double incentivo;
 
Jefatura(String nombre, double sueldo, int anne, int mes, int dia){
        super(nombre, sueldo, anne, mes, dia);
        
    }
void estableceIncentivo(double incentivo){
    this.incentivo=incentivo;
       }
    @Override
double dimeSueldo(){
    double sueldoJefe=super.dimeSueldo();
    return sueldoJefe+ incentivo;
    
}
String dameIncentivo(){
        return "El incentivo es: "+incentivo;
    }

    @Override
    public String toString (){
    return "Nombre: "+super.dimeNombre()+" su ID es: " +super.dimeId()+" su sueldo es:  "+(super.dimeSueldo()+incentivo)+""
        + " y su fecha de contrato es: " +super.dimeFechaDeAlta();    
}
    
}
