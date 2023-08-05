package validateAnnotationTest;

import java.time.LocalDate;
import java.time.Month;

import static validateAnnotationTest.EdadMinimaUtil.validador;

public class testAnnotation {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Diego", "contraseña123", LocalDate.of(2009, Month.MARCH, 14));

        System.out.println(validador(usuario));
    }
}
