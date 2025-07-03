import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de un mes: ");
        String mes = scanner.nextLine().toLowerCase(); // Convertimos a minúsculas para facilitar la comparación

        int dias;

        // Determinamos la cantidad de días
        if (mes.equals("abril") || mes.equals("junio") || mes.equals("septiembre") || mes.equals("noviembre")) {
            dias = 30;
        } else if (mes.equals("febrero")) {
            dias = 28; // No se considera año bisiesto en este caso
        } else if (mes.equals("enero") || mes.equals("marzo") || mes.equals("mayo") ||
                   mes.equals("julio") || mes.equals("agosto") || mes.equals("octubre") ||
                   mes.equals("diciembre")) {
            dias = 31;
        } else {
            System.out.println("Mes no válido.");
            scanner.close();
            return;
        }

        // Mostrar resultado
        System.out.println("El mes de " + capitalizar(mes) + " tiene " + dias + " días.");
        scanner.close();
    }

    // Método para capitalizar la primera letra del mes
    public static String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }
}
