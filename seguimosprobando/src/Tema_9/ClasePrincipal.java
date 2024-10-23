/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author profesor
 */
public class ClasePrincipal {
    public static void main(String[]args){
     Coche coche3=new Coche();
     Coche coche1= new Coche("1111-CJK");  
     Coche coche2= new Coche("Opel",175);
     coche1.mostrarDatos();
     coche1.marca="Seat";
     coche1.precio=2634.9;
     coche1.mostrarDatos();
     coche2.mostrarDatos(); 
     coche3.llenarDeposito(50);
     coche3.mostrarDatos();
     
        
    }
    
    }
    

