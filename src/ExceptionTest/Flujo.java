package ExceptionTest;

public class Flujo {
    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin main");
    }

    public static void metodo1() {
        System.out.println("Inicio metodo1");
        try {
            metodo2();
        } catch (myException me) {
            me.printStackTrace();
        }
        System.out.println("Fin metodo1");
    }

    public static void metodo2() {
        System.out.println("Inicio metodo2");
        throw new myException("My exception was launched");
    }
}
