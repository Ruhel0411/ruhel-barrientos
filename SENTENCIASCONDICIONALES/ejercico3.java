package SENTENCIASCONDICIONALES;

public class ejercico3 {
    public static void main(String[] args) {
        int x = 0;
        System.out.print(" introduce una variable: ");
        int var1 = Integer.parseInt(System.console().readLine());
        System.out.print(" introduce otra variable: ");
        int var2 = Integer.parseInt(System.console().readLine());
        x = (-var2)/var1;
        System.out.printf("En %dx + %d = 0, x = %d", var1, var2, x);
      }
    }
