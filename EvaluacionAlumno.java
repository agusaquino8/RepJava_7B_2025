public class EvaluacionAlumno {
    public static void main(String[] args) {
        // Definimos las tres notas
        double nota1 = 8.0;
        double nota2 = 6.5;
        double nota3 = 7.5;

        // Calculamos el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Usamos un único if para determinar si está aprobado o reprobado
        if (promedio >= 7)
            System.out.println("Aprobado con promedio: " + promedio);
        else
            System.out.println("Reprobado con promedio: " + promedio);
    }
}
