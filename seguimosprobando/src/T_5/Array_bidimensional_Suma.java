/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T_5;

/**
 *
 * @author IFC303-1
 */
public class Array_bidimensional_Suma {
    
    
public static void main (String args[]){
    int [][]matriz= new int [2][4];
  
    matriz[0][0]=1;
    matriz[0][1]=2;
    matriz[0][2]=3;
    matriz[0][3]=4;
    
    matriz[1][0]=10;
    matriz[1][1]=20;
    matriz[1][2]=30;
    matriz[1][3]=40;
  int resultado=sumaMatriz(matriz);
  System.out.println(+resultado);
}    

public static int sumaMatriz(int [][] matriz){
    int total=0;
    int dimen1=matriz.length;
    int dimen2=matriz[0].length;
    for (int i=0; i<dimen1; i++){
        for (int j=0; j<dimen2; j++){
            total+=matriz [i][j];
        }
    }
    return total;    
    }

}
