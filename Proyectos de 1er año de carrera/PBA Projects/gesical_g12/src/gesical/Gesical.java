package gesical;

import java.util.*;
import java.util.Scanner;

public class Gesical {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String apellido = "", nombre = "", nacionalidad = "", generoMusical = "", discografica = "", titulo = "", algunoMas = "", tipoInstrumento = "";
        int añoInicio = 0, duracionEnSegs = 0, menuPausa = 0;
        boolean haySolista = false, hayCancion = false, hayDisco = false, finalizar = false, encontrado = false, casoPrueba = true, flag = false;

        List<String> generosMusicales = new LinkedList<>();
        List<Musico> musicos = new LinkedList<>();
        List<Cancion> canciones = new LinkedList<>();
        List<Disco> discos = new LinkedList<>();

        menu();
        int selector = entrada.nextInt();

        while (selector != 9) {

            switch (selector) {
                case 1:
                    registrarSolista(flag,entrada, apellido, nombre, nacionalidad, generoMusical, añoInicio, discografica, tipoInstrumento, musicos, haySolista, algunoMas);

                    haySolista = true;
                    
                    System.out.println("Ingrese algun numero para volver al Menu Principal");
                    menuPausa = entrada.nextInt();

                    break;

                case 2:
                    registrarBanda(entrada, haySolista, generoMusical, añoInicio, discografica, titulo, flag, algunoMas, nombre, apellido, encontrado, musicos);

                    System.out.println("Ingrese algun numero para volver al Menu Principal");
                    menuPausa = entrada.nextInt();
                    break;

                case 3:
                    registarCancion(entrada, nombre, duracionEnSegs, hayCancion, encontrado, canciones, hayDisco, algunoMas, discos, titulo);

                    hayCancion=true;
                    
                    System.out.println("Ingrese algun numero para volver al Menu Principal");
                    menuPausa = entrada.nextInt();
                    break;

                case 4:
                    registarDisco(entrada, haySolista, hayCancion, titulo, generoMusical, añoInicio, nombre, algunoMas, duracionEnSegs, finalizar, encontrado, flag, canciones, discos, musicos, hayDisco, apellido);
                    if(discos.size()>0){
                        hayDisco = true;
                    }
                    System.out.println("Ingrese algun numero para volver al Menu Principal");
                    menuPausa = entrada.nextInt();
                    break;

                case 5:
                    registrarCasoPrueba(casoPrueba, canciones, discos, musicos, haySolista, hayCancion, hayDisco);
                    haySolista = true;
                    hayCancion = true;
                    hayDisco = true;
                    casoPrueba= false;

                    System.out.println("Ingrese algun numero para volver al Menu Principal");
                    menuPausa = entrada.nextInt();
                    break;
                case 6:
                    char charac = ' ';
                    while (charac != 'z') {

                        submenu();

                        charac = entrada.next().charAt(0);

                        switch (charac) {
                            case 'a':
                                discosDuranXSegs(entrada, finalizar, duracionEnSegs, discos, musicos);

                                System.out.println("Ingrese algun numero para volver al Sub-Menu");
                                menuPausa = entrada.nextInt();
                                break;

                            case 'b':
                                playListGeneroMusical(entrada, discos, generosMusicales, finalizar, encontrado, musicos, generoMusical);

                                System.out.println("Ingrese algun numero para volver al Sub-Menu");
                                menuPausa = entrada.nextInt();
                                break;

                            case 'c':
                                eliminarDiscoAnio(entrada, discos, añoInicio);

                                System.out.println("Ingrese algun numero para volver al Sub-Menu");
                                menuPausa = entrada.nextInt();
                                break;

                            case 'd':
                                listarDiscos(entrada,selector, encontrado, musicos, discos, titulo, nombre, apellido);

                                System.out.println("Ingrese algun numero para volver al Sub-Menu");
                                menuPausa = entrada.nextInt();
                                break;

                            case 'z':
                                break;

                            default:
                                System.out.println("Opcion incorrecta. Ingrese un caracter válido.");  // RESOLVER VUELTA DE ENTRADA AL MENÚ
                                break;

                        }
                    }
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }

            menu();
            selector = entrada.nextInt();
        }

    }

    private static void submenu() {

        System.out.println("GESICAL - Sistema de GEStión MusICAL");
        System.out.println("Consultas");
        System.out.println("==========================================");
        System.out.println("a) Discos que duran más de X segundos ");
        System.out.println("b) Playlist por género musical");
        System.out.println("c) Borrar discos según año de edición");
        System.out.println("d) Listar discos por banda");
        System.out.println(" ");
        System.out.println("z) Volver al menú anterior");
        System.out.println(" ");
        System.out.println("Ingrese una opción:");
        System.out.println("");
    }

    private static void menu() {

        System.out.println("GESICAL - Sistema de GEStión MusICAL");
        System.out.println("Menú Principal");
        System.out.println("==========================================");
        System.out.println("1) Registrar Solista ");
        System.out.println("2) Registrar Banda ");
        System.out.println("3) Registrar Canción");
        System.out.println("4) Registrar Disco");
        System.out.println("5) Registro Masivo - Datos de Prueba");
        System.out.println("6) Consultas");
        System.out.println(" ");
        System.out.println("9) Cerrar la aplicación");
        System.out.println("Ingrese una opción:");
        System.out.println("");
    }

    private static void registrarSolista(boolean flag,Scanner entrada, String apellido, String nombre, String nacionalidad, String generoMusical, int añoInicio, String discografica, String tipoInstrumento, List<Musico> musicos, boolean haySolista, String algunoMas) {
        flag = true;
        do {
            System.out.println("REGISTRAR SOLISTA: ");
            System.out.println("Ingrese los datos requeridos");
            if(flag){
            //Limpiador de buffer
            apellido = entrada.nextLine();
            flag =false;
            }
            
            System.out.println("Ingrese el apellido: ");
            apellido = entrada.nextLine();
            System.out.println("");

            System.out.println("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.println("");

            System.out.println("Ingrese la nacionalidad: ");
            nacionalidad = entrada.nextLine();
            System.out.println("");

            System.out.println("Ingrese el género musical: ");
            generoMusical = entrada.nextLine();
            System.out.println("");

            System.out.println("Ingrese el año de inicio: ");
            añoInicio = entrada.nextInt();
            System.out.println("");

            //Limpiador de buffer
            discografica = entrada.nextLine();

            System.out.println("Ingrese la discográfica a la que pertenece: ");
            discografica = entrada.nextLine();
            System.out.println("");

            System.out.println("Ingrese el tipo de instrumento que toca entre Bajo,Bateria,Guitarra,Teclado");
            System.out.println("Sino toca ningun intrumento ingrese cantante");
            tipoInstrumento = entrada.nextLine().toUpperCase();
            System.out.println("");

            if (tipoInstrumento.equals("BAJO")) {
                Instrumento instrumento = new Bajo();
                Solista s = new Solista(apellido, nombre, nacionalidad, instrumento, generoMusical, añoInicio, discografica);
                musicos.add(s);
                
            } else if (tipoInstrumento.equals("BATERIA")) {
                Instrumento instrumento = new Bateria();
                Solista s = new Solista(apellido, nombre, nacionalidad, instrumento, generoMusical, añoInicio, discografica);
                musicos.add(s);
                
            } else if (tipoInstrumento.equals("TECLADO")) {
                Instrumento instrumento = new Teclado();
                Solista s = new Solista(apellido, nombre, nacionalidad, instrumento, generoMusical, añoInicio, discografica);
                musicos.add(s);
                
            } else if (tipoInstrumento.equals("GUITARRA")) {
                Instrumento instrumento = new Guitarra();
                Solista s = new Solista(apellido, nombre, nacionalidad, instrumento, generoMusical, añoInicio, discografica);
                musicos.add(s);
                
            } else {
                Solista s = new Solista(apellido, nombre, nacionalidad, generoMusical, añoInicio, discografica);
                musicos.add(s);
                
            }
            System.out.println("Quiere registrar algun solista mas? (SI/NO)");
            algunoMas = entrada.nextLine().toUpperCase();
        } while (algunoMas.equals("SI"));

    }

    private static void registrarBanda(Scanner entrada, boolean haySolista, String generoMusical, int añoInicio, String discografica, String titulo, boolean flag, String algunoMas, String nombre, String apellido, boolean encontrado, List<Musico> musicos) {
        if (haySolista) {
            System.out.println("REGISTRAR BANDA:");
            System.out.println("Ingrese los datos requeridos y presione 'enter'");

            //Limpiador de buffer
            generoMusical = entrada.nextLine();

            System.out.println("Ingrese el género musical:");
            generoMusical = entrada.nextLine();
            System.out.println("");

            System.out.println("Ingrese el año de inicio:");
            añoInicio = entrada.nextInt();
            System.out.println("");

            //Limpiador de buffer
            discografica = entrada.nextLine();

            System.out.print("Ingrese la discográfica a la que pertenece:");
            discografica = entrada.nextLine();
            System.out.println("");

            System.out.print("Ingrese el título:");
            titulo = entrada.nextLine();
            System.out.println("");

            Banda b = new Banda(generoMusical, añoInicio, discografica, titulo);
            
            System.out.println("Lista de Solistas Registrados");
            for(Musico m: musicos){
                if(m instanceof Solista){
                    System.out.println((Solista)m);
                }
            }
            System.out.println();
            
            flag = false;
            algunoMas = "SI";
            while (algunoMas.equals("SI")) {
                System.out.println("Ingrese el nombre del músico perteneciente a la banda: ");
                nombre = entrada.nextLine().toUpperCase();
                System.out.println("Ingrese el apellido del músico perteneciente a la banda: ");
                apellido = entrada.nextLine().toUpperCase();

                int i = 0;
                encontrado = false;
                while (i < musicos.size() && !encontrado) {
                    if ((musicos.get(i)) instanceof Solista) {
                        if (((Solista) musicos.get(i)).getNombre().toUpperCase().equals(nombre) && (((Solista) musicos.get(i)).getApellido().toUpperCase().equals(apellido))) {

                            encontrado = true;
                            b.agregarSolista((Solista) musicos.get(i));
                            if (!flag) {
                                flag = true;
                            }
                        }
                    }
                    i++;
                }
                if (!encontrado) {
                    System.out.println("El Solista ingresado no se encuentra registrado");
                }
                else{
                    System.out.println("El Solista se ha registrado en la banda correctamente");
                }
                System.out.println("Hay algun/a mas? (Si/No)");
                algunoMas = entrada.nextLine().toUpperCase();

            }
            if (flag) {
                musicos.add(b);
                System.out.println("La banda se registro Correctamente");
            } else {
                System.out.println("La banda no se pudo Registar porque no tiene Solista que la compontan");
            }

        } else {
            System.out.println("No hay Solista registrados actualmente");
            System.out.println("Por favor vay a REGISTAR SOLISTA y siga las instrucciones");
        }
    }

    private static void registarCancion(Scanner entrada, String nombre, int duracionEnSegs, boolean hayCancion, boolean encontrado, List<Cancion> canciones, boolean hayDisco, String algunoMas, List<Disco> discos, String titulo) {
        System.out.println("REGISTRAR CANCIÓN:");
        System.out.println("Ingrese los datos requeridos ");

        //Limpiador de buffer
        nombre = entrada.nextLine();

        System.out.print("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("");

        System.out.print("Ingrese la duración en segundos:");
        duracionEnSegs = entrada.nextInt();
        System.out.println("");

        Cancion c = new Cancion(nombre, duracionEnSegs);

        if (hayCancion) {
            int i = 0;
            encontrado = true;
            while (i < canciones.size() && encontrado) {
                if (((Cancion) canciones.get(i)).compareTo(c) == 1) {
                    System.out.println("Ya existe una cancion con ese nombre y duracion");
                    encontrado = false;
                }
                i++;
            }
            if (encontrado) {
                canciones.add(c);
            }
        } else {
            canciones.add(c);
            hayCancion = true;
            encontrado = true;
        }
        if (hayDisco && encontrado) {
            do {
                //Limpiador de buffer
                algunoMas = entrada.nextLine();
                System.out.println("Quiere agregar la cancion a un disco ya existente? (SI/NO)");
                algunoMas = entrada.nextLine().toUpperCase();
                if (algunoMas.equals("SI")) {
                    System.out.println("Escriba el titulo del Disco");

                    titulo = entrada.nextLine().toUpperCase();

                    int i = 0;
                    encontrado = true;
                    while (i < discos.size() && encontrado) {
                        if ((((Disco) discos.get(i)).getTitulo().toUpperCase()).equals(titulo)) {
                            {
                                ((Disco) discos.get(i)).añadirCancion(c);
                                encontrado = false;
                            }
                        }
                        i++;
                    }
                    if (encontrado) {
                        System.out.println("No existen Disco con ese titulo");
                    }
                }
            } while (algunoMas.equals("SI") && encontrado);
            if (algunoMas.equals("SI")) {
                System.out.println("Se ha registrado la cancion en el disco correctamente");
            }
        }
    }

    private static void registarDisco(Scanner entrada, boolean haySolista, boolean hayCancion, String titulo, String generoMusical, int añoInicio, String nombre, String algunoMas, int duracionEnSegs, boolean finalizar, boolean encontrado, boolean flag, List<Cancion> canciones, List<Disco> discos, List<Musico> musicos, boolean hayDisco, String apellido) {
        if (haySolista && hayCancion) {
            System.out.println("REGISTRAR DISCO");
            System.out.println("Ingrese los datos requeridos ");

            //Limpiador de Buffer
            titulo = entrada.nextLine();

            System.out.println("Ingrese el titulo del disco ");
            titulo = entrada.nextLine();

            System.out.println("Ingrese el genero del disco ");
            generoMusical = entrada.nextLine();

            System.out.println("Ingrese el año de edicion ");
            añoInicio = entrada.nextInt();

            Disco d = new Disco(añoInicio, titulo, generoMusical);

            //Limpiador de Buffer
            nombre = entrada.nextLine();

            for(Cancion c: canciones){
                    System.out.println(c);
            }
            algunoMas = "SI";
            boolean puedeRepetir = false;
            while (algunoMas.equals("SI")) {
                
                System.out.println("Ingrese el nombre de la cancion");
                nombre = entrada.nextLine();
                System.out.println("Ingrese la duracion de la cancion");
                duracionEnSegs = entrada.nextInt();

                int i = 0;
                finalizar = true;
                encontrado = false;
                flag = false;
                while (i < canciones.size() && finalizar) {
                    if (canciones.get(i).getNombre().equals(nombre) && canciones.get(i).getDuracionEnSegs() == duracionEnSegs) {
                        encontrado = true;
                        if (puedeRepetir && d.hayCancionRepetida(canciones.get(i))) {
                            System.out.println("La cancion ya se encuentra dentro del disco");
                        } else {
                            d.añadirCancion((Cancion) canciones.get(i));
                            puedeRepetir = true;
                            finalizar = false;
                            System.out.println("La cancion se registro Correctamente");
                            if (!flag) {
                                flag = true;
                            }
                        }
                    }
                    i++;
                }
                if (!encontrado) {
                    System.out.println("La cancion no existe/no esta registrada");
                }
                //limpiador de Buffer
                algunoMas = entrada.nextLine().toUpperCase();

                System.out.println("Hay alguna cancion mas? (SI/NO)");
                algunoMas = entrada.nextLine().toUpperCase();
            }
            if (flag) {
                discos.add(d);
                hayDisco = true;
                System.out.println("El Disco pertenece a una Banda (1) o a un Solista (2) ?");
                System.out.println("Ingrese alguna de las opciones anteriores ");

                int bSelector = entrada.nextInt();

                switch (bSelector) {
                    case 1:
                        for(Musico m :musicos){
                            if(m instanceof Banda){
                                System.out.println(m);
                            }
                        }
                        
                        algunoMas = "SI";
                        finalizar = true;
                        while (finalizar) {

                            //Esta hecho porque al momento de ingresar mal algun dato de solista,la ejecucion te llevaria
                            // aca y pediria que ingreses un String para la variable ya que el buffer ya esta limpio
                            if (algunoMas.equals("SI")) {
                                //Limpiador de Buffer
                                nombre = entrada.nextLine();
                                algunoMas = "NO";
                            }
                            System.out.println("Ingese el Titulo de la Banda");
                            titulo = entrada.nextLine().toUpperCase();

                            int i = 0;
                            encontrado = false;
                            while (i < musicos.size() && !encontrado) {
                                if (musicos.get(i) instanceof Banda) {
                                    if (((((Banda) musicos.get(i)).getTitulo()).toUpperCase()).equals(titulo)) {
                                        ((Banda) musicos.get(i)).agregarDisco(d);
                                        encontrado = true;
                                    }
                                }
                                i++;
                            }
                            if (encontrado) {
                                System.out.println("Se ha Registrado un Disco Exitosamente");
                                finalizar = false;
                                
                            } else {
                                System.out.println("No se ha encontrado la Banda");
                                hayDisco = false;
                                discos.remove(d);
                                finalizar = false;
                            }
                        }

                        break;

                    case 2:
                        for(Musico m :musicos){
                            if(m instanceof Solista){
                                System.out.println(m);
                            }
                        }
                        algunoMas = "SI";
                        finalizar = true;
                        while (finalizar) {

                            //Esta hecho porque al momento de ingresar mal algun dato de solista,la ejecucion te llevaria
                            // aca y pediria que ingreses un String para la variable ya que el buffer ya esta limpio 
                            if (algunoMas.equals("SI")) {
                                //Limpiador de Buffer
                                nombre = entrada.nextLine();
                                algunoMas = "NO";
                            }

                            System.out.println("Ingese el Nombre del Solista");
                            nombre = entrada.nextLine().toUpperCase();

                            System.out.println("Ingrese el Apellido del Solista");
                            apellido = entrada.nextLine().toUpperCase();

                            int i = 0;
                            encontrado = false;
                            while (i < musicos.size() && !encontrado) {
                                if (musicos.get(i) instanceof Solista) {
                                    if (((((Solista) musicos.get(i)).getNombre()).toUpperCase()).equals(nombre)) {
                                        if (((((Solista) musicos.get(i)).getApellido()).toUpperCase()).equals(apellido)) {
                                            ((Solista) musicos.get(i)).agregarDisco(d);
                                            encontrado = true;
                                        }
                                    }
                                }
                                i++;
                            }
                            if (encontrado) {
                                System.out.println("Se ha Registrado un Disco Exitosamente");
                                finalizar = false;
                            } else {
                                System.out.println("No se ha encontrado al Solista");
                                hayDisco = false;
                                discos.remove(d);
                                finalizar = false;
                            }
                        }
                        break;
                }
            } else {
                System.out.println("El Disco no se pudo registrar porque no tiene canciones");
            }

        } else {
            System.out.println("No hay nada o nadie para asignarle el Disco");
            System.out.println("Seleccione REGISTRAR BANDA o REGISTAR SOLISTAS para REGISTAR DISCO");
            System.out.println("Si no hay canciones registrada seleccione REGISTRAR CANCION");
        }
    }

    private static void registrarCasoPrueba(boolean casoPrueba, List<Cancion> canciones, List<Disco> discos, List<Musico> musicos, boolean haySolista, boolean hayCancion, boolean hayDisco) {
        if (casoPrueba) {
            System.out.println("REGISTRO MASIVO DE DATOS DE PRUEBA");

            Instrumento Bat = new Bateria();
            Instrumento Baj = new Bajo();
            Instrumento Gui = new Guitarra();
            Instrumento Tec = new Teclado();

            //Instanciación de Solistas
            Solista s1 = new Solista("Robles", "Ana", "argentina", Bat, "rock", 2010, "Warner");
            Solista s2 = new Solista("Martinez", "Javier", "estadounidense", Baj, "pop", 2015, "Warner");
            Solista s3 = new Solista("Conde", "Gonzalo", "argentina", Gui, "rap", 2015, "Dale Play");
            Solista s4 = new Solista("Jhonson", "Patrick", "inglesa", Tec, "rock", 2017, "Warner");
            Solista s5 = new Solista("Iglesias", "Maria", "uruguaya", "rock", 2000, "Warner");
            Solista s6 = new Solista("Maverick", "Ronald", "irlandesa", Bat, "pop", 2014, "Epic Records");
            Solista s7 = new Solista("Garcia", "Anabella", "argentina", Baj, "folklore", 2003, "Sony Music");
            Solista s8 = new Solista("Murtagh", "Patricio", "argentina", Gui, "rap", 2013, "Dale Play");
            Solista s9 = new Solista("Prince", "George", "escocesa", Tec, "jazz", 2012, "Warner");
            Solista s10 = new Solista("Rende", "Agustin", "argentina", Bat, "blues", 2020, "Sony Music");

            //Instanciación de Bandas
            Banda b1 = new Banda("Rap", 2015, "Dale Play", "Metamorfosis");
            Banda b2 = new Banda("Rock", 2017, "Warner", "Limitless");

            //Agregación de Solistas a Bandas
            //Conformación b1
            b1.agregarSolista(s3);
            b1.agregarSolista(s8);

            //Conformación b2
            b2.agregarSolista(s1);
            b2.agregarSolista(s4);
            b2.agregarSolista(s5);

            //Instanciación de Canciones
            Cancion c1 = new Cancion("Flying", 181);
            Cancion c2 = new Cancion("Cry a river", 175);
            Cancion c3 = new Cancion("Rememorando", 234);
            Cancion c4 = new Cancion("Ripio", 190);
            Cancion c5 = new Cancion("Let me be", 169);
            Cancion c6 = new Cancion("Even now", 190);
            Cancion c7 = new Cancion("Ball in the map", 240);
            Cancion c8 = new Cancion("Leaves upside down", 180);
            Cancion c9 = new Cancion("Saint money", 199);
            Cancion c10 = new Cancion("Estandarte de paz", 210);
            Cancion c11 = new Cancion("Pop up my heart", 250);
            Cancion c12 = new Cancion("Aca y allá", 223);
            Cancion c13 = new Cancion("Martes azul", 240);
            Cancion c14 = new Cancion("Capas de ropa", 226);
            Cancion c15 = new Cancion("Meet me at the square", 189);
            Cancion c16 = new Cancion("Mirar atrás", 190);
            Cancion c17 = new Cancion("Birds in my head", 260);
            Cancion c18 = new Cancion("Priest", 220);
            Cancion c19 = new Cancion("Queen of mine", 320);
            Cancion c20 = new Cancion("Atando cabos", 217);

            canciones.add(c1);
            canciones.add(c2);
            canciones.add(c3);
            canciones.add(c4);
            canciones.add(c5);
            canciones.add(c6);
            canciones.add(c7);
            canciones.add(c8);
            canciones.add(c9);
            canciones.add(c10);
            canciones.add(c11);
            canciones.add(c12);
            canciones.add(c13);
            canciones.add(c14);
            canciones.add(c15);
            canciones.add(c16);
            canciones.add(c17);
            canciones.add(c18);
            canciones.add(c19);
            canciones.add(c20);

            //Instanciación de Discos
            Disco d1 = new Disco(2020, "Alma blanca", "rap");
            Disco d2 = new Disco(2015, "Creando verdades", "blues");
            Disco d3 = new Disco(2021, "Vanity", "rock");

            //Adición de canciones a disco 1
            d1.añadirCancion(c3);
            d1.añadirCancion(c4);
            d1.añadirCancion(c9);
            d1.añadirCancion(c14);
            d1.añadirCancion(c18);
            d1.añadirCancion(c20);

            //Adición de canciones a disco 2
            d2.añadirCancion(c2);
            d2.añadirCancion(c6);
            d2.añadirCancion(c10);
            d2.añadirCancion(c12);
            d2.añadirCancion(c13);
            d2.añadirCancion(c16);

            //Adición de canciones a disco 3
            d3.añadirCancion(c1);
            d3.añadirCancion(c5);
            d3.añadirCancion(c8);
            d3.añadirCancion(c11);
            d3.añadirCancion(c15);
            d3.añadirCancion(c17);
            d3.añadirCancion(c19);

            discos.add(d1);
            discos.add(d2);
            discos.add(d3);

            b1.agregarDisco(d1);
            b2.agregarDisco(d3);
            s10.agregarDisco(d2);

            musicos.add(s1);
            musicos.add(s2);
            musicos.add(s3);
            musicos.add(s4);
            musicos.add(s5);
            musicos.add(s6);
            musicos.add(s7);
            musicos.add(s8);
            musicos.add(s9);
            musicos.add(s10);

            musicos.add(b1);
            musicos.add(b2);

            

            System.out.println("Se han registrado los datos masivos de prueba ");
            
        } else {
            System.out.println("Los datos ya se habian registraron anteriormente");
        }
    }

    private static void discosDuranXSegs(Scanner entrada, boolean finalizar, int duracionEnSegs, List<Disco> discos, List<Musico> musicos) {
        finalizar = true;
        System.out.println("Ingrese el tiempo en Segundos ");
        duracionEnSegs = entrada.nextInt();

        for (Disco d : discos) {

            if (d.duracionDisco() > duracionEnSegs) {
                for (Musico m : musicos) {
                    if (m.comprobarDisco(d)) {
                        System.out.println("Disco: " + d.getTitulo());
                        if (m instanceof Banda) {
                            System.out.println("Nombre de la Banda: " + ((Banda) m).getTitulo());
                        } else {
                            System.out.println("Nombre del Solista: " + ((Solista) m).getNombre() + " " + ((Solista) m).getApellido());
                        }

                        System.out.println("");
                        finalizar = false;
                    }
                }
            }
        }
        if (finalizar) {
            System.out.println("No hay canciones con mas segundos de los ingresados ");
        }
    }

    private static void playListGeneroMusical(Scanner entrada, List<Disco> discos, List<String> generosMusicales, boolean finalizar, boolean encontrado, List<Musico> musicos, String generoMusical) {
        System.out.println("Generos Disponibles");

        for (Disco d : discos) {
            int i = 0;

            encontrado = true;
            while (i < generosMusicales.size() && encontrado) {
                if ((d.getGeneroMusical().toUpperCase()).equals(generosMusicales.get(i))) {
                    encontrado = false;
                }
                i++;
            }
            if (encontrado) {
                generosMusicales.add(d.getGeneroMusical().toUpperCase());
            }
        }
        System.out.println(generosMusicales);

        //Limpiador de buffer
        generoMusical = entrada.nextLine();

        System.out.println("Ingrese el genero musical");
        generoMusical = entrada.nextLine().toUpperCase();
        finalizar = true;
        for (Disco d : discos) {
            if (((d.getGeneroMusical()).toUpperCase()).equals(generoMusical)) {

                int i = 0;
                encontrado = false;
                while (i < musicos.size() && !encontrado) {
                    if ((musicos.get(i)).comprobarDisco(d)) {
                        System.out.println("Lista de Canciones");
                        d.mostrarCancionesDisco();
                        System.out.println("Disco: " + d.getTitulo() + " - Año de Edicion (" + d.getAñoEdicion() + ")");
                        if (musicos.get(i) instanceof Banda) {
                            System.out.println("Nombre de la Banda: " + ((Banda) (musicos.get(i))).getTitulo());
                        } else {
                            System.out.println("Nombre del Solista: " + ((Solista) (musicos.get(i))).getNombre() + " " + ((Solista) (musicos.get(i))).getApellido());
                        }
                        System.out.println("");
                        finalizar = false;
                        encontrado = true;
                    }
                    i++;
                }
            }
        }
        if (finalizar) {
            System.out.println("No hay canciones con ese genero");
        }
    }

    private static void eliminarDiscoAnio(Scanner entrada, List<Disco> discos, int añoInicio) {
        System.out.println("Ingrese el año para tomar como referencia para borrar discos de años anteriores: ");
        añoInicio = entrada.nextInt();

        for (Disco d : discos) {
            if (d.getAñoEdicion() < añoInicio) {
                discos.remove(d);

            }
        }
        System.out.println("Se han eliminado los discos anteriores al año " + añoInicio + ". ");
    }

    private static void listarDiscos(Scanner entrada,int selector, boolean encontrado, List<Musico> musicos, List<Disco> discos, String titulo, String nombre, String apellido) {
        encontrado = false;
        for (Musico m : musicos) {
            System.out.println(m);
        }
        System.out.println("");
        System.out.println("Ingrese si esta buscando Banda(1) o Solista(2)");
        selector = entrada.nextInt();
        switch (selector) {
            case 1:
                //Limpiador de Buffer
                titulo = entrada.nextLine();

                System.out.println("Escriba el nombre de la banda");
                titulo = entrada.nextLine().toUpperCase();

                int i = 0;
                encontrado = true;
                while (i < musicos.size() && encontrado) {
                    for (Disco d : discos) {
                        if (musicos.get(i) instanceof Banda) {
                            if (((((Banda) musicos.get(i)).getTitulo()).toUpperCase()).equals(titulo)) {
                                if (musicos.get(i).comprobarDisco(d)) {
                                    ((Banda) musicos.get(i)).listarDisco();
                                    encontrado = false;
                                }
                            }
                        }
                    }
                    i++;
                }
                if (encontrado) {
                    System.out.println("No se han encontrado Banda con ese nombre o no tienen ningun Disco actualmente");
                }

                break;
            case 2:
                //Limpiador de Buffer
                nombre = entrada.nextLine();

                System.out.println("Escriba el nombre del Solista");
                nombre = entrada.nextLine().toUpperCase();
                System.out.println("Escriba el apellido del Solista");
                apellido = entrada.nextLine().toUpperCase();

                i = 0;
                encontrado = true;
                while (i < musicos.size() && encontrado) {
                    for (Disco d : discos) {
                        if (musicos.get(i) instanceof Solista) {
                            if (((((Solista) musicos.get(i)).getNombre()).toUpperCase()).equals(nombre) && ((((Solista) musicos.get(i)).getApellido()).toUpperCase()).equals(apellido)) {
                                if (musicos.get(i).comprobarDisco(d)) {
                                    ((Solista) musicos.get(i)).listarDisco();
                                    encontrado = false;
                                }
                            }
                        }
                    }
                    i++;
                }
                if (encontrado) {
                    System.out.println("No se han encontrado Solistas o no tiene ningun Disco actualmente");
                }
                break;
        }
    }
}
