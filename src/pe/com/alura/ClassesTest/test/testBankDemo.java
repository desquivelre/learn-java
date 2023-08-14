package pe.com.alura.ClassesTest.test;

import pe.com.alura.ClassesTest.model.Cuenta;

public class testBankDemo {
    public static void main(String[] args) {
        // Inicializo la cuenta
        Cuenta cuentaDiego = new Cuenta();
        // Datos cuenta
        cuentaDiego.setAgencia(1);
        cuentaDiego.setTipoMoneda("Soles");
        // Datos cliente
        cuentaDiego.getTitularCuenta().setNombre("Diego");
        cuentaDiego.getTitularCuenta().setCelular("999775647");

        Cuenta cuentaUsuario2 = new Cuenta();
        cuentaUsuario2.setAgencia(2);
        cuentaUsuario2.setTipoMoneda("Soles");
        cuentaUsuario2.getTitularCuenta().setNombre("Usuario2");
        cuentaUsuario2.getTitularCuenta().setCelular("999888777");

        // Asignar saldo a ambas cuentas(embedded variable)
        System.out.println("-- Asignar saldo a cuentas --\n");
        cuentaDiego.depositar(200.3);
        cuentaUsuario2.depositar(350.5);

        System.out.println("\n-- Antes de transferir --\n");
        System.out.println("Cuenta de Diego: " + cuentaDiego.getSaldo());
        System.out.println("Cuenta de Usuario2: " + cuentaUsuario2.getSaldo() + "\n");
        cuentaDiego.transferir(200.134, cuentaUsuario2);

        System.out.println("\n-- Luego de transferir --\n");
        System.out.println("Cuenta de Diego: " + cuentaDiego.getSaldo());
        System.out.println("Cuenta de Usuario2: " + cuentaUsuario2.getSaldo());
    }
}
