package com.mycompany.agendatelefonica;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Agenda {

    private Contacto[] contactos;

    
    public Agenda() {
        this.contactos = new Contacto[10];

    }

    public Agenda(int tamaio) {
        this.contactos = new Contacto[tamaio];

    }

    public void anadirContacto(Contacto c) {
        if (existeContacto(c)) {
            System.out.println("Ese contacto ya existe");
        } else if (agendaLlena()) {
            System.out.println("La agenda se encuentra llena no se puede añadir más contactos");
            

        } else {
            boolean encontrado = false;
            for (int i = 0; i < contactos.length && !encontrado; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;

                    encontrado = true;
                }
            }
            if (encontrado) {
                System.out.println("Se ha añadido correctamente el contacto ");
            } else {
                System.out.println("No se ha podido añadir el contacto");
            }

        }
    }

    public boolean existeContacto(Contacto c) {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && c.equals(contactos[i])) {
                
                return true;
            }
        }
        
        return false;

    }
    public boolean existeContacto(String nombre) {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && nombre.equals(contactos[i].getNombre())) {
                return true;
            }
        }
        return false;

    }

    public void listarContactos() {

        if (huecosLibres()== contactos.length) {
            System.out.println("No hay contactos que mostrar");
            
        } else {
           /* for (Contacto e : contactos) {
                System.out.println(e);
            }
        }*/
        for (int i = 0; i < contactos.length; i++) {
       if (contactos[i]!=null){
     System.out.println(contactos[i]);
       }
     }
        
    }

    } public void buscarNombre(String nombre) {

        boolean encontrado = false;
        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
                System.out.println("Su telefono es: " + contactos[i].toString());
                encontrado = true;
            }
            }
            if (!encontrado) {
                System.out.println("No se ha encontrado el contacto");
            }
        }
    

    public boolean agendaLlena() {

        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                
                return false;
            }
        }
        return true;

    }

    public void eliminarContactos(Contacto c) {

        boolean encontrado = false;

        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i] != null && contactos[i].equals(c)) {
                contactos[i] = null;
                encontrado = true;

            }
        }
        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        }else{
        System.out.println("No se ha podido eliminar el contacto\n" + c.toString());
    }
    }

    public int huecosLibres() {
        int cont = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                cont++;
            }
        }
        return cont;
    }

    public void exportarContactos(){
        try (ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream  ("contactos.age"))) {
        
            for (int i=0; i<contactos.length; i++){
                oos.writeObject(contactos[i]);
            }
            
            System.out.println("Se ha copiado correctamente la agenda al fichero");
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public void importarContactos(String fichero) throws IOException{
        
        try ( ObjectInputStream ois= new ObjectInputStream (new FileInputStream (fichero))){
            
            
            
        } catch (EOFException ex) {
            
        }
        
    }
    
}
