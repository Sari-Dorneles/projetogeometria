public class CalculoPlano extends CalculosBase {
    //atributos

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
    public double losangoP(){
        return 4 * lado;
    }
    public double losangoA(){
        return (diagonalmaior*diagonalmenor)/2;
    }
    public double paralelogramoP(){
        return (2 * base) + (2 * lado); 
    }
    public double paralelogramoA(){
        return base * altura;
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
        double losangoP = calculo.losangoP();
        double losangoA = calculo.losangoA();
        double paralelogramoP = calculo.paralelogramoP();
        double paralelogramoA = calculo.paralelogramoA();

        System.out.println(paralelogramoA);
    }
} 