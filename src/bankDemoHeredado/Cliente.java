package bankDemoHeredado;

public class Cliente implements Autenticable{
    private String celular;
    private String nombre;
    private String clave;

    public Cliente() {

    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return clave == "AluraCliente";
    }
}
