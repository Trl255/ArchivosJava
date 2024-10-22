package cine2;

import java.util.Scanner;

public class PrincipalCine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = 0;
        char letra = 0;
        Espectador e;
        Pelicula pelicula1 = new Pelicula("Vía de escape", 90, 10, "Tk-Tok");

        System.out.println("Introduce el número de filas");
        int filas = sc.nextInt();

        System.out.println("Introduce el número de columnas");
        int columnas = sc.nextInt();

        System.out.println("Introduce el precio de la entrada al cine");
        double precio = sc.nextDouble();

        Cine cine = new Cine(filas, columnas, precio, pelicula1);

        System.out.println("Introduce el número de espectadores a crear");
        int numEspectadores = sc.nextInt();
        
        System.out.println("Espectadores generados: ");
         //Termino cuando no queden espectadores o no haya mas sitio en el cine
        for (int i = 0; i < numEspectadores && cine.haySitio(); i++) {
            
            //Generamos un espectador
            
            e = new Espectador(Metodos.nombres[Metodos.generarAleatorio(0, Metodos.nombres.length - 1)],
                    Metodos.generarAleatorio(10, 30),
                    Metodos.generarAleatorio(1, 10));
            
            //Mostramos la información del espectador
            System.out.println(e);
            
               //Generamos una fila y letra
            //Si esta libre continua sino busca de nuevo
            do {

                fila = Metodos.generarAleatorio(0, cine.getFilas() - 1);
                letra = (char) Metodos.generarAleatorio('A', 'A' + (cine.getColumnas() - 1));

            } while (cine.haySitioButaca(fila, letra));
            //Si el espectador cumple con las condiciones    
            if (cine.sePuedeSentar(e)) {
                e.pagar(cine.getPrecio());//El espectador paga el precio de la entrada
                cine.sentar(fila, letra, e);//El espectador se sienta

            }
            System.out.println("");
            cine.mostrar();
            System.out.println("Fin");

        }

    }

}
