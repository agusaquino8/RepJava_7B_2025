public class MayorDeTresConAnd {
    public static void main(String[] args) {
        // Definimos las tres variables (podés cambiar los valores)
        int num1 = 15;
        int num2 = 42;
        int num3 = 27;

        int mayor;

        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
