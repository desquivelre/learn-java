package bankDemoHeredado;

public class testCuenta {
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(null, 2, "Soles");
        CuentaAhorro cuentaAhorro = new CuentaAhorro(null, 3, "Soles");

        cuentaCorriente.depositar(2350.25);
        cuentaAhorro.depositar(3500.30);

        cuentaCorriente.transferir(1000.40, cuentaAhorro);

        System.out.println("" + cuentaCorriente.getSaldo());
        System.out.println(cuentaAhorro.getSaldo());
    }
}