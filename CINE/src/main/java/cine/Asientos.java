
package cine;

public class Asientos {

    private String asientoAsignado;
    boolean disponible=true;

    
    Asientos() {
        
    }
    void estableceAsientoAsignado(String asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }

    public void estableceDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getAsientoAsignado() {
        return asientoAsignado;
    }
    
    
    }
