package cliente_ficheros;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author josea
 */
public class Dr_7_Serializacion {

    public static void main(String[] args) throws DNIException, FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        boolean salir = false;
        int opcion;

        File fichero = new File("Clientes.dat");
        String DNI, nombre, telefono;
        Cliente c;

        while (!salir) {

            System.out.println("---------1.Crear fichero -------------");
            System.out.println("---------2.Añadir cliente-------------");
            System.out.println("---------3.Listar clientes------------");
            System.out.println("---------4.Borrar fichero ------------");
            System.out.println("---------5.Salir de la aplicación-----");
        

        try {

            System.out.println("Escribir una opción");
            opcion = sc.nextInt();

            switch (opcion) {//Crear un fichero

                case 1:
                    if (fichero.exists()) {
                        System.out.println("El fichero ya esta creado");
                    } else {
                        if (fichero.createNewFile()) {
                            System.out.println("Se ha creado el fichero");
                        } else {
                            System.out.println("Error al crear el fichero");
                        }
                    }

                    break;
                case 2: //Añadir un cliente
                    
                    if (fichero.exists()){
                        System.out.println("Introduce el DNI");
                    DNI = sc.next();

                  //  validarDNI(DNI);//Validamos el DNI con la función anexa

                    System.out.println("Introduce el nombre");
                    nombre = sc.next();

                    System.out.println("Introduce el télefono");
                    telefono = sc.next();

                    c = new Cliente(DNI, nombre, telefono); //Creamos el cliente

                    ObjectOutputStream oos = null; //Declaramos el objeto que vamos a
                    //escribir

                    if (fichero.length() == 0) {//length nos devuelve lo que ocupa el fichero
                        //si esta a "0" es que no existe por tema de cabecera
                        oos = new ObjectOutputStream(new FileOutputStream(fichero));
                    } else {
                        oos = new ObjectOutputStream(new FileOutputStream(fichero, true));
                        //arriba iba "MiobjectOutputSrteam pero no me lo reconocia, lo he dejado igual.         
                    }
                    oos.writeObject(c);//Escribimos el objeto "oos" es la apertura del flujo, y writer el metodo de escritura, "C" la información
                    //que vamos a escribir en este caso la información del cliente
                    System.out.println("Se ha creado correctamente");
                    }else{
                        System.out.println("Debes crear el fichero");
                    }
                    
                    break;
                case 3://Listar clientes
                        //si existe el fichero lo lee
                        if (fichero.exists()) {
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));//Abrimos el flujo
                    //Y le indicamos el nombre del fichero "Fichero es tipo FILE que esta declarado al inicio,
                    // en Fichero/File se le indica la ruta, la extensión y el nombre del archivo donde se guardará la inormación

                    while (true) //Hasta que no salte la excepción no saldrá de ahí
                    //En este caso cuando termine el fichero     
                    {

                        c = (Cliente) ois.readObject();
                        System.out.println(c.toString());
                    }    
                    }else{
                            System.out.println("Debes crear el fichero");
                        }

                case 4://Caso 4, borrar.
                    if (fichero.exists()) {
                        fichero.delete();

                        System.out.println("El fichero se ha borrado");
                        
                    } else {
                        System.out.println("No se ha podido eliminar el archivo, no se ha encontrado");
                    }

                    break;
                case 5:

                    salir = true;
                    break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Error Mismatch" +e.getMessage());
            sc.next();
        } catch (EOFException ex) {
            System.out.println("No hay más clientes");
       // }catch (DNIException |IOException | ClassNotFoundException ex){
            //System.out.println(ex.getMessage());
        }
    }
    }

    public static void validarDNI(String DNI) throws DNIException {

        //Comprobamos la longitud del dni
        if (!(DNI.length() >= 8 && DNI.length() <= 9)) {
            throw new DNIException(DNIException.LONGITUD_NO_CORRECTA);
        }

        //saco la parte numerica
        String parte_numerica = DNI.substring(0, DNI.length() - 1);

        //Aqui guardare el dni
        int numeroDNI = 0;

        try {
            //Lo transformo en un numero
            //Puede saltar la excepcion
            numeroDNI = Integer.parseInt(parte_numerica);
        } catch (NumberFormatException e) {
            throw new DNIException(DNIException.PARTE_NUMERICA_NO_CORRECTA);
        }

        //
        char letra = DNI.substring(DNI.length() - 1, DNI.length()).toUpperCase().charAt(0);

        if (!(letra >= 'A' && letra <= 'Z')) {
            throw new DNIException(DNIException.PARTE_LETRA_NO_CORRECTA);
        }

        //Ya hemos validado el formato
        final int DIVISOR = 23;

        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int resto = numeroDNI % DIVISOR;

        String nuevoDNI = numeroDNI + "" + letrasNIF[resto];

        if (DNI.startsWith("0")) {
            nuevoDNI = "0" + nuevoDNI;
        }

        if (!(nuevoDNI.equals(DNI))) {
            throw new DNIException(DNIException.FORMATO_NO_CORRECTO);
        }

    }

}
