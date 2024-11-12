/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manejodeventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author IFC303-1
 */
public class ManejoDeVentanas { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MiVentana ventana1 = new MiVentana();
        //ventana1.setVisible(true);
        ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana1.setTitle("Ventana1");
        ventana1.setBounds(700, 50, 1200, 1000);
        //SetIconImage(image image), pero primero hay que crear un objeto de imagen
        
        
        
        MiVentana ventana2 = new MiVentana();
        
        ventana2.setVisible(true);
        ventana2.add(new MiPanel());
        ventana2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        ventana2.setTitle("Ventana DOS");
        ventana2.setResizable(false);
        String valor = JOptionPane.showInputDialog("Dame un valor");

    }

}

class MiVentana extends JFrame {

    public MiVentana() {
        setSize(800, 500);//Las ventanas por defecto se crean invisible
        setVisible(true);

    }

}
class MiPanel extends JPanel{
    
    public MiPanel(){
        this.setForeground(Color.orange);
        
    }
    
}
class VentanaCentro extends JFrame{
    
    public VentanaCentro(){
        Toolkit mipantalla= Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla= mipantalla.getScreenSize();
        int alturaPantalla=tamanioPantalla.height;
        int anchuraPantalla= tamanioPantalla.width;
        
        setSize(anchuraPantalla/2, alturaPantalla/2);
        
        setLocation(anchuraPantalla/4, alturaPantalla/4);
    }
    
    
}