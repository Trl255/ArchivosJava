
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
Mostrar en consola el título de los 3 cursos con mayor duración.
Mostrar en consola la duración total de todos los cursos.
Mostrar en consola todos aquellos cursos que superen el promedio en cuanto a duración se refiere.
Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
Obtener el curso con mayor duración.
Crear una lista de Strings con todos los titulos de los cursos.
 */
public class EjerciciosStream {

    public static void main(String[] args) {
        
        
    List<Curso> cursos = new ArrayList<>();
    cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
    cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
    cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
    cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
    cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
    
    
    }     
}