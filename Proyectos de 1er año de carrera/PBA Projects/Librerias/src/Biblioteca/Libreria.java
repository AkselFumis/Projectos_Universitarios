package Biblioteca;

import java.util.*;

public class Libreria {

    private List<Libro> libros = new ArrayList<>();
    private List<Libro> librosPrestados = new LinkedList<>();
    private Set<Cliente> clientes = new HashSet<>();

    public Libreria() {
    }

    public void agregarLibro(Libro a) {
        libros.add(a);
    }

    public void agregarCliente(Cliente a) {
        clientes.add(a);
    }

    public void prestarLibro(Libro unLibro, Cliente unCliente) {

        if (libros.contains(unLibro)) {
            if (clientes.contains(unCliente)) {
                boolean encontrado = true;
                int i = 0;
                while (encontrado && i < libros.size()) {
                    if (libros.get(i).equals(unLibro)) {
                        encontrado = false;
                        libros.get(i).setEstado(false);
                        librosPrestados.add(libros.get(i));
                    }
                    i++;
                }

                for (Cliente e : clientes) {
                    if (e.equals(unCliente)) {
                        e.agregarLibro(unLibro);
                    }

                }
            } else {
                System.out.println("El cliente no esta registrado en esta biblioteca");
            }
        } else {
            System.out.println("El libro no esta registrado en esta bibloteca");
        }

    }

    public void devolverLibro(Libro unLibro, Cliente unCliente) {
        if (libros.contains(unLibro)) {
            if (unLibro.isEstado() == false) {
                if (clientes.contains(unCliente)) {
                    boolean encontrado = true;
                    int i = 0;
                    while (encontrado && i < libros.size()) {
                        if (libros.get(i).equals(unLibro)) {
                            encontrado = false;
                            libros.get(i).setEstado(true);
                            librosPrestados.remove(libros.get(i));
                        }
                        i++;
                    }

                    for (Cliente e : clientes) {
                        if (e.equals(unCliente)) {
                            e.eliminarLibro(unLibro);
                        }

                    }
                } else {
                    System.out.println("El cliente no esta registrado en esta biblioteca");
                }
            }else
                System.out.println("El libro no esta prestado");
        } else {
            System.out.println("El libro no pertenece a la biblioteca");
        }

    }
    public List<Libro> listadoDePrestamos(){
        return librosPrestados;
    }
    public Libro masCapitulo(){
        boolean flag = true;
        Libro l = new Libro();
        for(Libro a : this.libros){
            if(flag){
                l = a;
                flag=false;
            }
            
            if(a.getCapitulo()>l.getCapitulo()){
                l=a;
            }
            
        }
        return l;   
    }
}
