public class TablaMultiplicar {
    public static void main(String[] args) {
        int numero = 7;  // Cambiá este valor por el que quieras mostrar la tabla

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
