package aula;

public class Alumno extends Persona{
    
        private int nota;
        
    public Alumno(){
        super();
        
        nota=MetodosSueltos.generaNumeroAleatorio(0,10);
        
        super.setEdad(MetodosSueltos.generaNumeroAleatorio(12,15));
   }
    int getNota() {
        return nota;
    }
    void setNota(int nota) {
        this.nota = nota;
    }
    //* Indica si el alumno esta disponible (50%)
     
    @Override
    public void disponibilidad() {
        
        int prob=MetodosSueltos.generaNumeroAleatorio(0, 100);
        
        if(prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }
    
    public String toString(){
        
        return "Nombre: "+super.getNombre()+" ,sexo: "+super.getSexo()+" , nota: "+nota;
       
    }
    
    
    
    
}
