import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Mediaaritmetica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa tres numeros, separados por espacio: ");
        double x1 = s.nextDouble();
        double x2 = s.nextDouble();
        double x3 = s.nextDouble();

        double media = (x1+x2+x3)/3;
        System.out.println("la media es: "+media);
    }
}
