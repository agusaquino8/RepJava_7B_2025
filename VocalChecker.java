public class VocalChecker {
    public static void main(String[] args) {
        char letra = 'e';  // Asignás la letra que querés probar

        // Convertimos a minúscula para manejar mayúsculas también
        char letraMinuscula = Character.toLowerCase(letra);

        if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' || letraMinuscula == 'o' || letraMinuscula == 'u') {
            System.out.println(letra + " es una vocal.");
        } else {
            System.out.println(letra + " no es una vocal.");
        }
    }
}
