package Arrays_funciones;
/*Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.*/


public class practica_4 {
    public static void main(String[] args) {
        int []num=new int [100];
        for (int i=0; i<100; i++){
            num[i]=(int) (Math.random()*99+1);
            System.out.println(""+num[i]);
        }
        int  sum=suma(num);
        double  div=division(num, sum);
              



    }public static int suma( int []numeros){
        int suma=0;
        for (int i=0; i<numeros.length; i++){
            suma+=numeros[i];
        } System.out.println("El resultado de la suma es: "+suma);
            
        return suma;   
        
}public static double division(int []numeros, int suma){
    double div=0;
    int  contador=0;
    for (int i=0; i<numeros.length; i++){
        contador++;
    
    } div=suma/contador;
            System.out.println("El resultado de la división es: "+div);
       return div;
}
    
        }