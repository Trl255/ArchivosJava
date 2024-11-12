/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

import java.time.LocalDate;

/**
 *
 * @author IFC303-1
 */
public class Edificio {
    protected String direccion;
    protected Propietario propietario;
    protected int n_pisos;
    protected LocalDate fecha_construccion;
    protected String constructora;
    
    Edificio(){}
    Edificio(String direccion, LocalDate fecha){
        this.direccion=direccion;
        this.fecha_construccion=fecha;
    }
    Edificio(String direccion, int n, Propietario propietarios){
        this.direccion=direccion;
        this.n_pisos=n;
        propietario=new Propietario();
    }
    Edificio(Propietario propietarios, String constructora){
        propietario=new Propietario();
        this.constructora=constructora;
    }

    void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    void setN_pisos(int n_pisos) {
        this.n_pisos = n_pisos;
    }
    void setFecha_construccion(LocalDate fecha_construccion) {
        this.fecha_construccion = fecha_construccion;
    }
    void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    String getDireccion() {
        return direccion;
    }
    Propietario getPropietario() {
        return propietario;
    }
    int getN_pisos() {
        return n_pisos;
    }
    LocalDate getFecha_construccion() {
        return fecha_construccion;
    }
    String getConstructora() {
        return constructora;
    }
    
    void modificarConstructora(String nueva){
        nueva=constructora;
    }
/*     String getMonstructoraNueva(){
        String resultado="";
        resultado=constructora.modificarConstructora();
        
        return constructora;
    }*/
}
