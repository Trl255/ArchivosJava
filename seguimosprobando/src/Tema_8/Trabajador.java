/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema_8;

public class Trabajador {

    private String nombre;
    private String seccion;
    private int id;
    public static int idPx=1;
    
Trabajador (String nombre){
        this.nombre=nombre;
        seccion="Administración";
        id= idPx;
        idPx++;
        
        
        
    }
    
void cambiaSeccion(String seccion){
        this.seccion=seccion;
    }
    
String dameDatos(){
    return "El ID es: "+id+ " el nombre es: "+nombre+" y su sección es: "+seccion;
}
void cambiaNombre(String nombre){
    this.nombre=nombre;
}
public static String  dameIdPx(){
    return "El próximo ID es: "+idPx;
    
}

}
