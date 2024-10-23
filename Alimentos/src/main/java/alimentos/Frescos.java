
package alimentos;

import java.time.LocalDate;

public class Frescos extends Alimentos{
    
    
    
    Frescos (String lote, LocalDate fechaEnvasado, LocalDate fechaCaducidad, String pais){
        super(lote, fechaEnvasado, fechaCaducidad, pais);
    }    
    
    Frescos (String lote, String pais){
        super(lote, pais);
        
    }



    
}
