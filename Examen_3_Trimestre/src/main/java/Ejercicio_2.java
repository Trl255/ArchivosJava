
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author IFC303-1
 */
public class Ejercicio_2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;

        String texto = "";
        String texto2 = "";
        

        while (!salir) {
            System.out.println("---------1. Introducir datos-------------");
            System.out.println("---------2. Mostrar-------------");
            System.out.println("---------3. Salir-------------");

            try ( BufferedWriter bw = new BufferedWriter(new FileWriter("numeros.txt", true));  BufferedReader br = new BufferedReader(new FileReader("numeros.txt"))) {
                System.out.println("Elija una opción");
                opcion = sc.nextInt();
                //opcion=Metodos.leernumeroEntero();

                switch (opcion) {

                    case 1:
                        System.out.println("Introduzca un entero");
                        texto = sc.next();
                        bw.write(texto);
                        bw.newLine();

                        break;
                    case 2:
                        salir = true;
                        while ((texto2 = br.readLine()) != null) {
                            
                            String frase[]=texto2.split(" ");
                            
                            for (int i=0; i<frase.length; i++){
                                System.out.println(frase[i]);
                            }
                            /*String frase = “Con diez cañones por banda”;
            String [] palabras = frase.split (“ “); //separador espacio en blanco
            El resultado será la tabla palabras que tendrá 5 elementos, “Con”, “diez”, “cañones”, “por”,    
            “banda”, esto es, [“Con”, “diez”, “cañones”, “por”, “banda“].*/
                        }
                        
                        case 3:
                            salir = true;
                }
            }catch (IOException e) {
            System.out.println("error"+e);
        }
            }
            
        }
    }
