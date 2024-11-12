/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class pruebaSwitch1{
public static void main(String args[]){        
    Scanner ss=new Scanner(System.in);
    System.out.println("Intruduce una nota");
    int nota=ss.nextInt();
    switch (nota){
        case 0,1,2,3,4-> {
            System.out.println("Suspendido");
            System.out.println("Animo");
        }
        case 6->
            System.out.println("Bien");
        case 7,8->
            System.out.println("Notable");
        case 9,10->{
            System.out.println("Sobresaliente");
            System.out.println("Enhorabuena");
        }
        }
              
        }   
}
