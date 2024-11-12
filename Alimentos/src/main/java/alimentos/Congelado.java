package alimentos;

public class Congelado extends Alimentos {
    
    double temperatura;
    
    Congelado(String lote, String pais, double temperatura){
        super(lote, pais);
        this.temperatura=temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }
}
