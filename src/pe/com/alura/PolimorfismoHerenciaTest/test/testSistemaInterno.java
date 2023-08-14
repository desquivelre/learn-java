package pe.com.alura.PolimorfismoHerenciaTest.test;

import pe.com.alura.PolimorfismoHerenciaTest.model.SistemaInterno;
import pe.com.alura.PolimorfismoHerenciaTest.model.Administrador;
import pe.com.alura.PolimorfismoHerenciaTest.model.Cliente;
import pe.com.alura.PolimorfismoHerenciaTest.model.Gerente;

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
