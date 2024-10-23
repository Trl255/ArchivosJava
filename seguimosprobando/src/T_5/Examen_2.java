package T_5;

public class Examen_2 {
    public static void main(String[] args) {
      int []array= new int [15];
      
      for (int i=0; i<array.length; i++){
        array[i]=(int)(Math.random()*99+1);           
        System.out.println(""+array[i]);
      }  
        for (int x=0;x<array.length; x++){
        }
        float med =media(array);
        System.out.println("La media es "+med);
                
        int [] menor=menor(array,med);
        int [] mayor=mayorM(array,med);
        System.out.println("Los mayores son:");
        mostrar (mayor);
        System.out.println("Los menores son:");
        mostrar (menor);
        
      //  mostrar (menor);
        
        
        
}
    static float media (int med []){
    int suma=0, cont=0;
    float media=0;
            for (int i=0; i<med.length; i++){
            suma+=med[i];
            cont++;
       }media=(float)suma/cont;
        return media;

}
    
    
    static int[] mayorM(int array[], float media){
    int cont=0;
    for (int i=0;i<array.length; i++){
        if (media<array[i]){
            cont++;
        }
    }
    
    int indice=0;
    int []mayor=new int [cont];
    for (int y=0;y<array.length; y++){
        if (media<array[y]){
            mayor[indice]=array[y];
            indice++;
        }
            
        }
  
    
        return mayor;
    }
        
        

    static int []menor(int array[], float media){
    int cont=0;
    for (int i=0; i<array.length; i++){
        if (media>array[i]){
            cont++;
        }
    }
    int cont2=0;
    int []menores=new int[cont];
    for (int y=0; y<array.length; y++){
        if (media>array[y]){
            menores[cont2]=array[y];
            cont2++;
            }
       }
    return menores;
}
    
    
    
    static void mostrar(int []valores){
    for (int i=0; i<valores.length; i++){
        System.out.println(""+valores[i]);
   
}
}
}

 
  /*for (int x=0; x<indice; x++){
        for (int i=x; i<indice; i++){
            int aux=0;
            aux=
        }
    }*/