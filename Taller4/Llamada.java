package controller.Taller4;

import java.util.Scanner;

public class Llamada {
    // como el precio es dato constante dependiendo la zona se usa enum para evitar
    // redundancias.
    public enum EnumZona { // importante en MAYUS
        NORTE(2.75), CENTRAL(1.89), SUR(1.60), EUROPA(3.5), ASIA(4.5), AFRICA(3.1), OCEANIA(3), RESTO(6);

        // Variables de instancia
        private double precioPorMinuto;

        private EnumZona(double precio) {
            precioPorMinuto = precio;
        }

        public double getPrecioPorMinuto() {
            return precioPorMinuto;
        }
    }

    public void procesarLlamadas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("~~> Llamadas_Telefonicas_Internacionales <~~");

        for (int i = 0; i < EnumZona.values().length; i++) {
            System.out.println(EnumZona.values()[i]);
        }

        System.out.print("Destino de la llamada: ");
        //System.out.print("(Si es America solo especifique la zona): ");

        String cadena_Zonas = sc.nextLine().toUpperCase(); // solo para convertir todo a MAYUS

        System.out.print("Ingrese la clave de la zona: ");
        int clave = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese los minutos de duracion de la llamada: ");
        int minutos = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer nuevamente

        double costoLlamada = 0.0;

        switch (cadena_Zonas) {
            case "NORTE":
                if (clave == 12) {
                    costoLlamada = minutos * EnumZona.NORTE.getPrecioPorMinuto();
                } else {
                    System.out.println("Error. La clave de la zona es incorrecta.");
                }
                break;
            case "CENTRAL":
                if (clave == 15) {
                    costoLlamada = minutos * EnumZona.CENTRAL.getPrecioPorMinuto();
                } else {
                    System.out.println("Error. La clave de la zona es incorrecta.");
                }
                break;
            case "SUR":
                if (clave == 18) {
                    costoLlamada = minutos * EnumZona.SUR.getPrecioPorMinuto();

                } else {
                    System.out.println("Error. La clave de la zona es incorrecta.");
                }
                break;
            case "EUROPA":
                if (clave == 19) {
                    costoLlamada = minutos * EnumZona.EUROPA.getPrecioPorMinuto();

                } else {
                    System.out.println("Error. La clave de la zona es incorrecta.");
                }
                break;
            case "ASIA":
                if (clave == 23) {
                    costoLlamada = minutos * EnumZona.ASIA.getPrecioPorMinuto();

                } else {
                    System.out.println("Error. La clave de la zona es incorrecta.");
                }
                break;
            case "AFRICA":
                if (clave == 25) {
                    costoLlamada = minutos * EnumZona.AFRICA.getPrecioPorMinuto();

                } else {
                    System.out.println("Error. La clave de la zona es incorrecta.");
                }
                break;
            case "OCEANIA":
                if (clave == 29) {
                    costoLlamada = minutos * EnumZona.OCEANIA.getPrecioPorMinuto();

                } else {
                    System.out.println("Error. La clave de la zona es incorrecta.");
                }
                break;
            case "RESTO":
                if (clave == 31) {
                    costoLlamada = minutos * EnumZona.RESTO.getPrecioPorMinuto();

                } else {
                    System.out.println("Error. La clave de la zona es incorrecta.");
                }
                break;

            default:
                System.out.println("Error. La zona especificada no es válida.");
                return;
        }
        System.out.println("~~> Costo TOTAL de la llamada: $" + costoLlamada);
    }
}