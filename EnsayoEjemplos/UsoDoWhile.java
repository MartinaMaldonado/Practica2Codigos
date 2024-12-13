package controller.EnsayoEjemplos;
import java.util.Scanner;
public class UsoDoWhile {
    public static void main(String[] args) {
        Scanner adivina = new Scanner(System.in);
        boolean bandera = false;
        int numeroSecreto = 3;
        int intento;

        do {
            System.out.print("Adivina cual es la mitad de 2 + 2: ");
            intento = adivina.nextInt();

            if (intento == numeroSecreto) {
                System.out.println("¡Correcto!");
                bandera = true;
            } else {
                System.out.println("Incorrecto. Intenta de nuevo.");
            }
        } while (!bandera);
    }
}
