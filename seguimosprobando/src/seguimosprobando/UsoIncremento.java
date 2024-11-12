/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seguimosprobando;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author IFC303-1
 */
public class UsoIncremento {
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int x=10, y=10;
    x++;
    System.out.println(x);
    x=x+1;
    System.out.println(x);
    --y;
    System.out.println(y);
    y=y+1;
    System.out.println(y);
    y=y*100;
    System.out.println(y);
    y=++y;
    System.out.println(y);
          
    System.out.println("La suma es:\n"+x+y);

}

}
