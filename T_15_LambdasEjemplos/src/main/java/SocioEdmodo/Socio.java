/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocioEdmodo;

import java.time.LocalDate;
import java.util.Objects;

/**
 Implementa la clase Socio con los atributos, dni, nombre, fechaNacimiento, fechaAlta (de
tipo LocalDate), cuota y números de familiares del socio.
Implementa al menos un constructor, los métodos equals, compareTo y toString. Crea una tabla con 5
socios, y a partir de ella, un Stream con los socios:
a) Ordenador por DNI
b) Con un cuota mayor de 100 €
c) Cuyo nombre empieza por “A”
d) Crea un método que calcule la edad del socio en años a partir de la fecha de nacimiento y la fecha
actual.
e) Crea el método antigüedad del socio en meses completos.
f) Crea un Stream con los socios ordenados por antigüedad y otro con los socios ordenados por edad.
 */
public class Socio implements Comparable <Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaAlta;
    private double cuota;
    private int numeroFamiliares;

    public Socio(String dni, String nombre, LocalDate fechaNacimiento, LocalDate fechaAlta, double cuota, int numeroFamiliares) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.cuota = cuota;
        this.numeroFamiliares = numeroFamiliares;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public void setNumeroFamiliares(int numeroFamiliares) {
        this.numeroFamiliares = numeroFamiliares;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public double getCuota() {
        return cuota;
    }

    public int getNumeroFamiliares() {
        return numeroFamiliares;
    }
   

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.getDni());
    }
    @Override
    public boolean equals(Object ob){
        if(this == ob)
            return true;
        if(ob == null)
            return false;
        if (getClass() != ob.getClass())
             return false;
        Socio other = (Socio) ob;
        if (!this.dni.equals(other.getDni()))
          return false;
       return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.dni);
        return hash;
    }
    
    public String toString(){
        return "Dni: "+dni+" Nombre: "+nombre+ " Cuota: "+ cuota+
                "Numero Familiares: "+ numeroFamiliares + " Fecha nacimiento: "+
                fechaNacimiento.toString()+" Fecha Alta: "+fechaAlta.toString();
    }
}
