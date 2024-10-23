/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;
import java.util.Scanner;
/**
 *
 * @author IFC303-1
 */
public class examen_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int area=0, base=0, altura;
        
        System.out.println("Introduzca un valor");
        base=sc.nextInt();
        System.out.println("Introduzca un valor");
        altura=sc.nextInt();
        
        area=(base*altura)/2;
                System.out.println("La base es: "+area);
    }
}
