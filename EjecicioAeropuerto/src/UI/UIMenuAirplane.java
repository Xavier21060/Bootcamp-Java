package UI;

import tipoDeNave.Airplane;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenuAirplane {
    //Un Array List e los aviones que tienen viajes dispoibles
    public static ArrayList<Airplane> avionesViajesDisponibles = new ArrayList<>();


    public static void mostrarMenuAvion(){
        int respuesta = 0;
        do {
            System.out.println("\n");
            System.out.println("Aeropuerto Terricola");
            System.out.println("Avion");
            System.out.println("Bienvenido" + InterfazDespegue.avionLogged.getTipoAeronave());

            System.out.println("1. Añadir viajes Disponibles");
            System.out.println("2. Mis viajes");
            System.out.println("0. Salir");

            Scanner entrada = new Scanner(System.in);
            respuesta = Integer.valueOf(entrada.nextLine());

            switch (respuesta){
                case 1:
                    mostrarViajesDisponibles();
                    break;
                case 2:
                    break;
                case 0:
                    InterfazDespegue.mostrarMenu();
                    break;
            }

        }while (respuesta !=0);

    }

    private static void mostrarViajesDisponibles(){
        int respuesta = 0;
        do {
            System.out.println();
            System.out.println("::Añadir viajes Disponibles ");
            System.out.println("::Seleccione un mes");
            //Un ciclo para recorrer los tres primeros meses
            for (int i = 0; i < 3; i++) {
                int j = i +1;
                System.out.println(j + ". " + InterfazDespegue.MESES_DISPONIBLES[i]);
            }
            System.out.println("0. Regresar");

            Scanner entrada = new Scanner(System.in);
            respuesta = Integer.valueOf(entrada.nextLine());

            if (respuesta > 0 && respuesta < 4){
                int mesSeleccionado = respuesta;
                System.out.println(mesSeleccionado + ". " + InterfazDespegue.MESES_DISPONIBLES[mesSeleccionado -1]);

                System.out.println("Inserta la fecha dispnible: [DD/MM/AAAA]");
                String date = entrada.nextLine();

                System.out.println("Tu fecha es " + date + "\n1. Correcto \n2. Cambiar");
                int respuestaFecha = Integer.valueOf(entrada.nextLine());
                if (respuestaFecha == 2)continue;

                int respuestaHora = 0;
                String time = "";
                do {
                    System.out.println("Inserte la hora en la que desea viajar de su viaje " + date + " [24:00]");
                    time = entrada.nextLine();

                    System.out.println("Tu Hora es " + time + "\n1. Correcto \n2. Cam");
                    respuestaHora = Integer.valueOf(entrada.nextLine());
                }while (respuestaHora == 2);

                //Le añadimos los viajes al avion
                InterfazDespegue.avionLogged.addViajesDisponibles(date, time);
                checkAvionViajesDisponibles(InterfazDespegue.avionLogged);

            }else if (respuesta == 0){
                mostrarMenuAvion();
            }
        }while(respuesta != 0);
    }

    private  static  void checkAvionViajesDisponibles(Airplane avion){
       if (avion.getViajesDisponibles().size() > 0 && !avionesViajesDisponibles.contains(avion)){
           avionesViajesDisponibles.add(avion);
       }

    }
}
