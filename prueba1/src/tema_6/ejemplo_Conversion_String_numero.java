package tema_6;
import java.util.Scanner;
public class ejemplo_Conversion_String_numero {
    boolean operacionCancelada;
    
    public ejemplo_Conversion_String_numero(){
        setOperacionCancelada(false);
    }
        
    
    public boolean isOperacionCancelada(){
        return operacionCancelada;
    }
    
    
    private void setOperacionCancelada(boolean operacionCancelada){
        this.operacionCancelada=operacionCancelada;
    }
 
    public double PedirNumeroDouble (String titulo,  String mensaje){
        Scanner sc=new Scanner (System.in);
        double doble= 0;
        setOperacionCancelada(false);
        boolean NumeroValido= false;
        
       do{
           System.out.println("Introduce un número");
           String s=sc.nextLine();
           
           if (s!=null){
               try {
                   doble=Double.valueOf(s).doubleValue();
                   NumeroValido=true;
            }catch (NumberFormatException e){
                   System.out.println("El número introducido no es válido.Erro");
    }
    }
           else {NumeroValido=true;
           setOperacionCancelada(true);
    }
    }while (!NumeroValido);
    return doble;
    
    }
    
    public float PedirNumeroFloat (String titulo, String mensaje){
        float d=0;
        Scanner sc=new Scanner(System.in);
        setOperacionCancelada(false);
        boolean NumeroValido=false;
        
        do{
            System.out.println("Introduce un número");
            String s=sc.nextLine();
            
           if (s !=null){
           try {
           d=Float.valueOf(s).floatValue();
           NumeroValido=true;
           
           } catch (NumberFormatException e){
               System.out.println("El número introducido no es válido. Error");}
           }   
           else{ NumeroValido=true;
           }
           }while 
            (!NumeroValido);
           return d;
        }
    
}
