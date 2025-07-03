public class SueldoNetoEmpleado {
    public static void main(String[] args) {
        char categoria = 'B';   // Puede ser 'A', 'B' o 'C'
        int antiguedad = 7;     // Años de antigüedad
        double sueldoBruto = 50000;  // Sueldo bruto

        double aumento = 0;

        // Calculamos el aumento según la antigüedad
        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = sueldoBruto * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = sueldoBruto * 0.10;
        } else if (antiguedad > 10) {
            aumento = sueldoBruto * 0.30;
        }

        // Calculamos el plus según la categoría
        double plus;
        switch (Character.toUpperCase(categoria)) {
            case 'A':
                plus = 1000;
                break;
            case 'B':
                plus = 2000;
                break;
            case 'C':
                plus = 3000;
                break;
            default:
                plus = 0;
                System.out.println("Categoría inválida.");
        }

        // Calculamos el sueldo neto
        double sueldoNeto = sueldoBruto + aumento + plus;

        System.out.println("Sueldo bruto: $" + sueldoBruto);
        System.out.println("Aumento por antigüedad: $" + aumento);
        System.out.println("Plus por categoría: $" + plus);
        System.out.println("Sueldo neto: $" + sueldoNeto);
    }
}
