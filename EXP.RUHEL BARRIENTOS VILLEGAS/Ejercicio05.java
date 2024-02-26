package EXP.RUHEL BARRIENTOS VILLEGAS;

public class Ejercicio05 {
    System.out.println(" introduzca 10 números enteros: ");

    int negativos = 0;
    int positivos = 0;
    
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
    
    System.out.println("Has introducido " + positivos + " positivos y " + negativos + " negativos.");
}

