/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.henrenciaproducto;

/**
 *
 * @author josea
 */
public class Principal {
    public static void main(String[] args) {
         Productos []productosNuevos= new Productos[3];
         
         productosNuevos[0]= new Productos ("Poducto 1", 10);
         productosNuevos[1]= new Perecedero (1, "Producto 2", 20);
         productosNuevos[2]= new NoPerecedero ("tipo1", "poducto 3", 5);
         
         double total=0;
         
         for (int i=0; i<productosNuevos.length; i++){
              total += productosNuevos[i].calcular(5);
         }
         
         System.out.println("El total es: "+total);
    }
    
    
    
}
