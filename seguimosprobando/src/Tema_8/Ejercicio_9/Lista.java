/*Ejercicio9. Las listas son estructuras dinámicas de datos donde se pueden insertar o eliminar elementos
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
 Mostrar los elementos de la lista por consola.*/
package Tema_8.Ejercicio_9;

public class Lista {

    int []tamano;
    

Lista ( int []tamano){
    tamano[0]=0;
}

    void estableceTamano(int []x) {
        for (int i=0 ; i<x.length;i++){
            
        }
        
        
      }
    
    /*static String introduceNumero(int numero){
        
        
    }*/
    

    int[] muestraTamano() {
        return tamano;
    }

    
    


    
}

