/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3Listas;

import ejercicio3.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

/*
Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que incluirá el
método equals() y la interfaz Comparable basada en el dni.
*/

public class Socio implements Serializable, Comparable <Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;
    
    public Socio(String dni, String nombre,int anio,int dia,int mes){
        this.dni=dni;
        this.dni=nombre;
        fechaAlta = LocalDate.of(anio,mes,dia);
    }
    public Socio(String dni, String nombre, LocalDate fecha){
        this.dni=dni;
        this.nombre=nombre;
        this.fechaAlta=fecha;
    }
 public Socio(String dni){
        this.dni=dni;
        
    }
    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + '}';
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    @Override
    public int hashCode(){
        int hash=8;
        hash = 97 * hash +  Objects.hashCode(this.dni);
       return hash;
    }
    public boolean equals(Object ob){
        if(this == ob)
            return true;
        if(ob == null)
            return false;
        if (getClass() != ob.getClass())
             return false;
        Socio other = (Socio) ob;
        if (!dni.equals(other.dni))
          return false;
        return true;
    }
    @Override
    public int compareTo(Socio o) {
        return dni.compareTo(o.dni);
    }
  

}

class ordenarPorNombre implements Comparator <Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
    return o1.getNombre().toLowerCase().compareTo(o2.getNombre().toLowerCase()); }
    
    
}
