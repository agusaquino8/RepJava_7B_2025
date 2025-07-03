import java.util.Random;

public class MaxMinDoWhile {
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        System.out.println("Números al azar:");

        do {
            int numero = rand.nextInt(100); // Número entre 0 y 99
            System.out.println(numero);

            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }

            contador++;
        } while (contador < 10);

        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
