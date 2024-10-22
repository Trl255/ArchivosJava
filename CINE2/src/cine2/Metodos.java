
package cine2;




    


public class Metodos{
    
    public static final String nombres[] = {"Pedro", "José", "Carlos", "María", "Patricia",
        "Paula","Claudia", "Francisco","Petronila","Basti", "Kimberly","Fernando", "Laura", "Pepe", "Eufrasio"};
    
    
    public static int generarAleatorio(int min, int max){
        int num=0;
        num=(int)Math.floor(Math.random()*(min-(max+1))+(max+1));
        return num;
    }
    
    public static double generarAleatorio(double min, double max){
        double num=(Math.random()*(min-(max+1))+(max+1));
        return num;
    
        }
}
