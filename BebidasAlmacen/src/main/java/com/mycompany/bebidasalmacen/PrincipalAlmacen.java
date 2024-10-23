/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bebidasalmacen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author josea
 */
public class PrincipalAlmacen {
    public static void main(String[] args) throws ClassNotFoundException {
        
        
        Almacen almacen1= new Almacen ();
        Bebidas b;
        
        
        for (int i=0; i<10; i++){
            switch(i%2){
                
                case 0:
                    b= new AguaMineral("Pirineo", 1.5, 0.5, "Cabalca");
                     almacen1.agregarBebida(b);
                     break;
                case 1:
                    b= new Azucaradas ("CocaCola", 5, 10);
                     almacen1.agregarBebida(b);
            }
        }
        
              /*  almacen1.mostrarBebidas();
                
                try(ObjectOutputStream fAlmacen= new ObjectOutputStream(new FileOutputStream ("Almacen 1.dat", true))){
                    fAlmacen.writeObject(almacen1);
                    System.out.println("Se ha añadido correctamante");
                    
                }catch(IOException ex){
                    System.out.println(ex.getMessage());
                }*/
              try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Almacen 1.dat"))){
                  while (true){
                      Almacen aux=(Almacen)ois.readObject();
                      System.out.println(aux.toString());
                      
                  }
                  
                  
              }catch(IOException ex){
                  System.out.println("Error de lectura "+ex.getMessage());
              }
                
    }
    
}
