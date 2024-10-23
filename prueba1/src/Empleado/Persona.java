
package Empleado;

public abstract class Persona {
    String nombre;
    
public Persona(String nom){
    nombre=nom;
}
    
 public String dameNombre(){
     return nombre;
 }   
 
 public abstract String dameDescripcion();
    
    
}
    
