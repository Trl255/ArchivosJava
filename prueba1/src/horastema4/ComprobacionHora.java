
package horastema4;

import java.util.Scanner;

public class ComprobacionHora {

private int hora;
private int minutos;
private int segundos;
boolean comprobacion;


ComprobacionHora(){
    
}
boolean comprobarHora(int hora){
    Scanner sc=new Scanner (System.in);
    
    while(hora>23||hora<0){
        System.out.println("Introduzca una hora entre 0 y 23");
        hora=sc.nextInt();
    }
    return comprobacion;
}
boolean comprobacionMin(int minuto){
    Scanner sc=new Scanner (System.in);
    
    while (minuto>60||minuto<=0){
    System.out.println("Introducir un valor entre 0 y 60");
    this.minutos=sc.nextInt();
    }
    return true;
}









    
}
