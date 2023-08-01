package bankDemoHeredado;

public class testSistemaInterno {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Gerente gerente = new Gerente();
        Administrador administrador = new Administrador();

        cliente.setClave("AluraCliente");
        gerente.setClave("AluraGerente");
        administrador.setClave("AluraAdministrador");

        SistemaInterno prueba = new SistemaInterno();
        prueba.autenticar(administrador);

    }
}
