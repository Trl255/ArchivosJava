
package Tema_8;

public class TrabPrincipal {
    public static void main(String[] args) {
        int resultado=0, x=50, y=20;
        
        resultado=x>y? x:y;
        
        System.out.println("el mayor es: "+resultado);
        
        
        Trabajador empleado10=new Trabajador("Paco");
        empleado10.cambiaSeccion("Dirección");
        Trabajador empleado11=new Trabajador("Ana Patricia");
        empleado11.cambiaSeccion("Informática");
        Trabajador empleado12=new Trabajador("Pedro");
        empleado12.cambiaSeccion("Publicidad");
        Trabajador empleado13=new Trabajador("Paula");
        
        
        System.out.println(empleado10.dameDatos()+"\n"+empleado12.dameDatos()
       +"\n"+empleado13.dameDatos()); 
        
        
    Trabajador []misEmpleados= new Trabajador[4];
    
    misEmpleados[0]=new Trabajador ("Patricia");
    misEmpleados[1]=new Trabajador ("José");
    misEmpleados[2]=new Trabajador ("Isabella");
    misEmpleados[3]=new Trabajador ("Pablo");
    
        System.out.println("El id va por: "+Trabajador.idPx);;
    
    for (Trabajador e: misEmpleados){
        e.cambiaSeccion("Administración");
    }
    for (Trabajador e: misEmpleados){
        System.out.println(e.dameDatos());
    }
        System.out.println(Trabajador.dameIdPx());
   
        
        
        
    }

    
}
