package Array01;

public class Ejemplo03 {
   public static void main(String[] args) {
    //ARREGLO DE NOTAS
    double [] notas = new double[5];
   double suma = 0;
    System.out.println("ingresa la nota del 1er parcial");

    for (int i = 0; i < notas.length; i++){
        System.out.print("Notas del estudiante n"+(i+1)+":");
        notas [i] = Double.parseDouble(System.console().readLine());
        suma = suma + notas[i];

        System.out.println("el promedio del aula es:"+ suma / notas.length);

   
    } 
}
}
