/*1.	Una compañía de autos usados paga $2,500.00 de sueldo a sus empleados por mes,
 Además agrega pagos extras a sus sueldos como: una comisión de $250.00 por cada automóvil 
 vendido cuyo valor de venta supere el $10,000.00 y el 5% de utilidad del valor total de ventas.  
 La compañía necesita emitir un informe desglosado por empleado donde indique el número total de 
 autos vendidos, el valor total de los autos que vendió, el monto total que se le debería pagar al 
 final del mes, indicando: el sueldo mensual, la comisión por cada automóvil y la utilidad por el valor total de la venta. 
 También debe permitir ingresar la venta de los automóviles hasta que se desee y luego emitir el respectivo informe.   */
 package controller.Taller4;
 import java.util.Scanner;
 public class SueldoMes {
     public void procesarVentas() {
         Scanner compania = new Scanner(System.in);
         System.out.print("Identifiquese: ");
         String empleado = compania.nextLine();
 
         // Inicializar variables
         double sueldoMensual = 2500.00;
         int totalAutosVendidos = 0;
         double valorTotalVentas = 0;
         double comision = 0;
         double utilidad = 0;
         String resp;
 
         // Bucle para ingresar ventas
         do {
             System.out.print("Ingrese el valor de venta de los automoviles que a vendido: ");
             double valorDeVenta = compania.nextDouble();
 
             // Acumular valores
             valorTotalVentas += valorDeVenta;
             totalAutosVendidos++;
 
             // Calcular comisión si el auto vale más de $10,000.00
             if (valorDeVenta > 10000) {
                 comision += 250.00;
             }

             System.out.print("Ingresar mas (S/N): ");
             resp = compania.next();
 
         } while (resp.equalsIgnoreCase("S"));

         utilidad = valorTotalVentas * 0.05;
         double sueldoTotal = sueldoMensual + comision + utilidad;
 
         // Imprimir el informe
         System.out.println("\n------- Informe de ventas -------");
         System.out.println("Nombre del empleado: " + empleado);
         System.out.println("Total de autos vendidos: " + totalAutosVendidos);
         System.out.println("Valor total de ventas: $ " + valorTotalVentas);

         System.out.println("\nSueldo mensual: $ " + sueldoMensual);
         System.out.println("Comisión por ventas: $ " + comision);
         System.out.println("Utilidad por ventas: $ " + utilidad);
         System.out.println("Monto total a pagar: $ " + sueldoTotal);
     }
 }