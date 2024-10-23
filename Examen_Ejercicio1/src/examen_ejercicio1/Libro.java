
package examen_ejercicio1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Libro {
       
    protected String titulo;
    protected int numPag;
    protected Date fechaEdicion;
    static String editorial="un Millón de Letras";
    Autor autor;

Libro (String titulo, int anne, int mes, int dia){
    this.titulo=titulo;
    GregorianCalendar fecha=new GregorianCalendar (anne, mes-1, dia);
    fechaEdicion=fecha.getTime();
    this.fechaEdicion=fechaEdicion;
    
       
    }
Libro (Autor autor, String titulo){
    this.autor=autor;
    this.titulo=titulo;
}
Libro (Autor autor, String titulo, int anne, int mes, int dia){
    
    this.autor=new Autor(autor.nombre, autor.apellidos);
    this.titulo=titulo;
    GregorianCalendar fecha=new GregorianCalendar (anne, mes-1, dia);
    fechaEdicion=fecha.getTime();
    this.fechaEdicion=fechaEdicion;
    
}
Libro (Autor autor, String titulo,int numPag,  int anne, int mes, int dia){
    this.autor=new Autor (autor.nombre, autor.apellidos, autor.nacionalidad);
    this.titulo=titulo;
    this.numPag=numPag;
    GregorianCalendar fecha=new GregorianCalendar (anne, mes-1, dia);
    this.fechaEdicion=fecha.getTime();
    this.fechaEdicion=fechaEdicion;
    
}

String dimeTitulo() {
        return titulo;
    }


int dimeNumPag() {
        return numPag;
    }

Date dimeFechaEdicion() {
        return fechaEdicion;
    }

static String estableceEditorial(String nuevaEditorial) {
        return editorial=nuevaEditorial;
    }

void estableceTitulo(String titulo) {
        this.titulo = titulo;
    }


void estableceNumPag(int numPag) {
        this.numPag = numPag;
    }

void estableceFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public String toString() {
        String resultadoL=autor.toString()+"\nLa editorial es: \n"+editorial;
        
        if(titulo!=null)
          resultadoL+="\nEl ttulo del libro: \n"+titulo;
        
       if (numPag>0)
           resultadoL+="\nEl número de pagína del libro es: \n"+numPag;
       
       if (fechaEdicion!=null)
           resultadoL+= "\nLa fecha de edicíon del libro es: \n"+fechaEdicion;
       
        return resultadoL; 
    }

}