/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alimentos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author profesor
 */
public class Principal {
    public static void main(String [] args){
        LocalDate fecha1 = LocalDate.parse("2021-08-12");
        DateTimeFormatter formatoespaña= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha2=LocalDate.parse("12-08-2022",formatoespaña);
        
        
        
        Fresco fresco1=new Fresco("E-589","Brasil");
        System.out.println("El lote es: "+fresco1.getLote()+ "y el pais es: "+fresco1.getPais());
        Refrigerado refri1=new Refrigerado("E-968","Holanda","CEE",5.0);
        System.out.println("El lote es: "+refri1.getLote()+ "y el pais es: "+refri1.getPais());
        Congelado conge1=new Congelado("e-987","Francia",-20);
        System.out.println("El lote es: "+conge1.getLote()+"Y la temperatura"+conge1.temperatura);
        String devolucion=fresco1.toString();
        System.out.println(devolucion);
        System.out.println(refri1.toString());
        System.out.println(fecha2);
        
        

        
    }
    
}
