/*/* Nos piden hacer un almacén, vamos a usar programación orientado a objetos.

En un almacén se guardan un conjunto de  bebidas.

Estos productos son bebidas como agua mineral y bebidas azucaradas (coca-cola, fanta, etc). De los productos nos interesa saber su identificador 
(cada uno tiene uno distinto), cantidad de litros, precio y marca.

Si es agua mineral nos interesa saber también el origen (manantial tal sitio o donde sea).

Si es una bebida azucarada queremos saber el porcentaje que tiene de azúcar y si tiene o no alguna promoción (si la tiene tendrá un descuento del 10% en el precio).

En el almacén iremos almacenado estas bebidas por estanterías (que son las columnas de la matriz).

Las operaciones del almacén son las siguientes:

Calcular precio de todas las bebidas: calcula el precio total de todos los productos del almacén.
Calcular el precio total de una marca de bebida: dada una marca, calcular el precio total de esas bebidas.
Calcular el precio total de una estantería: dada una estantería (columna) calcular el precio total de esas bebidas.
Agregar producto: agrega un producto en la primera posición libre, si el identificador esta repetido en alguno de las bebidas, no se agregará esa bebida.
Eliminar un producto: dado un ID, eliminar el producto del almacén.
Mostrar información: mostramos para cada bebida toda su información.
Puedes usar un main para probar las funcionalidades (añade productos, calcula precios, muestra información, etc) */
package com.mycompany.bebidasalmacen;

import java.io.Serializable;

/**
 *
 * @author josea
 */
public class Almacen implements Serializable {

    private Bebidas estanteria[][];

    Almacen(int fila, int columna) {
        estanteria = new Bebidas[fila][columna];

    }

    Almacen() {
        estanteria = new Bebidas[5][5];
    }

    void agregarBebida(Bebidas b) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int z = 0; z < estanteria[0].length && !encontrado; z++) {
                if (estanteria[i][z] == null) {
                    estanteria[i][z] = b;
                    encontrado = true;
                }
                
                }

            }if (encontrado) {
                    System.out.println("Se ha añadido corectamente la bebida " + b.toString());

                } else {
                    System.out.println("No se ha podido añadir la bebida");
        }

    }

    void eliminarBebida(int id) {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int z = 0; z < estanteria[0].length && !encontrado; z++) {
                if (estanteria[i][z] != null && estanteria[i][z].getId() == id) {

                    estanteria[i][z] = null;
                    encontrado = true;
                }
                if (encontrado) {
                    System.out.println("Se ha eliminado correctamente el articulo");
                } else {
                    System.out.println("No se ha encontrado el ID introducido");
                }
            }

        }

    }

    void mostrarBebidas() {
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length; i++) {
            for (int z = 0; z < estanteria[0].length; z++) {
                if (estanteria[i][z] != null) {
                    System.out.println("Fila :" + i + ", columna :" + z + "\n Bebida: " + estanteria[i][z].toString());
                }

            }
        }

    }

    public double calcularPrecioBebidas() {
        double precioFinal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int z = 0; z < estanteria[0].length; z++) {
                if (estanteria[i][z] != null) {
                    precioFinal += estanteria[i][z].getPrecio();
                }
            }
        }
        return precioFinal;
    }

    public double calcularPrecioBebidas(String marca) {
        double precioMarca = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int z = 0; z < estanteria[0].length; z++) {
                if (estanteria[i][z] != null) {

                    if (estanteria[i][z].getMarca().equalsIgnoreCase(marca)) {
                        precioMarca += estanteria[i][z].getPrecio();
                    }
                }

            }
        }
        return precioMarca;
    }

    public double calcularPrecioBebidas(int columna) {
        double precioFinal = 0;

        if (columna >= 0 && columna < estanteria[0].length) {

            for (int i = 0; i < estanteria.length; i++) {
                if (estanteria[i][columna] != null) {
                    precioFinal += estanteria[i][columna].getPrecio();

                }

                return precioFinal;

            }
        } else {
            System.out.println("El rango de la columna debe estar entre 0 y " + estanteria.length);
        }
        return precioFinal;
    }
}

/*
for (int i=0; i<estanterias.length; i++){
            for (int x=0; i<estanterias[0].length; i++){
                
            }
        }
 */
 /*}void PruebaEliminarBebida(int id) {
        Bebidas [][]estanteriaMenos= new Bebidas[estanteria.length-1][estanteria.length-1];
        boolean encontrado = false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int z = 0; z < estanteria[0].length && !encontrado; z++) {
                if (estanteria[i][z] != null && estanteria[i][z].getId() == id) {

                    estanteria[i][z] = null;
                    encontrado = true;
                    
                }
                if (encontrado) {
                    System.out.println("Se ha eliminado correctamente el articulo");
                } else {
                    System.out.println("No se ha encontrado el ID introducido");
                }
            }

        }*/
