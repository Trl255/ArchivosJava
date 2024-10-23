
package Arrays;
public class DD_intercambio_de_posicion {
    public static void main(String[] args) {
        
    
       int[] array1={1,2,3,4,5,54,87,415,98,46};
        int[] array2=new int[array1.length];
        
        for (int i=0; i<array1.length; i++){
        System.out.println(""+array1[i]);
        }
        int  []mostrar=alreves(array1);
        
        
        /*for(int i=(array1.length-1),j=0;i>=0;i--,j++){
        }           array2[j]=array1[i];
           System.out.println(array2[j]);*/
        
        
        }public static int []alreves(int [] arrays1){
            
            int []arrays2=new int [arrays1.length];
            for (int i=(arrays1.length-1), j=0;     i>=0; i--, j++){
                arrays2[j]=arrays1 [i];
                System.out.println(""+arrays2[j]);
            }return arrays2;
    }
     
}
