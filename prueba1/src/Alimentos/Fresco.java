/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alimentos;

import java.time.LocalDate;

/**
 *
 * @author profesor
 */
public class Fresco extends Alimentos {
    
    Fresco(String lote, LocalDate fechaEnvasado,LocalDate fechaCaducidad, String pais){
        super(lote,fechaEnvasado,fechaCaducidad,pais);
    }
    Fresco(String lote,String pais){
        super(lote,pais);
    }
    
    
    
}
