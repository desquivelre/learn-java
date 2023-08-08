package bankDemoHerencia;

public class testControlBonificacion {
    public static void main(String[] args) {
        Funcionario funcionarioTest = new Contador(); // Clase abstracta, por ello, se asigna la referencia en Contador
        funcionarioTest.setSalario(2000);

        Gerente gerenteTest = new Gerente();
        gerenteTest.setSalario(3000);

        Contador contadorTest = new Contador();
        contadorTest.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();
        System.out.println("Antes de sumar el salario de los funcionarios: " + controlBonificacion.getSuma());

        controlBonificacion.registrarSalario(funcionarioTest);  // Bonificacion del funcionario: 200.0
        controlBonificacion.registrarSalario(gerenteTest);  // Bonificacion del gerente: 3300.0
        controlBonificacion.registrarSalario(contadorTest); // Bonificacion del contador: 1500.0

        System.out.println("Luego de sumar el salario de los funcionarios: " + controlBonificacion.getSuma());
    }
}
