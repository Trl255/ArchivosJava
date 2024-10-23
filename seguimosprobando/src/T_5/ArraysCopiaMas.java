/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;

import java.util.Arrays;

/**
 *
 * @author IFC303-1
 */
public class ArraysCopiaMas {
    public static void main (String args[]){
     int []array={54,87,987,646,5,545,578,579};
        System.out.println("array");
        
        array=Arrays.copyOf(array,array.length+1);
        System.out.println(array);
        array[array.length-1]=54694;
                for (int valor:array)
                    System.out.println(valor);
    array=Arrays.copyOf(array, array.length+3);
    for (int valor:array)
        System.out.println(valor);
    }

    {
        
    }
    
    
}

