public class DocenaConAnd {
    public static void main(String[] args) {
        int numero = 15;  // Asignar el número a evaluar

        if (numero >= 1 && numero <= 12) {
            System.out.println("El número " + numero + " pertenece a la primera docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número " + numero + " pertenece a la segunda docena.");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número " + numero + " pertenece a la tercer docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}
