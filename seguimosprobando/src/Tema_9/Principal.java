/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentacorriente;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Principal {
    enum dias{
        lunes,martes, miercoles,jueves,viernes,sabado,domingo
    }
    public static void main(String args[]){
        dias diasem;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del banco");
        //CuentaCorriente.banco=entrada.nextLine();
        CuentaCorriente cliente1=new CuentaCorriente("Maite","1111112V");
        cliente1.ingresarDinero(0);
        System.out.println("¿Cómo se llama el banco");
        String banco=entrada.nextLine();
        CuentaCorriente.ponerNombreBanco(banco);
        Gestor gestor1=new Gestor("María","987563254",1500);
        Gestor gestor2=new Gestor("Manuel","658741523");
        CuentaCorriente cliente2=new CuentaCorriente("999666555J",15000,gestor2);
        cliente2.mostrarInformacion();
        Gestor gestor3=cliente2.darGestor();
       System.out.println("Antes de cambiar el nombre "+gestor3.nombre);
        gestor3.nombre="Jacinto";
        System.out.println("Despues de cambiar el nombre"+gestor2.nombre);
        cliente2.mostrarInformacion();
    }
    
        
        
    }
    
