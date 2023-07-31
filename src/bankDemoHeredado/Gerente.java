package bankDemoHeredado;

public class Gerente extends Funcionario implements Autenticable{
    private String clave;

    @Override
    public void setClave(String clave){
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String clave){
        return clave == "AluraGerente";
    }

    @Override
    public double getBonificacion(){
        return super.getSalario()* 1.1;
    }


}
