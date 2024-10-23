/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author profesor
 */
public class Persona implements Comparable {
    String nombre;
    String apellidos;
    String dni;
    int edad;
     Persona(){
         
     }
    Persona(String nom, String apell,String dniusua){
        nombre=nom;
        apellidos=apell;
        dni=dniusua;
        
    }

    @Override
    public int compareTo(Object o) {
       /* int resultado=0;
        if(this.edad>((Persona)o).edad)
            resultado=1;
        else if(this.edad==((Persona)o).edad)resultado=0;
        else resultado=-1;
        return resultado;*/
       Persona b=(Persona)o;
       return (this.dni).compareTo(b.dni);
       
        
    }
           
    
}
