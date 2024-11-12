/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t14.ejercicio04;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/**
 * Ejercicio4. Hacer una aplicación que gestione las existencias de una tienda
 * de ropa. Cada producto se identifica por un valor alfanumérico. Se podrá dar
 * de alta, de baja los productos; y modificar el número de elementos de cada
 * producto. Los datos se mantendrán en un fichero, que se actualizará al cerrar
 * la
 *
 * @author josea
 */
public class Articulo implements Serializable, Comparable<Articulo> {

    private String descripcion;
    private Integer cantidad;
    private String codigo;

    private String codGenerado;

    Articulo(String descripcion, Integer cantidad) {

        this.descripcion = descripcion;
        this.cantidad = cantidad;
        codGenerado = generarCodigo();
        this.codigo = codGenerado;

    }

    Articulo(String codigo) {

        this.codigo = codigo;

    }

    private String generarCodigo() {
        String codigo = null, cod = null;

        for (int i = 0; i < 20; i++) {
            char num = (char) Math.floor(Math.random() * (65 - 90 + 1) + (90));

            Integer numero = (int) Math.floor(Math.random() * (1005 - 2000 + 1) + (2000));

            codigo = numero + "";
            cod = num + codigo;

        }
        return cod;

    }

    public void setId(String id) {
        this.codigo = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Id= " + codigo + ", Artículo: " + descripcion + "\n           Stock:     " + cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 9;
        hash = 68 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null) {
            return false;
        }
        if (getClass() != ob.getClass()) {
            return false;
        }
        Articulo other = (Articulo) ob;
        if (!codigo.equals(other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Articulo o) {
        return codigo.compareTo(o.codigo);
    }

}
