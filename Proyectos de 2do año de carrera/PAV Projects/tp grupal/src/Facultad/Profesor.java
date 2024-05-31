/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad;

import java.time.LocalDate;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pablo
 */
public class Profesor extends Persona {

    private Integer antiguedad;

    public Profesor(Integer antiguedad, Integer id, String apellido, String nombre, Integer dni, LocalDate fechaNacimiento, Ciudad ciudad) {
        super(id, apellido, nombre, dni, fechaNacimiento, ciudad);
        this.antiguedad = antiguedad;
    }

    public Profesor() {

    }

    public Integer getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void listar(SessionFactory sf) {
        List<Profesor> profesores = sf.openSession().createQuery("From Profesor").list();
        for(Profesor p:profesores){
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return "Profesor: " + "apellido: " + apellido + ", nombre: " + nombre + ", dni: " + dni + ", fecha de nacimiento: " + fechaNacimiento + ", ciudad: " + ciudad + "antiguedad: " + antiguedad + ".-";
    }

}
