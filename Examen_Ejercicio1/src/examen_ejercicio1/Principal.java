
package examen_ejercicio1;


public class Principal {
    public static void main(String[] args) {
    Autor autor1=new Autor("Pedro", "Ramirez");
    Autor autor2=new Autor("Marcos", "Del Caso", "Italiana");
    
    Libro libro1=new Libro(autor1, "Embarque a los desconocido", 2000,05,02);
    
    Libro libro2=new Libro(autor2, "Salida al amanecer", 2005, 12, 14);
    
    Libro libro3=new Libro("Cuando amanezca", 2010, 05, 01);
    
        System.out.println(libro1);
        Libro.estableceEditorial("Mil historias");
        
        System.out.println(libro1.toString()+libro2.toString());
    
    
    
    
    }
    
}
