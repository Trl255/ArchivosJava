
package alimentos;

public class Nitrogeno extends Agua {
    
    String tipoCongelacion;
    int tiempoE;
    
    Nitrogeno(String lote, String pais, double temperatura, double salinidad, String tipoCongelacion, int tiempoE){
        super (lote, pais, temperatura, salinidad);
        this.tipoCongelacion=tipoCongelacion;
        this.tiempoE=tiempoE;
    }
    void setTipoCongelacion(String tipoCongelacion){
        this.tipoCongelacion=tipoCongelacion;
    }
    String getTipoCongelacion(){
        return tipoCongelacion;
    }
    void setTiempoE(int tiempoE){
        this.tiempoE=tiempoE;
    }
    
    int getTiempoE(){
        return tiempoE;
    }
    @Override
    public String toString(){
        return "El lote es: "+lote+" el país es: "+pais+" la temperatura es: "+temperatura+" la fecha es:"+ fechaCaducidad;
        
    }
}
