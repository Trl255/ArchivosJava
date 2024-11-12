/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;

/**
 *
 * @author IFC303-1
 */
public class Array_bidimensional {
public static void main (String args[]){
    int [][] matriz= new int [3][4];
    
    matriz[0][0]=1;
    matriz[0][1]=2;
    matriz[0][2]=3;
    matriz[0][3]=4;
    
    matriz[1][0]=10;
    matriz[1][1]=20;
    matriz[1][2]=30;
    matriz[1][3]=40;
    
    matriz[2][0]=100;
    matriz[2][1]=200;
    matriz[2][2]=300;
    matriz[2][3]=400;
    
    /*for (int i=0 ; i<3 ; i++){
        for (int j=0 ; j<4 ; j++){
          System.out.println(matriz[i][j]); 
    }
    }*/
    for (int [] array : matriz){
        for (int valor : array){
            System.out.println(valor);
        }
    }
}    
}
