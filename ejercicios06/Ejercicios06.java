package ejercicios06;

public class Ejercicios06 {
public static void main(String[] args) {
   
    int linea = 0;
        
        System.out.print("\033[32m"); 
        
        for(int i = 0; i < 8000; i++) {
          System.out.println((char)(Math.random() * (126 - 32 + 1) + 32));
          
          if (linea++ == 60) {
            linea = 0;
            System.out.println(50);
            System.out.println();
}
}
}
}