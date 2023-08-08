package bankDemoHerencia;

public class Gerente extends Funcionario implements Autenticable {
    private String clave;

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String getClave() {
        return this.clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        if (clave == "AluraGerente") {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getBonificacion() {
        return super.getSalario() * 1.1;
    }


}
