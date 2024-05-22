import java.util.Scanner;

public class CalculosBase {
    public double lado = 2;
    public double base = 4;
    public double altura = 4;
    public double ladoT1 = 3;
    public double ladoT2 = 6;
    public double ladoT3 = 7;
    public double baseMaior =4;
    public double baseMenor =2;
    public double raio = 2;
    public double raio2 = 4;
    public double diagonalmaior = 5;
    public double diagonalmenor = 3;
    public double Nlados;
    public double geratiz;
    public double SuperficieBaseMaior = 10;
    public double SuperficieBaseMenor = 5;

    public static void main(String[] args) {
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
        case 1:
            System.out.println("plana");
            break;
        case 2:
            System.out.println("epacial");
            break;
        default:
            System.out.println("Opção inválida" + "\n" + "Por favor, escolha novamente.");
        }
    }
}

