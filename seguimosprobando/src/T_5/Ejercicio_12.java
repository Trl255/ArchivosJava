
package T_5;
/*Que rellene un array con los 100 primeros números pares y muestre su suma.
*/ 
public class Ejercicio_12 {
    public static void main(String[] args) {
        int []num=new int [100];
        pares(num);
        suma(num);
        
        
    }static void pares(int num[]){
        int cont=0, contA=0;
        for (int i=1; i<=200; i++){
            if (i%2==0){
                cont++;
                num[contA]=i;
                System.out.println(""+num[contA]);
            }
        }System.out.println("se han mostrado " +cont);
    }static void suma(int num[]){
        int suma=0;
        for (int i=1; i<=200; i++){
        if ( i%2==0){
            suma+=i;
            
        }
    }System.out.println("La suma de los números pares es: "+suma);
    }
    
}
