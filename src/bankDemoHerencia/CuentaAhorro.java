package bankDemoHerencia;

public class CuentaAhorro extends Cuenta{
    public CuentaAhorro() {
    }

    public CuentaAhorro(Cliente titularCuenta, int agencia, String tipoMoneda) {
        super(titularCuenta, agencia, tipoMoneda);
    }
}
