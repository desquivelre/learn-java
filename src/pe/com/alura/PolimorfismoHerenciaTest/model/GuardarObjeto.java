package pe.com.alura.PolimorfismoHerenciaTest.model;

public class GuardarObjeto {
    private Object[] objects = new Object[10];
    private int indice = 0;

    public void guardarObjeto(Object object) {
        objects[indice] = object;
        indice++;
    }

    public Object obtenerObjeto(int indice) {
        System.out.println("Se obtuvo el objeto: " + objects[indice]);
        return objects[indice];
    }

    public void obtenerObjetos() {
        System.out.println("Se obtuvieron los objetos: \n");

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                break;
            }

            if (i < objects.length - 1) {
                System.out.println(objects[i]);
            } else if (i == objects.length - 1) {
                System.out.println(objects[i]);
            }

        }
    }
}
