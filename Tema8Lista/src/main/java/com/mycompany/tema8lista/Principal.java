/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema8lista;

/**
 *
 * @author mama
 */
public class Principal {
    public static void main(String []args){
        Lista lista1=new Lista();
        lista1.mostrarElementos();
        int vector[]={2,9,-4,6};
       /* int [] vector=new int[10];
        for(int i=0;i<10;i++){
            vector[i]=i;
        }*/
        Lista lista2=new Lista(vector);
        lista2.mostrarElementos();
        lista2.anadirElementoPrincipio(100);
        lista2.mostrarElementos();
        lista2.anadirElementoFinal(-100);
        lista2.mostrarElementos();
        lista2.anadirElementoPosicion(1000, 15);
        lista2.anadirElementoPosicion(1000,3);
        lista2.mostrarElementos();
        lista1.anadirListaFinal(lista2);
        lista1.mostrarElementos();
        lista1.anadirListaFinal(lista2);
        lista1.mostrarElementos();
        System.out.println("Elementos"+lista1.numeroElementos());
        lista2.mostrarElementos();
        lista2.eleminarElementoIndice(2);
        lista2.mostrarElementos();
        System.out.println("Elemento de la lista"+lista2.obtenerElemento(20));
         System.out.println("Elemento de la lista"+lista2.obtenerElemento(2));
         System.out.println("Posicion en la lista "+lista2.buscarElemento(800));
         System.out.println("Posicion en la lista "+lista2.buscarElemento(-100));
         Lista todo =Lista.unirDosListas(lista1, lista2);
         todo.mostrarElementos();
    }
    
}
