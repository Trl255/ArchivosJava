/*Crearemos una clase, de nombre Examen, para guardar la siguiente información de un examen: 
el nombre de la asignatura, el aula, la fecha y la hora. 
Para guardar la fecha y la hora, hay que realizar dos clases, Fecha y Hora.
La clases Fecha guarda día, mes y año. Todos los valores se reciben en el constructor por parámetro.
Además, esta clase debe tener un método que devuelva cada uno de los atributos, y un método toString() 
que que devuelva la información de la fecha en forma de String.
 */
package Ejercicio_Composicion;

public class Fecha {
     private int dia;
     private int mes;
     private int anne;
     
     Fecha (int dia, int mes, int anne){
         this.dia=dia;
         this.mes=mes;
         this.anne=anne;
     }
 String dimeLaFecha(){
     return "El día "+dia+" del mes "+ mes+" del año "+anne;
 }
     
     
}

