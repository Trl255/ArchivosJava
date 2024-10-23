
package Tema3;

public class prueba_1 {
    public static void main(String[] args) {
        
 boolean b;
    char a='9', c='8', d= 'f', h='B';
    char i='\n';     
    /*b = Character.isDigit(c); // aquí b valdrá true ya que 8 es un dígito
        System.out.println(""+b);
    b = Character.isDigit(a); // aquí b valdrá false porque d no es un dígito
    System.out.println( " "+b);
   
    
    d =Character.toLowerCase('d'); //devolverá false ya que no es una letra
        System.out.println("lo pasará a minuscula?"+i+b);
        
     b=Character.isLetterOrDigit(c);
        System.out.println("");*/
      
      
      
      String s="Hola como estas"+" espero que este muy bien";
     String t = s.substring(0,s.length());
     String c1= s.concat(" Quizas me equivoque en decir");
     System.out.println("De la posición 0 a la 15 "+i+t);
        System.out.println("Ahora todo "+i+c1);
      
        int z=12;
     String e1=s.substring(3);
        System.out.println("Vamos a probar substring posición "+ z + i+ e1);
     
     /*for (int k=0; k< s.length() ; k++){
         char ch1=s.charAt(k);
       System.out.println(""+k);
        }*/
        
      /*s= s.concat(" también")+" bien";
        System.out.println("\t"+s);
        System.out.println("longitud de Hola como estas espero que:"+i +s.length());
        
        Integer i3=new Integer (123546);
        i3+=350+4;
        i3.toString(i3);
        System.out.println("número "+i3);*/
        
        
        
    
            
          
            
            
    }/*static boolean isDigit(char c){
        //indica si el carácter c es un dígito. Devuelve true en caso
//afirmativo y false en caso contrario.
char c='8', d= 'f';
boolean b;
b = Character.isDigit(c); // aquí b valdrá true ya que 8 es un dígito
b = Character.isDigit(d); // aquí b valdrá false porque d no es un dígito
        return false;
    
    }*/
}
