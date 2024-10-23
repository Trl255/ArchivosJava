package cine2;

public class Cine {

    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;

    public Cine(int filas, int columnas, double precio, Pelicula pelicula) {

        asientos = new Asiento[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenarButacas();

    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    private void rellenarButacas() {
        int fila = asientos.length;

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                asientos[i][j] = new Asiento((char) ('A' + j), fila);

            }
            fila--;
        }
        
    }

    public boolean haySitio() {
        
        for (int i = 0; i < asientos.length ; i++) {
            for (int j = 0; j < asientos[0].length ; j++) {

                if (!asientos[i][j].ocupado()) {
                    return true;

                }
            }
        }
        return false;
    }

    public boolean haySitioButaca(int fila, char letra) {

        return getAsiento(fila, letra).ocupado();
    }
    
    
    public boolean sePuedeSentar(Espectador e){
        
        return e.tienedinero(precio)&& e.tieneEdad(pelicula.getEdadMinima());
    }
    
    
    public void sentar(int fila, char letra, Espectador e){
     
        getAsiento(fila, letra).setEspectador(e);
        
    }
    public Asiento getAsiento(int fila, char letra){
        return asientos[asientos.length-fila-1][letra -'A'];
        
    }
    public int getFilas(){
        return asientos.length;
    }
    
    public int getColumnas(){
        return asientos[0].length;
    }
    
    public void mostrar(){
        System.out.println("Información cine");
        System.out.println("Pelicula reproducida: " + pelicula);
        System.out.println("Precio entrada: " + precio);
        System.out.println("");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                System.out.println(asientos[i][j]);
            }
            System.out.println("");
        }
    }

}
