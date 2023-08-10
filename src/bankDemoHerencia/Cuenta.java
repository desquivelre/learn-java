package bankDemoHerencia;

public abstract class Cuenta {
    private double saldo;
    private Cliente titularCuenta = new Cliente();
    private int agencia;
    private String tipoMoneda;

    private static int total = 0;   // Cuenta el total de cuentas creadas

    public Cuenta() {
        total++;
    }

    public Cuenta(Cliente titularCuenta, int agencia, String tipoMoneda) {
        this.titularCuenta = titularCuenta;
        this.agencia = agencia;
        this.tipoMoneda = tipoMoneda;

        total++;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(Cliente titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public static int getTotal() {
        return Cuenta.total;
    }

    public void depositar(double montoDepositar) {
        if (montoDepositar < 0) {
            System.out.println("ERROR - El monto establecido es negativo");
        } else {
            this.saldo += montoDepositar;
            System.out.println("SUCCESS - Se realizó la operación con éxito");
        }
    }

    public void retirar(double montoRetirar) throws SaldoInsuficienteException {
        if (this.saldo < montoRetirar) {
            throw new SaldoInsuficienteException("ERROR - No tiene saldo");
        }
        this.saldo -= montoRetirar;
        System.out.println("SUCCESS - Se realizó la operación con éxito");
    }

    public void transferir(double montoTransferir, Cuenta cuentaPorTransferir) throws SaldoInsuficienteException {
        if (montoTransferir < 0) {
            System.out.println("ERROR - El monto establecido es negativo");
        } else if (montoTransferir > this.saldo) {
            System.out.println("ERROR - El monto establecido es mayor al saldo de la cuenta que transfiere");
        } else {
            this.retirar(montoTransferir);
            cuentaPorTransferir.depositar(montoTransferir);

            // Redondea los saldos a dos cifras decimales
            this.saldo = Math.round(this.saldo * 100.0) / 100.0;
            cuentaPorTransferir.saldo = Math.round(cuentaPorTransferir.saldo * 100.0) / 100.0;

            System.out.println("SUCCESS - Se realizó la operación con éxito");
        }
    }
}
