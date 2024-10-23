
package Tema_8.bombillas;
import java.util.Scanner;
public class Bombilla_principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String encenderBombilla="No";
        String apagarGeneral="";
        String apagarBombilla="";
        int cant=0;
        
        
        Bombilla_S bombilla1=new Bombilla_S();
        Bombilla_S bombilla2=new Bombilla_S();
        Bombilla_S bombilla3=new Bombilla_S();
        
        System.out.println("Actualmente los estados son los siguientes:\n1-INTERRUPTOR GENERAL: ENCENDIDO\n2-BOMBILLAS: APAGADAS ");
        
        System.out.println("¿Desea Apagar el interruptor general?");
        apagarGeneral=sc.nextLine();
while (apagarGeneral.equalsIgnoreCase("No")){
       if (encenderBombilla.equalsIgnoreCase("Si")){
           System.out.println("¿Desea apagar alguna bombilla?");
           apagarBombilla=sc.next();
       }if (apagarBombilla.equalsIgnoreCase("SI")) {
           System.out.println("¿Cuantas bombillas desea apagar?");
           cant=sc.nextInt();
           if (cant<2){
                System.out.println(bombilla1.setApagarBombilla(apagarBombilla));
                System.out.println(bombilla2.setApagarBombilla("NO"));
                System.out.println(bombilla3.setApagarBombilla("No"));
            }if (cant==2){
                System.out.println(bombilla1.setApagarBombilla("NO"));
                System.out.println(bombilla2.setApagarBombilla("NO"));
                System.out.println(bombilla3.setApagarBombilla(apagarBombilla));
             }
            if (cant==3){
                System.out.println(bombilla1.setApagarBombilla(apagarBombilla));
                System.out.println(bombilla2.setApagarBombilla(apagarBombilla));
                System.out.println(bombilla3.setApagarBombilla(apagarBombilla));
            }
            }
               
            
        System.out.println("Desea encender alguna bombilla\nSI\nNO");
        encenderBombilla=sc.next();
        
        if (encenderBombilla.equalsIgnoreCase("SI")){
            System.out.println("¿Cuantas bombillas quiere encender?");
            cant=sc.nextInt();
            if (cant<2){
                System.out.println(bombilla1.setEstadoBombilla(encenderBombilla));
                System.out.println(bombilla2.setEstadoBombilla("No"));
                System.out.println(bombilla3.setEstadoBombilla("No"));
            }if (cant==2){
                System.out.println(bombilla1.setEstadoBombilla(encenderBombilla));
                System.out.println(bombilla2.setEstadoBombilla(encenderBombilla));
                System.out.println(bombilla3.setEstadoBombilla("NO"));
             }
            if (cant==3){
                System.out.println(bombilla1.setEstadoBombilla(encenderBombilla));
                System.out.println(bombilla2.setEstadoBombilla(encenderBombilla));
                System.out.println(bombilla3.setEstadoBombilla(encenderBombilla));
            }}
            }System.out.println("Se ha apagago el interruptor general\nEstado de las bombillas"+bombilla1.setEstadoBombilla(apagarBombilla)+ bombilla2.setEstadoBombilla(apagarBombilla)+ bombilla3.setEstadoBombilla(apagarBombilla));
    }        
    }
        
          

