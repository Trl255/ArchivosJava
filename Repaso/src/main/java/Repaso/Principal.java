
package Repaso;

public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo1=new Vehiculo();
        Vehiculo vehiculo2=new Vehiculo("1587-POL",50);        
        Vehiculo vehiculo3=new Vehiculo(50,"Ford");
        Cliente cliente1=new  Cliente();
        Cliente cliente2=new Cliente("Maite", " García", "147859682T");
        //tema 7, 8, 9
        VehiculoAlquilado vA1=new VehiculoAlquilado(vehiculo1, cliente2);
        
        
        Cliente cliente3=vA1.dameCliente();
        System.out.println(cliente3.dameDatos());
        cliente3.apellidos="Perez";
        System.out.println(cliente3.dameDatos());
        System.out.println(cliente3.apellidos);
        
        
    }
    
    
}
