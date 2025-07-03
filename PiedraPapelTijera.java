import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de elecciones
        System.out.print("Jugador 1 (0: piedra, 1: papel, 2: tijera): ");
        int jugador1 = scanner.nextInt();

        System.out.print("Jugador 2 (0: piedra, 1: papel, 2: tijera): ");
        int jugador2 = scanner.nextInt();

        // Validación de entradas
        if (jugador1 < 0 || jugador1 > 2 || jugador2 < 0 || jugador2 > 2) {
            System.out.println("Entrada inválida. Debe ser 0, 1 o 2.");
        } else if (jugador1 == jugador2) {
            System.out.println("Empate.");
        } else if ((jugador1 == 0 && jugador2 == 2) || 
                   (jugador1 == 1 && jugador2 == 0) || 
                   (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("Jugador 1 gana.");
        } else {
            System.out.println("Jugador 2 gana.");
        }

        scanner.close();
    }
}
