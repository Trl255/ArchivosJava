package cine2;

public class Pelicula {

    private String titulo;
    private int duracion;
    private int edadMinima;
    private String direccion;

    public Pelicula(String titulo, int duracion, int edadMinima, String direccion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
        @Override
    public String toString() {
        return "'" + titulo + "' del director " + direccion + ", con una duracion de " + duracion + " minutos y la edad minima es de " + edadMinima + " años";
    }

    
}
