/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facultad;

import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Pablo
 */
public class Persona {

    protected Integer id;
    protected String apellido;
    protected String nombre;
    protected Integer dni;
    protected LocalDate fechaNacimiento;
    protected Ciudad ciudad;

    public Persona(Integer id, String apellido, String nombre, Integer dni, LocalDate fechaNacimiento, Ciudad ciudad) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    public Persona() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    public void guardar(SessionFactory sf){
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();
        session.save(this);
        tx.commit();
        session.close();
    }
    public void actualizar(SessionFactory sf){
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();
        session.update(this);
        tx.commit();
        session.close();
    }
    
    public void borrar(SessionFactory sf){
        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();
        session.delete(this);
        tx.commit();
        session.close();
    }
    public void listar(SessionFactory sf){
    }
       
    

    @Override
    public String toString() {
        return "Persona{" + "apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", ciudad=" + ciudad + '}';
    }

}
