package bankDemoHerencia;

public class Contador extends Funcionario {
    @Override
    public double getBonificacion(){
        return super.getSalario() * 0.3;
    }
}
