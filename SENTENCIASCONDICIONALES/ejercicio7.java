package SENTENCIASCONDICIONALES;

public class ejercicio7 {
    public static void main(String[] args) {
    
        System.out.print("Por favor, introduce un número: ");
        int num = Integer.parseInt(System.console().readLine());
        String divisible = "no";
        String par = "no";
        if ((num % 5 == 0) && (num % 5 == 0)){
          divisible = " es divisible entre 5 y, además, par.";
        } else if ((num % 5 != 0) && (num % 2 != 0)){
          divisible = " es indivisible entre 5 e impar.";
        }
       
        else if (num % 5 == 0){
          divisible = " es divisible entre 5.";
        } else if (num % 5 != 0){
          divisible = " no es divisible entre 5.";
        } 
       
        else if (num % 2 == 0){
          divisible = " es par.";
        } else if (num % 2 != 0){
          divisible = " es impar.";
        }
        System.out.print("El número " + num + divisible);
      }
    }