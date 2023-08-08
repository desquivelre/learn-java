package bankDemoHerencia;

public class ControlBonificacion {
    private double suma;

    public void registrarSalario(Funcionario funcionario) {
        this.suma += funcionario.getBonificacion();
        this.suma = Math.round(this.suma * 100.0) / 100.0;
    }

    public double getSuma() {
        return suma;
    }
}
