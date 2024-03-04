package Array01;

public class Ejemplo02 {
    public static void main(String[] args) {
        int [] numeros = new int  [15];

        for(int i = 0; i < numeros.length ; i++){ 
            numeros [i]= (int)(Math.random()*10);
        
         for(int i = 0; i < numeros.length; i++){ 
          System.out.println(numeros [i]);
            }
        }
    }
}
