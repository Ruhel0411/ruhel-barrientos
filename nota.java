import java.util.Scanner;

public class nota {
         public static void main(String[] args) {
        System.out.println("ingrese una nota");
        Scanner s = new  Scanner(System.in);
        int numero = s.nextInt();

        if (numero > 10.5) {
            System.out.println("el numero " +numero+ " aprobo el curso");
        }else{
            System.out.println("el numero " +numero+" desaprobado el curso");

        }

    }
}



