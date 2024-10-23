package cliente_ficheros;


import java.io.Serializable;

/*
package cliente_ficheros;

/**
 *
 * @author josea
 */
public class Cliente implements Serializable {
  
    private static final long seriaVersionUISD= -1L;
    
    private String DNI;
    private String nombre;
    private String telefono;
    
    Cliente (String DNI, String nombre, String telefono){
        
        this.DNI=DNI;
        this.nombre=nombre;
        this.telefono=telefono;
        
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static long getSeriaVersionUISD() {
        return seriaVersionUISD;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString() {
        return  "El DNI =" + DNI + "\nDel cliente" + nombre + "\nSu número de telefono es:" + telefono + '}';
    }
    
        
  
    
}
