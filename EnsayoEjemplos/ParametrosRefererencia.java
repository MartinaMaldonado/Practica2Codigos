package controller.EnsayoEjemplos;

public class ParametrosRefererencia {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.saldo = 500.0;
        System.out.println("Saldo antes del depósito: " + cuenta.saldo);
        realizarDeposito(cuenta, 300.0);
        System.out.println("Saldo después del depósito: " + cuenta.saldo);
    }

    public static void realizarDeposito(CuentaBancaria cuenta, double cantidad) {
        cuenta.saldo += cantidad;
        System.out.println("Saldo dentro de la función: " + cuenta.saldo);
    }
}

class CuentaBancaria {
    public double saldo;
}

