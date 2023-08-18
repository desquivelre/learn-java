package pe.com.alura.PolimorfismoHerenciaTest.test;

import pe.com.alura.PolimorfismoHerenciaTest.model.*;

public class testGuardarObjeto {
    public static void main(String[] args) {
        GuardarObjeto guardarObjeto = new GuardarObjeto();

        Gerente gerente = new Gerente();
        Cliente cliente = new Cliente();
        Contador contador = new Contador();

        guardarObjeto.guardarObjeto(gerente);
        guardarObjeto.guardarObjeto(cliente);
        guardarObjeto.guardarObjeto(contador);

        guardarObjeto.obtenerObjetos();
    }
}
