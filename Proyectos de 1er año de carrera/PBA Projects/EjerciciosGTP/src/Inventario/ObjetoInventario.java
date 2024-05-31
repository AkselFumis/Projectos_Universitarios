/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventario;

/**
 *
 * @author lirio
 */
public abstract class ObjetoInventario implements Item {

    protected String nombre, descripcion;

    public ObjetoInventario(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double obtenerPeso() {
        double suma = 0;
        for (int i = 0; i < nombre.length(); i++) {

            suma += 1.5;
        }

        return suma;
    }

    public void esEquipable() {

        if (this.obtenerPeso() > 30 || this.nombre.length() > 20) {
            System.out.println("El objeto " + this.nombre + " no es equipable");
        } else {
            System.out.println("El objeto " + this.nombre + " se puede equipar");
        }
    }

    @Override
    public void obtenerNombre() {
        System.out.println(this.nombre);
    }

    @Override
    public void obtenerDescripcion() {
        System.out.println(this.descripcion);
    }

    
    
    
}
