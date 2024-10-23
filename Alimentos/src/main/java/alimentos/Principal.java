
package alimentos;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* LocalDate fecha1=LocalDate.parse("2021-8-12");
        DateTimeFormatter formatoespana=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha2=LocalDate.parse("12-08-2022", formatoespana);
        int d, m, a;*/
        
        
        
        Frescos fresco1=new Frescos("E-589","Brazil");
        System.out.println("El lote es:" +fresco1.getLote()+" y el país es: "+fresco1.getPais());
        Refrigerado refri1=new Refrigerado("E-968", "Holanda", "GEE", 5.0);
        System.out.println("El lote es: "+refri1.getLote()+" el país es: "+refri1.getPais()+" el registro sanitario es: "+refri1.getOrganismo()+" y la temperatura es: "+refri1.getTemperatura());
        Congelado conge1=new Congelado("E-987", "Francia", -20);
        System.out.println("El lote es : "+conge1.getLote()+" la temperatura es "+conge1.getTemperatura());
        
        
        Agua congeAgua1=new Agua("E-010222", "Italia", -21.0, 1.2);
        System.out.println(congeAgua1.toString());
        
        Aire congeAire1=new Aire ("I-012221", "Italia", -20, 1.2, 0.5, 2.1, 1.5);
        
       
        
    }
    
    
    
}
