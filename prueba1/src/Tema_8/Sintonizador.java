/*Ejercicio6. Definir una clase que permita controlar un sintonizador digital de emisora FM;
concretamente, dotaremos al controlador de una interfaz que permita subir o bajar la frecuencia (en
saltos de 0,5 MHz) y mostrar la frecuencia sintonizada en un momento dado. Supondremos que el
rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y que, al inicio, el controlador
sintonice la frecuencia indicada en el constructor o 80 MHz por defecto. Si durante una operación de
subida o bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del
extremo contrario. Escribir un pequeño programa principal para probar su fucnionamiento.*/
package Tema_8;

/**
 *
 * @author IFC303-1
 */
public class Sintonizador {
    
    private double frecuencia;
    
    static double subirFrecuencia;
    static double bajarFrecuencia;
    double x=0.5;
    
   
    Sintonizador(){
        this.frecuencia=80;
    }
    void mostrarFrecuencia(){
        System.out.println("La frecuencia actual es: "+frecuencia);
    }
    void subirVolumen(int opcion){
        this.frecuencia+=(opcion*x);
        if (frecuencia>108){
            frecuencia=80+(frecuencia-108);
            
        }System.out.println("La frecuencia actual es "+frecuencia);
        
    }
    void  bajarVolumen(int opcion){
        frecuencia-=(x*opcion);
        if (frecuencia<80){
            frecuencia=108-(80-frecuencia);
            System.out.println("La frecuencia actual "+frecuencia);
        }
        
        
    }public String toString (){
        return "La sintonía actual es: "+ frecuencia;
    }
    
    
    
}

