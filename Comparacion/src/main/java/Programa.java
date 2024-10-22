/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author profesor
 */
public class Programa  {
    public static void main(String args[]){
        Persona  profesor1=new Persona("Maite","12345678Z","Garcia");
        Persona profesor=new Persona();
        System.out.println("El nombre de mi profesor es "+profesor.nombre);
        profesor.nombre="Pepe";
        profesor.apellidos="Lopez";
        profesor.dni="2569874H";
        profesor.edad=45;
        profesor.compareTo(profesor1);
    }

   
    
}
