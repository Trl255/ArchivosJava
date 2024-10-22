/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaCorriente;

/**
 *
 * @author profesor
 */
public class CuentaCorriente {
    String dni;
    public String nombre;
    private double saldo;
    private static String banco="";
    Gestor gestor;
    
    
    CuentaCorriente(String nombre, String dni){
        this.dni=dni;
        this.nombre=nombre;
        this.saldo=0.0;
     }
    CuentaCorriente(String dni,double saldo){
        this.dni=dni;
        this.saldo=saldo;
    }
    CuentaCorriente(String nombre, String dni, Gestor gestor){
        this(nombre,dni);
        this.gestor=gestor;
    }
     CuentaCorriente(String dni,double saldo, Gestor gestor){
        this(dni,saldo);
        this.gestor=gestor;
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
    void sacarDinero(double decremento){
        if(decremento<saldo)saldo-=decremento;
        else System.out.println("No tienes tanto dinero");
    }
    void ingresarDinero(double incremento){
        saldo+=incremento;
    }
    void mostrarInformacion(){
        System.out.println("El dni es "+dni+"."
                + " El nombre es "+ nombre +". El saldo es "+saldo +" y el banco"
                        + "se llama "+banco);
        if(gestor==null)System.out.println("La cuenta no tiene gestor");
        else{
            System.out.println("El gestor de la cuenta es:");
                gestor.mostrarInformacion();
        }
    }
        
    static void ponerNombreBanco(String nuevoNombre){
        banco=nuevoNombre;
    }
    static String recuperarNombreBanco(){
        return banco;
    }
    
}
