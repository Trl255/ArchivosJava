package empleadospoo;
 /** @author josea*/
public class Ejercicio_POO_08 {
//El main donde creamos los objetos.
    public static void main(String[] args) {

        //Creamos los objetos
        Comercial c1 = new Comercial(300, "Carlos Peréz", 37, 1000); //Comercial 1
        Repartidor r1 = new Repartidor("Zona 4", "Pablo García", 26, 900); //Repartidor 1

        //Llamamos a plus
        c1.plus(); // valora al comercial 1
        r1.plus(); // valora al repartidor 1

        //Mostramos la informacion del comercial 1
        System.out.println(c1);
        //Mostramos la informacion del repartidor 1
        System.out.println(r1);
    }

}
