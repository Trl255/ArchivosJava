/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HilosExcutorService.Repartidor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author josea
 */
public class MainEntrega {

    public static void main(String[] args) {
        // Crear los pedidos

        // Cliente 1
        Cliente cliente1 = new Cliente("Maria");
        Pedido pedido1 = new Pedido(cliente1, 3, "Bicicleta");
        Pedido pedido2 = new Pedido(cliente1, 1, "Patinete");

        List<Pedido> lPed1 = new ArrayList<>();
        lPed1.add(pedido1);
        lPed1.add(pedido2);

        
        //Cliente 2
        Cliente cliente2 = new Cliente("Jesus");
        Pedido pedido3 = new Pedido(cliente2, 2, "Balon");
        Pedido pedido4 = new Pedido(cliente2, 33, "Luz led");

        List<Pedido> lPed2 = new ArrayList<>();
        lPed2.add(pedido3);
        lPed2.add(pedido4);
        
        Cliente cliente3 = new Cliente("Pedro Martinez");
        Pedido pedido5 = new Pedido(cliente3, 22, "Coche");
        Pedido pedido6 = new Pedido(cliente3, 5, "Movil");
        
        List<Pedido> lPed3=new ArrayList<>();
        lPed3.add(pedido5);
        lPed3.add(pedido6);
        

        // Crear el repartidor y asignarle los pedidos
        Repartidor repartidor1 = new Repartidor("Pedro", lPed1, cliente1);
        Repartidor repartidor2 = new Repartidor("Jesus", lPed2, cliente2);
        Repartidor repartidor3 = new Repartidor("Jose Manuel", lPed3, cliente3);

        Thread hiloRepartidor1 = new Thread(repartidor1);
        Thread hiloRepartidor2 = new Thread(repartidor2);
        Thread hiloRepartidor3 = new Thread(repartidor3);

        hiloRepartidor1.start();
        hiloRepartidor2.start();
        hiloRepartidor3.start();
        

        /*ExecutorService pool = Executors.newFixedThreadPool(2);
        List<Future<List<String>>> listaFuturos = new ArrayList<>();
        
        Future<List<String>> futuro = */
    }

}
