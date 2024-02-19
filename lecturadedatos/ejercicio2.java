package lecturadedatos;

public class ejercicio2 {
   
        public static void main(String[] args) {
          String linea;
          System.out.print("Por favor, introduce una cantidad de euros: ");
          linea = System.console().readLine();
          int euros = Integer.parseInt(linea);
          double soles = (double)(euros)*4.10;
          System.out.printf("%d euros. son %.2f soles. \n", euros,soles);
        }
      }