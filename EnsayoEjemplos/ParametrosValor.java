package controller.EnsayoEjemplos;

public class ParametrosValor {

    // Función que realiza una operación usando tres parámetros
    public static void realizarOperacion(int x, int y, int z) {
        // Modificar los valores locales
        x = x + y;
        y = y * z;
        z = z - x;

        System.out.println("Dentro de la función:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

    public static void main(String[] args) {
        // Variables originales
        int x = 4;
        int y = 7 - 2;
        int z = 3 * 2;

        System.out.println("Antes de llamar a la función:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        // Llamada a la función con paso de parámetros por valor
        realizarOperacion(x, y, z);

        System.out.println("Después de llamar a la función:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
