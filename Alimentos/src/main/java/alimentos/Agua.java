
package alimentos;

public class Agua extends Congelado {
    
    double salinidad;
    
    
    Agua (String lote, String pais, double temperatura, double salinidad){
        super(lote, pais, temperatura);
        this.salinidad=salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    public double getSalinidad() {
        return salinidad;
    }
            
    public String toString(){
        return "El lote es "+lote+" del país: "+pais+" tiene una temperatura de: "+temperatura+" y una salinidad de: "+salinidad;
    }
    
}
