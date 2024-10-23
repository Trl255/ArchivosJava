/*Crea dos arrays de números con una posición pasado por teclado.Uno de ellos estará rellenado con números 
aleatorios y el otro apuntara al array anterior, después crea un nuevo array con el primer array 
(usa de nuevo new con el primer array) con el mismo tamaño que se ha pasado por teclado, rellenalo de nuevo con números aleatorios.
Después, crea un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con la multiplicación 
de la posición 0 del array1 con el del array2 y así sucesivamente. Por último, muestra el contenido de cada array.
Llama al final al recolector de basura.
 */
package Arrays;
import java.util.Scanner;
public class DD_ejercicio_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int a=0;
        
        System.out.println("Introduzca el tamaño del pimer Array");
        a=sc.nextInt();
        int []array1=new int [a];
        int []array2;
        
        int []array1Valor=numerosAleatorio (array1);
        
        array2=array1Valor;
        array1=new int [a];
        numerosAleatorio(array1);
        
        System.out.println("Estos son los valores de primer array");
        mostrar (array1Valor);
        System.out.println("Estos son los valores de la copia del primer array con el segundo");
        mostrar (array2);
        System.out.println("Estos son los valores nuevos del primer array");
        mostrar (array1);
        System.out.println("Esta son las multiplicacin de los valores del primer array con el segundo");
        int [] multiplicacion=multiplicar(array2, array1);
        System.out.println("El array 1 quedaría ordenado de la siguiente manera:");
        ordenar(array1);
        System.out.println("El array 2 quedaría ordenado de la siguiente manera:");
        ordenar (array2);
        ordenar (multiplicacion);
        System.out.println("No podia faltar el cambio de posisiones de array1");
        interPosiciones (array1);
        
        
    
    }public static int []numerosAleatorio(int []valores){
        for (int i=0; i<valores.length; i++){
            valores[i]=(int)(Math.random()*99+1);
                    
            }return valores;
    
    }public static int [] multiplicar (int [] array1, int []array2){
        int []arrayx=new int [array1.length];
        for (int i=0; i<array1.length; i++){
            arrayx[i]=array1[i]*array2[i];
            System.out.println(""+array1[i]+" x "+array2[i]+" = "+arrayx[i]);
           
            }return arrayx;   
        
    
    }public static void mostrar (int []arrays){
        for (int i=0; i<arrays.length; i++){
            System.out.println(""+arrays [i]);
        }
    }public static void ordenar ( int []valores1){
        for (int x=0;x<valores1.length; x++){
            for (int y=x+1; y<valores1.length; y++){
                if (valores1 [y]<valores1[x]){
                    int aux=0;
                    aux=valores1[x];
                    valores1[x]=valores1[y];
                    valores1[y]=aux;
                    
                }
            }
        }for (int i=0;i<valores1.length; i++){
            System.out.println(""+valores1[i]);
        }
        
    }public static void interPosiciones(int [] array1 ){
        int array2[]=new int [array1.length];
            for(int i=(array1.length-1),j=0;i>=0;i--,j++){
           array2[j]=array1[i];
           System.out.println(array2[j]);
            }
        
    }

    
}
