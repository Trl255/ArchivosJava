
package examen_ejercicio1;

public class Autor {
       
    protected String nombre; 
    protected String apellidos; 
    protected String nacionalidad; 
    
    Autor(String nombre){
        
        
    }
    Autor (String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    Autor (String nombre, String apellidos, String nacionalidad){
        this (nombre, apellidos);
        this.nacionalidad=nacionalidad;
    }

    String dameNombre() {
        return nombre;
    }

    String dameApellidos() {
        return apellidos;
    }

    String dameNacionalidad() {
        return nacionalidad;
    }

    void estableceNombre(String nombre) {
        this.nombre = nombre;
    }

    void estableceApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    void estableceNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        String resultado=" ";
        
        if (!nombre.equals("") && nombre!=null)
            resultado+="El nombre del autor es: \n"+nombre;
        
        if (!apellidos.equals("") && apellidos!=null)
            resultado+="\nEl apellido es: \n"+apellidos;
        if (nacionalidad!=null)
            resultado+="Su nacionalidad es: \n"+nacionalidad;
        
        
         
        
        return resultado;
    }
    
}
