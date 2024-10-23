/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.excepciones;

import javax.swing.JOptionPane;

public class ErroresPassword {
    public static void main(String []args){
        String mail=JOptionPane.showInputDialog("Introduce tu dirección de correo");
        try{
        examina(mail);
        }catch (ErrorDeLongitud e)
       {
          System.out.println("El correo es demasiado corto"); 
       }
    }
    static void examina(String correo)throws ErrorDeLongitud{
        
        if(correo.length()<=3){
            ErrorDeLongitud errorprueba= new ErrorDeLongitud();
            throw errorprueba;
        }
        else
        {
        
        boolean  punto=false;
        int arroba=0;
        
        for(int x=0;x<correo.length();x++){
            if(correo.charAt(x) == '@')
                arroba++;
            
             if('.' == correo.charAt(x))
                    punto=true;
        }
        if(arroba==1 && punto==true)
            System.out.println("El correo es correcto");
        else
            System.out.println("El correo no es correcto");
        }
        
    }
}
    //Elegimos Exception más genérica, pero podríamos utiliza cualquiera
    //En esta deberemos crear try... catch
    class ErrorDeLongitud extends Exception{
    //En los errores se suelen crear dos constructores, el por defecto
    // y uno asociado a un mensaje que se mostrará
        public ErrorDeLongitud(){}
        public ErrorDeLongitud(String mensajeError){
            super(mensajeError);//Mostrará lo que hay en el mensaje
        }
    }


