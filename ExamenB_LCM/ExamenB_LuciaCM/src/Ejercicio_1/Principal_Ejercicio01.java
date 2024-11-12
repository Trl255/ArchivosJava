/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author IFC303-1
 */
public class Principal_Ejercicio01 {
    public static void main(String[] args) {
        Propietario propietario1=new Propietario("12345678A");
        Propietario propietario2=new Propietario("98745612B");
        
        Edificio edificio1=new Edificio(propietario1, "constructora uno");
        Edificio edificio2=new Edificio(propietario2, "constructora dos");
        
        System.out.println("El propietario principal del edificio 1 era: "+propietario1.getDni());
        propietario1.setDni("23232323C");
        System.out.println("Ahora el propietario del edificio 1 es: "+propietario1.getDni()+"\n");
        
        System.out.println("La constructora del edicicio 2 era: "+edificio2.getConstructora());
        edificio2.modificarConstructora("CONSTRUCTORA NUEVA");
        System.out.println("Ahora la constructora nueva es: "+edificio2.getConstructora());
    }
}
