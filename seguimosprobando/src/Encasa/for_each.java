
package Encasa;
import java.util.Scanner;
public class for_each {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        int []array;
        

        System.out.println("Introduzca el tamaño del valor array");
        a=sc.nextInt();
        array=new int [a];
        
        int []numeros=aleatorio(array);
        float mediaA=valorMedia(numeros);
        int []numerosMayores=mayores(numeros, mediaA);
        System.out.println("Los números mayores a la media son:");
        mostrar(numerosMayores);
        int []numerosMenores=menores(numeros, mediaA);
        System.out.println("Los números menores a la media son:");
        mostrar(numerosMenores);
        
        
        
        
        
    }public static int [] aleatorio(int []valores){
        int []numeros=new int [valores.length];
        
        for (int i=0; i<valores.length; i++){
            numeros[i]=(int) (Math.random()*99+1);
            System.out.println(""+numeros[i]);
        }
                   return numeros;
    
    
    
    }public static float valorMedia (int []valor){
    float med=0;
    int suma=0, cont=0;
    int []valores=new int [valor.length];
    
    for (int i=0; i<valor.length; i++){
        suma+=valor[i];
        cont++;
        
    }   med=(float) suma/cont;
            System.out.println("La media es: "+med);
            return med;
        
}public static int [] mayores( int []array,float media){
    int cont=0;
    for (int i=0; i<array.length; i++){
        if (array[i]>media){
            cont++;
    }}
    int []mayores=new int [cont];
    int indice=0;
    
    for (int i=0; i<array.length; i++){
        if (array[i]>media){
            mayores[indice]=array[i];
            indice++;
            
        }
    }
        return mayores;

        
} static void mostrar(int [] valores){
    for (int i=0; i<valores.length; i++){
        System.out.println(""+valores[i]);
    }



}public static  int [] menores (int []valores, float media){
    int cont=0;
    for (int i=0; i<valores.length; i++ ){
        if (valores[i]<media){
            cont++;
        }
     }
    int []menores=new int [cont];
    int indice=0;
    for (int i=0; i<valores.length; i++){
        if (valores [i]<media){
            menores [indice]=valores[i];
            indice++;
        }
        
    }       return menores;
}
        


}
