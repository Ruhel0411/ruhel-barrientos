public class MenuSwitch {
    public static void main(String[] args) {
        System.out.println("calculo de areas");
        System.out.println("................");
        System.out.println("1.- cuadrado");
        System.out.println("2.- rectangulo");
        System.out.println("3.- triangulo");
        System.out.println("/nElija una opcion (1-3):");

        int opcion = Integer. parseInt(System.console().readLine());

        int lado, base, altura;
        switch (opcion) {
            case 1:
                System.out.println( "/nIntroduzca el lado del cuadrado: ");
                lado = double.parseDouble(System.console().readLine());
                System.out.println("/nEL area del cuadradoes "+(lado*lado)+"u2");
                break;
        
            default:
            System.out.println("/nla opcion no es correctar");
                break;

                    case 2:
                    System.out.println("/nIntroduzca la base del rectangulo: ");
                    base = double.parseDouble(System.console().readLine());
                    System.out.println("/nIntroduzca la basae del rectangulo");
                    altura =double.parseDouble(System.console().readLine());
                    System.out.println("/nEL area del rectangulo es "+(base+altura)+"u2");
                        
                        break;
                
                    default:
                    System.out.println("/nla opcion no es correcta:");
                        break;

                        case 3;
                        System.out.println("/n introdusca la base del triangulo: ");
                        base = double.parseDouble(System.console().readLine());
                        System.out.println(" /nintridusca la base del triangulo");
                        altura = double.parseDouble(System.console().readLine());
                        System.out.println("/nel area totalo del triangulo es"+(base*altura)/2+"u2");
                    default:
                    System.out.println("/nla opcion no es corecta:");
                    break;
                }
        }






    }
}
