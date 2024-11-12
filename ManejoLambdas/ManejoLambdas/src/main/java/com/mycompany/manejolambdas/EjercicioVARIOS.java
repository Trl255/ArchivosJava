/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejolambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author IFC303-1
 */
public class EjercicioVARIOS {
    public static void main(String[] args) {
            List <Cliente> misClientes = new ArrayList<>();
        misClientes.add(new Cliente("91111111P","Manolo",22));
        misClientes.add(new Cliente("12547896S","Beatriz",35));
        misClientes.add(new Cliente("11111112Q","Luis",45));
        misClientes.add(new Cliente("24555556W","Arturo",46));
        misClientes.add(new Cliente("21111111A","Ana",66));
        Stream<Cliente> clientes=misClientes.stream();
        
//Consumer <Cliente> saludo= cliente->System.out.println("Nombre:"+cliente.nombre+", DNI: "+cliente.dni);

        //Function <Cliente, Integer> edades=e-> e.edad; COMO SE DECLARA EN LA SIGUIENTE FUNCION CON MAPTOINT NO HACE FALTA DECLARAR LA FUNCIÓN
        //clientes.mapToInt(e->e.edad); LA DE ARRIBA SE REALIZA ASÍ
        System.out.println("La media es:\n"+clientes.mapToInt(e->e.edad).average().getAsDouble());//ESTA ES OTRA FUNCION(
        //System.out.println("La media es:\n"+clientes.mapToInt(e->e.edad).sum());//ESTA ES OTRA suma
        //System.out.println("La media es:\n"+clientes.mapToInt(e->e.edad).min());//ESTA ES OTRA minimo
        //System.out.println("La media es:\n"+clientes.mapToInt(e->e.edad).max());//ESTA ES OTRA máximo
        
        //clientes.forEach(System.out::println);
       
        //clientes.forEach(saludo);
        
        Predicate <Cliente> mayoresCuarenta= a ->a.edad>40;
        //misClientes.stream().filter(mayoresCuarenta).sorted().forEach(saludo);
        //misClientes.stream().filter(mayoresCuarenta).sorted((a,b)->a.nombre.compareTo(b.nombre)).forEach(saludo);//Ordenado por nombre con CompareTO
        //misClientes.stream().filter(mayoresCuarenta).sorted((a,b)->a.edad-b.edad).forEach(saludo);//Ordenado por edad ascendente
        //misClientes.stream().filter(mayoresCuarenta).sorted((a,b)->b.edad-a.edad).forEach(saludo);//Ordenado por edad descendente Se intercambia el orden de las variables
        
        Integer []numeros={5,8,3,45,7,84,15,74,38,};
        Stream<Integer> listaNumeros= Arrays.stream(numeros);
        //Function <Integer, Integer> doblar=e->e*2;  ESTA ES UNA OPCION, DOS LINEAS
        //listaNumeros.map(doblar).forEach(System.out::println); 
        listaNumeros.map(e->e*2).forEach(System.out::println);//ESTA OPCIÓN SE ACOTA EN UNA SOLA LINEA PERO TIENE QUE TENER UN MISMO TIPO DE DATO EN ESTE CASO INTEGER
        
        
        long mayores30=listaNumeros.filter(e->e>30).count();
        //System.out.println(listaNumeros.filter(a->a>30).count());
        System.out.println(mayores30);
        
        
        
        
        
        //
        
        /*Stream <Cliente> mayor40= clientes.filter(mayoresCuarenta);
        
        mayor40.forEach(saludo);*/
        
    }
    
}
