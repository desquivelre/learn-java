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
        Cuenta cuentaPrueba = new Cuenta(1000, clientePrueba, 3, "Soles");
        System.out.println(cuentaPrueba.getTitularCuenta().getCelular());

        // Cuenta la cantidad de cuentas creadas a partir de una variable estatica
        System.out.println(Cuenta.getTotal());
    }
}
