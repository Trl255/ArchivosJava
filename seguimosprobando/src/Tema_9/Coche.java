/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author profesor
 */
public class Coche {
    String matricula;
    String marca;
    int km;
    double precio;
    double gasolina;
    final int RUEDAS=4;
    
    Coche(){}
    Coche(String matricu){
       matricula=matricu;
        
    }
   Coche(String marca,int km){
        this.marca=marca;
        this.km=km;
    }
    Coche(String matricula, String marca){
        
    }
    void mostrarDatos(){
        System.out.println("La matricula es "+matricula);
        System.out.println("La marca es "+marca);
        System.out.println("Los km son "+km);
        System.out.println("El precio es "+precio);
        System.out.println("La gasolina es "+gasolina);
        System.out.println("Las ruedas son "+RUEDAS);
    }
    void llenarDeposito(double incremento){
        gasolina+=incremento;
    }
    
    
    
    
}
