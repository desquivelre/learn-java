package pe.com.alura.PolimorfismoHerenciaTest.test;

import pe.com.alura.PolimorfismoHerenciaTest.model.Cliente;
import pe.com.alura.PolimorfismoHerenciaTest.model.Gerente;

import java.util.ArrayList;

public class testArrayList {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();

        Cliente cliente = new Cliente();
        Gerente gerente = new Gerente();

        objects.add(cliente);
        objects.add(gerente);

        System.out.println("Se obtuvieron los objetos:\n");

        for (int i = 0; i < objects.size(); i++) {
            System.out.println(objects.get(i));
        }

        System.out.println("\nOtra forma:\n");

        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
