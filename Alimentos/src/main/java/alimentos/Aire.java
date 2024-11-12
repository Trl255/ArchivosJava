
package alimentos;

public class Aire extends Congelado{
    double vapor;
    double dioxido;
    double nitrogeno;
    double oxigeno;
    
    Aire (String lote, String pais, double temperatura){
        super(lote, pais, temperatura);
        
    }
    Aire (String lote, String pais, double temperatura,double vapor, double dioxido, 
              double nitrogeno, double oxigeno){
        super (lote, pais, temperatura);
        this.vapor=vapor;
        this.dioxido=dioxido;
        this.nitrogeno=nitrogeno;
        this.oxigeno=oxigeno;
        }    
    void setVapor(double vapor){
        this.vapor=vapor;
    }
    double getVapor(){
        return vapor;
    }
    void setDioxido(double dioxido){
        this.dioxido=dioxido;
    }            
    double getDioxido(double dioxido){
        return dioxido;
    }
    void set(double nitrogeno){
        this.nitrogeno=nitrogeno;
    }
    double getNitrogeno(){
        return nitrogeno;
    }
    void setOxigeno(double oxigeno){
        this.oxigeno=oxigeno;
    }
    double getOxigeno(){
        return oxigeno;
    }
    }
    
