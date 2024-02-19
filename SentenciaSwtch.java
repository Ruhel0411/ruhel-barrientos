public class SentenciaSwtch {
public static void main(String[] args) {
System.out.println("ingresa un numero del dia: ");
Dia = Integer. parseInt(System.console().readLine());
switch (Dia) {
    case 1:
        nombreDia = "domingo";
        break;
case 2:
    nombreDia = "lunes";
        break;
case 3:
        nombreDia = "martes";
        break;
case 4:
    nombreDia = "miercoles";
         break;
case 5:
    nombreDia = "jueves";
        break;
 case 6:
    nombreDia = "viernes";  
    break;
case 7:  
nombreDia = "sabado";
    break;
    default:
    nombreDia = "no existe ese dia";
    break;
}
System.out.println("Dia" +nombreDia);
}
}