/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ruletarusa;

/**
 *
 * @author josea
 */
public class Juego {

    private Jugador[] jugadores;
    private Revolver revolver;

    public Juego(int numJugadores) {
        
        jugadores = new Jugador [comprobarJugadores(numJugadores)];
        crearJugadores();  

        revolver = new Revolver();
        System.out.println(revolver);
    }
 private int comprobarJugadores(int numJugadores){
        
        if (! (numJugadores>0 && numJugadores<=6)){
            numJugadores = 6;
        }
        return numJugadores;
    } 

    private void crearJugadores() {
        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i] = new Jugador(i + 1);

        }

    }
   
    public boolean finJuego() {

        for (int i = 0; i < jugadores.length; i++) {
            if (!jugadores[i].isVivo()) {
                return true;
            }

        }
        return false;
    }

    public void ronda() {

        for (int i = 0; i < jugadores.length; i++) {
            jugadores[i].disparar(revolver);
            System.out.println(revolver);
             //Si muere, terminamos
            if(!jugadores[i].isVivo()){
                return;
            
        }    
    }
}
}
