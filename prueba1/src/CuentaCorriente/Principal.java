/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaCorriente;

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
        Gestor gestor1=new Gestor("María","987563254",1500);
        Gestor gestor2=new Gestor("Manuel","658741523");
        CuentaCorriente cliente2=new CuentaCorriente("999666555J",15000,gestor2);
        cliente2.mostrarInformacion();
    }
    
        
        
    }
    
