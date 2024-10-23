/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays_funciones;
import java.util.Scanner;
/**
 *Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.
 * @author IFC303-1
 */
public class practica_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arrays=new int [10];
        int []numeros= peticion(arrays);
        mostrar (numeros);
        
        
    }public static int []peticion (int []solicitud){
        Scanner sc=new Scanner(System.in);
        int []array=new int [10];
        int a=0;
        for (int i=0; i<10; i++){
            System.out.println("Por favor introducir el valor: "+(i+1));
            a=sc.nextInt();
            array[i]=a;
        }
        return array;
    }static void mostrar(int []nums){
        int conta=1;
        for (int i=0; i<10; i++){
            System.out.println("La posición número "+conta+" tiene el valor de: "+nums[i]);
            conta++;
        }
        
    }
 
}
