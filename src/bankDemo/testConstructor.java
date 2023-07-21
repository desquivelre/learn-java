package bankDemo;

public class testConstructor {
    public static void main(String[] args) {
        Cuenta cuentaTest2 = new Cuenta();
        cuentaTest2.setAgencia(-4);

        System.out.println(cuentaTest2.getAgencia());
    }
}
