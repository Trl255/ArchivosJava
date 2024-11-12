package Empleado;

public class Jefatura extends Empleado{
    
    private double incentivo;
    
Jefatura(String nombre, double sueldo, int anne, int mes, int dia, double incentivo){
        super(nombre, sueldo, anne, mes, dia);
        this.incentivo=incentivo;
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

    
}
