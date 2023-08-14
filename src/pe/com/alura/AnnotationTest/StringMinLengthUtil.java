package pe.com.alura.AnnotationTest;

import java.lang.reflect.Field;

public class StringMinLengthUtil {
    public static <T> boolean validateStringLength(T objeto) {
        Class<?> clase = objeto.getClass();

        for (Field field : clase.getDeclaredFields()) {
            if (field.isAnnotationPresent(StringMinLength.class)) {
                StringMinLength annotationDeclared = field.getAnnotation(StringMinLength.class);

                try {
                    field.setAccessible(true);
                    return field.get(objeto).toString().length() >= annotationDeclared.lengthValue();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
