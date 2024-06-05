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
            System.out.println("Escolha o cálculo que vocÊ deseja: " + "\n" + 
            "[1] Perímetro" + "\n"+
            "[2] Área");
            int escolha2 = sc.nextInt();
            switch (escolha2) {
                case 1:
                System.out.println("DIGITE A OPÇÃO DE CÁLCULO"+"\n" +
                "[1] Retângulo" + "\n" + 
                "[2] Quadrado" + "\n" +
                "[3] Triangulo" + "\n" +
                "[4] Triangulo equilátero" + "\n" +
                "[5] Trapézio" + "\n"+
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
                }
                default:
                    break;
            }
        case 2://espacial
            System.out.println("Escolha o cálculo de geometria espacial que você2 deseja: " + "\n" + 
            "[1] Volume" + "\n"+
            "[2] Área");
            int escolha3 = sc.nextInt();
            switch (escolha3) {
                case 1:
                System.out.println("DIGITE A OPÇÃO DE CÁLCULO"+"\n" +
                "[1] Cone" + "\n" + 
                "[2] Cilindro" + "\n" +
                "[3] Prisma" + "\n" +
                "[4] Pirâmide" + "\n" +
                "[5] ESfera" + "\n"+
                "[6] Tronco do cone" + "\n" +
                "[7] Tronco da pirâmide");

                int escolhaForma = sc.nextInt();
                switch  (escolhaForma){
                    case 1: // volume
                    System.out.println("Informe a medida da altura: ");
                    double altura = sc.nextDouble();
                    System.out.println("Informe a medida da área da base: ");
                    double raio = sc.nextDouble();
                    System.out.println("Informe o raio do cone: "+ ce.ConeV(raio, altura));
                    break;
                    case 2: 
                    System.out.println("Informe a medida do raio: ");
                    double raioC = sc.nextDouble();
                    System.out.println("Informe a altura: ");
                    double alturaC = sc.nextDouble();
                    System.out.println("O volume : " + ce.CilindroV(raioC, alturaC));
                    break;
                    case 3: 
                    System.out.println("Informe o altura:");
                    double alturaP = sc.nextDouble();
                    System.out.println("Informe a área da base: ");
                    double AreaBasePrisma = sc.nextDouble();
                    System.out.println("O volume é: " + ce.PrismaV(alturaP, AreaBasePrisma));
                    break;
                    case 4: 
                    System.out.println("Informe a altura: ");
                    double alturaPIT = sc.nextDouble();
                    System.out.println("Informe a área da base: ");
                    double AreaBasePiramide = sc.nextDouble();
                    System.out.println("O volume é: " + ce.PiramideV(alturaPIT, AreaBasePiramide));
                    break;
                    case 5: 
                    System.out.println("Informe o raio: ");
                    double raioE = sc.nextDouble();
                    System.out.println("O volume é: " + ce.EsferaV(raioE)); 
                    break;
                    case 6:
                    System.out.println("Informe o raio maior");
                    double raioTC = sc.nextDouble();
                    System.out.println("Informe o raio menor: ");
                    double raio2TC = sc.nextDouble();
                    System.out.println("Informe a altura: ");
                    double alturaTC = sc.nextDouble();
                    System.out.println("O volume é: " + ce.TroncoConeV(raioTC, alturaTC, raio2TC));
                    break;
                    case 7:
                    System.out.println("Informe a base maior: ");
                    double SuperficieBaseMaior = sc.nextDouble();
                    System.out.println("Informe a base menor: ");
                    double SuperficieBaseMenor = sc.nextDouble();
                    System.out.println("Informe a altura: ");
                    double alturaTPI = sc.nextDouble();
                    System.out.println("O volume é: " + ce.TroncoPiramideV(SuperficieBaseMaior,SuperficieBaseMenor,alturaTPI));
                    break;
                }

                default:
                    System.out.println("Opção inválida" + "\n" + "Por favor, escolha novamente.");
            }
    }
}}

