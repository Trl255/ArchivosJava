/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlist;
import java.util.*;
/**
 *
 * @author josea
 */
public class pruebaTset {
    public static void main(String[] args) {
        
        /*TreeSet <String> ordenaNombres= new TreeSet<String>();
        
        ordenaNombres.add("Amanda");
        ordenaNombres.add("Paulina");
        ordenaNombres.add("Cleo");
    
        
      for(String e: ordenaNombres) {
          
          System.out.println(e);   

      }  */
        Articulo art1= new Articulo (1, "Primer artículo");
        Articulo art2= new Articulo (2, "Segundo artículo");
        Articulo art3= new Articulo (1100, "Tercer artículo");
        Articulo art4= new Articulo (4, "Cuarto artículo");
        
        TreeSet <Articulo> ordenaArticulos=new TreeSet<Articulo>();
        
        ordenaArticulos.add(art4);
        ordenaArticulos.add(art3);
        ordenaArticulos.add(art2);
        ordenaArticulos.add(art1);
        
        for (Articulo e: ordenaArticulos){
             System.out.println(e.getDescripcion());
        }
    }
    
}
class Articulo implements Comparable<Articulo>{
    
    private int numeroArticulo;
    private String descripcion;
    
    
    Articulo(int num, String desc){
        
        numeroArticulo=num;
        descripcion=desc;
        
    }
    public String getDescripcion(){
        return descripcion;
    }
    

    @Override
    public int compareTo(Articulo o) {
        return numeroArticulo-o.numeroArticulo;
    }
    
    
}