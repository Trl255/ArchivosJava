

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;


public class Metodos {
    
    static Scanner entrada=new Scanner(System.in);
      static int menu(){
        
        System.out.println("*****************************************************");
        System.out.println("**********SELECCIONA UNA OPCIÓN**********************");
        System.out.println("      1. Añadir un empleado");
        System.out.println("      2. Borrar un empleado");
        System.out.println("      3. Modificar un empleado");
        System.out.println("      4. Listar");
        System.out.println("      5. Salir");
        System.out.println("*****************************************************");
        System.out.println("       Introduce la opción");
        int seleccion=0;
        do{
        seleccion= leerEntero();
        }while(seleccion>5 || seleccion<1);
        return seleccion;
    }
    
    static int leerEntero(){
        int valor=0;
        boolean valido=true;
        while(valido)
        try{
          valor=entrada.nextInt();
          entrada.nextLine();
          valido=false;
        }catch (InputMismatchException e){
          entrada.nextLine();
          System.out.println("Esa opcion no es correcta introduce otra");
        }
         return valor;       
    }
    
     static double leerDouble(){
        double valor=0;
        boolean valido=true;
        while(valido)
        try{
          valor=entrada.nextDouble();
          entrada.nextLine();
          valido=false;
        }catch (InputMismatchException e){
          entrada.nextLine();
          System.out.println("Esa opcion no es correcta introduce otra");
        }
         return valor;       
    }
    static int buscarEmpleado(Empleado empleado,Empleado[]empleados){
        int siEsta=-1;
      /*  for(int i=0;i<empleados.length;i++){
            if(empleado.getDni()==empleados[i].getDni()) siEsta=true;
        }*/
      if(empleados!=null)
       for(int i=0;i<empleados.length;i++){
            if(empleado.compare(empleado, empleados[i])==1) siEsta=i;
        }
        
        return siEsta;
        
    }
    static Empleado[] nuevoUsuario(Empleado empleado,Empleado [] empleados){
        int longitud=0;
        if(empleados!=null){
            longitud=empleados.length;
        }
        Empleado []listaNueva=new Empleado[longitud+1];
        for(int i=0;i<longitud;i++)
            listaNueva[i]=new Empleado(empleados[i].getDni(),empleados[i].getNombre(),empleados[i].getSueldo());
        listaNueva[longitud]=new Empleado(empleado.getDni(),empleado.getNombre(),empleado.getSueldo());
        
        System.out.println("Usuario añadido");
        return listaNueva;
        
    }
    static Empleado[] borrarEmpleado(int indice, Empleado[]empleados){
        int longitud=empleados.length;
        
        Empleado []listaNueva=new Empleado[longitud-1];
        for(int i=0;i<longitud;i++){
            //if(empleados!=null )
            if(i<indice)
            listaNueva[i]=new Empleado(empleados[i].getDni(),empleados[i].getNombre(),empleados[i].getSueldo());
            if(i>indice)
            listaNueva[i-1]=new Empleado(empleados[i].getDni(),empleados[i].getNombre(),empleados[i].getSueldo());
        }
        System.out.println("Usuario eliminado");
        return listaNueva;
    }
    static void modificarEmpleado(int indice, Empleado[]empleados){
        System.out.println("¿Quieres cambiar el nombre (Si/No)?");
        String respuesta=entrada.nextLine();
        if(!respuesta.equalsIgnoreCase("No")){
            System.out.println("Dime el nuevo nombre");
            empleados[indice].setNombre(entrada.nextLine());
        }
         System.out.println("¿Quieres cambiar el dni (Si/No)?");
         respuesta=entrada.nextLine();
        if(!respuesta.equalsIgnoreCase("No")){
            System.out.println("Dime el nuevo dni");
            empleados[indice].setDni(entrada.nextLine());  
        }
         System.out.println("¿Quieres cambiar el sueldo (Si/No)?");
         respuesta=entrada.nextLine();
        if(!respuesta.equalsIgnoreCase("No")){
            System.out.println("Dime el nuevo sueldo");
            empleados[indice].setSueldo(leerDouble());  
        }
            
        
    }
    
}
