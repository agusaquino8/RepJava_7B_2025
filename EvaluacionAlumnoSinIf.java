public class EvaluacionAlumnoSinIf {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 6.5;
        double nota3 = 7.0;

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7)
            System.out.println("Aprobado con promedio: " + promedio);
        else
            System.out.println("Reprobado con promedio: " + promedio);

        // Suma de valores pares (sin if)
        int n1 = (int)nota1;
        int n2 = (int)nota2;
        int n3 = (int)nota3;

        int sumaPares = n1 * (1 - n1 % 2) + n2 * (1 - n2 % 2) + n3 * (1 - n3 % 2);

        System.out.println("Suma de valores pares (sin if): " + sumaPares);
    }
}
