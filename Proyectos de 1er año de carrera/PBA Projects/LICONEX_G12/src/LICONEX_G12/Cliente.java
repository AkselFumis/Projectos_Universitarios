package LICONEX_G12;

import java.util.Scanner;

public class Cliente {

    static int tope = 0;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int dni, circuito1, circuito2, cilindradas, faltas, selector = 0;
        byte puertas;
        String fechaInicio, fechaNacimiento, nombre, apellido, marca, patente;
        boolean espejos;
        Examen nube[] = new Examen[100];

        while (selector != 9) {

            menuOpciones();

            selector = entrada.nextInt();

            switch (selector) {
                case 1:
                    System.out.println("A CONTINUACION REGISTRAR EXAMEN");
                    //Limpiador de buffer
                    fechaInicio = entrada.nextLine();

                    System.out.println("");

                    System.out.print("Ingrese la fecha de incio del Examen (Formato dd/mm/yyyy)  ");

                    fechaInicio = entrada.nextLine();

                    System.out.print("Ingrese la fecha de nacimineto del examinado (Formato dd/mm/yyyy)  ");

                    fechaNacimiento = entrada.nextLine();

                    System.out.print("Ingrese el Dni del examinado  ");

                    dni = entrada.nextInt();
                    //Limpiador de buffer
                    nombre = entrada.nextLine();

                    System.out.print("Ingrese el nombre  del examinado  ");

                    nombre = entrada.nextLine();

                    System.out.print("Ingrese el apellido del examinado  ");

                    apellido = entrada.nextLine();

                    Persona persona = new Persona(fechaNacimiento, dni, nombre, apellido);

                    System.out.println("A CONTINUACION REGISTRAR MOTO");

                    System.out.print("Ingrese el Tiempo del circuito 1  ");

                    circuito1 = entrada.nextInt();

                    System.out.print("Ingrese el Tiempo del circuito 2  ");

                    circuito2 = entrada.nextInt();

                    System.out.print("Ingre la(s) Faltas totales  ");

                    faltas = entrada.nextInt();
                    //Limpiador de buffer
                    patente = entrada.nextLine();

                    System.out.print("Ingrese la patente  ");

                    patente = entrada.nextLine();

                    System.out.print("Ingrese la marca  ");

                    marca = entrada.nextLine();

                    System.out.print("Ingrese la cantidad de cilindradas  ");

                    cilindradas = entrada.nextInt();

                    System.out.print("Lleva todos los espejos (Escribir true=Si o false=NO)  ");

                    espejos = entrada.nextBoolean();

                    Moto moto = new Moto(espejos, patente, marca, cilindradas);

                    nube[tope++] = new ExamenMoto(moto, circuito2, fechaInicio, persona, circuito1, faltas);

                    break;
                case 2:
                    System.out.println("A CONTINUACION REGISTRAR EXAMEN");
                    //Limpiador de buffer

                    fechaInicio = entrada.nextLine();

                    System.out.println("");

                    System.out.print("Ingrese la fecha de incio del Examen (Formato dd/mm/yyyy)  ");

                    fechaInicio = entrada.nextLine();

                    System.out.print("Ingrese la fecha de nacimineto del examinado (Formato dd/mm/yyyy)  ");

                    fechaNacimiento = entrada.nextLine();

                    System.out.print("Ingrese el Dni del examinado  ");

                    dni = entrada.nextInt();
                    //Limpiador de buffer
                    nombre = entrada.nextLine();

                    System.out.print("Ingrese el nombre  del examinado  ");

                    nombre = entrada.nextLine();

                    System.out.print("Ingrese el apellido del examinado  ");

                    apellido = entrada.nextLine();

                    Persona persona1 = new Persona(fechaNacimiento, dni, nombre, apellido);

                    System.out.println("A CONTINUACION REGISTRAR AUTO");

                    System.out.print("Ingrese el Tiempo del circuito  ");

                    circuito1 = entrada.nextInt();

                    System.out.print("Ingre la(s) Faltas totales  ");

                    faltas = entrada.nextInt();
                    //Limpiador de buffer
                    patente = entrada.nextLine();

                    System.out.print("Ingrese la patente  ");

                    patente = entrada.nextLine();

                    System.out.print("Ingrese la marca  ");

                    marca = entrada.nextLine();

                    System.out.print("Ingrese la cantidad de cilindradas  ");

                    cilindradas = entrada.nextInt();

                    System.out.print("Ingrese la cantidad de puertas  ");

                    puertas = entrada.nextByte();

                    Auto auto = new Auto(puertas, patente, marca, cilindradas);

                    nube[tope++] = new ExamenAuto(auto, fechaInicio, persona1, circuito1, faltas);

                    break;
                case 3:
                    while (selector != 9) {

                        menuOpciones2();

                        selector = entrada.nextInt();

                        switch (selector) {
                            case 1:

                                System.out.print("Ingrese DNI para buscar Examen  ");

                                dni = entrada.nextInt();

                                boolean flag = true;

                                for (int i = 0; i < tope; i++) {
                                    if (((nube[i]).getPersona()).getDni() == dni) {

                                        flag = false;

                                        System.out.println("Nombre: " + ((nube[i]).getPersona()).getNombre() + "||  Apellido: " + ((nube[i]).getPersona()).getApellido() + "||  DNI: " + ((nube[i]).getPersona()).getDni());

                                        if (nube[i] instanceof ExamenMoto) {

                                            System.out.println(((ExamenMoto) nube[i]).toString());

                                            System.out.println((((ExamenMoto) (nube[i])).getMoto()).toString());

                                            System.out.println("Examen: " + ((ExamenMoto) nube[i]).tomarExamen());

                                            System.out.println("---------------------------------------------");
                                        } else {

                                            System.out.println(((ExamenAuto) nube[i]).toString());

                                            System.out.println((((ExamenAuto) (nube[i])).getAuto()).toString());

                                            System.out.println("Examen: " + ((ExamenAuto) nube[i]).tomarExamen());

                                            System.out.println("---------------------------------------------");
                                        }
                                    }
                                }
                                if (flag) {

                                    System.out.println("“Ninguna persona con el DNI ingresado ha rendido examen alguno en Villa Pehuenia”.");
                                }

                                break;
                            case 2:
                                System.out.print("Ingrese Fecha(dd/mm/yyyy) para buscar Examen de MOTO  ");
                                //limpiar buffer
                                fechaInicio = entrada.nextLine();

                                fechaInicio = entrada.nextLine();

                                for (int i = 0; i < tope; i++) {

                                    if (nube[i] instanceof ExamenMoto) {

                                        if (fechaInicio.equals(nube[i].getFechaInicio())) {

                                            System.out.println();

                                            System.out.println("DNI: " + ((nube[i]).getPersona()).getDni() + " Examen: " + ((ExamenMoto) nube[i]).tomarExamen());

                                            System.out.println();
                                        }
                                    }
                                }
                                break;
                            case 3:

                                System.out.print("Ingrese Fecha(dd/mm/yyyy) para buscar Examen de AUTO  ");
                                //limpiar buffer
                                fechaInicio = entrada.nextLine();

                                fechaInicio = entrada.nextLine();

                                for (int i = 0; i < tope; i++) {

                                    if (nube[i] instanceof ExamenAuto) {

                                        if (fechaInicio.equals(nube[i].getFechaInicio())) {

                                            System.out.println();

                                            System.out.println("DNI: " + ((nube[i]).getPersona()).getDni() + " Examen: " + ((ExamenAuto) nube[i]).tomarExamen());

                                            System.out.println();
                                        }
                                    }
                                }
                                break;
                        }
                    }
                    selector = 0;

                    break;
                default:
                    if (selector != 9) {

                        System.out.println("La opcion ingresada no esta disponible");
                        System.out.println("Porfavor seleccione una opcion enumerada");
                    }
            }
        }
    }

    private static void menuOpciones() {
        System.out.println("------------------------------------------");
        System.out.println("        LICENCIAS DE CONDUCIR ");
        System.out.println("           Menu Pricipal ");
        System.out.println("------------------------------------------");
        System.out.println("1)- Registrar Examen de MOTO");
        System.out.println("2)- Registrar Examen de AUTO");
        System.out.println("3)- Consultas");
        System.out.println();
        System.out.println("9)- Cerrar Aplicacion");
        System.out.println();
        System.out.print("Ingrese una opcion:  ");

    }

    private static void menuOpciones2() {
        System.out.println("------------------------------------------");
        System.out.println("        LICENCIAS DE CONDUCIR ");
        System.out.println("           Menu Consultas ");
        System.out.println("------------------------------------------");
        System.out.println("1)- Examen por DNI");
        System.out.println("2)- Examen de moto por FECHA");
        System.out.println("3)- Examen de auto por FECHA");
        System.out.println();
        System.out.println("9)- Menu anterior");
        System.out.println();
        System.out.print("Ingrese una opcion:  ");
    }
}
