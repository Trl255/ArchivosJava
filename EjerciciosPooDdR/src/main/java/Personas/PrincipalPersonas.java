/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class PrincipalPersonas {

    public static void main(String[] args) throws IOException, FileNotFoundException, FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);
        Persona personas[] = null;
        
        try ( ObjectInputStream informacion = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            
            
            personas = (Persona[])informacion.readObject();
                      System.out.println(personas.toString());              
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        

        //Introducimos los datos
        System.out.println("Introduce el nombre");
        String nombre = sc.next();

        System.out.println("Introduce la edad");
        int edad = sc.nextInt();

        System.out.println("Introduce el sexo");
        char sexo = sc.next().charAt(0);

        System.out.println("Introduce el peso");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura");
        double altura = sc.nextDouble();

        //Creamos objetos con cada constructor
        Persona persona1 = new Persona();

        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);

        persona2.setPeso(90.5);
        persona2.setAltura(1.80);

        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());

        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());

        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
        
           try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("personas.dat"))){
               oos.writeObject(oos);
}
    }
 

    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.pesoIdeal:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.pesoMenor:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.sobrePeso:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Persona p) {

        if (p.mayorEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }

}
