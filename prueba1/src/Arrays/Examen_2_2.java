/*Realizar un programa que creará un array con 15 elementos enteros de forma aleatoria entre 0
y 100, luego crearemos una función que nos calculará la media de los elementos y otras dos
funciones que nos devolverán un array, la primera devolverá un array con todos los elementos
que son mayores que la media, y la otra un array con todos los elementos menores que la media.
Finalmente se mostrarán ambos arrays por pantalla y ordenados de mayor a menor. (4 puntos)te*/
package Arrays;
import java.util.Scanner;
public class Examen_2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arrays=new int [15];
        
        for (int i=0; i<arrays.length; i++){
        arrays[i]=(int) (Math.random()*99+1);
            System.out.println(""+arrays[i]);
                }
        double valorMedia=media(arrays);
        int []valorMayores=mayor(arrays,valorMedia);
        int []valorMenor=menor(arrays,valorMedia);
        
        System.out.println("La media de los 15 valores introducidos es: "+ valorMedia);
        
        System.out.println("Los valores mayores a la media son: ");
        mostrar(valorMayores);
        System.out.println("Los valores menores a la media son: ");
        mostrar(valorMenor);
        
        
        
        
    }public static double media( int []valores){
        double med=0;
        int suma=0, cont=0;
        for (int x=0; x<valores.length;x++ ){
            suma+=valores[x];
            cont++;
        }
        for (int y=0; y<valores.length; y++){
            med=suma/cont;
        }
        return med;
    
    
    }public static int [] mayor (int []valores, double med){
        int cont=0;
        for (int x=0; x<valores.length; x++){
            if (valores [x]>med){
                cont++;
            }
        }int []arrayMayor=new int[cont];
        int indexY=0;
        
        for (int x=0;x<valores.length; x++ ){
            if (valores[x]>med){
                arrayMayor[indexY]=valores[x];
//                System.out.println(""+arrayMayor[indexY] );
                indexY++;
                }
            
        }for (int x=0; x<arrayMayor.length; x++){
            for (int y=x+1; y<arrayMayor.length; y++){
                int aux=0;
                if (arrayMayor[y]>arrayMayor[x]){
                    aux=arrayMayor[y];
                    arrayMayor[y]=arrayMayor[x];
                    arrayMayor[x]=aux;
                }
            }
        }
            return arrayMayor;
            
            
    }public static int []menor(int []valores, double med){
        int contaRango=0;
        for(int x=0; x<valores.length; x++){
            if (valores[x]<med){
                contaRango++;
            }
        }int []arraysMenor=new int [contaRango];
        int indice=0;
        for(int x=0; x<valores.length; x++){
            if (valores[x]<med){
                arraysMenor[indice]=valores[x];
                indice++;
                
            }
        }for (int x=0; x<arraysMenor.length; x++){
            for(int y=x+1; y<arraysMenor.length; y++){
                int aux=0;
                if (arraysMenor[y]>arraysMenor[x]){
                    aux=arraysMenor[y];
                    arraysMenor[y]=arraysMenor[x];
                    arraysMenor[x]=aux;
                }
            }
        }
        return arraysMenor;
        
    }public static void mostrar(int []valores){
        for(int i=0;i<valores.length; i++){
            /*for(int x=i+1;x<valores.length; x++){
                int aux=0;
                if (valores[x]<valores [i]){
                aux=valores[x];
                valores[x]=valores[i];
                valores[i]=valores[x];
            }
        }
        }for (int i=0;i<valores[i];i++){*/
        System.out.println(""+valores[i]);
    }}
}  
