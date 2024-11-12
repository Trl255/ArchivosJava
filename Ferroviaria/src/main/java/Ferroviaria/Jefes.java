/*/*Ejercicio8. Debemos definir los paquetes y clases necesarias para gestionar una empresa ferroviaria,
en la que se distinguen dos grandes grupos: el personal y la maquinaria. En el primero se ubican todos
los empleados de la empresa, que se clasifican en tres grupos: los maquinistas, los mecánicos y los jefes
de estación. De cada uno de ellos guardaremos:
 Maquinistas: su nombre, DNI, sueldo y el cargo en la empresa
 Mecánicos: nombre, teléfono y en qué especialidad desarrollan su trabajo (frenos, hidráulica,
electricidad o motor)
 Jefes de estación: nombre, DNI y la fecha en que fue nombrado jefe de estación.
En la parte de maquinaria podemos encontrar trenes, locomotoras y vagones. De cada uno de ellos
consideraremos:
 Vagones: número que los identifica, carga máxima, carga actual y tipo de mercancía que tienen
ahora.
 Locomotoras: tienen una matrícula que las identifica, la potencia de sus motores y la
antigüedad (año de fabricación). Además, cada locomotora tiene un mecánico que se encarga
de su mantenimiento.
 Trenes: formados por una locomotora y un máximo de 5 vagones. Cada tren tiene asignado un
maquinista que es responsable de él.
Todas las clases del personal son de uso público. En el caso de la maquinaria solo será posible construir,
desde clases externas, objetos tipo Tren y Locomotora. La clase Vagon solo será visible por sus clases
vecinas */
package Ferroviaria;

import Ferroviaria.Personas;
import java.util.Date;
import java.util.GregorianCalendar;

public class Jefes extends Personas {

    public Date fechaAscenso;
    public Personas persona;
    
    
    Jefes(String nombre, String dni, int anne, int mes, int dia){
        super(nombre, dni);
        GregorianCalendar fecha=new GregorianCalendar(anne,mes-1, dia);
        fechaAscenso=fecha.getTime();
    }
    void estableceFechaAscenso(Date fechaAscenso) {
        this.fechaAscenso = fechaAscenso;
    }
    
    @Override
    String dimeDatos() {
        return "El nombre: "+nombre+" con DNI: "+dni+ " ha sido ascendido el "+fechaAscenso;
    }
    


    
    
}
