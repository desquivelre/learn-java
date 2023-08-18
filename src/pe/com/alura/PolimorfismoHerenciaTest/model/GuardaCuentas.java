package pe.com.alura.PolimorfismoHerenciaTest.model;

public class GuardaCuentas {
    private Cuenta[] cuentas = new Cuenta[10];
    private int indice = 0;

    public void guardar(Cuenta cuenta) {
        cuentas[indice] = cuenta;
        indice++;
    }

    public Cuenta obtenerPorIndice(int indice) {
        System.out.println("Se obtuvo la cuenta con: " + cuentas[indice].getAgencia());
        return cuentas[indice];
    }
}
