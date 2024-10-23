/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio08_T08;


import Ejercicio08_T08.Mecanicos.Especialidad;
import java.util.Scanner;

/**
 *
 * @author IFC303-1
 */
public class Principal {
    public static void main(String[] args) {
    /*    Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cuántos vagones tiene el tren?");
        int cantidadVagones=entrada.nextInt();
        String id="123456f";
        Vagones []vagones =new Vagones[cantidadVagones];
        for(int i=0; i<cantidadVagones;i++){
            System.out.println("Indica la carga máxima del vagón "+(i+1));
            double cargaMax=entrada.nextDouble();
            vagones[i]=new Vagones(id,cargaMax);
        }
        vagones.toString();*/
        Maquinaria maq1=new Maquinaria("123456A");
        Mecanicos mecanico1=new Mecanicos("Pepe", "612345678");
        Maquinistas maquinista1=new Maquinistas("Juan","67891234B");
        Locomotoras locomotora1=new Locomotoras(maq1.id, 500.5, 8, mecanico1);
        
        
        Vagones []vagon =new Vagones[3];
        for(int i=0; i<3;i++){
            vagon[0]=new Vagones(maq1.id, "cajas");
            vagon[1]=new Vagones(maq1.id, "tablas");
            vagon[2]=new Vagones(maq1.id, "pintura");
        }
        
        //Vagones vagon1=new Vagones(maq1.id, "comida");
        
        Trenes tren1=new Trenes(maq1.id, locomotora1, vagon, maquinista1);
        
        System.out.println(tren1.toString());
        
        Especialidad mec1 = Especialidad.electricidad;
        System.out.println(mec1);
        
    }
}
