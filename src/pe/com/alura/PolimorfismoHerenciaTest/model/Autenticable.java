package pe.com.alura.PolimorfismoHerenciaTest.model;

public interface Autenticable {
    void setClave(String clave);

    String getClave();

    boolean iniciarSesion(String clave);
}
