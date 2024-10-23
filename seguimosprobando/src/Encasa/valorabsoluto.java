/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class valorabsoluto {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int valorabsoluto, numero;
    
System.out.println("Por favor introduzca un número");
numero=sc.nextInt();
valorabsoluto=numero<0 ? -1*numero:numero;
System.out.println("El valor absoluto es: "+valorabsoluto);

/*valorabsoluto=Math.abs(numero);

System.out.println("El valor absoluto es: "+ valorabsoluto);*/
        
    }
    
}
