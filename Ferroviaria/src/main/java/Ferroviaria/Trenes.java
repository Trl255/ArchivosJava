
package Ferroviaria;
import java.util.Scanner;
public class Trenes{
    
    private Locomotoras locomotora;
    private Maquinista maquinista;
    private Vagones vagon[];
    private int id;
    private int idPx=100;
    
    
    Trenes (Locomotoras locomotora, Maquinista maquinista){
            this.locomotora=locomotora;
            this.maquinista=maquinista;
            this.vagon=vagon;
            this.id=idPx;
            this.idPx++;
     }
    Trenes (Locomotoras locomotora, Maquinista maquinista, Vagones []vagon){
            this.locomotora=locomotora;
            this.maquinista=maquinista;
            this.vagon=vagon;
            this.id=idPx;
            this.idPx++;
    }
    String dimeDatosTren(){
        return "El tren pertenece a la locomotora con matricula: "+locomotora.dimeMatricula()+" tiene asignado el maquinista "+maquinista.dimeDatos()+"\n"
                +"Esta locomotora tiene una potencia motor de: "+locomotora.dimePontenciaMotor()+" y fecha de fabricación: "+locomotora.dimeFechaFabricacion();
     }
    
     public void agregarVagones(int cant){
      Vagones []VagonesT = null;
        
        Scanner sc=new Scanner (System.in);
        /*for (int i=0; i<cant; i++){
        System.out.println("¿Cuanto es el valor máximo del vagón?"+(i+1));
        int x=sc.nextInt();*/
        
        for (int z=0; z<cant; z++){
            System.out.println("Cuanto es la capacidad del "+z+1+" vagón");
            int capacidad=sc.nextInt();
        VagonesT [z]=new Vagones(capacidad);    
            
        }
       
        }
        
    
    
    
    void dimDatosVagones(Vagones vagon[]){
            
   /*for (int i=0; i<vagon.length; i++){
             System.out.println(vagon[i].dimeDatos());*/
             for (Vagones e: vagon){
             System.out.println(e.dimeDatos());
    }
    }
    
}    