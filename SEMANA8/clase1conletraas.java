package SEMANA8;

public class clase1conletraas {
    public static void main(String[] args) {
        System.out.println("genera al azar piedra, papel o tijera");
        int mano = (int) (Math.random()*3); // de 1 o y 2
        switch (mano) {
            case 0:
               System.out.println("PIEDRA"); 
                break;
        case 1:
        System.out.println("papel");
            
            break;
       
        case 2:
        System.out.println("tijera");
        break;
       } 
           
    
    }
}

