package Arrays;
/*Que lea 10 números por teclado, los almacene en un array y muestre la suma y la multiplicación de todos.
 */
import java.util.Scanner;
public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []solicitud=new int [10];
        peticion (solicitud);
        suma(solicitud);
        multiplicacion(solicitud);
        
    }static void peticion(int num[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.println("Introduzca el valor: "+(i+1));
            num[i]=sc.nextInt();
        }
    }static void suma(int sum[]){
        int suma=0;
        for (int i=0; i<sum.length;i++ ){
            suma+=sum[i];
            
        }System.out.println("La suma de los 10 número introducidos es: "+suma);
    }static void multiplicacion(int mult[]){
        int x=1;
        for (int i=0; i<mult.length;i++){
            x=mult[i]*x;
        }System.out.println("La multiplicación de los 10 número introducidos es: "+x);
    }
    
}
