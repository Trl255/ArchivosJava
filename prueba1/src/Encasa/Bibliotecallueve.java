/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
/**
 *
 * @author josea
 */
public class Bibliotecallueve {
    public static void main(String args[]){
        boolean  lloviendo=true, tarea=true;
        /*String permiso;*/
        
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Hola, ya ha terminado la tarea");
        tarea=sc.nextBoolean();
        System.out.println("Esta lloviendo");
        lloviendo=sc.nextBoolean();
        
        boolean=(lloviendo&tarea)? : "no puedes salir";*/
        double x=12.456, y=123.559, z=12344.4411;
        
        System.out.println("Hola puedes salir porque ya has terminado tu tarea y no esta lloviendo \n " +(true & true));
        System.out.println("Hola no puedes salir porque no has terminado tu tarea y no esta lloviendo\n " +(false & true));
        System.out.println("Hola no puedes salir porque ya has terminado tu tarea pero esta lloviendo\n" +(false & true));
        System.out.println("Hola no puedes salir porque no has terminado tu tarea y esta lloviendo\n" +(false & false));
        
        
        System.out.printf("%nEl número "+x+" mostrando sólo dos digitos es: %.2f\n",x);
        System.out.println("El número: "+y+" redondeado a floor es: "+ Math.floor(y));
        System.out.println("El número: "+z+" redondeado a floor es: "+ Math.floor(z)+"\n" );
        
        System.out.printf("%nEl número: "+x+" mostrando sólo dos digitos es::  %.2f\n", x);
        System.out.println("El número: "+x+" redondeado con la función round es: "+ Math.round(x));
        System.out.println("El número: "+y+" redondeado con la función round es: "+ Math.round(y));
        System.out.println("El número: "+z+" redondeado con la función round es: "+ Math.round(z)+"\n" );
        
        System.out.printf("%nEl número: "+x+" mostrando sólo dos digitos es: %.2f\n",x);
        System.out.println("El número: "+x+" redondeado con la función ceil es: "+ Math.ceil(x));
        System.out.println("El número: "+y+" redondeado con la función ceil es: "+ Math.ceil(y));
        System.out.println("El número: "+z+" redondeado con la función ceil es: \n"+ Math.ceil(z));
        
        System.out.printf("%nEl número: "+x+" \"mostrando sólo dos digitos es\": %.2f\n",x);
        System.out.printf("%nEl número: "+y+" mostrando sólo dos digitos es: %.2f\n", y);
        System.out.printf("%nEl número: "+z+" mostrando sólo dos digitos es: %.2f\n",z);
        x=(char)(x);
        System.out.println("Con la función CHAR es: "+ (x));
        
        
        
        /*System.out.println("Negación:\n false es: "+ (!false));
        System.out.println("!true es:: "+ (!true));*/
        
        
        
        
    }
    
}
