/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletarusa;

/**
 *
 * @author josea
 */
public class PrincipalRuleta {
    public static void main(String[] args) {
        
        Juego juego = new Juego(2);
        
        while (! juego.finJuego()){
            
            juego.ronda();
        }
        
        System.out.println("Juego Terminado");
    }
    
    
}
