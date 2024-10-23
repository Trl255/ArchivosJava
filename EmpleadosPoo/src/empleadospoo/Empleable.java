/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package empleadospoo;

/**
 *
 * @author josea
 */
public interface Empleable {
    boolean plusAntiguedad();
    boolean descuento();
    
    static double irpf(){
        return 0.15;
    }
    boolean edadMedia();
    
}
