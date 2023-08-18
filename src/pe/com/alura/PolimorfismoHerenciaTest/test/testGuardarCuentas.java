package pe.com.alura.PolimorfismoHerenciaTest.test;

import pe.com.alura.PolimorfismoHerenciaTest.model.*;

public class testGuardarCuentas {
    public static void main(String[] args) {
        GuardaCuentas guardaCuentas = new GuardaCuentas();

        Cliente cliente = new Cliente();
        Cuenta cuentaCorriente = new CuentaCorriente(cliente, 10, "Soles");
        Cuenta cuentaAhorro = new CuentaAhorro(cliente, 25, "Dólares");

        guardaCuentas.guardar(cuentaCorriente);
        guardaCuentas.guardar(cuentaAhorro);

        guardaCuentas.obtenerPorIndice(0);
    }
}
