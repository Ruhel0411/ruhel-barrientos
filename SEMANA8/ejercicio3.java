package SEMANA8;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("genera al azar los dias de la semana");
        int dias = (int) (Math.random()*7); // de 1, 2, 3, 4, 5, 6 y 7
        switch (dias) {
            case 1:
               System.out.println("lunes"); 
                break;
        case 2:
        System.out.println("martes"); 
            break;
       
        case 3:
        System.out.println("miercoles");
        break;

        case 4:
        System.out.println("jueves");
        break;

        case 5:
        System.out.println("VIERNES");
        break;

        case 6:
        System.out.println("sabado");
        break;

        case 7:
        System.out.println("domingo");
        break;
        }
    }
}
