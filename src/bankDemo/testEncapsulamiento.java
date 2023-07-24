package bankDemo;

public class testEncapsulamiento {
    public static void main(String[] args) {
        // Cuenta creada con getters y setters
        Cuenta cuentaTest = new Cuenta();
        cuentaTest.setAgencia(5);
        cuentaTest.setTipoMoneda("Soles");
        cuentaTest.getTitularCuenta().setNombre("Usuario3");
        cuentaTest.getTitularCuenta().setCelular("988756234");
        System.out.println(cuentaTest.getTitularCuenta().getNombre());

        // Cuenta creada con constructor
        Cliente clientePrueba = new Cliente();
        clientePrueba.setNombre("Prueba1");
        clientePrueba.setCelular("123456799");
        Cuenta cuentaPrueba = new Cuenta(clientePrueba, 3, "Soles");
        cuentaPrueba.depositar(1000);
        System.out.println(cuentaPrueba.getTitularCuenta().getCelular());

        // Cuenta la cantidad de cuentas creadas a partir de una variable estatica
        System.out.println("\nCantidad de cuentas creadas: " + Cuenta.getTotal());
    }
}
