/*Que rellene un array con los 100 primeros números enteros y los muestre en pantalla en orden ascendente.*/
package Arrays;
public class Ejercicio_6 {
    public static void main(String[] args) {
int []arry=new int [100];
        tabla(arry);
    }static void tabla( int[]arry){
        for (int i=100; i>0; i--){
            if (i%2==0){
                System.out.println(""+i);
                
            }
        }
        
    }
}
