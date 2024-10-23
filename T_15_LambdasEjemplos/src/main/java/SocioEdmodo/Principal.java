/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocioEdmodo;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Implementa la clase Socio con los atributos, dni, nombre, fechaNacimiento,
 * fechaAlta (de tipo LocalDate), cuota y números de familiares del socio.
 * Implementa al menos un constructor, los métodos equals, compareTo y toString.
 * Crea una tabla con 5 socios, y a partir de ella, un Stream con los socios: a)
 * Ordenador por DNI b) Con un cuota mayor de 100 € c) Cuyo nombre empieza por
 * “A” d) Crea un método que calcule la edad del socio en años a partir de la
 * fecha de nacimiento y la fecha actual. e) Crea el método antigüedad del socio
 * en meses completos. f) Crea un Stream con los socios ordenados por antigüedad
 * y otro con los socios ordenados por edad.
 */
public class Principal {

    public static void main(String[] args) {

        Socio[] socios = new Socio[5];
        socios[0] = new Socio("21111111P", "Mario Morata Sanchez", LocalDate.of(1972, 10, 25),
                LocalDate.of(2020, 7, 15), 356.25, 3);
        socios[1] = new Socio("11111112A", "Silvia Aranda Añaños", LocalDate.of(1976, 9, 30),
                LocalDate.of(2021, 6, 12), 125.0, 2);
        socios[2] = new Socio("11111113S", "Oscar Villalba Romero", LocalDate.of(1996, 5, 14),
                LocalDate.of(2020, 4, 18), 386.3, 1);
        socios[3] = new Socio("3111114Q", "aloy Burriel Rubio", LocalDate.of(1995, 3, 5),
                LocalDate.of(2020, 1, 8), 204.25, 4);
        socios[4] = new Socio("21111115M", "Ana Lidia Perez Suarez", LocalDate.of(2000, 11, 1),
                LocalDate.of(2020, 10, 5), 359.25, 1);

        System.out.println("Socios ordenados por el dni");
        Arrays.stream(socios).sorted().forEach(e -> System.out.println(e.toString()));

        System.out.println("Socios con cuota mayor 300");
        Arrays.stream(socios).filter(e -> e.getCuota() > 300).forEach(e -> System.out.println(e.toString()));
        System.out.println("Socios cuyo nombre empieza por a, añadimos mayúsculas");

        Arrays.stream(socios).filter(e -> e.getNombre().toLowerCase().startsWith("a")).forEach(e -> System.out.println(e.toString()));
        System.out.println("Socios ordenados por antiguedad");

        Arrays.stream(socios).sorted((a, b) -> antiguedad(a.getFechaAlta()) - antiguedad(b.getFechaAlta()))
                .forEach(e -> System.out.println(e.toString()));

        System.out.println("Socios ordenados por edad");
        Arrays.stream(socios).sorted((a, b) -> edad(b.getFechaNacimiento()) - edad(a.getFechaNacimiento()))
                .forEach(e -> System.out.println(e.toString()));
        
    }

    static int edad(LocalDate fechaNacimiento) {
        int anios = LocalDate.now().getYear() - fechaNacimiento.getYear();
        if (LocalDate.now().getMonth().compareTo(fechaNacimiento.getMonth()) < 0) {
            anios--;
        } else if (LocalDate.now().getMonth().compareTo(fechaNacimiento.getMonth()) == 0) {
            if (LocalDate.now().getDayOfMonth() > fechaNacimiento.getDayOfMonth()) {
                anios--;
            }
        }
        return anios;
    }

    static int antiguedad(LocalDate fechaAlta) {
        int aniosTotales = 0;
        int meses = 0;
        aniosTotales = LocalDate.now().getYear() - fechaAlta.getYear();
        if (LocalDate.now().getDayOfMonth() < fechaAlta.getDayOfMonth()) {
            meses = aniosTotales * 12 + (LocalDate.now().getMonth().getValue() - fechaAlta.getMonth().getValue());
        } else {
            meses = aniosTotales * 12 + (LocalDate.now().getMonth().getValue() - fechaAlta.getMonth().getValue()) - 1;
        }

        return meses;
    }
}
