/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**Crea un programa que pida la base y la altura de un triángulo y muestre su área. Area triangulo= (basexaltura)/2 
 *
 * @author josea
 */
public class baseXaltura {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int base=0, altura=0, area;
    System.out.println("Introduzca la base");
    base=sc.nextInt();
    System.out.println("Introduzca la base");
    altura=sc.nextInt();
    double resultado=area(base, altura);
    System.out.println("La base de "+base+" y "+altura+" es: "+ resultado);
    

        
        
    }
    static double area(int bs, int alt){
        return (double)(bs*alt)/2;
    }
    
}
