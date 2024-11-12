
package com.mycompany.bombillas;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Bombilla []bombillas= new Bombilla[4];
        
        for (int i=0; i<bombillas.length; i++){
            bombillas[i]=new Bombilla();
        }
        
      /* System.out.println("quieres encender el general");
        boolean inGeneral=sc.nextBoolean();
        
        
        System.out.println("quieres encender las bombillas");
        boolean inBombillas=sc.nextBoolean();
        
        for (int i=0; i<bombillas.length; i++){
        bombillas[i].valorBombillas(inBombillas, inGeneral );
        }*/
        Bombilla.encenderLuz();
        for (Bombilla e: bombillas){
            System.out.println(e.toString());
        }
        Bombilla.apagarLuz();
        
        for (Bombilla e: bombillas){
            System.out.println(e.toString());
        }
        
        
        
    }
        
    }
        
    
    

