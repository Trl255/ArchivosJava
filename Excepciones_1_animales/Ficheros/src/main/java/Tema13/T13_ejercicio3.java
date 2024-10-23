/*Ejercicio3. Realizar un programa que registra la evolución temporal de la temperatura en una ciudad.
La aplicación mostrará un menú que permitirá añadir nuevos registros de temperatura y mostrar el
listado de todos los registros guardados. En los registros se guardará la Fecha y hora de y la temperatura
en grados centígrados. Toda la información se leerá desde el teclado.
*/
package Tema13;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class T13_ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp; String ciudad; int anne, mes, dia;
        
        
        try{
        System.out.println("Introduzca la temperatura");
        temp=sc.nextDouble();
        
        System.out.println("Introduzca la ciudad");
        ciudad=sc.next();
        
        System.out.println("Introduzca el año");
        anne=sc.nextInt();
        
        System.out.println("Introduzca el mes");
        mes=sc.nextInt();
        
        System.out.println("Introduzca el día");
        dia=sc.nextInt();
        
        Temperatura regis1= new Temperatura(temp, ciudad, anne, mes, dia);
        System.out.println(regis1.toString());
        
        }catch( Exception e){
            System.out.println("Error al introducir los datos "+e.getMessage());
        }
        
        
        
        
        
        
        
        
        
        
        
    }

    
}

class Temperatura implements Serializable{
        double temperatura;
        public Date fechaRegistro;
        String ciudad;
    
    
    Temperatura(double temperatura, String ciudad,  int anne, int mes, int dia){
        
        this.temperatura=temperatura;
        this.ciudad=ciudad;
        GregorianCalendar fecha=new GregorianCalendar(anne,mes-1, dia);
        fechaRegistro=fecha.getTime();
}    

    @Override
    public String toString() {
        return "Las condiciones actuales son:\n" + "Temperatura=" + temperatura + "\nFechaRegistro=" + fechaRegistro + "\nCiudad=" + ciudad;
    }
    
}
