/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encasa;

/**
 *
 * @author josea
 */
public class anneyFecha {
public static void main(String args[]){    
int [] array= {12,34,54,13,452,2,34,454};

orden(array);
}static void orden(int array[]){
    for (int x=0; x<array.length; x++){
        for (int y=x+1; y<array.length; y++){
            if (array[y]<array [x]){
                int aux=0;
                aux=array [x];
                array[x]=array[y];
                array[y]=aux;
                
            }
        }
        }for (int i=0;i<array.length;i++){
                System.out.println(""+array[i]);
    }
}
}
