package bankDemoHeredado;

public class Gerente extends Funcionario{
    private String clave;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "Alura";
    }

    @Override
    public double getBonificacion(){
        return super.getSalario()* 1.1;
    }
}
