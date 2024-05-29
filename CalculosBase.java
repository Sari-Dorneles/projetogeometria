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

        int escolha = sc.nextInt();
        switch (escolha) {
        case 1: //plana
            System.out.println("DIGITE A OPÇÃO DE CALCULO"+"\n" +
            "[1] Retangulo" + "\n" + 
            "[2] Quadrado" + "\n" +
            "[3] Triangulo" + "\n" +
            "[4] Triangulo equilatero" + "\n" +
            "[5] Trapezio" + "\n"+
            "[6] Circulo" + "\n" +
            "[7] Losango" + "\n" +
            "[8] Paralelograma");
            int escolha2 = sc.nextInt();
            switch (escolha2){
                case 1: 
                System.out.println("Informe a altura: ");
                double altura = sc.nextDouble();
                System.out.println("Informe a largura: ");
                double largura = sc.nextDouble();

                case 2: 
                System.out.println("Informe o lado: ");
                double lado = sc.nextDouble();
                
                case 3: 
                System.out.println("Informe o lado 1: ");
                double ladoT1 = sc.nextDouble();
                System.out.println("Informe o lado 2: ");
                double ladoT2 = sc.nextDouble();
                System.out.println("Informe o lado 3: ");
                double ladoT3 = sc.nextDouble();
                System.out.println("O perímetro do triânculo é "+ cp.trianguloP(ladoT1,ladoT2,ladoT3));
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

