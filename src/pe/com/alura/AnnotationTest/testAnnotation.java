package pe.com.alura.AnnotationTest;

import java.time.LocalDate;
import java.time.Month;

import static pe.com.alura.AnnotationTest.EdadMinimaUtil.validador;
import static pe.com.alura.AnnotationTest.StringMinLengthUtil.validateStringLength;

public class testAnnotation {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Diego", "contraseña123", LocalDate.of(2002, Month.MARCH, 14));

        System.out.println(validador(usuario));
        System.out.println(validateStringLength(usuario));
    }
}
