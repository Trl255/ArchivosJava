 
package password;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);


        System.out.println("Introduce un tamaño para el array");
        int tamanio=sc.nextInt();
  
        System.out.println("Introduce la longitud del password");
        int longitud=sc.nextInt();
  
        //Creamos los arrays
        Password listaPassword[]=new Password[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
  
        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
        }
    }
  
}