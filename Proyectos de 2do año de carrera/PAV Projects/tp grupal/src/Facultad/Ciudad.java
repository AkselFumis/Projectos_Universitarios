/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Pablo
 */
public class Ciudad {

    private String nombre;
    private Integer id;

    public Ciudad(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Ciudad() {
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

    public static List<Ciudad> listar(SessionFactory sf) {
        List<Ciudad> carreras = sf.openSession().createQuery("From Ciudad").list();
        for (Ciudad carrera : carreras) {
            System.out.println(carrera.toString());
        }
        return carreras;
    }

    @Override
    public String toString() {
        return "Ciudad: " + "id nro.: " + id + ", nombre: " + nombre + ".-";
    }

}
