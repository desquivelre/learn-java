package validateAnnotationTest;

import java.time.LocalDate;
import java.time.Month;

public class testAnnotation {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Diego", "contraseña123", LocalDate.of(1995, Month.MARCH, 14));

//        System.out.println(validador(usuario));
    }
}
