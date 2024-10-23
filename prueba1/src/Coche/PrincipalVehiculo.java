
package Coche;

public class PrincipalVehiculo {
    public static void main(String[] args) {
        Coche []misCoches= new Coche[3];
        
        
        Coche miCoche1=new Coche();
        miCoche1.estableceColor("Rojo");
        
        Furgoneta miFurgoneta1=new Furgoneta(7,580);
        miFurgoneta1.estableceColor("Azul");
        miFurgoneta1.configuraAsientos("Si");
        miFurgoneta1.configuraClimatizador("Si");
        
        System.out.println(miFurgoneta1.dimeDatosGenerales()+"\n"+miCoche1.dimeColor()+"\n"+
                miCoche1.dimeDatosGenerales()+"\n"+miFurgoneta1.dimeDatosFurgoneta());
        
        
        
        
        
        
        
        
    }
    
}
