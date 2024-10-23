
package Empleado;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        
        
        Empleado []misEmpleados=new Empleado[5];
        misEmpleados[0]=new Empleado ("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1]=new Empleado ("Ana López", 95000, 1995, 06, 02);
        misEmpleados[2]=new Empleado ("María Martín", 105000, 2002, 03, 15);
        misEmpleados[3]=new Empleado ("Ana Patricia Cano", 120000, 1990, 12, 07);
        misEmpleados[4]=new Empleado ("Paula Muñoz");
        
        for (Empleado e: misEmpleados){
            e.subeSueldo(5);
        }
        for (Empleado e : misEmpleados){
            System.out.println(e.toString());
        }
        
    }
    
}
