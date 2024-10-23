/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion_Obras;

/**
 *
 * @author IFC303-1
 */
public class Libros extends Obras{
    public int año_edicion;
    protected String protagonista;

    Libros(String autor, String prota){
        super(autor);
        this.protagonista=prota;
    }
    Libros(String autor, String prota, int año){
        super(autor);
        this.protagonista=prota;
        this.año_edicion=año;
    }
    
    void setAño_edicion(int año_edicion) {
        if(año_edicion>1)
            this.año_edicion = año_edicion;
        else
            System.out.println("El año introducido es inválido");
    }
    void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    String getProtagonista() {
        return protagonista;
    }
    
    @Override
    String mostrar(){
        String resultado="";
        if(super.mostrar()!=null){
            if(año_edicion>1 && protagonista!=null)
                resultado=super.mostrar()+"\nFue escrito en el año "+año_edicion+" y su protagonista es "+protagonista;
            if(año_edicion<0 && protagonista==null)
                resultado=super.mostrar();
            if(año_edicion<0 && protagonista!=null)
                resultado=super.mostrar()+"\nSu protagonista es "+protagonista;
            if(año_edicion>1 && protagonista==null)
                resultado=super.mostrar()+"\nFue escrito en el año "+año_edicion;
        }else{
            if(año_edicion>1 && protagonista!=null)
                resultado="\nFue escrito en el año "+año_edicion+" y su protagonista es "+protagonista;
            if(año_edicion<0 && protagonista!=null)
                resultado="\nSu protagonista es "+protagonista;
            if(año_edicion>1 && protagonista==null)
                resultado="\nFue escrito en el año "+año_edicion;
        }
            return resultado;
    }
    
}
