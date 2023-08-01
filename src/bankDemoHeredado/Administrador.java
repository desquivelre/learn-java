package bankDemoHeredado;

public class Administrador extends Funcionario implements Autenticable {
    private String clave;
    @Override
    public double getBonificacion() {
        return super.getSalario() * 1.5;
    }

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
        if (clave == "AluraAdministrador") {
            return true;
        } else {
            return false;
        }
    }
}
