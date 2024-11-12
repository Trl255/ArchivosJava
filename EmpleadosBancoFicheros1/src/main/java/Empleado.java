
import java.io.Serializable;
import java.util.Comparator;

public class Empleado implements Serializable, Comparator{
    private static final long SerialVersion= 9L;
   private String dni;
   private String nombre;
   private double sueldo;

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    Empleado(String dni,String nombre, double sueldo){
        this.dni=dni;
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    @Override
    public int compare(Object o1, Object o2) {
        int valor=0;
        if(((Empleado)o1).getDni().equalsIgnoreCase(((Empleado)o2).getDni()))valor=1;
        return valor;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "El empleado con Dni=" + dni + "\nNombre= " + nombre + "\nCon sueldo= " + sueldo;
    }

    
    
}
