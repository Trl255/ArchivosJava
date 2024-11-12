
package alimentos;

import java.time.LocalDate;

public class Alimentos {

String lote;
LocalDate fechaEnvasado;
LocalDate fechaCaducidad;
String pais;

Alimentos (String lote, LocalDate fechaEnvasado, LocalDate fechaCaducidad, String pais){
    this.lote=lote;
    this.fechaEnvasado=fechaEnvasado;
    this.fechaCaducidad=fechaCaducidad;
    this.pais=pais;
    
}Alimentos (String lote, String pais){
    this.lote=lote;
    this.pais=pais;
    
}

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLote() {
        return lote;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public String getPais() {
        return pais;
    }

    
}
