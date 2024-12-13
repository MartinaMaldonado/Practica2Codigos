package controller.Taller4;
import java.util.Scanner;
import controller.util.Utilidades;
public class SerieSolucion {
// (1 / 1)^2 + (1 / 3)^4 - (2 / 5)^6 - (3 / 7)^8 + (5 / 9)^10 + (8 / 11)^12 ….
// el numerador es fibonacci con el siguiente, el denominador son primos, la potencia se va sumando 2
    private int generarNumerador(int posicion) {
        if (posicion <= 0) return 0;
        if (posicion == 1) return 1;
        int anterior = 0, actual = 1, siguiente = 0;
        for (int i = 2; i <= posicion; i++) {
            siguiente = anterior + actual; 
            anterior = actual;            
            actual = siguiente;           
        } 
        return siguiente;
    }
    // se tiene en cuenta que en la serie proporcionada se empieza por 1 
    private int generarDenominador(int numero) {
        return 1 + (numero * 2);
    }
    
    private int generarPotencia(int numero) {
        return 2 + (numero * 2);
    }

    public String ejecutar(int numSerie) {
        String serie = "S = ";
        if (numSerie > 0) {
            double suma = 0.0;
            for (int i = 0; i < numSerie; i++) { ///ojo que inicia de cero
                int numerador = generarNumerador(i + 1);
                int denominador = generarDenominador(i);
                int potencia = generarPotencia(i);
                double termino = Math.pow((double) numerador / denominador, potencia);

                if (i % 4 == 2 || i % 4 == 3) { //para el signo
                    /*En este caso, las posiciones 0, 1 representan términos positivos.
                    Las posiciones 2, 3 representan términos negativos/* */
                    serie += "(" + numerador + "/" + denominador + ")^" + potencia + " - ";
                    suma -= termino;
                } else {
                    serie += "(" + numerador + "/" + denominador + ")^" + potencia + " + ";
                    suma += termino;
                }
            }
            serie = serie.substring(0, serie.length() - 3); // Elimina el último " + " o " - " o sea para la longuitud de la cadena
            String resp = "La serie es: "+serie+ "\n";
            resp += "El resultado es: " +suma;
            return resp;
        } else {
            return "Que sea mayor a 0";
        }
    }

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de terminos de la serie:");
        String numero = sc.nextLine();
        int numSerie = Utilidades.transformStringInt(numero);
        System.out.println(ejecutar(numSerie));
    }
}
