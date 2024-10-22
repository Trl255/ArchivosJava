
package cine;

public class Sala  {
    
    Asientos [] asiento;
    int precio;
    Pelicula pelicula;
    
    String fila="ABCDEFGHI";
    
Sala (int precio, Pelicula pelicula){
    this.pelicula=pelicula;
    this.precio=precio;
    asiento= new Asientos[72];
    creaAsientos();
    
    
    
    }private void creaAsientos(){
        
        int c=0, f=0, i=0;        
        String resultado="";
    
    for (c=0; c<8;c++){
    for (f=0; f<9; f++){
        
        asiento [i]=new Asientos();
        //resultado=String.valueOf(c+1);
        //resultado+=fila.charAt(f);
        asiento[i].estableceAsientoAsignado(String.valueOf(c+1)+fila.charAt(f));
        asiento[i].estableceDisponible(true);
        
        i++;
    }
    }
        
}

}