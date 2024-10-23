
package Ferroviaria;
import java.util.Date;
import java.util.GregorianCalendar;

public class Locomotoras {
    private String matricula;
    private int potenciaMotor;
    private Date fechaFabricacion;
    Mecanicos mecanico;
    
    Locomotoras (String matricula, int potenciaMotor, Mecanicos mecanico, int anne, int mes, int dia ){
        this.matricula=matricula;
        this.potenciaMotor=potenciaMotor;
        GregorianCalendar fecha=new GregorianCalendar (anne, mes-1, dia);
        fechaFabricacion=fecha.getTime();
        this.mecanico=mecanico;
    }
    
    void estableceDatos(){
        this.matricula=matricula;
        this.potenciaMotor=potenciaMotor;
        this.fechaFabricacion=fechaFabricacion;
        this.mecanico=mecanico;
    } 
    void estableceFechaFabricacion(){
        this.fechaFabricacion=fechaFabricacion;
    }
    String dimeMatricula(){
        return matricula;
    }
    Date dimeFechaFabricacion(){
        return fechaFabricacion;
    }
    int dimePontenciaMotor(){
        return potenciaMotor;
    }
    
    
    String dimeDatos(){
        return "La locomotora con MATRICULA: "+matricula+" POTENCIA: "+potenciaMotor+" tiene una fecha de "
                + "fabricación del :"+fechaFabricacion+" y el mécanico  "+mecanico.dimeNombre();
    }
    
}
