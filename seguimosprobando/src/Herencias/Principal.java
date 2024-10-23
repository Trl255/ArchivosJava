/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencias;

/**
 *
 * @author profesor
 */
public class Principal {
    public static void main(String []args){
        Profesor profe1=new Profesor("matematicas","jueves");
        System.out.println(profe1.nombre);
        System.out.println(profe1.getTelefono());
        profe1.toString();
        Alumno alumno1=new Alumno("Manuel","11111111P",2);
        alumno1.nombre="Lorenzo";
        alumno1.ciclo="Desarrollo Web";
        profe1.nombre="Maite";
        profe1.correo="maitegarciaam20.21@gmail.com";
        System.out.println( alumno1.toString());
        System.out.println(profe1.toString());
        Persona person=new Persona("Juan","99988874L");
       person.mostrar();
     profe1.mostrar();
        
    }
    
    }
    
