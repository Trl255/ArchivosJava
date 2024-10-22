/*Crearemos una clase, de nombre Examen, para guardar la siguiente información de un examen: 
el nombre de la asignatura, el aula, la fecha y la hora. 
Para guardar la fecha y la hora, hay que realizar dos clases, Fecha y Hora.
La clases Fecha guarda día, mes y año. Todos los valores se reciben en el constructor por parámetro.
Además, esta clase debe tener un método que devuelva cada uno de los atributos, y un método toString() 
que que devuelva la información de la fecha en forma de String.
 */
package Ejercicio_Composicion;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Examen {
     public static void main(String[] args) {
        int dia=0, mes=0, anne=0;
    Scanner sc=new Scanner(System.in);
          LocalDate fecha11 = LocalDate.parse("2021-08-12");
        DateTimeFormatter formatoespaña= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha2=LocalDate.parse("12-08-2022",formatoespaña);
        System.out.println(fecha2.format(formatoespaña));
        
        LocalDate fecha20=LocalDate.parse("2021-02-01");
        DateTimeFormatter formatoN= DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(fecha20.format(formatoN));    
        
        
        
        
        System.out.println("De qué asignatura realizará el examén");
        String asignatura=sc.nextLine();
        System.out.println("En que aula se realizará");
        String aula=sc.nextLine();
        
        
        System.out.println("Introduzca el día que será el examén");
        dia=sc.nextInt();
    while (dia<1 || dia >31){
            System.out.println("El día debe estar comprendido entre 0 y 31, por favor introduzca un número de día válido");
            dia=sc.nextInt();
        }
        
        System.out.println("Introduzca el mes que sera el exámen");
        mes=sc.nextInt();
    while (mes<1 || mes>12){
        System.out.println("El mes corresponde entre el 1 y el 12, por favor introduzca un número de mes válido");    
        mes=sc.nextInt();
    }    
    System.out.println("Introduzca el año que sera el exámen");
        anne=sc.nextInt();
        
        
        
        System.out.println("Introduzca la hora que sera el exámen");
        int hora=sc.nextInt();
    while (hora>24 || hora<0){
        System.out.println("Hora no valida, por favor introduzca una hora comprendida entre 0 y 24");
        hora=sc.nextInt();
    }    
        System.out.println("Introduzca los minutos que sera el exámen");
        int minutos=sc.nextInt();
    while(minutos>60 || minutos<0){
        System.out.println("Intervalo de minutos no valido, por favor introduzca los minutos comprendidos entre 1 y 60");
    }    
        
        System.out.println("Introduzca los segundos que sera el exámen");
        int segundo=sc.nextInt();
    while (segundo>60 || segundo<0){
        System.out.println("Intervalo de segundos no valido, por favor introduzca los segundos comprendidos entre 1 y 60");
    }    
    
    Fecha fecha1=new Fecha (dia, mes, anne); 
    Hora hr1=new Hora(hora,minutos, segundo, fecha1);
    
        
    System.out.println(hr1.toString()+" de la asignatura "+asignatura+" se realizará el exámen en el aula "+aula );
        
    
}
}