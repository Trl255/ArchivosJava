
package Empleado;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        Jefatura jefeRRHH=new Jefatura("Cristina", 5500, 1980, 02, 10);
        jefeRRHH.estableceIncentivo(2570);
        
        
        
        
        Empleado []misEmpleados=new Empleado[7];
        misEmpleados[0]=new Empleado ("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1]=new Empleado ("Ana López", 95000, 1995, 06, 02);
        misEmpleados[2]=new Empleado ("María Martín", 105000, 2002, 03, 15);
        misEmpleados[3]=new Empleado ("Ana Patricia Cano", 120000, 1990, 12, 07);
        misEmpleados[4]=new Empleado ("Paula Muñoz");
        
        misEmpleados[5]=jefeRRHH;
        misEmpleados[6]=new Jefatura("María Rodriguez", 95000, 1999, 5, 4);
        
        Jefatura jefaFinanzas= (Jefatura) misEmpleados[6];
        
        jefaFinanzas.estableceIncentivo(100000);
        
        for (Empleado e: misEmpleados){
            e.subeSueldo(6);
        }
        for (Empleado e : misEmpleados){
            System.out.println(e);
        }
        
        
        
        
        
        
    }
    
}
