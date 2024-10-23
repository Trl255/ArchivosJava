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
public class Obras {
    public String titulo;
    protected String autor;
    public String genero;

    
    Obras(String autor){
        this.autor=autor;
    }
    Obras(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    Obras(String titulo, String autor, String genero){
        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
    }
    
    void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    void setAutor(String autor) {
        this.autor = autor;
    }
    void setGenero(String genero) {
        this.genero = genero;
    }

    String getAutor() {
        return autor;
    }
    
    String mostrar(){
        String resultado="";
        if(titulo!=null && genero!=null && autor!=null)
            resultado="La obra "+titulo+" de género "+genero+" pertenece al autor "+autor+".";
        else{
            if(titulo==null && genero!=null && autor!=null)
                resultado="La obra de género "+genero+" pertenece al autor "+autor+".";
            if(titulo!=null && genero==null && autor!=null)
                resultado="La obra "+titulo+" pertenece al autor "+autor+".";
            if(titulo!=null && genero!=null && autor==null)
                resultado="La obra "+titulo+" de género "+genero+".";
            if(titulo!=null && genero==null && autor==null)
                resultado="El título de obra es "+titulo+".";
            if(titulo==null && genero!=null && autor==null)
                resultado="El género de la obra es "+genero+".";
            if(titulo==null && genero==null && autor!=null)
                resultado="El autor de la obra es "+autor+".";      
        }
        if(titulo==null && genero==null && autor==null)
            resultado=null;
        return resultado;
    }
}
