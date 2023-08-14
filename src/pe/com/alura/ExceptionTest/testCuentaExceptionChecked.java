package pe.com.alura.ExceptionTest;

public class testCuentaExceptionChecked {
    public static void main(String[] args) {
        Cuenta account = new Cuenta();
        try {
            account.depositar();
        } catch (myExceptionHeredada e) {
            e.printStackTrace();
        }
    }
}
