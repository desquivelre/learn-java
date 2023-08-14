package pe.com.alura.ExceptionTest;

public class testCuentaExceptionChecked {
    public static void main(String[] args) {
        Account account = new Account();
        try {
            account.depositar();
        } catch (myExceptionHeredada e) {
            e.printStackTrace();
        }
    }
}
