package exp. ruhel barrientos villegas;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el año de nacimiento: ");
        int año = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el día de nacimiento: ");
        int dia = scanner.nextInt();
        if (esFechaValida(año, mes, dia)) {
        
            int numeroMagico = calcularNumeroMagico(año, mes, dia);
            System.out.println("El número mágico de su fecha de nacimiento es: " + numeroMagico);
        } else {
            System.out.println("La fecha introducida no es válida.");
        }

        scanner.close();
    }
    private static boolean esFechaValida(int año, int mes, int dia) {
        if (año > 0 && mes >= 1 && mes <= 12) {
            int maxDias = obtenerDiasDelMes(mes);
            return dia >= 1 && dia <= maxDias;
        }
        return false;
    }
    private static int obtenerDiasDelMes(int mes) {
        switch (mes) {
            case 2:
                return 28; 
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    private static int calcularNumeroMagico(int año, int mes, int dia) {
        int suma = sumaDigitos(año) + sumaDigitos(mes) + sumaDigitos(dia);
        return sumaDigitos(suma);
    }
    private static int sumaDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}

