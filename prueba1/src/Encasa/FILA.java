/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;
import java.util.Scanner;
/**La FILA (Federación Internación de Lanzamiento de Algoritmo) realiza un competición donde
cada participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo
más lejos. La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros
(con tantos decimales como se desee), pero para el ranking solo se tiene en cuenta la longitud 
en centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 metros se
contabilizarán 1234 cm.
Realiza un programa que solicite la longitud en metros de un lanzamiento y muestre la parte
entera correspondiente en centímet
 *
 * @author josea
 */
public class FILA {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double lanzamiento, conversion;
        System.out.println("\"Programa de visualización lanzamiento en centimetros\"\n Introduzca su lanzamiento en metros");
        lanzamiento=sc.nextDouble();
        double total=converse(lanzamiento);
        System.out.printf("La conversión de metros a centimetros es %.0f ",total," centimetros");
        
    }static double converse(double lanz){
        return (lanz*100);
    }
    
}
