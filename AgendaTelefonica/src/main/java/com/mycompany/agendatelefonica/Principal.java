/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendatelefonica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Principal {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String nombre;
        int telefono;
        boolean salir = false;
        int opcion;//Guardaremos la opcion que elige
        Contacto c;
        Agenda agendaTelefonica = new Agenda();
        File fichero=new File("Informacion.dat");
        
        /*try(ObjectInputStream aTelefonica= new ObjectInputStream (new FileInputStream ("Agenda.dat"))){
            
            Agenda angenda1=(Agenda) aTelefonica.readObject();
            
        }catch(ClassNotFoundException ex){
            System.out.println("Clase no encotnrada "+ex.getMessage());
        }catch(FileNotFoundException ex){
            System.out.println("Archivo no encontrado "+ ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }*/
                if (fichero.exists()){
                        System.out.println("El fichero Existe");   
                    
                    }else if (fichero.createNewFile()){
                        System.out.println("El fichero se ha creado correctamente");
                    }else{
                        System.out.println("No se ha podido crear el archivo");
                    }
        while (!salir) {
            

            System.out.println("---------1. Añadir contacto-------------");
            System.out.println("---------2. Listar contacto-------------");
            System.out.println("---------3. Buscar contacto-------------");
            System.out.println("---------4. Comprobar si existe contacto");
            System.out.println("---------5. Eliminar contacto-----------");
            System.out.println("---------6. Contacto disponibles--------");
            System.out.println("---------7. Agenda llena-----");
            System.out.println("---------8. Salir aplicación-----");

              try {
            System.out.println("Elija una opción");
            opcion = sc.nextInt();

            switch (opcion) {//

                case 1:
                  
                  if(fichero.exists()){      
                    System.out.println("Escriba el nombre");
                    nombre = sc.next();

                    System.out.println("Escriba el teléfono");
                    telefono = sc.nextInt();

                    c = new Contacto(nombre, telefono);
                    agendaTelefonica.anadirContacto(c);
                    ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream(fichero));
                    
                   oss.writeObject(c);
                   oss.close();
                  }
                    break;

                case 2: //
                    agendaTelefonica.listarContactos();
                    break;

                case 3://
                    System.out.println("Escribe el nombre a buscar");
                    nombre = sc.next();
                    agendaTelefonica.buscarNombre(nombre);

                    break;
                case 4://

                    System.out.println("Escribe el nombre a comprobar");
                    nombre = sc.next();
                    agendaTelefonica.existeContacto(nombre);

                    break;

                case 5:

                    System.out.println("Que contacto desea eliminar");
                    nombre = sc.next();
                    c = new Contacto(nombre, 0);

                    agendaTelefonica.eliminarContactos(c);

                    break;

                case 6:

                    System.out.println("Hay " + agendaTelefonica.huecosLibres() + " huecos disponibles");

                    break;

                case 7:
                    if (!agendaTelefonica.agendaLlena()) {

                        System.out.println("Todavia puedes añadir contactos"
                                + ", puedes añadir " + agendaTelefonica.huecosLibres());
                    }
                    break;

                case 8:
                    try(ObjectInputStream ois=new ObjectInputStream (new FileInputStream(fichero))){
                        
                            Contacto aux=(Contacto)ois.readObject();
                            
                            System.out.println(aux.toString());
                        
                        
                        
                    }catch(ClassNotFoundException e){
                        System.out.println("error 1"+e);
                    }catch(FileNotFoundException e){
                        System.out.println("Error 2"+e);
                    }catch(IOException e){
                        System.out.println("Error 3"+e);
                    }
                    
                    //salir = true;
                    break;
            }

        }catch(InputMismatchException e){
                  System.out.println("Error a la hora de mostrar los datos"+ e.getMessage());
                  
                  
                      
                  
        }
    }
    }
}
