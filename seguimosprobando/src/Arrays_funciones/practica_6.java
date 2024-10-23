
package Arrays_funciones;
import java.util.Scanner;
public class practica_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        
        System.out.println("Introduzca los valores a introducir");
        a=sc.nextInt();
           int []valores=new int [a];
           int []numero=numeros(valores);
           double med=media(valores);
           
                
    }public static int []numeros(int []valores){
        Scanner sc=new Scanner (System.in);
        for (int i=0; i<valores.length; i++){
            System.out.println("Introduzca el valor; "+(i+1));
            valores[i]=sc.nextInt();
        }return valores;
    
    }public static double media(int [] valores){
        int contador=0;
        int suma=0;
        double div=0;
        for (int i=0; i<valores.length; i++){
        suma+=valores[i];   
        contador++;
        }
        div=suma/contador;
            System.out.println("La división es:" + div);
     
            return div;
    
    }public static int []mayores(int []valores, int media ){
        int cont=0;
        for (int i=0; i<valores.length; i++){
            if (valores[i]>media){
                cont++;
            }
            int []mayor=new int [cont];
        }for (int x=0; x<valores.length; x++){
            if (valores[x]>media){
                
            }
        }
        return null;
    
}
}
        
    
    
    
    

