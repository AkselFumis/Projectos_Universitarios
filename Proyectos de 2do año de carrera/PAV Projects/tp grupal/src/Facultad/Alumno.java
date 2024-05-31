/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad;

import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Pablo
 */
public class Alumno extends Persona{
    private Integer numeroLegajo;
    private LocalDate añoIngreso;

    public Alumno(Integer numeroLegajo, LocalDate añoIngreso, Integer id, String apellido, String nombre, Integer dni, LocalDate fechaNacimiento, Ciudad ciudad) {
        super(id, apellido, nombre, dni, fechaNacimiento, ciudad);
        this.numeroLegajo = numeroLegajo;
        this.añoIngreso = añoIngreso;
    }

    public Alumno(Integer numeroLegajo, LocalDate añoIngreso) {
        this.numeroLegajo = numeroLegajo;
        this.añoIngreso = añoIngreso;
    }

    public Alumno() {
    }

    public Integer getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(Integer numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public LocalDate getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(LocalDate añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    
    @Override
    public void listar(SessionFactory sf) {
        List<Alumno> alumnos = sf.openSession().createQuery("From Alumno").list();
        for(Alumno a:alumnos){
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        return "Alumno: " + "apellido: " + apellido + ", nombre: " + nombre + ", dni: " + dni + ", fecha de nacimiento: " + fechaNacimiento + ", ciudad: " + ciudad + "número de legajo: " + numeroLegajo + ", año de ingreso:" + añoIngreso + ".-";
    }
    
}
