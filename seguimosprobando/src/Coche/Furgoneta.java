
package Coche;


public class Furgoneta extends Coche {
    
    private int capacidadCarga;
    private int plazaExtra;
    
    Furgoneta (int plazaExtra, int capacidadCarga){
        super ();
        this.capacidadCarga=capacidadCarga;
        this.plazaExtra=plazaExtra;
        
    }
    String dimeDatosFurgoneta(){
        return "La capacidad de carga es: "+capacidadCarga+" y las plazas son:"
                +plazaExtra;
    }
    
}
