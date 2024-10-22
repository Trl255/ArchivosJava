
package Tema_8.bombillas;
import java.util.Scanner;
public class Bombilla_principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cant=0;
        boolean estadoI, estadoG;
        //Bombilla_S []bombillas;
        
        System.out.println("Cuantas bombillas quiere crear");
        cant=sc.nextInt();
        
        Bombilla_S bombillas[]=new Bombilla_S[cant];
        
        
        System.out.println("Quieres encender el general");    
        estadoG=sc.nextBoolean();
        
        System.out.println("Quieres encender las bombillas");    
        estadoI=sc.nextBoolean();
        
        for (int i=0; i<bombillas.length;i++){
            bombillas[i]=new Bombilla_S(estadoG, estadoI);
        }
        
            
            for (Bombilla_S e:bombillas){
                e.encenderLuces(estadoG, estadoI);
                
            }
            for (Bombilla_S e:bombillas){
                System.out.println(e.estadoBombilla());
            }
            
            
            
        }

}

        
          

