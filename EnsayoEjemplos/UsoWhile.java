package controller.EnsayoEjemplos;

public class UsoWhile {
    public static void main(String[] args) {
        // Tabla de multiplicar de los números más difíciles de recordar (para mí)
        int contador;
        int siete = 7;
        int nueve = 9;
        int doce = 12;

        System.out.println("Tabla de multiplicar del 7");
        contador = 1;
        while (contador <= 12) {
            System.out.println(siete + " x " + contador + " = " + (siete * contador));
            contador++;
        }

        System.out.println("Tabla de multiplicar del 9");
        contador = 1;
        while (contador <= 12) {
            System.out.println(nueve + " x " + contador + " = " + (nueve * contador));
            contador++;
        }

        System.out.println("Tabla de multiplicar del 12");
        contador = 1;
        while (contador <= 12) {
            System.out.println(doce + " x " + contador + " = " + (doce * contador));
            contador++;
        }
    }
}
