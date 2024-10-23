/* Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y 
el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.*/
package Encasa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DD_ejercicio_1 {

    public static void main(String[] args) {

        int[] miArray = peticion();
        mostrar(miArray);
        ordenar(miArray);

    }

    static int[] peticion() {
        int[] miArray = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del Array");

        int tamanio = Metodos.comprobarEntero();
        miArray = new int[tamanio];

        for (int i = 0; i < miArray.length; i++) {
            System.out.println("Introduzca el valor " + (i + 1));
            miArray[i] = sc.nextInt();

        }
        return miArray;
    }

    static void mostrar(int[] tamanio) {
        for (int e : tamanio) {
            System.out.println(e);
        }

    }

    static void ordenar(int[] orden) {
        int aux = 0;
        for (int x = 0; x < orden.length; x++) {
            for (int y = x + 1; y < orden.length; y++) {
                if (orden[y] < orden[x]) {
                    aux = orden[x];
                    orden[x] = orden[y];
                    orden[y] = aux;
                }
            }
        }
        System.out.println("Ordenados");
        for (int e : orden) {
            System.out.println(e);
        }

    }

    

    /*
        Scanner sc=new Scanner(System.in);
        int []array=new int [5];    
        
        
        int []valores=peticion(array);
        mostrar (valores);
        
        
    }public static int []peticion(int []array){
        int []solicitud=new int [array.length];
        Scanner sc=new Scanner(System.in);
        
        for (int i=0; i<array.length; i++){
            System.out.println("Intoduzca el valor "+(i+1));
            solicitud[i]=sc.nextInt();
        /*}
        int aux=0;
        for (int x=0; x<array.length; x++){
            for (int y=x+1; y<array.length; y++){
                if (solicitud[y]<solicitud[x]){
                    aux=solicitud[x];
                    solicitud[x]=solicitud[y];
                    solicitud[y]=aux;
                }
            }*/
 /*}for (int z=0; z<solicitud.length; z++){
            System.out.println(""+solicitud[z]);
        }System.out.println("Ahora estan desordenados: ");
        for (int z=0; z<solicitud.length; z++){
            System.out.println(""+solicitud[z]);
        }
            
        return solicitud;
        
        
    }public static void mostrar(int []solicitud){
        int aux=0;
        for (int x=0; x<solicitud.length; x++){
            for (int y=x+1; y<solicitud.length; y++){
                if (solicitud[y]<solicitud[x]){
                    aux=solicitud[x];
                    solicitud[x]=solicitud[y];
                    solicitud[y]=aux;
                }
            }
        }System.out.println("Ahora te los ordeno:");
        
        for (int i=0; i<solicitud.length; i++){
            System.out.println(""+ solicitud[i]);
        }
    
       
     */
}
