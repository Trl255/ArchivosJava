/*
Ejercicio
Generar una lista con 50 número enteros entre -25 y 25, que genere dos listas una lista con número positivos y la otra con negativos.
 */
package com.mycompany.manejolambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author IFC303-1
 */
public class EjercicioNumeros {

    public static void main(String[] args) {
        List<Integer> numPositivos = new ArrayList<>();
        List<Integer> numNegativos = new ArrayList<>();
        int contCero=0;
        

        for (int i = 0; i < 50; i++) {
            int rn = (int) Math.floor(Math.random() * (25 - (-25) + 1) + (-25));
            Predicate<Integer> esPositivo = e -> (rn) > 0;
            if (esPositivo.test(rn)) {
                numPositivos.add(rn);
            } else if(rn==0){
                contCero++;
                
            }else{
                numNegativos.add(rn);
            }
        }

        System.out.println("Números positivos\n"+numPositivos);
        System.out.println("Números negativos \n"+numNegativos);
        System.out.println("Se han generado "+contCero+", veces cero.");

    }

}
