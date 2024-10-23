/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Listas;

import ejercicio3.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/*
Al arrancar la aplicación,
se leerán los datos del fichero y se abre un menú con las opciones: 1. Alta, 2. Baja, 3. Modificaciones,
4. Listado por dni y 6. Salir.
*/
public class Metodos {
    static Scanner entrada = new Scanner(System.in);
    static int menu(){
        int c=0;
        while (c>6 || c<=0){
           System.out.println("Introduce una opción");
            System.out.println("1. Altas");
            System.out.println("2. Bajas");
            System.out.println("3. Modificaciones");
            System.out.println("4. Listado por dni");
            System.out.println("5. Listado por nombre");
            System.out.println("6. Salir");
            c=pedirEntero();
    }
        return c;
    }
    static Socio pedirUsuario(){
        Socio usuario=null;
        String dni="";
        while(dni.equals("")){
        System.out.println("Introduce el dni");
        dni = entrada.nextLine();
        }
         
        String nombre="";
        while(nombre.equals("")){
        System.out.println("Introduce el nombre");
        nombre = entrada.nextLine();
        }
        LocalDate fecha=pedirFecha();
        usuario=new Socio(dni,nombre,fecha);
    return usuario; }
    
    static int pedirEntero(){
        int dato = 0;
        boolean noVale;
        String ss;              
        do{
            noVale = false;          
            try{
                 dato = entrada.nextInt();
                 entrada.nextLine();
            }catch(InputMismatchException ime){
                noVale = true;
                ss = entrada.nextLine();
                entrada.nextLine();
                System.out.println("El dato introducido no es de tipo entero");
            }
        }while(noVale);     
        return dato;

    }
    static LocalDate pedirFecha(){
         System.out.println("Introduce el año");
        int anio=pedirEntero();
        while(anio>LocalDate.now().getYear()){
            System.out.println("El año no puede ser posterior al actual");
            System.out.println("Introduce el año");
            anio=pedirEntero();
        }
        System.out.println("Introduce el mes");
        int mes=pedirEntero();
        while(mes<1 || mes>12){
            System.out.println("El mes tiene que estar entre 1 y 12");
            System.out.println("Introduce el mes");
            mes=pedirEntero();
        }
        int dia;
       
        while(true){
             System.out.println("Introduce el día");
            dia=pedirEntero();
            if (dia >0 && dia<=28)
                break;
            else 
                if(dia<=30 && mes!=2)
                    break;
                else
                    if(dia==31 && (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes ==10 || mes==12 ))
                        break;
        }
        return LocalDate.of(anio,mes,dia);
        }
    
       static void borrarUsuario(ArrayList <Socio> listado){
           String dni="";
           System.out.println("Dime el dni del usuario a eliminar");
           dni=entrada.nextLine();
           while(dni.equals("")){
               System.out.println("Dime el dni del usuario a modificar");
               System.out.println("El dni no puede estar vacío");
               dni=entrada.nextLine();
           }
           boolean borrado =listado.remove(new Socio(dni));
           if(borrado)
               System.out.println("El socio ha sido borrado");
           else
               System.out.println("El socio no existe");
       }

       static void modificarUsuario(ArrayList<Socio> listado){
           boolean existe=false;
            String dni="";
           System.out.println("Dime el dni del usuario a eliminar");
           dni=entrada.nextLine();
           while(dni.equals("")){
               System.out.println("Dime el dni del usuario a eliminar");
               System.out.println("El dni no puede estar vacío");
               dni=entrada.nextLine();
           }
           existe=listado.contains(new Socio(dni));
           if(!existe)
               System.out.println("Ese usuario no existe");
           else
               for(Socio unUsuario:listado)
                   if(unUsuario.equals(new Socio(dni)))
                   {
                       modificarUsuario(unUsuario);
                       }     
                   }
                       
       
       static void modificarUsuario(Socio usuario){
                System.out.println("¿Quieres cambiar el dni?(Si/No)");
                String res=entrada.nextLine();
                if(res.equalsIgnoreCase("si")){
                      System.out.println("Dime el nuevo dni");
                      String dni=entrada.nextLine();
                      while(dni.equals("")){
                            System.out.println("El dni no puede estar vacío");
                            dni=entrada.nextLine();
                           }
                      usuario.setDni(dni);
                System.out.println("¿Quieres cambiar el nombre?(Si/No)");
                res=entrada.nextLine();
                if(res.equalsIgnoreCase("si")){
                      System.out.println("Dime el nuevo nombre");
                      String nombre=entrada.nextLine();
                      while(nombre.equals("")){
                            System.out.println("El nombre no puede estar vacío");
                            nombre=entrada.nextLine();
                           }
                      usuario.setNombre(nombre);            
                   }
                    System.out.println("¿Quieres cambiar la fecha de alta");
                    res=entrada.nextLine();
                    LocalDate fecha=pedirFecha();
                    usuario.setFechaAlta(fecha);
}
       }
       static void listarNombre(ArrayList <Socio> usuarios){
          
           Collections.sort(usuarios,new ordenarPorNombre());
           Iterator it = usuarios.iterator();
           while(it.hasNext()){
               System.out.println(it.next().toString());
           }
           
           
           
       }
}

