package bankDemo;

public class Cuenta {
    private double saldo;
    Cliente titularCuenta = new Cliente();
    int agencia;
    String tipoMoneda;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double montoDepositar) {
        if (montoDepositar < 0) {
            System.out.println("ERROR - El monto establecido es negativo");
        } else {
            this.saldo += montoDepositar;
            System.out.println("SUCCESS - Se realizó la operación con éxito");
        }
    }

    public void retirar(double montoRetirar) {
        if (montoRetirar < 0) {
            System.out.println("ERROR - El monto establecido es negativo");
        } else if (montoRetirar > this.saldo) {
            System.out.println("ERROR - El monto establecido es mayor al saldo actual");
        } else {
            this.saldo -= montoRetirar;
            System.out.println("SUCCESS - Se realizó la operación con éxito");
        }
    }

    public void transferir(double montoTransferir, Cuenta cuentaPorTransferir) {
        if (montoTransferir < 0) {
            System.out.println("ERROR - El monto establecido es negativo");
        } else if (montoTransferir > this.saldo) {
            System.out.println("ERROR - El monto establecido es mayor al saldo de la cuenta que transfiere");
        } else {
            this.saldo -= montoTransferir;
            cuentaPorTransferir.saldo += montoTransferir;

            // Redondea los saldos a dos cifras decimales
            this.saldo = Math.round(this.saldo * 100.0) / 100.0;
            cuentaPorTransferir.saldo = Math.round(cuentaPorTransferir.saldo * 100.0) / 100.0;

            System.out.println("SUCCESS - Se realizó la operación con éxito");
        }
    }
}
