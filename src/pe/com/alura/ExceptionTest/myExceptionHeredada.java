package pe.com.alura.ExceptionTest;

public class myExceptionHeredada extends Exception {
    public myExceptionHeredada() {
        super();
    }

    public myExceptionHeredada(String message) {
        super(message);
    }
}
