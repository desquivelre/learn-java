package bankDemoHeredado;

public class testFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Contador(); // Clase abstracta, por ello, se asigna la referencia en Contador
        funcionario1.setDocumento(75632136);
        funcionario1.setNombre("Diego");
        funcionario1.setSalario(2000);

        System.out.println("Salario: " + funcionario1.getSalario());
        System.out.println("Bonificación: " + funcionario1.getBonificacion());
    }
}
