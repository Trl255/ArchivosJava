/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema8lista.Tema8Pila;

import java.util.Arrays;

/**

*/
 
public class Principal {
    public static void main(String []args){
        Pila pila1 = new Pila();
        for(int i=1;i<10;i++){
            pila1.apilar(i);
        }
      
        while(pila1.fila1.numeroElementos()!=0){
            pila1.desapilar();
        }
        pila1.mostrar();
    }
   
    
}
