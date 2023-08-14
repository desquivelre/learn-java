package pe.com.alura.PolimorfismoHerenciaTest.model;

public class SistemaInterno {
    public boolean autenticar(Autenticable autenticable) {
        boolean puedeIniciarSesion = autenticable.iniciarSesion(autenticable.getClave());

        if (puedeIniciarSesion){
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error en login");
            return false;
        }
    }
}
