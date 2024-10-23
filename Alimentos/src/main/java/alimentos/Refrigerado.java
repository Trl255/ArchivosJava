
package alimentos;

import java.time.LocalDate;

public class Refrigerado extends Alimentos {

String organismo;
double temperatura;

Refrigerado (String lote, LocalDate fechaEnvasado, LocalDate fechaCaducidad, String pais, String organismo, double temperatura){
    super(lote, fechaEnvasado, fechaCaducidad, pais);
    this.organismo=organismo;
    this.temperatura=temperatura;

}Refrigerado (String lote,String pais, String organismo, double temperatura){
    super(lote,pais);
    this.organismo=organismo;
    this.temperatura=temperatura;

}
    public String getOrganismo() {
        return organismo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setOrganismo(String organismo) {
        this.organismo = organismo;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
public String toString(){
    return super.toString()+" El oraganismo es: "+organismo;
}
    
}
