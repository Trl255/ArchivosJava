
package Empleado;

public class Principal_personas {
    public static void main(String[] args) {
        
        Persona [] lasPersonas=new Persona[2];
        
        lasPersonas[0]=new Empleado2("Luis Conde", 5000, 2009, 02, 25);
        lasPersonas[1]=new Alumno("Ana López", "Biológicas");
        
    for (Persona e: lasPersonas){
        System.out.println(e.dameNombre()+", "+e.dameDescripcion());
    }    
        
        
        
    }
    
}
