/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author IFC303-1
 */
public class Metodos {
    //PARA COMPROBAR QUE INTRODUCIMOS ENTEROS
    static int readInt(){
        Scanner sc = new Scanner(System.in);
        int valor=0;
        while(true){
            //System.out.println("Introduce un valor entero");
            
            try{
                valor=sc.nextInt();
                break;
            }catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("No has introducido un valor de tipo numerico entero INT");
            }
        }
        
        return valor;
    }
}
