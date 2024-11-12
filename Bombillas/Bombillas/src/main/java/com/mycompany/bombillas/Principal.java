/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bombillas;

/**
 *
 * @author profesor
 */
public class Principal {
    public static void main(String []args){
        Bombilla [] bombilla = new Bombilla[15];
        for(int i=0;i<15;i++){
             bombilla[0]=new Bombilla(false);
            
        }
        bombilla[2].encenderBombilla();
    }
    
}
