
package Repaso;

public class VehiculoAlquilado {
Vehiculo vehiculo;
Cliente cliente;
int dia, mes, anne, diasAlquiler;

VehiculoAlquilado(){
    
}
VehiculoAlquilado (Vehiculo vehiculos, Cliente clientes){
    vehiculo=new Vehiculo(vehiculos.matricula, vehiculos.tarifa);
    cliente=new Cliente(clientes.nombre, clientes.apellidos, clientes.dni);
}
VehiculoAlquilado (String nombre, String apellidos, String dni, String matricula, double tarifa){
    cliente=new Cliente(cliente.nombre, cliente.apellidos, cliente.dni);
    vehiculo=new Vehiculo(vehiculo.matricula, vehiculo.tarifa);
    /*vehiculo= new Vehiculo(matricula, tarifa);
    cliente=new Cliente(nombre, apellidos, dni);*/
}
        

    public Vehiculo dameVehiculo() {
        return vehiculo;
    }

    public Cliente dameCliente() {
        Cliente nuevo=new Cliente();
        nuevo.apellidos=cliente.apellidos;
        nuevo.nombre=cliente.nombre;
        nuevo.dni=cliente.dni;
        return nuevo;
    }

    public int dameDia() {
        return dia;
    }

    public int dameMes() {
        return mes;
    }

    public int dameAnne() {
        return anne;
    }

    public int dameDiasAlquiler() {
        return diasAlquiler;
    }
       
    String mostrarDatos (){
        String resultado="";
        if (!cliente.equals("")&&cliente!=null)
        resultado+="Los datos del cliente son\n"+cliente.dameDatos();
        if (!vehiculo.equals("")&& vehiculo!=null)
            resultado+="Y los datos del vehiculos son "+vehiculo.dameMarca();
        return resultado;
    }    
}
