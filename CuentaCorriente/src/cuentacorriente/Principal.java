/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacorriente;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Principal {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del banco");
        //CuentaCorriente.banco=entrada.nextLine();
        CuentaCorriente cliente1=new CuentaCorriente("Maite","1111112V");
        cliente1.ingresarDinero(0);
        System.out.println("¿Cómo se llama el banco");
        String banco=entrada.nextLine();
        CuentaCorriente.ponerNombreBanco(banco);
        
    }
    
}
