
package cuentacorriente;

/**
 *
 * @author profesor
 */
public class CuentaCorriente {
    String dni;
    public String nombre;
    private double saldo;
    private static String banco="";
    
    CuentaCorriente(String nombre, String dni){
        this.dni=dni;
        this.nombre=nombre;
        this.saldo=0.0;
     }
    CuentaCorriente(String dni,double saldo){
        this.dni=dni;
        this.saldo=saldo;
    }
   /* CuentaCorriente(String dni,String nombre, double saldo){
        this.dni=dni;
        this.nombre=nombre;
        this.saldo=saldo;
    }*/
    CuentaCorriente(String dni,String nombre, double saldo){
        this(dni,nombre);
        this.saldo=saldo;
       
        
    }
    double sacarDinero(double decremento){
        if(decremento<saldo)saldo-=decremento;
        else System.out.println("No tienes tanto dinero");
        return saldo;
    
    }
    void ingresarDinero(double incremento){
        saldo+=incremento;
    }
    void mostrarInformacion(){
        System.out.println("El dni es "+dni+"."
                + " El nombre es "+ nombre +". El saldo es "+saldo);
    }
    static void ponerNombreBanco(String nuevoNombre){
        banco=nuevoNombre;
    }
    static String recuperarNombreBanco(){
        return banco;
    }
    
}
