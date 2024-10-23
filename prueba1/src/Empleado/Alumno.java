
package Empleado;

public class Alumno extends Persona{
    
    private String carrera;
    
    public Alumno (String nom, String carrera){
        super(nom);
        this.carrera=carrera;
         
    }
    
    public String dameDescripcion(){
        return "Este alumno está estudiando la carrera de: "+carrera;
    }
    
    
}
