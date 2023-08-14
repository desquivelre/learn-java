package pe.com.alura.ExceptionTest;

public class myException extends RuntimeException {
    public myException() {
        super();
    }

    public myException(String message) {
        super(message);
    }

}
