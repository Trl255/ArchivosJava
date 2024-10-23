/*
Que rellene un array con los 100 primeros números pares y muestre su suma.
 */
package Arrays;
public class Ejercicio_12 {
    public static void main(String[] args) {
        int []numero=new int [100];
        muestra(numero);
        suma(numero);
        
    }static void muestra(int num[]){
        for (int i=0; i<=num.length; i++){
            if (i%2==0){
            System.out.println(""+i);
        }
        }
    }static void suma(int num[]){
        int suma=0;
        for (int i=0; i<num.length; i++){
            if (i%2==0){
            suma+=i;
        }
    }System.out.println("El resultado de la suma es "+suma);
    
}}
