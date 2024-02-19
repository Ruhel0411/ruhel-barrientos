package lecturadedatos;

public class Ejercicio1 {
    public static void main(String[] args) {
        String linea;
        
        System.out.print("Por favor, introduce un número: ");
        linea = System.console().readLine();
        int primerNumero = Integer.parseInt(linea);
        
        System.out.print("Introduce otro, por favor: ");
        linea = System.console().readLine();
        int segundoNumero = Integer.parseInt(linea);
        int total = primerNumero*segundoNumero;
        System.out.println(primerNumero*segundoNumero);
      }
    } 

