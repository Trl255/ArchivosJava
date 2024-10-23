package Arrays;
/**
Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
 */
public class DD_ejercicio_4 {
    public static void main(String args[]) {
int []numeros=new int [100];

        int [] array=rellenar(numeros);
        suma(array);
        System.out.println("De manera descendente");
        int []arraydesc=descendente(array);
        System.out.println("intercambiamos valores");
        alreves(arraydesc);
        

    }public static int []rellenar(int []valores){
        int x=1;
        int []numeros=new int [50];
        for (int i=0; i<50; i++){
            numeros[i]=x;
            x++;
        System.out.println(""+numeros[i]);
        }
                   return numeros;
            
    }public static void suma(int []valores){
        int suma=0, cont=0;
        double div=0;
        for (int i=0; i<valores.length; i++){
            suma+=valores[i];
            cont++;
        }div=(int) suma/cont;
        
                System.out.println("La suma total es:"+suma);
                System.out.println("La división de las cifras es: "+div);
     
    }public static int [] descendente( int []array){
        for (int i=0; i<array.length; i++){
            for (int y=i+1; y<array.length;y++){
                int aux=0;
                if (array[y]>array[i]){
                    aux=array[y];
                    array[y]=array[i];
                    array[i]=aux;
                    
                   }
        }
        }for (int x=0; x<array.length;x++){
                System.out.println(""+array[x]);
                }
        
        return array;
    
    }public static void alreves(int []arrays){
        int []array2=new int [arrays.length];
        for (int i=(arrays.length-1), j=0; i>=0; j++, i--){
        array2[i]=arrays[j];
            System.out.println(""+array2[i]);
    }
    }           
}
