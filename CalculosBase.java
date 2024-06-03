import java.util.Scanner;

public class CalculosBase {

    public static void main(String[] args) {

        CalculoPlano cp = new CalculoPlano();
        CalculoEspacial ce = new CalculoEspacial();

        System.out.println("-----------------------------------------" + "\n" + 
        "BEM VINDO À CALCULADORA GEOMÉTRICA" + "\n" +
        "-----------------------------------------" + "\n" +
        "DIGITE A OPÇÃO DESEJADA: " + "\n" +
        "[1] Geometria Plana" + "\n" + 
        "[2] Geometria Espacial" + "\n" + 
        "-----------------------------------------");

        Scanner sc = new Scanner(System.in);

        int escolhaG = sc.nextInt();
        switch (escolhaG) {
        case 1: //Geometria plana
        System.out.println("Escolha o calculo que vocÊ deseja: " + "\n" + 
        "[1] Perímetro" + "\n"+
        "[2] Área");
        int escolha2 = sc.nextInt();
        switch (escolha2) {
            case 1:
            System.out.println("DIGITE A OPÇÃO DE CALCULO"+"\n" +
            "[1] Retangulo" + "\n" + 
            "[2] Quadrado" + "\n" +
            "[3] Triangulo" + "\n" +
            "[4] Triangulo equilatero" + "\n" +
            "[5] Trapezio" + "\n"+
            "[6] Circulo" + "\n" +
            "[7] Losango" + "\n" +
            "[8] Paralelograma");
            int escolhaForma = sc.nextInt();
            switch  (escolhaForma){
                case 1: // perímetro
                System.out.println("Informe a medida da altura: ");
                double altura = sc.nextDouble();
                System.out.println("Informe a medida da largura: ");
                double largura = sc.nextDouble();
                System.out.println("O perímetro do retângulo é "+ cp.retanguloP(largura, altura));
                break;
                case 2: 
                System.out.println("Informe a medida do lado: ");
                double lado = sc.nextDouble();
                System.out.println("O perímetro do quadrado é " + cp.quadradoP(lado));
                break;
                case 3: 
                System.out.println("Informe a medida do lado 1: ");
                double ladoT1 = sc.nextDouble();
                System.out.println("Informe a medida do lado 2: ");
                double ladoT2 = sc.nextDouble();
                System.out.println("Informe a medida do lado 3: ");
                double ladoT3 = sc.nextDouble();
                System.out.println("O perímetro do triângulo é "+ cp.trianguloP(ladoT1,ladoT2,ladoT3));
                break;
                case 4: 
                System.out.println("Informe a medida do lado");
                double ladoT = sc.nextDouble();
                System.out.println(cp.trianguloEquilateroP(ladoT));
                break;
                case 5: 
                System.out.println("Informe a medida da base maior: ");
                double baseMaior = sc.nextDouble();
                System.out.println("Informe a medida da área menor: ");
                double baseMenor = sc.nextDouble();
                System.out.println("Informe a medida do lado: ");
                double ladoTP = sc.nextDouble();
                System.out.println("O perímetro do trapézio é " + cp.trapezioP(ladoTP, baseMaior, baseMenor)); 
                break;
                case 6:
                System.out.println("Informe a medidad do raio: ");
                double raio = sc.nextDouble();
                System.out.println("O perímetro do círculo é " + cp.circuloP(raio));
                break;
                case 7:
                System.out.println("Informe a medida do lado: ");
                double ladoL = sc.nextDouble();
                System.out.println("O perímetro do losango é " + cp.losangoP(ladoL));
                break;
                case 8:
                System.out.println("Informe a medida da base: ");
                double base = sc.nextDouble();
                System.out.println("Informe a medida do lado: ");
                double ladoP = sc.nextDouble();
                System.out.println("O perímetro do Paralelograma é " + cp.paralelogramoP(base, ladoP));
                break;
        
            default:
                break;
        }
            break;
        case 2:
            System.out.println("epacial");
            break;
        default:
            System.out.println("Opção inválida" + "\n" + "Por favor, escolha novamente.");
        }
    }
}
}

