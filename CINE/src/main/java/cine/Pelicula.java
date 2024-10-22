
package cine;

public class Pelicula {

private String director;
private String pelicula;
private int duracion;
private int edadMinima;


Pelicula (){
    
}
Pelicula ( String director, String pelicula, int duracion, int edadMinima){
    this.director=director;
    this.pelicula=pelicula;
    this.duracion=duracion;
    this.edadMinima=edadMinima;
}
 
    public int dimeEdadMinima() {
        return edadMinima;
    }

    @Override
    public String toString() {
       String resultado="";
       if (pelicula!=null)
           resultado+="\nEl título de la pelicula es: "+pelicula;
       if (director!=null)
           resultado+="\nEl director de la pelicula es: "+director;
       if (duracion>0)
           resultado+="\nLa duración de la pelicula es: "+duracion;
       if (edadMinima>0)
           resultado+="\nLa edad mínima para ver esta pelicula es: "+edadMinima;
       
        return resultado;
    }

       


    
}
