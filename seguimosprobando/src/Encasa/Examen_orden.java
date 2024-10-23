/*Realizar un programa que creará un array con un número de elementos que pasaremos por
teclado, cuyos valores también pediremos por teclado. Además, crearemos una función que nos
devolverá otro array con los valores invertidos. Es decir, si el array es {1,22,5,9,15} el nuevo array
será {15,9,5,22,1} (2 puntos)
 */
package Arrays;
import java.util.Scanner;
public class Examen_orden {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        
        System.out.println("Introduzca la cantidad de valores a introducir");
        a=sc.nextInt();
        int num[]=new int [a];
        
        int []arrays=rellenarValores(num);
        valoresInvertidos(arrays);
        
    
    
    }public static int []rellenarValores(int []num){
        Scanner sc=new Scanner(System.in);
        int []valores=new int [num.length];
        
        for (int i=0; i<num.length; i++){
            System.out.println("Introduzca el valor: "+(i+1));
            valores[i]=sc.nextInt();
        }
                    return valores;
    
    }public static void valoresInvertidos(int []arrays){
        int []valoresInv=new int[arrays.length];
        int a=0;
       for(int i=(arrays.length-1), j=0;   i>=0;        i--,j++){
           valoresInv[j]=arrays[i];
           System.out.println(valoresInv[j]);
         
        }
    }
}
