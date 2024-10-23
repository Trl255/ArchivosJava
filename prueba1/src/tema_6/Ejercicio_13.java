/*Ejercicio 13. Juego del ahorcado. Las reglas son las siguientes:
a) Un primer jugador teclea una palabra
b) Se muestran tantos guiones como letras tenga la palabra secreta
c) Otro jugador intenta acertar, letra a letra, la palabra secreta.
d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán siendo guiones.
e) El jugador solo tiene 7 intentos
f) La partida terminará al acertar todas las letras o cuando se agoten todos los intentos.*/
package tema_6;
import java.util.Scanner;
public class Ejercicio_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String palabra="", intento="";
        int cont=0;
        
        
 while (palabra==""){
     System.out.println("Introduzca la palabra que quiera guardar");
     palabra=sc.nextLine();
      }
while (cont>0 || !palabra.equals(intento)){    
        char a;
        String pGuionBajo=guionBajo (palabra);
        System.out.println(pGuionBajo);
        
        for (int x=0; x<palabra.length(); x++){
            System.out.println("Introduzca la letra de la posición ");
                intento=sc.nextLine();
                
                
            if(intento.indexOf(palabra.charAt(x))>0){
            intento+=palabra.charAt(x);
               }else{
                   intento+="_";
               }
            System.out.println(intento);
                  cont++;
            
        
            
                        
                
  
       }
      
      if (palabra.equals(intento)){
          System.out.println("En horabuena has acertado");
      break;
      } 
      else {
          System.out.println("La palabra "+intento+" no es la contraseña");
        
      }
          
      }
    
        
    }static boolean comprobarGuiones(char [] array){
        for (char letra:array ){
            if (letra=='_')return true;
            
        }
        return false;
        
         
        
    }static String guionBajo(String palab2){
        String guion="";
        for (int i=0; i<palab2.length(); i++){
            guion+="_ ";
        }return guion;
    }
}