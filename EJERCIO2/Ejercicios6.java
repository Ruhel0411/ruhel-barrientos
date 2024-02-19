package EJERCIO2;

public class Ejercicios6 {
/**
 * Ejercicio 6 | Tema 2
 * Calcula el total de una factura a partit de la base imponible.
 */

 public class Ejercicio6_2 { // Clase principal
    public static void main(String[] args) {
      int IVA = 21;
      int baseImp = 100;
      int totalFac = ((baseImp*IVA/100)+baseImp);
  
      System.out.printf("El total sin IVA es: "+baseImp+".\n");
      System.out.printf("El total con IVA es: "+totalFac+".\n");
  
    }
  }
}