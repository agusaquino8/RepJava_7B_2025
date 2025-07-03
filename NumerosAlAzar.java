import java.util.Random;

public class NumerosAlAzar {
    public static void main(String[] args) {
        Random rand = new Random();
        int contador = 0;
        int suma = 0;

        System.out.println("Números al azar:");

        while (contador < 10) {
            int numero = rand.nextInt(100); // Número entre 0 y 99
            System.out.println(numero);
            suma += numero;
            contador++;
        }

        double promedio = suma / 10.0;
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
