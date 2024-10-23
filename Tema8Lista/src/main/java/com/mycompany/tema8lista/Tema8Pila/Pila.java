/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema8lista.Tema8Pila;
import  com.mycompany.tema8lista.*;

/**
Una pila es una estructura dinámica de datos donde los elementos se insertan (se apilan)
y se retiran (se desapilan) de forma que el último que se apila será el primero en desapilarse, como
ocurre con una pila de platos. Cuando vamos a retirar un plato de una pila a nadie se le ocurre tirar un
plato de los de abajo; retiramos el que está encima de todos, que fue el último en ser apilado. Se llama
cima de la pila al último elemento apilado. Los métodos fundamentales de una pila son apilar() y
desapilar()
 Implementar la clase Pila para números Integer, donde se usa una lista (realizada en la actividad
anterior) para guardar los elementos apilados.
*/
public class Pila {
    Lista fila1;
    
    
    Pila(){
    fila1=new Lista();
    }
    void apilar(int elemento){
        fila1.anadirElementoFinal(elemento);
    }
    void desapilar(){
        fila1.eleminarElementoIndice(fila1.listado.length-1);
    }
    void mostrar(){
        fila1.mostrarElementos();
    }
    
    
}
