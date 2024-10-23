
package cine;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int aforo=72, sinAforo=0, sinDinero=0, edadNoApta=0, entradasVendidas=0;

        Pelicula pelicula1=new Pelicula("San Pedro", "Desde mi ventana", 120, 14);
        Sala sala1=new Sala(5, pelicula1);
        
        
        System.out.println("Cantidad de espectadores");
        int espectad=sc.nextInt();
                
        Espectador [] espectadores=new Espectador[espectad];
        
       
        
        for (int i=0; i<espectad; i ++){
            espectadores[i]=new Espectador("Espectador: "+ (i+1),(int)(Math.random()*83+5),(int)(Math.random()*7+4) );
                }
        
                if (aforo>0){
        for (int x=0; x<espectad; x++){
                if (sala1.precio<espectadores[x].dimeDinero() && pelicula1.dimeEdadMinima()<espectadores[x].dimeEdad()){
                    int numAleatorio=(int)(Math.random()*71);
                    
                    if(sala1.asiento[numAleatorio].disponible=true){
                       sala1.asiento[numAleatorio].disponible=false;
                    }
                                           
                    System.out.println(espectadores[x]+"\nSe le ha asignado el asiento número \""+ sala1.asiento[numAleatorio].getAsientoAsignado()+"\"\n");
                    aforo--;
                    entradasVendidas++;
                
                
                }if (sala1.precio>espectadores[x].dimeDinero()){
                     sinDinero++;
                }if (pelicula1.dimeEdadMinima()>espectadores[x].dimeEdad()){
                     edadNoApta++;
                }        
                }
                }else if(aforo<1){
                      System.out.println("Ya no quedan asientos disponibles");;
                }
                
                System.out.println("El estado de la sala 1 proyectara la siguiente pelicula"+pelicula1.toString()+"\nHay un aforo de "+aforo+" disponible, se han quedado sin "
                        + "entrar por que no tienen dinero: "+sinDinero+" personas\nPor no cumplir con la edad: "+edadNoApta+" personas\nEntradas vendidas "+entradasVendidas);
}
} 
