/*Crearemos una clase, de nombre Examen, para guardar la siguiente información de un examen: 
el nombre de la asignatura, el aula, la fecha y la hora. 
Para guardar la fecha y la hora, hay que realizar dos clases, Fecha y Hora.
La clases Fecha guarda día, mes y año. Todos los valores se reciben en el constructor por parámetro.
Además, esta clase debe tener un método que devuelva cada uno de los atributos, y un método toString() 
que que devuelva la información de la fecha en forma de String.
 */
package Ejercicio_Composicion;

public class Hora {

private int hora;
private int minutos;
private int segundos;
Fecha fecha;
Examen asigna;

Hora (int hora){
    this.hora=hora;
}

Hora( int hora, int minutos, int segundos){
    this.hora=hora;
    this.minutos=minutos;
    this.segundos=segundos;
    
}
Hora (int hora, int minutos, int segundos, Fecha fecha){
    this(hora, minutos, segundos);
    this.fecha=fecha;
    
}

@Override
public String toString(){
    return fecha.dimeLaFecha()+" a las "+hora+" horas con  "+minutos+" minutos y "+segundos+" segundos";
}

    
}
