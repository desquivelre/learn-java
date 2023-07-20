package bankDemo;

public class testBankDemo {
    public static void main(String[] args) {
        // Inicializo la cuenta
        Cuenta cuentaDiego = new Cuenta();
        // Datos cuenta
        cuentaDiego.agencia = 1;
        cuentaDiego.tipoMoneda = "Soles";
        // Datos cliente
        cuentaDiego.titularCuenta.nombre = "Diego";
        cuentaDiego.titularCuenta.celular = "999775647";

        Cuenta cuentaUsuario2 = new Cuenta();
        cuentaUsuario2.agencia = 2;
        cuentaUsuario2.tipoMoneda = "Soles";
        cuentaUsuario2.titularCuenta.nombre = "Usuario2";
        cuentaUsuario2.titularCuenta.celular = "999888777";

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
