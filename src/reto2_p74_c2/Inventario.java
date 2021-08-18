/**
 * Clase principal: Inventario.java (incluye main)
 * Contiene menú con tres opciones
 *
 * @author Natalia Giraldo
 */
package reto2_p74_c2;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    private static Scanner sc = new Scanner(System.in);
    private static boolean salir = false;
    private static String opcion;
    private static String[] partes = {};
    private static String tipo = "";

    private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    private static Particular particular;
    private static Comercial comercial;

    public static void procesarComandos() {

        do {

            //System.out.println("1. Opcion 1");
            //System.out.println("2. Opcion 2");
            //System.out.println("3. Salir");
            //System.out.println("Escribe una de las opciones");
            String cadena = sc.nextLine();

            //sc.close();
            if (cadena.length() != 1) {
                partes = cadena.split("&");
                opcion = partes[0];
                tipo = partes[1];
            } else {
                opcion = cadena;
            }

            switch (opcion) {

                case "1":

                    String cantidadPasajeros = partes[2];
                    String velocidadMaxima = partes[3];
                    String placa = partes[4];

                    if (tipo.equals("Particular")) {

                        String color = partes[5];
                        particular = new Particular(color,tipo,velocidadMaxima,
                                cantidadPasajeros,placa);
                        vehiculos.add(particular);

                    }

                    if (tipo.equals("Comercial")) {

                        String cargaLimite = partes[5];
                        comercial = new Comercial(cargaLimite,velocidadMaxima,tipo,
                                cantidadPasajeros,placa);
                        vehiculos.add(comercial);
                    }

                    break;

                case "2":

                    System.out.println("***Inventario de vehículos***");
                    for (Vehiculo vehiculo : vehiculos) {
                        System.out.println(vehiculo.toString());
                    }

                    break;

                case "3":

                    salir = true;

                    break;

                default:

                    System.out.println("Solo numeros entre 1 y 3");

                    break;

            }
        } while (!salir);
    }

    public static void main(String[] args) {
        procesarComandos();
    }
}
