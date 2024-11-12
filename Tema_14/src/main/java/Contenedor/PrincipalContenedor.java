
package Contenedor;


public class PrincipalContenedor {
    public static void main(String[] args) {
        
        Contenedor <String> frase= new Contenedor <String>();
        Contenedor <String> frase2= new Contenedor <String>();
        
        frase.guardar("Oye como va");
        frase2.guardar("Mi ritmo, bueno");
        frase.guardar(frase2.extraer());
        
        System.out.println(frase.extraer());
        
        
    }
    
}
