/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletarusa;

/**
 *
 * @author josea
 */
public class Jugador {
    
           
    private int id;
    private String nombre;
    private boolean vivo;
    
    public Jugador (int id){
        this.id= id;
        this.nombre= "Jugador "+id;
        this.vivo= true;
    }
        
    void disparar (Revolver r){
        
        System.out.println("El jugador "+nombre+" se apunta con la pistola");
        if (r.disparar()){
            this.vivo= false; //El jugador muere
            System.out.println("El "+nombre+" ha muerto...");
         }else{
            System.out.println("El "+nombre+" se ha librado....");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isVivo(){
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
        
    }