package Facultad;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        System.out.println("Creando datos, pulsa enter para continuar");
        CrearDatos(sf);
        sc.nextLine();
        System.out.println(" ");

        System.out.println("Listar alumnos ordenados por apellido,  pulsa enter para continuar ");
        sc.nextLine();
        ListarAlumnosPorApellido(sf);
        System.out.println(" ");

        System.out.println("Listar profesores ordenados por año de antiguedad,  pulsa enter para continuar ");
        sc.nextLine();
        ListarProfesorPorAntiguedad(sf);
        System.out.println(" ");

        System.out.println("Listar materias con nivel igual a 2,  pulsa enter para continuar ");
        sc.nextLine();
        ListarMateriasPorNivel(sf, 2);
        System.out.println(" ");

        
        Ciudad ciudad1 = new Ciudad();
        ciudad1.setNombre("Venado Tuerto");
        System.out.println("Guardando Ciudad...");
        ciudad1.guardar(sf);
        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
        System.out.println("Actualizando Ciudad...");
        ciudad1.setNombre("Rosario");
        ciudad1.actualizar(sf);
        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
        System.out.println("Listando Ciudad/es...");
        ciudad1.listar(sf);
        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
        System.out.println("Borrando Ciudad...");
        ciudad1.borrar(sf);
        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
        Facultad facultad = new Facultad();
        facultad.setNombre("UTN Santa Fe");
        ciudad1.setNombre("Buenos Aires");
        facultad.setCiudad(ciudad1);
        ciudad1.guardar(sf);
        System.out.println("Guardando Facultad...");
        facultad.guardar(sf);
        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
        System.out.println("Actualizando Facultad...");
        facultad.setNombre("Gran Rosario");
        facultad.actualizar(sf);
        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
        System.out.println("Listando Facultad/es...");
        facultad.listar(sf);
        System.out.println("Pulsa enter para continuar");
        sc.nextLine();
        System.out.println("Borrando Facultad...");
        facultad.borrar(sf);

        System.out.println("Creando Alumno..., pulsa enter para continuar:");
        sc.nextLine();
        Alumno alumnoMicaela = new Alumno();
        alumnoMicaela.setNombre("Micaela");
        alumnoMicaela.setApellido("Medina");
        alumnoMicaela.setDni(8548613);
        alumnoMicaela.setNumeroLegajo(789);
        alumnoMicaela.setAñoIngreso(LocalDate.now());
        alumnoMicaela.guardar(sf);
        System.out.println(alumnoMicaela);
        sc.nextLine();
        System.out.println("Actualizando Alumno..., pulsa enter para continuar:");
        alumnoMicaela.setNombre("Juan");
        alumnoMicaela.setApellido("Perez");
        alumnoMicaela.actualizar(sf);
        System.out.println(alumnoMicaela);
        sc.nextLine();

        System.out.println("Creando Ciudad..., pulsa enter para continuar: ");
        Ciudad ciudadRosario = new Ciudad();
        ciudadRosario.setNombre("Rosario");
        ciudadRosario.guardar(sf);
        System.out.println(ciudadRosario);
        sc.nextLine();

        System.out.println("Creando Facultad..., pulsa enter para continuar:");

        Facultad facultadRosario = new Facultad();
        facultadRosario.setNombre("UTN Rosario");
        facultadRosario.setCiudad(ciudadRosario);
        facultadRosario.guardar(sf);
        System.out.println(facultadRosario);
        sc.nextLine();

        System.out.println("Creando Profesor..., pulsa enter para continuar:");

        Profesor profesor3 = new Profesor();
        profesor3.setApellido("profesor");
        profesor3.setNombre("Cuatro");
        profesor3.setDni(44444);
        profesor3.setCiudad(ciudadRosario);
        profesor3.setAntiguedad(30);
        profesor3.guardar(sf);
        System.out.println(profesor3);
        sc.nextLine();
        System.out.println("Actualizando Profesor..., pulsa enter para continuar:");
        profesor3.setApellido("Morales");
        profesor3.setDni(44567);
        profesor3.actualizar(sf);
        System.out.println(profesor3);
        sc.nextLine();

        System.out.println("Creando Materia..., pulsa enter para continuar:");

        Materia materia = new Materia();
        materia.setNombre("Tecnologias de la informacion");
        materia.setNivel(2);
        materia.setProfesor(profesor3);
        List<Alumno> alumnosMateria = new ArrayList<Alumno>();
        alumnosMateria.add(alumnoMicaela);
        materia.setAlumnos(alumnosMateria);
        materia.guardar(sf);
        System.out.println(materia);
        sc.nextLine();
        System.out.println("Actualizando Materia..., pulsa enter para continuar:");
        materia.setNivel(4);
        materia.setNombre("PAV");
        materia.actualizar(sf);
        System.out.println(materia);
        sc.nextLine();

        System.out.println("Creando Carrera..., pulsa enter para continuar:");

        Carrera carrera = new Carrera();
        carrera.setNombre("Tecnologias de la informacion");
        carrera.setFacultad(facultadRosario);
        List<Materia> materiasRosario = new ArrayList<Materia>();
        materiasRosario.add(materia);
        carrera.setMaterias(materiasRosario);
        carrera.guardar(sf);
        System.out.println(carrera);
        sc.nextLine();
        System.out.println("Actualizando Carrera..., pulsa enter para continuar:");
        carrera.setNombre("Ingenieria en Sistemas");
        carrera.actualizar(sf);
        System.out.println(carrera);
        sc.nextLine();

        System.out.println("Listando Carrera/s..., pulsa enter para continuar:");
        carrera.listar(sf);
        sc.nextLine();

        System.out.println("Listando Alumno..., pulsa enter para continuar:");
        alumnoMicaela.listar(sf);
        sc.nextLine();

        System.out.println("Listando Profesor..., pulsa enter para continuar:");
        profesor3.listar(sf);
        sc.nextLine();

        System.out.println("Listando Materia..., pulsa enter para continuar:");
        materia.listar(sf);
        sc.nextLine();

        System.out.println("Borrando Carrera -Ingenieria en Sistemas-..., pulsa enter para continuar:");
        carrera.borrar(sf);
        sc.nextLine();

        System.out.println("Borrando Materia -PAV-..., pulsa enter para continuar:");
        materia.borrar(sf);
        sc.nextLine();
        
        System.out.println("Borrando Profesor -Morales-..., pulsa enter para continuar:");
        profesor3.borrar(sf);
        sc.nextLine();
        
        System.out.println("Borrando Alumno -Juan Perez-..., pulsa enter para continuar:");
        alumnoMicaela.borrar(sf);
        sc.nextLine();
        
        System.out.println("Lista de Carreras despues del Borrado ");
        carrera.listar(sf);
        System.out.println();
        System.out.println("Lista de Materias despues del Borrado ");
        materia.listar(sf);
        System.out.println();
        System.out.println("Lista de Alumnos despues del Borrado ");
        alumnoMicaela.listar(sf);
        System.out.println();
        System.out.println("Lista de Profesor despues del Borrado ");
        profesor3.listar(sf);
        System.out.println();

        sf.close();

    }

    public static void CrearDatos(SessionFactory sf) {
        try {
            Alumno alumno1 = new Alumno();
            Ciudad ciudad1 = new Ciudad();
            Ciudad ciudad2 = new Ciudad();
            ciudad1.setNombre("Santa Fe");
            ciudad2.setNombre("Entre rios");
            alumno1.setApellido("fumis");
            alumno1.setNombre("axel");
            alumno1.setDni(44429);
            alumno1.setCiudad(ciudad1);

            Alumno alumno2 = new Alumno();
            alumno2.setApellido("dalessandro");
            alumno2.setNombre("pablo");
            alumno2.setDni(33687023);
            alumno2.setCiudad(ciudad2);

            Alumno alumno3 = new Alumno();
            alumno3.setApellido("luengo");
            alumno3.setNombre("victoria");
            alumno3.setDni(33887795);
            alumno3.setCiudad(ciudad2);

            Profesor profesor1 = new Profesor();
            ciudad1.setNombre("Santa Fe");
            ciudad2.setNombre("Entre rios");
            profesor1.setApellido("profesor");
            profesor1.setNombre("uno");
            profesor1.setDni(1111111);
            profesor1.setCiudad(ciudad1);
            profesor1.setAntiguedad(10);

            Profesor profesor2 = new Profesor();
            profesor2.setApellido("profesor");
            profesor2.setNombre("dos");
            profesor2.setDni(2222222);
            profesor2.setCiudad(ciudad2);
            profesor2.setAntiguedad(2);

            Profesor profesor3 = new Profesor();
            profesor3.setApellido("profesor");
            profesor3.setNombre("tres");
            profesor3.setDni(33333);
            profesor3.setCiudad(ciudad2);
            profesor3.setAntiguedad(30);

            List<Alumno> listaAlumno1 = new ArrayList<Alumno>();
            listaAlumno1.add(alumno1);
            listaAlumno1.add(alumno2);
            listaAlumno1.add(alumno3);

            Materia materia1 = new Materia();
            materia1.setNivel(1);
            materia1.setNombre("Programacion avanzada");
            materia1.setProfesor(profesor1);
            materia1.setAlumnos(listaAlumno1);

            Materia materia2 = new Materia();
            materia2.setNivel(2);
            materia2.setNombre("Netbeans");
            materia2.setProfesor(profesor2);
            materia2.setAlumnos(listaAlumno1);

            Materia materia3 = new Materia();
            materia3.setNivel(2);
            materia3.setNombre("Hibernate");
            materia3.setProfesor(profesor2);
            materia3.setAlumnos(listaAlumno1);

            Facultad facultad1 = new Facultad();
            facultad1.setNombre("UTN");
            facultad1.setCiudad(ciudad1);

            Carrera carrera1 = new Carrera();
            carrera1.setNombre("TUTI");
            carrera1.setFacultad(facultad1);
            ArrayList<Materia> materias1 = new ArrayList<Materia>();
            materias1.add(materia1);
            materias1.add(materia2);
            materias1.add(materia3);
            carrera1.setMaterias(materias1);

            Session session = sf.openSession();
            Transaction tx = session.beginTransaction();
            session.save(ciudad1);
            session.save(ciudad2);
            session.save(alumno1);
            session.save(alumno2);
            session.save(alumno3);
            session.save(profesor1);
            session.save(profesor2);
            session.save(profesor3);
            session.save(materia1);
            session.save(materia2);
            session.save(materia3);
            session.save(facultad1);
            session.save(carrera1);
            tx.commit();
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void ListarAlumnosPorApellido(SessionFactory sf) {
        List<Alumno> alumnos = sf.openSession().createQuery("From Alumno order by apellido ").list();
        // Iteramos el resultado
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }
    }

    public static void ListarProfesorPorAntiguedad(SessionFactory sf) {
        List<Profesor> profesores = sf.openSession().createQuery("From Profesor order by antiguedad ").list();
        // Iteramos el resultado
        for (Profesor profesor : profesores) {
            System.out.println(profesor.toString());
        }
    }

    public static void ListarMateriasPorNivel(SessionFactory sf, int nivel) {
        String query = "From Materia WHERE nivel = :nivel";
        List<Materia> materias = sf.openSession().createQuery(query).setParameter("nivel", nivel).list();
        // Iteramos el resultado
        materias.forEach((materia) -> {
            System.out.println(materia.toString());
        });
    }

    
}
