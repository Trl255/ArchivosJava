/*Ejercicio4. Escribir un programa que lea por teclado una hora cualquier y un número n que representa
una cantidad de segundos. El programa mostrará la hora introducida y las n siguientes, que se
diferencian en un segundo. Para ello hemos de diseñas previamente la clase Hora que dispone de los
atributos hora, minuto y segundo. Los valores de los atributos se controlarán mediante métodos
set/get.
 */
package Tema_7;

import java.time.LocalDateTime;

public class Ejercicio_4 {
    
private   int hora;
private   int minutos;
private   int segundos;
   

Ejercicio_4 (int hora, int minutos, int segundos){
    this.hora=hora;
    this.minutos=minutos;
    this.segundos=segundos;

   
}public void pedirHora(int hora, int minutos, int segundos, int n){
       hora=0;
       segundos=0;
       minutos=0;

       segundos+=n;
       
       hora=hora>23? hora:23;
       minutos=minutos>59? minutos:59;
       segundos=segundos>59? segundos:59;
       
       if (segundos>60||minutos>60 ){
           minutos++;
           hora++;
       }
       hora=hora;
       minutos=minutos;
       segundos=segundos;
       
            System.out.println(hora+minutos+segundos);
}



    }
    

