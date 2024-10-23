
package Arrays_funciones;
import java.util.Scanner;
/**) Crea un array de números donde le indicamos por teclado el tamaño del array, 
 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla el valor de cada posición 
 * y la suma de todos los valores. Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar), 
 * para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).  */
public class practica_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor=0;
        
        System.out.println("Introduzca la cantidad de valores a introducir entre el 0 y el 9");
        valor=sc.nextInt();
        int []arrays=new int [valor];
        int []numeros=peticion(arrays);
        peticion(arrays);
        mostrar(numeros);
        System.out.println("Ordenados es: ");
        ordenar(numeros);
        
        
        
    }public static int[] peticion(int []solicitud){
        Scanner sc=new Scanner(System.in);
        int []solicitudArray=new int [solicitud.length];
        for (int i=0; i<solicitud.length; i++){
            solicitudArray[i]=(int)(Math.random()*9+1);
            System.out.println(""+solicitudArray[i]);
            
            
        }        return solicitudArray;
        
        
        
    }public static void mostrar(int peticion[]){
        for (int i=0; i<peticion.length; i++){
            System.out.println("La posición "+i+" es :"+ peticion[i]);
        
        }
        
        
        
    }public static void ordenar(int num[]){
        for (int x=0; x<num.length; x++ ){
            for (int y=x+1; y<num.length;y++ ){
                if (num[x]>num[y]){
                    int aux=0;
                    aux=num[y];
                    num[y]=num[x];
                    num[x]=aux;
                    
                }
            }
        }for (int y=0; y<num.length; y++){
            System.out.println(""+num[y]);
        }
    }
    
    
}
