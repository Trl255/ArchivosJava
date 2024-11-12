import java.util.ArrayList;
import java.util.List;


/**
-Obtener la cantidad de cursos con una duraciÃ³n mayor a 5 horas.
-Obtener la cantidad de cursos con una duraciÃ³n menor a 2 horas.
-Listar el tÃ­tulo de todos aquellos cursos con una cantidad de vÃ­deos mayor a 50.
-Mostrar en consola el ti­tulo de los 3 cursos con mayor duraciÃ³n.
-Mostrar en consola la duracion total de todos los cursos.
-Mostrar en consola todos aquellos cursos que superen el promedio en cuanto a duraciÃ³n se refiere.
-Mostrar en consola la duraciÃ³n de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
-Obtener el curso con mayor duraciÃ³n.
-Crear una lista de Strings con todos los titulos de los cursos.
 */
public class EjerciciosStream {

    public static void main(String[] args) {
    List<Curso> cursos = new ArrayList<>();
    cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
    cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
    cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
    cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
    cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
    System.out.println("------------Mayores de 5 horas--------------");
    cursos.stream().filter(e->e.getDuracion()>5).forEachOrdered(e->System.out.println(e.getTitulo()));
        System.out.println("--------Menores de 2 horas------------------");
    cursos.stream().filter(e->e.getDuracion()<2).forEach(e->System.out.println(e.getTitulo()));
        System.out.println("--------Menores de 2 horas------------------");
        cursos.stream().
        
    cursos.stream().sorted(comparator)
        
    
    
    
    
    
    
    
    
    
    }
}
   