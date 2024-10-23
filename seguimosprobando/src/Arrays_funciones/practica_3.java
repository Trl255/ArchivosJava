/*crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios primos entre los números deseados, por último nos indica cual es el mayor de todos.

Haz un método para comprobar que el número aleatorio es primo, puedes hacer todos lo métodos que necesites.*/
package Arrays_funciones;
import java.util.Scanner;
public class practica_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0;
        
        System.out.println("Introduzca el tamaño");
        a=sc.nextInt();
        int []arrays=new int [a];
        int []valores=numeros(arrays);
        int []primo=primos (valores);
        System.out.println("Estos son los valores primos: ");
        primos(valores);
        mayor (primo);
        
        
    }public static int [] numeros (int []arrays){
        int rnd[]=new int [arrays.length];
        for (int i=0; i<arrays.length; i++){
            rnd[i]=(int) (Math.random()*99+1);
            System.out.println(""+rnd[i]);
            }
            return rnd;
            
            
    } public static int [] primos(int []valores){
        for (int i=0;i<valores.length; i++){
            if (valores[i]%2==1){
                System.out.println(""+valores[i]);
            } 
            
        }return valores;
    
        
    }public static int mayor(int []primo){
           int mayor=0;
        for (int i=0; i<primo.length; i++){
            if (mayor<primo[i]){
             mayor=primo [i];
            
        }
    }System.out.println("El valor máximo: "+mayor);   
        return mayor;
    
}
    
}
    
