
package Unidad4.Clase11CursosAlumnos;

import java.util.*;


public class Curso {
    private List<Alumno> curso = new ArrayList<>();
    
    public Curso(){
    }

    public List<Alumno> getCurso() {
        return curso;
    }

    public void setCurso(List<Alumno> curso) {
        this.curso = curso;
    }
    
    public void matricularAlumno(Alumno a){
        this.curso.add(a);
    }
    
    public void desmatricularAlumno(Alumno a){
        this.curso.remove(a);
    }
    
    public void consultarAlumno(int legajo){
        int i = 0;
        while(i<this.curso.size() && legajo != this.curso.get(i).getLegajo()){
            i++;
        }
        if(legajo == this.curso.get(i).getLegajo()){
            System.out.println(curso.get(i));
        }
        else
            System.out.println("No se encontro al alumno");
    }
    
    public void listaOrdenada(){
        this.curso.sort(null);
    }
    public void listarAprobados(){
        
        Iterator it = this.curso.iterator();
        
        while(it.hasNext()){
            Alumno a = (Alumno)it.next();
            if(a.getNotaTp() > 6){
                System.out.println(a);
            }
        }
        
        /*for(Alumno a: this.curso){
            if(a.getNotaTp()>=6){
                System.out.println(a);
            }
                
        }*/
    }
    
}
