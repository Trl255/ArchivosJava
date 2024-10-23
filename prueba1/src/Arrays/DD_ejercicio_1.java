/* Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y 
el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostrar.*/
package Arrays;
import java.util.Scanner;
public class DD_ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []array=new int [5];    
        int []ary=new int [4];
        
        
        
        
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
            System.out.println(""+solicitud[z]);*/
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
    
       
        
    }
}
