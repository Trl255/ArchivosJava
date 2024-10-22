package tema_6;
import java.util.Scanner;
public class prueba_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        sc.useDelimiter("\n");
        
        String sNumero1="50";
        int numeroN1=Integer.parseInt(sNumero1);
        numeroN1+=50;
        System.out.println(""+numeroN1);
        
        
           
            
            
            System.out.println("Introduzca una frase");
            String palabra1=sc.next();
            
            
            int pos=palabra1.indexOf('a');
            
            System.out.println("La posición de la primera \"a\" es: "+pos);
            
            pos=palabra1.indexOf('a', pos+1);
            
            System.out.println("La  posición de la segunda \"a\" es: "+pos);
            /*
            
            
            palabra1=palabra1.replace('a','e');
            palabra1=palabra1.replace('i', 'o');
            
            System.out.println(palabra1);
            
            
            
            
            String palabras[]=palabra1.split(" ");
            
            for (int i=0; i<palabras.length; i++){
            System.out.println(palabras[i]);
            }
            
            
            System.out.println("Introduzca la palabra 2");
            String palabra2=sc.nextLine();
            
            iguales (palabra1, palabra2);*/
            
            //extraer (palabra1);
            
            
        
        
    }public static String iguales(String palabr1, String palabr2){
            if (palabr1.equals(palabr2)){
                System.out.println("Las dos palabras introducidas son iguales");
            }else
                System.out.println("Las palabra \n"+palabr1+"\n es diferente a la palabra\n " +palabr2);
        return null;
    
    
    }public static String extraer(String palabr1){
        String subcadena=palabr1.substring(3, 5);
            System.out.println("La letra de la cuarta posición es:\n "+subcadena);
        return null;
    }
    
    
}
