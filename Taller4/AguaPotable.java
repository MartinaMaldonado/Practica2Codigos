package controller.Taller4;
import java.util.Scanner;
import controller.util.Utilidades;
public class AguaPotable {
    // Método para calcular el rubro por servicio de agua potable
    public static double calcularRubroAgua(double mililitros) {
        double rubro = 0;
        // esta raro esto analizar
        if (mililitros <= 15) {
            rubro = 3.00;
        } else if (mililitros <= 25) {
            rubro = 3.00 + (mililitros - 15) * 0.10;
        } else if (mililitros <= 40) {
            rubro = 3.00 + (mililitros - 25) * 0.20 + (25 - 15) * 0.10;
        } else if (mililitros <= 60) {
            rubro = 3.00 + (mililitros - 40) * 0.30 + (25 - 15) * 0.10 + (40 - 25) * 0.20;
        } else {
            rubro = 3.00 + (mililitros - 60) * 0.35 + (25 - 15) * 0.10 + (40 - 25) * 0.20 + (60 - 40) * 0.30;
            //
        }

        return rubro;
    }

    /*NOTA: El código solo aplica el descuento a mayores y discapacitados al rango base de $3.00. 
       ---> Si no hay descuentos aplicables el descuento se mantiene en cero*/
    
    // Método para calcular el descuento
    public static double calcularDescuento(double mililitros, boolean TerceraEdad, boolean Discapacidad, double porcentaje) {
        double descuento = 0;

        if (TerceraEdad) {
            if (mililitros <= 15) {
                descuento = 3.00 * 0.50;
            } else {
                descuento = 3.00 * 0.30; 
            }
        } else if (Discapacidad) {
            descuento = 3.00 * (porcentaje / 100.0); 
        }

        return descuento;
    }

    public void procesarAgua() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el consumo de agua potable en mililitros cubicos: ");
        double mililitros = sc.nextDouble();
        System.out.println("¿Usted es de la tercera edad? (true/false): ");
        boolean TerceraEdad = sc.nextBoolean();
        System.out.println("¿Posee alguna discapacidad? (true/false): ");
        boolean Discapacidad = sc.nextBoolean();
        double porcentaje = 0;
        if (Discapacidad) {
            System.out.println("Ingrese el porcentaje de discapacidad (0 % - 100 %): ");
            porcentaje = sc.nextDouble();
        }

        // Calculo de los servicios y descuentos dependiendo

        double rubroAgua = calcularRubroAgua(mililitros);
        double descuento = calcularDescuento(mililitros, TerceraEdad, Discapacidad, porcentaje);
        double rubroAguaConDescuento = rubroAgua - descuento;

        //rubos adicionales
        double impuestoAlcantarillado = 0.35 * rubroAguaConDescuento; //Mencionar utilidades
        double tasaBasura = 0.75;
        double tasaProcesamiento = 0.50;

        // Total a pagar y factura
        double total = rubroAguaConDescuento + impuestoAlcantarillado + tasaBasura + tasaProcesamiento;

        System.out.println("-------Resultado de la planilla-------");
        System.out.println("Rubro por servicio de agua potable: $ " + Utilidades.redondear(rubroAguaConDescuento));
        System.out.println("Impuesto de alcantarillado: $ " + Utilidades.redondear(impuestoAlcantarillado));
        System.out.println("Tasa por recolección de basura: $ " + tasaBasura);
        System.out.println("Tasa por procesamiento de datos: $ " + tasaProcesamiento);
        System.out.println("Total a pagar: $ " + Utilidades.redondear(total));
    }
}
