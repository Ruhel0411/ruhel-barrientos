package SENTENCIASCONDICIONALES;

public class ejercicio2 {
    public static void main(String[] args) {
        final int solesHora = 12;
        final int solesExtra = 16;
        int totalSueldo;
        int horasExtra;
        
        System.out.print("Por favor, introduce las horas trabajadas: ");
        int horasTrabajadas = Integer.parseInt(System.console().readLine());
       
        if (horasTrabajadas <= 40){
          totalSueldo = horasTrabajadas*solesHora;
          System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d euros", horasTrabajadas, totalSueldo);
        } 
        else if (horasTrabajadas > 40){
          horasExtra = horasTrabajadas - 40;
          totalSueldo = 40*solesHora + horasExtra*solesExtra;
          System.out.printf("El sueldo correspondiente a %d horas de trabajo, son %d euros", horasTrabajadas, totalSueldo);
        }
      }
    }

