package bankDemoHerencia;

public class testGerente {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setSalario(5000);

        System.out.println("Salario: " + gerente1.getSalario());
        System.out.println("Bonificación: " + gerente1.getBonificacion());

        System.out.println(gerente1.iniciarSesion("AluraGerente"));
    }
}
