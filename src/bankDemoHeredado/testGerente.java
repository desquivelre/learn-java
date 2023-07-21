package bankDemoHeredado;

public class testGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setSalario(5000);
        gerente1.setClave("Alura");

        System.out.println("Salario: " + gerente1.getSalario());
        System.out.println("Bonificación: " + gerente1.getBonificacion());
        System.out.println("\nTiene acceso: " + gerente1.iniciarSesion(gerente1.getClave()));
    }
}
