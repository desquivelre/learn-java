package pe.com.alura.PolimorfismoHerenciaTest.test;

import pe.com.alura.PolimorfismoHerenciaTest.model.Cuenta;
import pe.com.alura.PolimorfismoHerenciaTest.model.Cliente;
import pe.com.alura.PolimorfismoHerenciaTest.model.CuentaAhorro;
import pe.com.alura.PolimorfismoHerenciaTest.model.CuentaCorriente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testOrdenarLista {
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
        for (Cuenta cuenta: cuentas){
            System.out.println(cuenta.getAgencia());
        }

        Comparator<Cuenta> comparador = new CompararCuentas();
        cuentas.sort(comparador);

        System.out.println("Antes de ordenar:");
        for (Cuenta cuenta: cuentas){
            System.out.println(cuenta.getAgencia());
        }
    }
}

class CompararCuentas implements Comparator<Cuenta> {
    @Override
    public int compare(Cuenta o1, Cuenta o2) {
        if (o1.getAgencia() == o2.getAgencia()) {
            return 0;
        } else if (o1.getAgencia() > o2.getAgencia()) {
            return 1;
        } else {
            return -1;
        }
    }
}
