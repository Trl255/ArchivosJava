
package Ferroviaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class PrincipalFerroviaria {
    public static void main(String[] args) {
              Scanner sc=new Scanner (System.in);
        
        Jefes jefe1=new Jefes ("Patricia", "26309012V", 1980, 07 ,25); 
        Personas per1=new Personas ("Mario", "21574878E");
        Mecanicos mecanico1=new Mecanicos("Pedro Martinez", "42354868D", 97615778, "Automatismo");
        Mecanicos mecanico2=new Mecanicos ("Manuel Arge", "45789796V", 97615384, "Electricidad");
        Maquinista maquinista1=new Maquinista("Claudio Arce", "7846841631X", 120000,"Cambiador");
        /*
        Vagones vagon1= new Vagones (10000);
        vagon1.modificaCargaMax(10100);
        Vagones vagon2= new Vagones (20200);
        Vagones vagon3= new Vagones (30300);
        Vagones vagon4= new Vagones (40400);
        Vagones vagon5= new Vagones (50500);     */
        Locomotoras locomotora1=new Locomotoras ("1234566W", 10000, mecanico1, 2000,12,01 );
        
        Trenes tren100=new Trenes(locomotora1, maquinista1);
        System.out.println(jefe1+"\n"+maquinista1);
        System.out.println("cuantos vagones desea agregar");
       int x =sc.nextInt();
        tren100.agregarVagones(x);
        
        
        
        
        
        
        
        
                
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        System.out.println("Cuantos vagones tiene el tren");
        int cantidadVagon=sc.nextInt();
        Vagones[]trenVagones1=new Vagones[cantidadVagon];
        
        for (int i=0; i<trenVagones1.length; i++){
            System.out.println("Cuanto es la capacidad máxima del vagon "+(i+1));
            int capacidad=sc.nextInt();
            trenVagones1[i]=new Vagones(capacidad);
        }
        Trenes tren3=new Trenes(locomotora1, maquinista1, trenVagones1);
        
        System.out.println("Tren3: "+tren3.dimeDatosTren()+" tiene los siguientes vagones: ");
        tren3.dimDatosVagones(trenVagones1);
        
        
        System.out.println(vagon1.dimeDatos()+ vagon2.dimeDatos()+ vagon3.dimeDatos()+vagon4.dimeDatos()+vagon5.dimeDatos());
        
        System.out.println(jefe1.dimeDatos()+"\n"+per1.dimeDatos()+"\n"+mecanico1.dimeDatos()+"\n"+mecanico2.dimeDatos()+"\n"+maquinista1.dimeDatos());
        System.out.println("----------------------------------------");
        System.out.println(vagon5.dimeDatos()+"\n"+vagon3.dimeDatos()+"\n"+vagon4.dimeDatos()+"\n"+vagon1.dimeDatos()+"\n"+vagon2.dimeDatos());
        System.out.println("----------------------------------------");
        System.out.println(locomotora1.dimeDatos());
        System.out.println(jefe1.dimeDatos()+"\n"+per1.dimeDatos());
        System.out.println(vagon1.dimeDatos());
        System.out.println("-------------------");
        
        
        
        vagon1.modificaCargaMax(105000);
        vagon1.modificatipoMercancia("Líquidos");
        
        System.out.println(vagon1.dimeDatos());*/
        
    }
    
}
