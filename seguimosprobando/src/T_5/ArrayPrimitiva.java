/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;

/**
 *
 * @author IFC303-1
 */
public class ArrayPrimitiva {
public static void main (String[]args ){
    int []num={15,26,3,8,48,33};
    int []ganador={1,5,48,15,33};
    int cont=0;
    for (int x=0; x<num.length ; x++){
        for (int y=0; y<ganador.length; y++){
            if (num[x]==ganador[y]){
                cont++;
                break;
            }
        }
    }
    /*for (int x=0);x<num.length ;++){
    System.out.println();*/
    System.out.println("El número de elementos repetidos es "+cont);
}
}    

