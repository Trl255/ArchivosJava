/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author IFC303-1
 */
public class PrincipalExamen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        ArrayList<Vivienda> masTresHabitacion = new ArrayList<>();
        Vivienda[] casas = new Vivienda[10];
        casas[0] = new Vivienda("11111-PIS", "PISO", 15364.68, 4);
        casas[1] = new Vivienda("33335-UNI", "UNIFAMILIAR", 27694.36, 3);
        casas[2] = new Vivienda("50001-PIS", "PISO", 57388.30, 1);
        casas[3] = new Vivienda("22223-APT", "APARTAMENTO", 33555.75, 1);
        casas[4] = new Vivienda("12119-PIS", "PISO", 28969.42, 95000);
        casas[5] = new Vivienda("88875-UNI", "UNIFAMILIAR", 18666.36, 5);
        casas[6] = new Vivienda("55693-APT", "APARTAMENTO", 31254.45, 2);
        casas[7] = new Vivienda("365829-LCM", "LOCAL COMERCIAL", 78145.83, 0);
        casas[8] = new Vivienda("666647-CH", "CHALET", 32145.99, 10);
        casas[9] = new Vivienda("269866-PIS", "PISO", 22478.25, 6);

        Arrays.stream(casas)
                .filter(e -> e.getPrecio() > 80000)
                .forEach(e -> System.out.println(e.toString()));//No arroja información porque todas tienen un valor inferior.

        int numeroHabitaciones = Arrays.stream(casas)
                .mapToInt(e -> e.getNumeroHabitaciones())
                .sum();
        int suma=0;
        for(Vivienda v: casas){
            suma+=v.getNumeroHabitaciones();
        }
        
        
        System.out.println("La cantidad total de habitaciones son: " + numeroHabitaciones);
        System.out.println("La cantidad total de habitaciones son FOR: " + suma);
        
        
        
        
        String[] numeroCatastrales = Arrays.stream(casas)
                .map(e -> e.getNumeroCatastral())
                .sorted()
                .toArray(String[]::new);

        System.out.println("Los números catastrales de las viviendas son:\n " + Arrays.toString(numeroCatastrales));

        ArrayList<Vivienda> listaNueva = Arrays.stream(casas)
                .filter(e -> e.getNumeroHabitaciones() > 3 && e.getTipoVivienda().equalsIgnoreCase("chalet"))
                .collect(Collectors.toCollection(ArrayList::new));
        
        Collections.sort(listaNueva, (Vivienda a, Vivienda b)->
                a.getTipoVivienda().compareTo(b.getTipoVivienda()));
        
        System.out.println("Ordenados por tipo de vivienda");
       listaNueva.forEach(e->System.out.print(e));

        System.out.println("Viviendas con más de 3 habitaciones y que son chalet");
        for (Vivienda e : listaNueva) {
            System.out.println(e.toString());

        }

        listaNueva.add(new Vivienda("12345678-CH", "CHALET", 12580.99, 9));
        listaNueva.add(new Vivienda("87654321-CH", "CHALET", 22580.99, 8));

        ListIterator<Vivienda> it = listaNueva.listIterator();
        boolean encontrado = false;
        Vivienda buscar = null;

        System.out.println("Introduzca la referencia a buscar");
        String comprobarNumero = sc.nextLine();
        new Vivienda(comprobarNumero);

        while (comprobarNumero.equals("")) {
            System.out.println("No puede estar vacio, introduzca una referencia correcta");
            comprobarNumero = sc.nextLine();

        }
        while (it.hasNext()) {
            buscar = it.next();
        }
        if (comprobarNumero.trim().equals(buscar.getNumeroCatastral())) {
            System.out.println("Se ha encontrado la vivienda " + buscar.toString());
            encontrado = true;
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado la referencia introducida");
        }

    }

}
