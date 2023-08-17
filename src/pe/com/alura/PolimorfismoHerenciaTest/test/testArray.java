package pe.com.alura.PolimorfismoHerenciaTest.test;

public class testArray {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[2] = 6;

        int lenghtNumeros = numeros.length;

        for (int i = 0; i < lenghtNumeros; i++) {
            System.out.println(numeros[i]);
        }
    }
}
