<<<<<<< HEAD
=======

>>>>>>> fe773dc (Modificado al 23/10/2024)
package almacen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PrincipalAlmacen {
<<<<<<< HEAD

    public static void main(String[] args) throws ClassNotFoundException {

        Almacen a = new Almacen();

        Bebida b;
        for (int i = 0; i < 10; i++) {
            switch (i % 2) {
                case 0:
                    b = new AguaMineral("manantial1", 1.5, 5, "Bezoya");
                    a.agregarBebida(b);
                    break;
                case 1:
                    b = new BebidaAzucarada(0.20, true, 1.5, 10, "CocaCola");
                    a.agregarBebida(b);
                    break;

=======
    public static void main(String[] args)throws ClassNotFoundException {
        
        Almacen a= new Almacen ();
        
        Bebida b;
        for (int i=0; i<10; i++){
            switch(i%2){
                case 0:
                    b= new AguaMineral("manantial1", 1.5, 5, "Bezoya");
                    a.agregarBebida(b);
                    break;
                case 1:
                    b= new BebidaAzucarada (0.20, true, 1.5, 10, "CocaCola");
                    a.agregarBebida(b);
                    break;
                    
>>>>>>> fe773dc (Modificado al 23/10/2024)
            }
        }
        a.mostrarBebida(0);
        System.out.println(a.calcularPrecioBebidas());
<<<<<<< HEAD

        a.eliminarBebida(4);
        a.mostrarBebida(0);
        System.out.println(a.calcularPrecioBebidas());

        System.out.println(a.calcularPrecioBebidas("bezoya"));

        System.out.println(a.calcularPrecioBebidas(0));

        /*  try(ObjectOutputStream oos= new ObjectOutputStream (new FileOutputStream("Almacen.dat"))){
=======
        
        a.eliminarBebida(4);
        a.mostrarBebida(0);
        System.out.println(a.calcularPrecioBebidas());
        
        System.out.println(a.calcularPrecioBebidas("bezoya"));
        
        System.out.println(a.calcularPrecioBebidas(0));
        
      /*  try(ObjectOutputStream oos= new ObjectOutputStream (new FileOutputStream("Almacen.dat"))){
>>>>>>> fe773dc (Modificado al 23/10/2024)
            
            while(true){
            Almacen aux=(Almacen)oos.writeObject(oos)
            }
            
        }catch(ClassNotFoundException ex){
            System.out.println("Error al encontrar la clase "+ex.getMessage());
        }catch(FileNotFoundException ex){
            System.out.println("Error al encontrar el archivo "+ex.getMessage());{
            
        }catch(IOException ex){
                System.out.println("Error de lectura "+ex.getMessage());
                }
        }
        
<<<<<<< HEAD
         */
    }

=======
        */
    }
    
>>>>>>> fe773dc (Modificado al 23/10/2024)
}
