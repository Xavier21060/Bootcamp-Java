package UI;


import tipoDeNave.Airplane;
import tipoDeNave.Ovni;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazDespegue {
    public static final String[] MESES_DISPONIBLES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "agosto", "septiembre"};
    public static Airplane avionLogged;
    public static Ovni ovniLogged;

    //public static String[] mesesRestantes = new String[MESES_DISPONIBLES.length];
    public static void mostrarMenuUsuario() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("USUARIO");
            System.out.println("1. Reservar un viaje");
            System.out.println("2. Mis viajes");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Reservar un viaje");
                    mostrarMenu();
                    break;
                case 2:
                    System.out.println("::Mis Viajes");
                    break;
                case 0:
                    break;
            }
        } while (response != 0);

    }
    public static void mostrarMenu() {
        System.out.println(" ° Binvenido al Aeropuerto: La mejor Diversidad");
        System.out.println(" ° Seleccione en que Aerolinea desea viajar");

        int respuesta = 0;
        do {
            System.out.println("1. Aerolinea Terricola");
            System.out.println("2. Aerolinea Criptoniana");
            System.out.println("0.Salir");

            Scanner entrada = new Scanner(System.in);
            respuesta = Integer.valueOf(entrada.nextLine());

            switch (respuesta) {
                case 1:
                    respuesta = 0;
                    mostrarMenuAerolineaTerricola();
                    break;
                case 2:
                    respuesta = 0;
                    mostrarMenuAerolineaCriptoniana();
                    break;

                case 0:
                    System.out.println("Gracias por su visita");
                    break;
            }

        } while (respuesta != 0);
    }
    static void mostrarMenuAerolineaTerricola() {
        int respuesta = 0;
        do {
            System.out.println("\n");
            System.out.println("Aerolinea Terricola");
            System.out.println("1. Avion");
            System.out.println("2. Helicotero");
            System.out.println("0. Return");

            Scanner entrada = new Scanner(System.in);
            respuesta = Integer.valueOf(entrada.nextLine());
            switch (respuesta) {
                case 1:
                    respuesta = 0;
                    System.out.println("1.Avion");
                    autenticacionUsuario(1);
                    break;
                case 2:
                    System.out.println("2.Helicotero");
                    break;
                case 0:
                    mostrarMenu();
            }
        } while (respuesta != 0);
    }
    static void mostrarMenuAerolineaCriptoniana() {
        int respuesta = 0;
        do {

            System.out.println("\n");
            System.out.println("Aerolinea Criptoniana");
            System.out.println("1. Superman");
            System.out.println("2. Ovni");
            System.out.println("0. Ir al menu");

            Scanner entrada = new Scanner(System.in);
            respuesta = Integer.valueOf(entrada.nextLine());
            switch (respuesta) {
                case 1:
                    System.out.println("1.Superman");
                    break;
                case 2:
                    respuesta = 0;
                    System.out.println("2.Ovni");
                    autenticacionUsuario(2);
                    break;

                case 0:
                    System.out.println("0.returnar Al menu");
                    mostrarMenu();
                    break;
            }

        } while (respuesta != 0);
    }

    //Un metodo para la autenticacion de un avion

    private static void autenticacionUsuario(int tipoUser ){
        //Las reglas del usuario
        //tiopuser = 1 Aeropuerto Terricola
        //tipouser = 2 Aerpuerto criptoniano
        //se guarda el metodo constructor
        ArrayList<Airplane> aviones = new ArrayList<>();
        aviones.add(new Airplane("avion04",20));
        aviones.add(new Airplane("avion05",20));
        aviones.add(new Airplane("avion06",22) );

        ArrayList<Ovni> ovnis = new ArrayList<>();
        ovnis.add(new Ovni("Ovni 04",6) );
        ovnis.add(new Ovni("Ovni 05",7) );
        ovnis.add(new Ovni("Ovni 06",9) );

        boolean cantidadDeAsientos =false;
        do {
            System.out.println("Coloque la cantidad de asiento ");
            Scanner sc = new Scanner(System.in);
            int asientos = sc.nextInt();

            if (tipoUser == 1) {
                for (Airplane a: aviones){
                    if (a.getCantidadDeAsientos() >= 20){
                        cantidadDeAsientos = true;
                        avionLogged =a;
                        UIMenuAirplane.mostrarMenuAvion();
                    }
                }
            }
            if (tipoUser ==2){
                for(Ovni o: ovnis){
                    if (o.getCantidadDeAsientos() >= 5) {
                        cantidadDeAsientos = true;
                        ovniLogged = o;//mostrarMenuovni
                    }
                }
            }
        }while (!cantidadDeAsientos);
    }
}

