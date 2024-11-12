/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Cap01.EstructuraAp;

import java.awt.event.ActionEvent;

/**
 *
 * @author josea
 */
public class CAplicacion extends javax.swing.JFrame {

    private javax.swing.JLabel jEtSaludo;
    private javax.swing.JButton jBtSaludo;

    public CAplicacion()//constructor
    {
        setSize(300, 200); //Tamaño del formulario.
        setTitle("Aplicación"); //Título del formulario.
        initComponents(); //Iniciar los controles o componentes.
    }

    /*Este método es llamado desde el constructor CAplicaion*/
    private void initComponents() {

        getContentPane().setLayout(null);

        jEtSaludo = new javax.swing.JLabel();
        jEtSaludo.setText("Etiqueta");
        jEtSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEtSaludo.setFont(new java.awt.Font("Dialog", 1, 18));
        getContentPane().add(jEtSaludo);

        jEtSaludo.setBounds(40, 36, 204, 30);

        jBtSaludo = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowClosing(java.awt.event.WindowEvent evt) {

                exitForm(evt);

            }
        });

        jBtSaludo.setToolTipText("Botón de pulsación");
        jBtSaludo.setMnemonic('c');
        jBtSaludo.setText("Haga click aquí");

        jBtSaludo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSaludoActionPerformed(evt);

            }
        });

        getContentPane()
                .add(jBtSaludo);
        jBtSaludo.setBounds(
                40, 90, 204, 30);

        jBtSaludo.addActionListener(
                new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt
            ) {
                Object obj = evt.getSource();

                if (obj == jBtSaludo) {
                    //  responder con una acción si es igual a jBtSaludo

                }

            }
        }
        );

    }

    /*Salir de la aplicación*/
    private void exitForm(java.awt.event.WindowEvent evt) {
        System.exit(0);
    }

    private void BtSaludoActionPerformed(java.awt.event.ActionEvent evt) {

        float rojo = (float) Math.random();
        float verde = (float) Math.random();
        float azul = (float) Math.random();

        jEtSaludo.setForeground(new java.awt.Color(rojo, verde, azul));

        jEtSaludo.setText("Hola Mundo!!!");

    }

    /**
     * @parámetros args: argumentos pasados en la línea de órdenes.
     */
    public static void main(String[] args) {

        try {
            //Aspecto de la interfaz gráfica
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("No se puede establecer el aspecto deseado: " + e);

        }
        new CAplicacion().setVisible(true);
    }
//Declaración de variables.
}
