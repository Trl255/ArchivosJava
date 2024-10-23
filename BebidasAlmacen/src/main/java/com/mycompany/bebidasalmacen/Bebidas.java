/* Nos piden hacer un almacén, vamos a usar programación orientado a objetos.

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
public class  Bebidas implements Serializable {
    
    public static int idActual=1;
    
    private int id;
    private String marca;
    private double litros;
    private double precio;
    
    
    Bebidas (){
        
        
    }
   Bebidas (String marca, double litros, double precio){
       this.marca= marca;
       this.litros= litros;
       this.precio= precio;
       this.id=idActual++;
       
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public double getLitros() {
        return litros;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return " La bebida tiene una marca: " + marca + " ID: "+id+"\nCapacidad de litros: " + litros + "\ntiene un precio de:" + precio + ", ";
    }
    
}
