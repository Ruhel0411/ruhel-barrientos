package lecturadedatos;

public class Ejercicio3 {
        public static void main(String[] args) {
          String linea;
          /* Recibe el número de pesetas */
          System.out.print("Por favor, introduce una cantidad de euros: ");
          linea = System.console().readLine();
          double pesetas = Double.parseDouble(linea);
          /* Convierte los euros en ptas. y las muestra */
          int euros = (int)(pesetas*4.1);
          System.out.printf("%.2f pecetas son %d ptas. \n", euros, pesetas);
        }
      }