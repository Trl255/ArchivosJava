
package Tema_8;
import java.util.Scanner;
public class Sinto_principal {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int opcion=0;
       int valor=0;
       Sintonizador sintonia= new Sintonizador(80);
       sintonia.mostrarFrecuencia();
       
       
       
       
       
       System.out.println("Presione:\n1-SUBIR VOLUMEN:\n2-BAJAR VOLUMEN");
       opcion=sc.nextInt();
       
       while (opcion<0 && opcion>2){ 
       System.out.println("Presione:\n 1-SUBIR VOLUMEN:\n2-BAJAR VOLUMEN");
        opcion=sc.nextInt();
            }
       
       if (opcion==1){
           
               System.out.println("¿Cuanto volumen desea subir??\ncada 1 = 0.5 en volumen");
               valor=sc.nextInt();
               sintonia.subirVolumen(valor);
           }
       else{
                System.out.println("¿Cuanto volumen desea bajar?\ncada 1 = 0.5 en volumen ");
                valor=sc.nextInt();
                sintonia.bajarVolumen(valor);
                System.out.println("por medio de ToString "+ sintonia.toString());
       }
       
       
       
       
       
       
    }
}
