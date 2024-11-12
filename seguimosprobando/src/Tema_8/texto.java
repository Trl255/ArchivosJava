/*Ejercicio5. Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
 La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor.
 Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la longitud
máxima, es decir, exista espacio disponible.
 Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y cuando se
rebase el tamaño máximo establecido.
 Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
 Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la fecha y hora
de la última modificación efectuada.
 Deberá existir un método que muestre la información que gestiona cada texto.*/
package Tema_8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class texto {

private String cadena;
private int longitud;
LocalDate fechaModificacion;
LocalDateTime horaModificacion;


texto (String cadena,int longitud ){
    this.cadena=cadena;
    this.longitud=longitud;
    this.fechaModificacion=LocalDate.now();
    this.horaModificacion=LocalDateTime.now();
        
    
}
texto (int longitud){
    this.longitud=longitud;
}
void caracterFinal(char c){
    if (longitud<cadena.length()){
        System.out.println("No se puede añadir el caracter porque no cabe en la longitud asignada");
    }else{
        cadena+=c;
       
    }
}
void caracterInicio(char c){
    if (longitud>cadena.length()){
        cadena=c+cadena;
        }else        
        
        System.out.println("No se puede añadir el caracter porque no cabe en la longitud asignada");
    
    
}
void comprobacionVocales(int longitud){
    
    int contadorVocales=0;
    int contY=0,contM=0, contA=0;
     String vocalesMy="A,E,I,O,U";
     String vocalesMin="a,e,i,o,u,";
     String vocalesAce="Á,É,Í,Ó,Ú,á,é,í,ó,ú";
    if (cadena.length()< longitud){
    for (int i=0 ; i<cadena.length(); i++){
        if (vocalesMy.indexOf(cadena.charAt(i))>-1){
            contY++;
        }}
    for (int x=0; x<cadena.length(); x++){
        if (vocalesMin.indexOf(cadena.charAt(x))>-1){
            contM++;
        }}
    for (int y=0; y<cadena.length(); y++){
        if (vocalesAce.indexOf(cadena.charAt(y))>-1){
            contA++;    
    }}
    System.out.println("Se han encontrado "+contY+" vocales mayúsculas, "+contM+" vocales minúsculas y "+contA+" vocales con acento en la cadena de texto introducida");
    }else
        System.out.println("Introduzca una cadena de texto inferior a la longitud "+longitud+" Introducida");
 }
void mostrarInformacion(){
    System.out.println("La palabra con el texto agregado al inicio es:"+cadena);
     System.out.println("La palabra con el texto agregado al final es: "+cadena);
     System.out.println("La fecha de modificacion es: "+horaModificacion);
}
}