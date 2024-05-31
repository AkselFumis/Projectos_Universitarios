/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Pablo
 */
public class Materia {
    private Integer id;
    private String nombre;
    private Integer nivel;
    private Profesor profesor;
    private List<Alumno> alumnos = new ArrayList<Alumno>() ;

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Materia(Integer id, String nombre, Integer nivel, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.profesor = profesor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Materia() {
    }
    
    

    @Override
    public String toString() {
        return "Materia: " + "nombre: " + nombre + ", nivel: " + nivel + ", profesor: " + profesor + ", alumno: " + alumnos + ".-";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    
    public void guardar(SessionFactory sf) {
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(this);
        tx.commit();
        session.close();
    }

    public void actualizar(SessionFactory sf) {

        Session session = sf.openSession();
        Transaction trx = session.beginTransaction();
        session.update(this);
        trx.commit();
        session.close();
    }

    public void borrar(SessionFactory sf) {
        Session session = sf.openSession();
        Transaction trx = session.beginTransaction();
        session.delete(this);
        trx.commit();
        session.close();

    }

    public static List<Materia> listar(SessionFactory sf) {
        List<Materia> carreras = sf.openSession().createQuery("From Materia").list();
        for (Materia carrera : carreras) {
            System.out.println(carrera.toString());
        }
        return carreras;
    }

}