package pe.com.alura.PolimorfismoHerenciaTest.test;

import pe.com.alura.PolimorfismoHerenciaTest.model.Cliente;
import pe.com.alura.PolimorfismoHerenciaTest.model.Cuenta;
import pe.com.alura.PolimorfismoHerenciaTest.model.CuentaAhorro;
import pe.com.alura.PolimorfismoHerenciaTest.model.CuentaCorriente;

import java.util.ArrayList;
import java.util.List;

public class testLambda {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        CuentaAhorro cuentaAhorro = new CuentaAhorro(cliente, 55, "Soles");
        cuentaAhorro.depositar(100);
        CuentaCorriente cuentaCorriente = new CuentaCorriente(cliente, 21, "Soles");
        cuentaCorriente.depositar(250);
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(cliente, 20, "Soles");
        cuentaAhorro1.depositar(632.4);

        List<Cuenta> cuentas = new ArrayList<>();

        cuentas.add(cuentaAhorro);
        cuentas.add(cuentaCorriente);
        cuentas.add(cuentaAhorro1);

        System.out.println("Antes de ordenar:");
        cuentas.forEach(cuenta -> System.out.println(cuenta.getAgencia()));

        cuentas.sort((o1, o2) -> Integer.compare(o1.getAgencia(), o2.getAgencia()));

        System.out.println("Despues de ordenar:");
        cuentas.forEach(cuenta -> System.out.println(cuenta.getAgencia()));
    }
}
