
package Encasa;
import java.util.Scanner;
public class Examen_recuperacion_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []notas=new int[5];
        int a=0;
        
        
        
        for (int i=0; i<notas.length; i++){
            
            System.out.println("Introduzca la nota "+(i+1));
            notas [i]=sc.nextInt();
            if (notas[i]<0){
                System.out.println("Introduzca un valor entre el 0 y el 10");
            }else{
                
            }
                
            
           }
            valoracion (notas);
            int [] suspendidosA=suspendidos(notas);
        System.out.println("Los supendidos son :");
        mostrar (suspendidosA);
        
        
    
        
}static void valoracion( int notasA[]){
    int cont=0;
    for (int i=0; i<notasA.length; i++){
        if (notasA[i]>=5){
            cont++;
        }
    } System.out.println("Los aprobados han sido "+cont);
        
}

   static int []suspendidos(int array[] ){
    int cont=0;
    for (int i=0; i<array.length; i++){
        if (5>array[i]){
            cont++;
        }
    }
    int cont2=0;
    int []menores=new int[cont];
    for (int y=0; y<array.length; y++){
        if (5>array[y]){
            menores[cont2]=array[y];
            cont2++;
            }
       }
    return menores;
}
    
    
    
    static void mostrar(int []valores){
    for (int i=0; i<valores.length; i++){
        System.out.println("La nota "+(i+1)+ " ha suspendido con " +valores[i]);
   
}
}
}

