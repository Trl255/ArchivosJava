/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bebidasalmacen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author josea
 */
public class Serializar implements Serializable  {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Almacen 1.dat"))) {

            while (true) {

                Almacen aux = (Almacen) ois.readObject();
                System.out.println(aux.toString());

            }
        } catch (IOException ex) {

            System.out.println("Error de lectura " + ex.getMessage());
        }

    }
}
