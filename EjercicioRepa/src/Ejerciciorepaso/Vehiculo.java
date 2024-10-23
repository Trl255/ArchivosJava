/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerciciorepaso;

/**
 *
 * @author profesor
 */
public class Vehiculo {
    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    boolean disponible;
    
    Vehiculo(){
        
    }
    Vehiculo(String matricula,double tarifa){
        this.matricula=matricula;
        this.tarifa=tarifa;
        
    }
    Vehiculo(double tarifa, String marca){
        this.tarifa=tarifa;
        this.marca=marca;
        
    }
    String getMatricula(){
        return matricula;
    }
    String getMarca(){
        return marca;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }
    String mostrar(){
        String resultado=" ";
        if(!matricula.equals("")&&matricula!=null)
          resultado="La matricula es: "+matricula;
       return resultado; 
    }
    
}
