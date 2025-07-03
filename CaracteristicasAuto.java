public class CaracteristicasAuto {
    public static void main(String[] args) {
        char clase = 'b';  // Cambiá este valor a 'a', 'b' o 'c'

        switch (clase) {
            case 'a':
            case 'A':
                System.out.println("Clase A: 4 ruedas y un motor.");
                break;
            case 'b':
            case 'B':
                System.out.println("Clase B: 4 ruedas, un motor, cierre centralizado y aire.");
                break;
            case 'c':
            case 'C':
                System.out.println("Clase C: 4 ruedas, un motor, cierre centralizado, aire y airbag.");
                break;
            default:
                System.out.println("Clase inválida. Ingrese 'a', 'b' o 'c'.");
                break;
        }
    }
}
