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
public class examen2_E2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la cantidad de valores a introducir");
        int n=sc.nextInt();
        int array1[]=new int [n];
        llamada(array1);
        orden(array1);
        
    }static void llamada(int array[]){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<array.length; i++){
            System.out.println("Introduzca el valor "+(i+1));
            array[i]=sc.nextInt();
            
        }
        
    }static void orden(int array[]){
        for (int x=0; x<array.length; x++){
            for (int y=x+1; y<array.length; y++){
                    int aux=0;
                    aux=array[x];
                    array[x]=array[y];
                    array[y]=aux;
                    
                }
            }for (int i=0; i<array.length; i++){
                System.out.println(""+array[i]);
            }
        }
    }
    

