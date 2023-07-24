package bankDemoHeredado;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente() {
    }

    public CuentaCorriente(Cliente titularCuenta, int agencia, String tipoMoneda) {
        super(titularCuenta, agencia, tipoMoneda);
    }

    @Override
    public void retirar(double montoRetirar) {
        double comisionCuentaCorriente = 0.2;
        super.retirar(montoRetirar + comisionCuentaCorriente);
    }
}
