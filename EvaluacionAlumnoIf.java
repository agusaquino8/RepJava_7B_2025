public class EvaluacionAlumnoIf {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 6.5;
        double nota3 = 7.0;

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7)
            System.out.println("Aprobado con promedio: " + promedio);
        else
            System.out.println("Reprobado con promedio: " + promedio);

        // Suma de valores pares (con if)
        int sumaPares = 0;

        if ((int)nota1 % 2 == 0) sumaPares += (int)nota1;
        if ((int)nota2 % 2 == 0) sumaPares += (int)nota2;
        if ((int)nota3 % 2 == 0) sumaPares += (int)nota3;

        System.out.println("Suma de valores pares (con if): " + sumaPares);
    }
}
