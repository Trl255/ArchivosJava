
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author IFC303-1
 */
public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String nombre = "";
        boolean salir = false;
        int opcion;
        File fichero=null; 
        while (!salir) {

            System.out.println("---------1. Buscar fichero y eliminarlo-------------");
            System.out.println("---------2. Salir-------------");
            try {
                System.out.println("Elija una opción");
                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:

                        System.out.println("Escriba el nombre");
                        nombre = sc.next();
                        fichero = new File(nombre);
                        if (fichero.exists()) {
                            fichero.delete();
                            System.out.println("Fichero eliminado");
                        }else if (!fichero.exists()){
                            fichero.createNewFile();
                            System.out.println("Fichero creado");
                            
                        } else {
                            System.out.println("El nombre del fichero no existe");

                        }
                        break;
                    case 2:
                        salir = true;
                        break;

                }

            } catch (InputMismatchException e) {
                fichero.delete();
                System.out.println("Error a la hora de mostrar los datos" + e.getMessage());
            }
        }
    }
}
