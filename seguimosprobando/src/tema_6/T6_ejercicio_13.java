/*Ejercicio 13. Juego del ahorcado. Las reglas son las siguientes:
a) Un primer jugador teclea una palabra
b) Se muestran tantos guiones como letras tenga la palabra secreta
c) Otro jugador intenta acertar, letra a letra, la palabra secreta.
d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán siendo guiones.
e) El jugador solo tiene 7 intentos
f) La partida terminará al acertar todas las letras o cuando se agoten todos los intentos.*/
package tema_6;

import java.util.Scanner;

public class T6_ejercicio_13 {
    
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    String palabra="";
        int cont=7;
            
while (palabra==""){
     System.out.println("Introduzca la palabra que quiera guardar");
     palabra=sc.nextLine();
      }
        char [] guionBajoP=guionBajo(palabra); 
        boolean fin=false;
        int contAciertos=0;
do{
    System.out.println(guionBajoP);
    System.out.println("Introduzca una letra ");
        char x=sc.next().charAt(0);
        boolean aciertoL=false; 
            
        for (int i=0; i<palabra.length();i++){
            if (palabra.charAt(i)==x){
                guionBajoP[i]=x;
                aciertoL=true;
                contAciertos++;
    }
    }
        if (!aciertoL){
            System.out.println("Sin acierto, te quedan "+cont+ " aciertos");
            cont--;
    }
        if (String.valueOf(guionBajoP).indexOf("_")==-1){
            System.out.println("Has acertado el juego\n con "+contAciertos+"intentos");
            fin=true;
    }
        if (cont<0){
            fin=true;
            System.out.println("Has acabado los 7 intentos del juego");
        }
        
}while(!fin);
       if (String.valueOf(guionBajoP).indexOf("_")==-1){
        System.out.println("FIN ");
       }
              
}static boolean comprobarGuiones(char [] array){
        for (char letra:array ){
            if (letra=='_')
            return true;
        }
            return false;

}static char[] guionBajo(String palabra){
        char []arrayPalabra=palabra.toCharArray();
        for (int i=0; i<palabra.length();i++){
        arrayPalabra[i]='_';
        }
            return arrayPalabra;
}
}

