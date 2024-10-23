/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;

/**
 *
 * @author IFC303-1
 */
public class ArrayOrden {
public static void main(String args[]){
    int []numeros={545,454,65,487,1,8458,6,854};
    for (int i=0; i<numeros.length; i++){
        for (int x=i+1; x<numeros.length ; x++){
            if (numeros[x]<numeros[i]){
                int aux=numeros[x];
                numeros[x]=numeros[i];
                numeros[i]=aux;
                }
        }
        
    }
    for (int x=0; x<numeros.length ; x++){
        System.out.println(numeros[x]);
    }
    
}
}
