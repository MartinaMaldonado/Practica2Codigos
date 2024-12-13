//Main de la practica 4
package controller.viewTaller;
import java.util.Scanner;
import controller.Taller4.Llamada;
import controller.Taller4.AguaPotable;
import controller.Taller4. SueldoMes;
import controller.Taller4.SerieSolucion;
public class MainPractica {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int salida = 0;
        do{
        System.out.println("---------------------------------------------------------");
        System.out.println("     Eliga un numero con lo que quiera ejecutar");
        System.out.println("---------------------------------------------------------");
        System.out.println("1: Sueldo de los empleados de la Compania de automoviles"); //mas o menos cual es el costo de un auto promedio? o el mas economico
        System.out.println("2: Costo de las llamadas telefonicas internacionales");
        System.out.println("3: Rubo de servicio de agua potable");
        System.out.println("4: Resolucion de la serie");
        System.out.println("0 salir del sistema");
        salida = sc.nextInt();
        switch (salida) {
            case 0:
                break;
            case 1:
                SueldoMes automovilesSueldo = new SueldoMes(); 
                automovilesSueldo.procesarVentas();
                break;
            case 2:
                Llamada llamada = new Llamada();
                llamada.procesarLlamadas();
                break;
            case 3: 
                AguaPotable aguaPotable = new AguaPotable();
                aguaPotable.procesarAgua();
                break;
            case 4:
                SerieSolucion serieSolucion = new SerieSolucion();
                serieSolucion.ejecutar();
                break; 

            default:
                salida = 0;
            break;
        }
    }while(salida != 0);
}
}