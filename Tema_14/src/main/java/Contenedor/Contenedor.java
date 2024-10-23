/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contenedor;

/**
 *
 * @author IFC303-1
 */
public class Contenedor <T>{
    
    private T objeto;
    
    
    public Contenedor (){
        
    }
    
    void guardar (T nuevo){
        objeto=nuevo;
    }
    
    T extraer(){
        T res= objeto;
        objeto= null;// el contenedor vuelve a estar vacío.
        return res;
    }
    
    
}
