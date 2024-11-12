
package Repaso;

public class Cliente {

String nombre;
String apellidos;
String dni;

Cliente (){
    
}
Cliente (String nombre, String apellido, String dni){
    
    this.nombre=nombre;
    this.apellidos=apellido;
    this.dni=dni;
}

String dameNombre(){
    return nombre;
}
String apellidos(){
    return apellidos;
}

String dameDni(){
    return dni;
}
String dameDatos(){
    return "El cliente:\n"+nombre+apellidos+"Con DNI:\n"+dni;
}
}
