/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 * Solicitar  el largo y el ancho de  un rectángulo  y realizar una función que  calcule el área de ese 
rectángulo
 * @author IFC303-1
 */
public class Ejercicio3 {
    public static void main(String args[]){
        int largo, ancho;
        Scanner sc=new Scanner(System.in);
    System.out.println("Por favor introduzca el larbo del rectángulo");
    largo=sc.nextInt();
    System.out.println("Por favor introduzca el ancho del rectángulo");
    ancho=sc.nextInt();
    
    
    mostrar(largo, ancho);
    
            }
  static void mostrar(int larg, int anch){
        
  int resultado=(larg+anch)/2;
      System.out.println("El área de "+larg+" y "+anch+" es: "+resultado);
         }    


        

}