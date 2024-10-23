package empleadospoo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PrincipaEmpleados {

    public static void main(String[] args) {

        
        
        
        //Creamos los objetos
        //Comercial c1 = new Comercial(300, "Pablo", 37, 1000);
        //Repartidor r1 = new Repartidor("zona 3", "Juan", 26, 900);
        
        
        Empleado []empleados= new Empleado[4];
        empleados[0]= new Repartidor  ("zona 4", "María", 28, 100);    
        empleados [1]= new Comercial (400, "Patricia", 30, 120);
        empleados [2] = new Comercial(300, "Pablo", 37, 1000);
        empleados [3] = new Repartidor("zona 3", "Juan", 36, 900);
        
        
        //Llamamos a plus
        empleados [2].plus();
        empleados [3].plus();
        empleados [3].plusAntiguedad();

        //Mostramos la informacion
        for (Empleado e: empleados){
            System.out.println(e.toString());
        }
        
        try(ObjectOutputStream oos= new ObjectOutputStream (new FileOutputStream ("Empleado.dat"))){
            
            oos.writeObject(empleados);
            
            
            //oos.writeObject(r1);
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
            
        }
            
    }

}
