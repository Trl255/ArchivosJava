package Ferroviaria;

public class Maquinista extends Personas {
    
    public double sueldo;
    public String cargo;
    public Personas personas;
    
Maquinista (String nombre, String dni,double sueldo, String cargo){
    super(nombre, dni);
    this.sueldo=sueldo;
    this.cargo=cargo;
}
void cambiaSueldo(){
    this.sueldo=sueldo;
}
String dimeSueldo(){
    return "El sueldo es: "+sueldo;
}
void cambiaCargo(){
    this.cargo=cargo;
}
String dimeNombre(){
    return nombre;
}
    @Override
String dimeDatos(){
    return "El nombre: "+nombre+" con DNI: "+dni+ " tiene un cargo de: "+cargo+ " y un sueldo de: " +sueldo;
}
}
