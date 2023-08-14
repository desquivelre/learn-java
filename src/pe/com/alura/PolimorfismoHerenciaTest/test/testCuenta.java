package pe.com.alura.PolimorfismoHerenciaTest.test;

import pe.com.alura.PolimorfismoHerenciaTest.model.SaldoInsuficienteException;
import pe.com.alura.PolimorfismoHerenciaTest.model.CuentaAhorro;
import pe.com.alura.PolimorfismoHerenciaTest.model.CuentaCorriente;

public class testCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(null, 2, "Soles");
        CuentaAhorro cuentaAhorro = new CuentaAhorro(null, 3, "Soles");

        cuentaCorriente.depositar(2350.25);
        cuentaAhorro.depositar(3500.30);

        try {
            cuentaCorriente.transferir(1000.40, cuentaAhorro);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Saldo cuenta corriente: " + cuentaCorriente.getSaldo());
        System.out.println("Saldo cuenta ahorros: " + cuentaAhorro.getSaldo());
    }
}
