public class SueldoNetoValientes {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            // Generar categoría al azar (A, B o C)
            char categoria;
            double random = Math.random();  // [0.0, 1.0)
            if (random < 0.33) {
                categoria = 'A';
            } else if (random < 0.66) {
                categoria = 'B';
            } else {
                categoria = 'C';
            }

            // Generar sueldo bruto entre 30000 y 100000
            double sueldoBruto = 30000 + (Math.random() * (100000 - 30000));

            // Generar antigüedad entre 1 y 30 años
            int antiguedad = 1 + (int)(Math.random() * 30); // 1 a 30 inclusive

            // Calcular aumento por antigüedad
            double aumento = 0;
            if (antiguedad >= 1 && antiguedad <= 5) {
                aumento = sueldoBruto * 0.05;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                aumento = sueldoBruto * 0.10;
            } else if (antiguedad > 10) {
                aumento = sueldoBruto * 0.30;
            }

            // Calcular plus por categoría
            double plus = 0;
            switch (categoria) {
                case 'A':
                    plus = 1000;
                    break;
                case 'B':
                    plus = 2000;
                    break;
                case 'C':
                    plus = 3000;
                    break;
            }

            // Calcular sueldo neto
            double sueldoNeto = sueldoBruto + aumento + plus;

            // Mostrar resultados
            System.out.println("Empleado #" + (contador + 1));
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.printf("Sueldo bruto: $%.2f\n", sueldoBruto);
            System.out.printf("Aumento: $%.2f\n", aumento);
            System.out.printf("Plus categoría: $%.2f\n", plus);
            System.out.printf("Sueldo neto: $%.2f\n", sueldoNeto);
            System.out.println("-----------------------------");

            contador++;
        }
    }
}
