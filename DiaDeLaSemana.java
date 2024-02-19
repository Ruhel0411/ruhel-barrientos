public class DiaDeLaSemana {
    public static void main(String[] args) {
        String diaSem;
      
        System.out.print("Por favor, introduce un dia de la semana: ");
        diaSem = System.console().readLine().toLowerCase();

        switch (diaSem){
            case "lunes":
            System.out.println("Programacion");
            break;
            case "martes":
              System.out.print("ingenieria.S, Programacion");
              break;
            case "miercoles":
            System.out.println(" ingenieria de sistemas, estadistica, algebra");
            break;
            case "jueves":
            System.out.println("ingenieria.S, Informaciones de operacione,algebra");
            case "viernes":
              System.out.print("Hay estadistica");
              break;
            case "sábado":
            case "domingo":
              System.out.print("No hay clase es descanso");
            
    }
}
}