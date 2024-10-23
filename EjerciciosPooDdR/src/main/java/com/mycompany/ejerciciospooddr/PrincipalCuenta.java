/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospooddr;

import java.io.IOException;

/**
 *
 * @author josea
 */
public class PrincipalCuenta {
    public static void main(String[] args) {
            Cuenta cuentas[]= new Cuenta[4];
        cuentas[0] = new Cuenta("Patricia", 1000);
        cuentas[1] = new Cuenta("José", 2000);
        cuentas[2] = new Cuenta("Pedro", 3000);
        cuentas[3] = new Cuenta("Isabella", 4000);
        
        cuentas[1].ingresarCantidad(10000);
        System.out.println(cuentas[1].toString());
        
        System.out.println(cuentas[1].ingresarCantidad(0));
        
        
        
        
        
        
        
        
        
    }
    
}
