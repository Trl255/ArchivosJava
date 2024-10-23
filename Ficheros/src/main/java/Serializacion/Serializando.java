/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Serializando {
    private static final long serialVersionUID=1L;
    
    public static void main(String[] args){
        Administrador jefe=new Administrador("Juan",50000,1999,2,15);
        jefe.fijarIncentivo(2000);
        Empleado []empleados=new Empleado[3];
        empleados[0]=jefe;
        empleados[1]=new Empleado("Ana",25000,2000,10,25);
        empleados[2]=new Empleado("Luis",10000,2012,9,30);
        try{
        FileOutputStream fichero=new FileOutputStream("C:/Serializacion/Probando.dat");
        ObjectOutputStream serializar = new ObjectOutputStream(fichero);
        serializar.writeObject(empleados);
        serializar.close();
        //Recuperemos la informacion que tenemos en Probando.dat
        FileInputStream ficheroRecuperar=new FileInputStream("C:/Serializacion/Probando.dat");
        ObjectInputStream recuperar=new ObjectInputStream(ficheroRecuperar);
        Object recuperacion;
        recuperacion=recuperar.readObject();
        Empleado [] personal=(Empleado[])recuperacion;
        recuperar.close();
        for(Empleado e: personal)
            System.out.println(e);
        
        }catch (Exception e){
            System.out.println("Error al abrir el fichero");
        }
    }
}

class Empleado implements Serializable{
    private String nombre;
    private double sueldo;
    Date fechaContrato;
    public Empleado(String nombre, double sueldo, int agno,int mes,int dia){
        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar fecha=new GregorianCalendar(agno,mes-1,dia);
        fechaContrato=fecha.getTime();
   }
    public String obtenerNombre(){
        return nombre;
    }
     public double obtenerSueldo(){
        return sueldo;
    }
     public Date obtenerFecha(){
         Date fech=fechaContrato;
         return fech;
     }
     public void subirSueldo(double porcentaje){
         double aumento=sueldo+sueldo*porcentaje;
         sueldo=aumento;
     }
     public String toString(){
         return "Nombre "+nombre+ " Sueldo "+sueldo+ " Fecha "+fechaContrato;
     }
}
class Administrador extends Empleado{
    private double incentivo;
    public Administrador(String nombre, double sueldo, int agno,int mes,int dia){
        super(nombre, sueldo,agno,mes,dia);
        incentivo=0;
    }
    public void fijarIncentivo(double s){
        incentivo=s;
    }
    public double obtenerSueldo(){
        return super.obtenerSueldo();
    }
    public String toString(){
        return super.toString()+ " Intentivos "+incentivo;
    }
}
