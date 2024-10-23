/*Ejercicio3. Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que incluirá el
método equals() y la interfaz Comparable basada en el dni. Implementar el programa que permita
gestionar los socios de un club guardando los datos en el fichero socios.dat. Al arrancar la aplicación,
se leerán los datos del fichero y se abre un menú con las opciones: 1. Alta, 2. Baja, 3. Modificaciones,
4. Listado por dni y 6. Salir.*/
package com.mycompany.t14.ejercicio3;

import java.io.Serializable;
import java.util.Objects;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author IFC303-1
 */
public class Socio implements Comparable, Serializable {

    private String dni;
    private String nombre;
    private Date fechaAlta;

    public Socio() {

    }
        

    Socio(String dni, String nombre, int dia, int mes, int anne) {
        this.dni = dni;
        this.nombre = nombre;
        GregorianCalendar fecha = new GregorianCalendar(anne, mes - 1, dia);
        //Fecha fechaAlta= new Fecha(dia, mes, anne);
        fechaAlta = fecha.getTime();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }
    

    @Override
    public String toString() {
        return "El socio: " + nombre + "\nCon DNI: " + dni + "\nTiene fecha de alta: " + fechaAlta;
    }

    @Override
    public int hashCode() {
        int hash = 45;
        hash = hash * 5 + Objects.hashCode(this.dni);
        return hash;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaAlta(int dia, int mes, int anne) {
        GregorianCalendar fecha = new GregorianCalendar(anne, mes - 1, dia);
        //Fecha fechaAlta= new Fecha(dia, mes, anne);
        this.fechaAlta = fecha.getTime();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return false;
        if (o==null)    
            return false;
        if(getClass()!=o.getClass())
            return false;
        Socio temporal= (Socio )o;
        if(dni.equals(temporal.dni)){
        return false;
        }
        return true;
                    
    }

    @Override
    public int compareTo(Object o) {
        return dni.toLowerCase().compareTo(((Socio)o).dni.toLowerCase());
        
    }



}
