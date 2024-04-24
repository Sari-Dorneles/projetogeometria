public class CalculoPlano {
    //atributos
    public double lado = 12;
    public double base = 4;
    public double altura = 4;
    public double ladoT1 = 3;
    public double ladoT2 = 6;
    public double ladoT3 = 7;
    public double baseMaior =4;
    public double baseMenor =2;
    public double raio = 4;

    public double quadradoA(){
        return lado*lado;
    }
    public double quadradoP(){
        return 4*lado;
    }
    public double retanguloA(){
        return base*altura;
    }
    public double retanguloP(){
        return (2*base)+(2*altura);
    }
    public double trianguloEquilateroA(){
        return ((lado*lado)*Math.sqrt(3))/4;
    }
    public double trianguloEquilateroP(){
        return 3*lado;
    }
    public double trapezioA(){
        return ((baseMaior+baseMenor)*altura)/2;
    }
    public double trapezioP(){
        return lado+lado+baseMaior+baseMenor; 
    }
    public double circuloP(){
        return 2 * Math.PI * raio;
    }
    public double circuloA(){
        return Math.PI * (raio * raio);
    }



    public static void main(String[] args) {
        CalculoPlano calculo = new CalculoPlano();

        double QuadradoA = calculo.quadradoA();
        double QuadradoP = calculo.quadradoP();
        double RetanguloA = calculo.retanguloA();
        double RetanguloP = calculo.retanguloP();
        double TrianguloEquilateroA = calculo.trianguloEquilateroA();
        double TrianguloEquilateroP = calculo.trianguloEquilateroP();
        double trapezioA = calculo.trapezioA();
        double trapezioP = calculo.trapezioP();
        double circuloP = calculo.circuloP();
        double circuloA = calculo.circuloA();

        System.out.println(circuloA);
    }
}