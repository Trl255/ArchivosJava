/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
Crea sus métodos get, set y toString.
Tendrá dos métodos especiales:
ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.*/
package com.mycompany.ejerciciospooddr;

/**
 *
 * @author josea
 */
public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;

    }

    public boolean ingresarCantidad(double ingreso) {
        boolean ingresado = false;
        if (ingreso <= 0) {
            System.out.println("No se puede ingresar la cantidad introducida, debe ser positiva");
            return ingresado = false;
        } else {
            System.out.println("Se ha ingresado correctamente, la cantidad de " + ingreso);
            cantidad += ingreso;
        }
        return ingresado = true;
    }
    boolean sacarCantidad(double egreso){
        boolean sacado= false;
        
        if (0>(cantidad-=(egreso))){
            System.out.println("No se puede sacar la cantidad "+egreso+" no cuenta con suficiente dinero");
            return sacado=false;
            
            
        }else{
            cantidad-=egreso;
            
        }System.out.println("Se ha retirado correctamente, actualmente tiene saldo: "+cantidad);
        return true;
        
    }
    @Override
    public String toString() {
        return "El nombre del titular ess: " + titular + "\nLa cantidad que tiene es: " + cantidad;
    }

}
