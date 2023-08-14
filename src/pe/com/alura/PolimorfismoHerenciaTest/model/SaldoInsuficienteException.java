package pe.com.alura.PolimorfismoHerenciaTest.model;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
