/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listasclientet14;

import com.mycompany.listasclientet14.Cliente;
import java.util.Comparator;

/**
 *
 * @author profesor
 */
public class OrdenarPorNombre implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Cliente)o1).nombre.compareTo(((Cliente)o2).nombre);
    }
    
    
}
