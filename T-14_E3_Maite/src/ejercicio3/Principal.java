/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que incluirá el
método equals() y la interfaz Comparable basada en el dni. Implementar el programa que permita
gestionar los socios de un club guardando los datos en el fichero socios.dat. Al arrancar la aplicación,
se leerán los datos del fichero y se abre un menú con las opciones: 1. Alta, 2. Baja, 3. Modificaciones,
4. Listado por dni y 6. Salir.
 */
public class Principal {

    public static void main(String[] args)  {
        //Voy a utilizar HashSet mientras estémos usando los datos
        HashSet <Socio> socios = new HashSet();
        try (ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("fichero.dat"))){
            try {
                socios = (HashSet<Socio>)entrada.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al leer");
                socios = null;
            }
                    } catch (IOException ex) {
            System.out.println("Problemas en el archivo");;
        }
     
     int accion=Metodos.menu();
     while(accion!=6){
     switch (accion){
         case 1: 
            Socio nuevoUsuario = Metodos.pedirUsuario(); 
            socios.add(nuevoUsuario);
            break;
         case 2:
             Metodos.borrarUsuario(socios);
             break;
         case 3:
             Metodos.modificarUsuario(socios);
             break;
         case 4:
             TreeSet <Socio> ordenado=new TreeSet<>();
             ordenado.addAll(socios);
             for(Socio unSocio:ordenado){
                 System.out.println(unSocio.toString());
             }
             break;
         case 5:
             Metodos.listarNombre(socios);
     }
     accion=Metodos.menu();
     }
         if(accion==6){
               try (ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("fichero.dat"))){
                  salida.writeObject(socios);
            }  catch (IOException ex) {
            System.out.println("Problemas en el archivo");;
        }
               
     }  
             
     }
    }

    
