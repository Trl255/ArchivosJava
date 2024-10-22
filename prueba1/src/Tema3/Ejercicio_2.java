/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales.
El número de animales que alimentar (todos de la misma especie) es numAnimales, y sabemos que 
cada animal come una media de kilosPorAnimal.Diseña un programa que solicite al usuario 
los valores anteriores y determine si disponemos de alimento suficiente para cada animal. 
En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales. (Evitar que la aplicación realice divisiones por cero)*/
package Tema3;
import java.util.Scanner;
/**
 *
 * @author josea
 */
public class Ejercicio_2 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int comidaDiaria=0, kilosPorAnimal=0, numAnimales=0;
        double division;
        
        System.out.println("Por favor introduzca la cantidad de animales para alimentar");
        numAnimales=sc.nextInt();
        System.out.println("Por favor introduzca los kilos de comida que come cada animal");
        kilosPorAnimal=sc.nextInt();
        System.out.println("Por favor introduzca los kilos de comida con los que dispone");
        comidaDiaria=sc.nextInt();
        int necesidades=kilosPorAnimal*numAnimales;
        if (necesidades>comidaDiaria){
            division=(double) necesidades/comidaDiaria;
        System.out.printf("Uste no dispone de comida suficiente para alimentar a todos los animales, tendrá que darles:%.2f ", division," kilos por animal");
        
        }else
            System.out.println("Usted dispone de comida suficiente para alimentar a todos los animales");
             
    }
}
