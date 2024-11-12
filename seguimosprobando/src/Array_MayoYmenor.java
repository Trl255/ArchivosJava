
public class Array_MayoYmenor {
    
    public static void main(String[] args){
        
        int[][] matrix = new int[3][4];
        
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = -3;
        matrix[0][3] = 4;
        
        matrix[1][0] = 10;
        matrix[1][1] = 20985;
        matrix[1][2] = 30;
        matrix[1][3] = 40;
        
        matrix[2][0] = 100;
        matrix[2][1] = 200;  
        matrix[2][2] = 300;
        matrix[2][3] = 400;
        
       // int[][] copia = copyMatrix(matrix);
        
       // matrix[0][0] = -1;
        //printMatrix(matrix);
        //printMatrix(copia);
        
        int extrem[]=extremos(matrix);
        System.out.println("El máximo es "+extrem[1]+" y el minimo "+extrem[0]);
        
        
     /*   for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
              System.out.println(matrix[i][j]);   
            }
        }*/
     
    /* for(int[] array : matrix){
         for(int valor: array){
              System.out.print(valor+" "); 
         }
       System.out.println(); 
     }*/
    
    
        
    }
    static int[]extremos(int [][]matriz){
        int []valores=new int[2];
        valores[0]=matriz[0][0];
        valores[1]=matriz[0][0];
        
        for(int [] filas:matriz){
            for(int valor:filas){
                if(valor<valores[0])
                    valores[0]=valor;
                if(valor>valores[1]){
                    valores[1]=valor;
                }
            }
        }
       /* int fila=matriz.length;
        int columna=matriz[0].length;
        for(int x=0;x<fila;x++){
            for(int y=0;y<columna;y++){
                
            }
        }*/
        
        
        return valores;
    }
    
    public static void printMatrix(int[][] matrix){
         for(int[] array : matrix){
         for(int valor: array){
              System.out.print(valor+" "); 
         }
       System.out.println(); 
     }
    }
    
    public static int[][] copyMatrix(int[][] matrix){
     int dimension1 = matrix.length;
     int dimension2 = matrix[0].length;
        int[][] copy = new int[dimension1][dimension2];
        for(int i=0;i<dimension1;i++){
            for(int j=0;j<dimension2;j++){
             copy[i][j] = matrix[i][j];   
         }
        }
        return copy;
    }
    
}