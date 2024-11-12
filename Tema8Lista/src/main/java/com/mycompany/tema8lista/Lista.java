/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tema8lista;

import java.util.Arrays;

/**
 *
 * Las listas son estructuras dinámicas de datos donde se pueden insertar o eliminar elementos
de un determinado tipo sin limitación de espacio.
Implementar la clase Lista correspondiente a una lista de números enteros. Los números se guardarán
en una tabla que se rediminensionará con las inserciones y eliminaciones, aumentando o disminuyendo
la capacidad de la lista según el caso.
 Entre los métodos de la case, sin incluirán las siguientes tareas:
 Un constructor que inicialice la tabla con un tamaño 0.
 Obtener el número de elementos insertados en la lista.
 Insertar un número al principio de la lista.
 Insertar un número en un lugar de la lista cuyo índice, que es el de la tabla, se pasa como
parámetro.
 Añadir al final de la lista los elementos de otra lista que se pasa como parámetro.
 Eliminar un elemento cuyo índice en la lista se pasa como parámetro.
 Obtener el elemento cuyo índice se pasa como parámetro.
 Buscar un número en la lista, devolviendo el índice del primer lugar donde se encuentre. Si no
está, devolverá -1
 Mostrar los elementos de la lista por consola
 Añadir a la clase Lista el método estático: Lista Concatena (Lista1, Lista 2) 
 * que construye y devuelve una lista que contiene, en el mismo orden, una copia
 * de todos los elementos Lista 1 y Lista2.
 */
public class Lista {
    
    public int [] listado;
    
    public Lista(){
        this.listado=new int[0];
    }
    
    Lista(int[]lista){
        listado=new int[lista.length];
        for(int i=0;i<lista.length;i++){
        listado[i]=lista[i];
        }
     }
     void anadirElementoPrincipio(int otro){
        int nuevo[]=new int[listado.length+1];
        nuevo[0]=otro;
        for(int i=1;i<nuevo.length;i++){
            nuevo[i]=listado[i-1];
        }
        listado=nuevo;
    }
    //Vamos a hacer lo mismo que antes usando funciones de Arrays
    public void anadirElementoFinal(int otro){
        listado=Arrays.copyOf(listado,listado.length+1);
        listado[listado.length-1]=otro;
     }
    void anadirListaFinal(Lista listar){
        int nuevo[]=new int[listado.length+listar.listado.length];
        for(int i=0;i<listado.length;i++){
            nuevo[i]=listado[i];
        }
        for(int i=0;i<listar.listado.length;i++){
            nuevo[listado.length+i]=listar.listado[i];
        }
        listado=nuevo;
    }
    void anadirElementoPosicion(int otro, int posicion){
        if(posicion<listado.length){
            //genero el Array con una posicion nueva
            listado=Arrays.copyOf(listado, listado.length+1);
            //Copiamos en listado de 0 a posicion y luego de posicion+1 en adelante
            System.arraycopy(listado, posicion, listado, posicion+1,listado.length-posicion-1);
            //Añadimos el nuevo en la posicion
            listado[posicion]=otro;
        }
        else
             System.out.println("La lista es demasiado corta, no se puede insertar en esa posicion");
    }
    public int numeroElementos(){
        return listado.length;
    }
   public void eleminarElementoIndice(int posicion){
        if(posicion>=0 && posicion<listado.length){
            for(int i=posicion;i<listado.length-1;i++){
                listado[i]=listado[i+1];
            }
            listado=Arrays.copyOf(listado, listado.length-1);
        }
    }
    //Utilizamos la clase Integer para controlar si el índice no es correcto
    Integer obtenerElemento(int posicion){
        Integer resultado=null;
        if(posicion>=0 && posicion<listado.length){
           resultado=listado[posicion];
        }
        return resultado;
    }
      int buscarElemento(int elemento){
        int posicion = -1;
        for(int i=0;i<listado.length;i++){
            if(elemento==listado[i]){posicion=i;
            break;}
        }
        return posicion;
    }
    
    public   void mostrarElementos(){
            for(int i=0;i<listado.length;i++)
            System.out.println("El valor que ocupa la posición "+(i+1)+" es "+listado[i]);
    }
       
    static Lista unirDosListas(Lista l1, Lista l2){
        Lista resultado=new Lista();
        resultado.anadirListaFinal(l2);
        resultado.anadirListaFinal(l2);
        return resultado;
        
    }
    
}
