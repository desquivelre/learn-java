package pe.com.alura.PolimorfismoHerenciaTest.model;

public class Contador extends Funcionario {
    @Override
    public double getBonificacion(){
        return super.getSalario() * 0.3;
    }
}
