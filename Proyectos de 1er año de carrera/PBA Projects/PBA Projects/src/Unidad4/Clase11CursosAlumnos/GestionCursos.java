
package Unidad4.Clase11CursosAlumnos;


public class GestionCursos {

    
    public static void main(String[] args) {
        Curso pba = new Curso();
        
        Alumno alum1 = new Alumno("Mike",28331,0);
        Alumno alum4 = new Alumno("Aaron",28331,8);
        Alumno alum2 = new Alumno("Patri",24431,7);
        Alumno alum3 = new Alumno("Aksel",28745,10);
        
        pba.matricularAlumno(alum1);
        pba.matricularAlumno(alum2);
        pba.matricularAlumno(alum3);
        pba.matricularAlumno(alum4);
        
        
        
        
        System.out.println(pba.getCurso());
        
        pba.listaOrdenada();
        
        System.out.println(pba.getCurso());
        
        pba.listarAprobados();
    }
    
}
