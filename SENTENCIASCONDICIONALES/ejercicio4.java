package SENTENCIASCONDICIONALES;

public class ejercicio4 {
    public static void main(String[] args) {
        
            String boletin = "a";
        
            System.out.print("Por favor, introduce la primera nota: ");
            double nota1 = Double.parseDouble(System.console().readLine());
            System.out.print("Por favor, introduce la segunda nota: ");
            double nota2 = Double.parseDouble(System.console().readLine());
            System.out.print("Por favor, introduce la tercera nota: ");
            double nota3 = Double.parseDouble(System.console().readLine());
            
            double media = (nota1+nota2+nota3)/3;
          
            if (media  <1){
              boletin = "insuficiente";
            } else if (media < 11){
              boletin = "bien";
            } else if (media < 13){
              boletin = "notable";
            } else if (media <= 16){
              boletin = "sobresaliente";
            
            }
            System.out.printf("Su nota en el boletín es: %s.", boletin);
          }
        }
    