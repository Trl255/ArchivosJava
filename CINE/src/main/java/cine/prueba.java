
package cine;

public class prueba {
    public static void main(String[] args) {
        Pelicula pelicula2=new Pelicula("San Lucas", "Desde mi ventana", 120, 14);
        Sala sala2=new Sala(5, pelicula2);
        int aforo=71;
    
        
        
        int c=0, f=0;    
    String fila="ABCDEFGHI";
    String [] asiento = new String[72];
         

    for (c=0; c<8;c++){
    for ( f=0; f<9; f++){
    String asientoAsignado=String.valueOf(c+1);
    asientoAsignado+=fila.charAt(f);
    asiento [c+1]=new String (asientoAsignado);
    }
    for (int i=0; i<72; i++){
        System.out.println(asiento[i]);
    }
        /*for (int i=0; aforo>0; i ++){
           
           System.out.println("se le asigna el asiento: "+ sala2.asignaAsiento(aforo));
           
           aforo--;
           */
    }
    }
}
