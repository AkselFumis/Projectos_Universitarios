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
public class Facultad {
    private Integer id;
    private String nombre;
    private Ciudad ciudad;

    public Facultad(Integer id, String nombre, Ciudad ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    public Facultad(){
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

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
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

    public static List<Facultad> listar(SessionFactory sf) {
        List<Facultad> carreras = sf.openSession().createQuery("From Facultad").list();
        for (Facultad carrera : carreras) {
            System.out.println(carrera.toString());
        }
        return carreras;
    }
    @Override
    public String toString() {
        return "Facultad: " + "id nro.: " + id + ", nombre: " + nombre + ", ciudad: " + ciudad + ".-";
    } 


    
    
    
    
}
