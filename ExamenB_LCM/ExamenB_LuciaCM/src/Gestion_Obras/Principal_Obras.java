/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion_Obras;

/**
 *
 * @author IFC303-1
 */
public class Principal_Obras {
    public static void main(String[] args) {
        Obras obra1=new Obras("Titulo Uno", "Pepe", "Romance");
        Obras obra2=new Obras("Titulo Dos", "Antonio", "Comedia");
        
        Libros libro1=new Libros(obra2.autor, "AAA");
        Canciones cancion1=new Canciones (obra1.autor, "BBB");
        
        System.out.println(libro1.mostrar());
        System.out.println(cancion1.mostrar());
    }
}
