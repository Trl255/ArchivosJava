
package cine;

public class Espectador {

    private String nombre;
    private int edad;
    private int dinero;
    protected Asientos asiento;

    Espectador (String nombre, int edad, int dinero){
        this.nombre=nombre;
        this.edad=edad;
        this.dinero=dinero;
        
    }
    Espectador (String nombre, int edad, int dinero, Asientos asiento ){
        this(nombre, edad, dinero);
        this.asiento=asiento;
    }
    Espectador (){
        
    }
    public String dimeNombre() {
        return nombre;
    }

    public int dimeEdad() {
        return edad;
    }

    public double dimeDinero() {
        return dinero;
    }

    void estableceNombre(String nombre) {
        this.nombre = nombre;
    }

    void estableceEdad(int edad) {
        this.edad = edad;
    }

    void estableceDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
    
    public String toString (){
        return "El nombre del espectador es:\n"+this.nombre+"\nSu edad es: "+edad+"\nCuenta con un total de: "+dinero+"€";
    }
}
