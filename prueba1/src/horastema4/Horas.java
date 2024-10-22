/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horastema4;

/**
 *
 * @author profesor
 */
public class Horas {
    private int horas;
    private int minutos;
    private int segundos;
    
    Horas(int horas, int minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
    }
    Horas(){
        
    }
    void setHoras(int horas){
        if(horas<0 || horas >23)
            System.out.println("Las horas tienen que ser entre 0 y 23");
        else
        this.horas=horas;
    }
    int getHoras(){
        return horas;
    }

     int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

     int getSegundos() {
        return segundos;
    }
    void incrementarSegundos(int segun){
       segundos+=segun;
       while(segundos>59){
           minutos++;
           segundos-=60;
       }
        while(minutos>59){
           horas++;
           if(horas==24)horas=0;
           minutos-=60;
       }
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundos);
               
    
}
    
    
    
    
    
}
