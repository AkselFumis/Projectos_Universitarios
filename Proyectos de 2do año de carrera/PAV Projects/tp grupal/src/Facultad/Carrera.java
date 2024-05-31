/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad;

import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Pablo
 */
public class Carrera {

    private Integer id;
    private String nombre;
    private Facultad facultad;
    private List<Materia> materias = new LinkedList();

    public Carrera(Integer id, String nombre, Facultad facultad) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Carrera() {
    }

    public void guardar(SessionFactory sf) {
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Carrera carrera = this;
        session.save(carrera);
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

    public static List<Carrera> listar(SessionFactory sf) {
        List<Carrera> carreras = sf.openSession().createQuery("From Carrera").list();
        for (Carrera carrera : carreras) {
            System.out.println(carrera.toString());
        }
        return carreras;
    }

    @Override
    public String toString() {
        return "Carrera: " + "nombre: " + nombre + ", facultad: " + facultad + ", materia: " + materias + ".-";
    }


}
