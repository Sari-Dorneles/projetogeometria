public class CalculoPlano extends CalculosBase {
    //atributos

    public double quadradoA(double lado){
        return lado*lado;
    }
    public double quadradoP(double lado){
        return 4*lado;
    }
    public double retanguloA(double base, double altura){
        return base*altura;
    }
    public double retanguloP(double base, double altura){
        return (2*base)+(2*altura);
    }
    public double trianguloEquilateroA(double lado){
        return ((lado*lado)*Math.sqrt(3))/4;
    }
    public double trianguloEquilateroP(double lado){
        return 3*lado;
    }
    public double trianguloP(double ladoT1, double ladoT2,double ladoT3){
        return ladoT1 + ladoT2 + ladoT3;
    }
    public double trianguloA(double lado, double altura){
        return (lado*altura)/2;
    }
    public double trapezioA(double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }
    public double trapezioP(double ladoTP, double baseMaior, double baseMenor){
        return (ladoTP*2)+baseMaior+baseMenor; 
    }
    public double circuloP(double raio){
        return 2 * Math.PI * raio;
    }
    public double circuloA(double raio){
        return Math.PI * (raio * raio);
    }
    public double losangoP(double lado){
        return 4 * lado;
    }
    public double losangoA(double diagonalmenor, double diagonalmaior){
        return (diagonalmaior*diagonalmenor)/2;
    }
    public double paralelogramoP(double base, double lado){
        return (2 * base) + (2 * lado); 
    }
    public double paralelogramoA(double base, double altura){
        return base * altura;
    }
} 