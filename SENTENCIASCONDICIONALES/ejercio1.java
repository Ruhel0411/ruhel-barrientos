package SENTENCIASCONDICIONALES;
public class ejercio1 {
    public static void main(String[] args) {
    
        
        System.out.print(" introduce un número (del 1 al 7): ");
        int diaSem = Integer.parseInt(System.console().readLine());
        switch (diaSem){
            case 1:
              System.out.print("Lunes");
              break;
            case 2:
              System.out.print("Martes");
              break;
            case 3:
              System.out.print("Miércoles");
              break;
            case 4:
              System.out.print("Jueves");
              break;
            case 5:
              System.out.print("Viernes");
              break;
            case 6:
              System.out.print("Sábado");
              break;
            case 7:
              System.out.print("Domingo");
              break;
            default:
              System.out.print("el dia de la semana in existe");
        }
      }
    }
