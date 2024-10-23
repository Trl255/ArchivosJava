
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josea
 */
public class Serializacion {
    public static void main(String[] args) throws ClassNotFoundException {
        Empleado[] empleados = null;
        ObjectInputStream fichero = null;
        
        try {
            fichero = new ObjectInputStream(new FileInputStream("fichero_empleados.dat"));
            try {
                //readObject lee un Objeto, pero nosotros queremos que sea un array de Empleado
                empleados = (Empleado[]) fichero.readObject();
                
                for (Empleado e: empleados){
                
                System.out.println(e.toString());
                }
            } catch (ClassNotFoundException ex) {
                System.out.println("El fichero no contiene un objeto de ese tipo");;
            }fichero.close();

        } catch (FileNotFoundException ex) {
            System.out.println("El fichero no existe");;
        } catch (IOException e) {
            System.out.println("El problema es de lectura");
        }}/*
        try(ObjectInputStream empleados= new ObjectInputStream(new FileInputStream ("fichero_empleados.dat"))){
            
            while(true){
                Empleado listEmpleados=(Empleado) empleados.readObject();
                System.out.println(listEmpleados.toString());
                
                
                
            }
            
        }catch(ClassNotFoundException ex){
            System.out.println("Clase no encontrada "+ex.getMessage());
        }catch(FileNotFoundException ex){
            System.out.println("Archivo no encontrado "+ex.getMessage());
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }*/
    
}
