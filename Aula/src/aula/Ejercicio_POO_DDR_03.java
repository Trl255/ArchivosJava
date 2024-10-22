package aula;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio_POO_DDR_03 {

    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
       
        //Creamos el objeto
        Aula aula=new Aula();
        
        //Indicamos si se puede dar la clase
        if(aula.darClase()){
            aula.notas();
            
            try(ObjectOutputStream oos= new ObjectOutputStream (new FileOutputStream ("Aula.dat"))){
                
                
                oos.writeObject(aula);
                System.out.println("Se ha escrito correctamente");
                
            }catch(IOException ex){
                System.out.println(ex.getMessage());
                
                
            }
            try(ObjectInputStream ois= new ObjectInputStream (new FileInputStream ("Aula.dat"))){
                Aula aux=(Aula)ois.readObject();
                aux.darClase();
                
                
                
                
            }catch(IOException ex){
                 System.out.println(ex.getMessage());
            }
        }
        
    }
    
}
