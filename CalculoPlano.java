public class CalculoPlano extends CalculosBase {
    //atributos

    public double quadradoA(double ladoQ){
        return ladoQ*ladoQ;
    }
    public double quadradoP(double lado){
        return 4*lado;
    }
    public double retanguloA(double baseR, double alturaR){
        return baseR*alturaR;
    }
    public double retanguloP(double base, double altura){
        return (2*base)+(2*altura);
    }
    public double trianguloEquilateroA(double ladoTE){
        return ((ladoTE*ladoTE)*Math.sqrt(3))/4;
    }
    public double trianguloEquilateroP(double lado){
        return 3*lado;
    }
    public double trianguloP(double ladoT1, double ladoT2,double ladoT3){
        return ladoT1 + ladoT2 + ladoT3;
    }
    public double trianguloA(double ladoT, double alturaT){
        return (ladoT*alturaT)/2;
    }
    public double trapezioA(double baseMaiorTR, double baseMenorTR, double alturaTR){
        return ((baseMaiorTR+baseMenorTR)*alturaTR)/2;
    }
    public double trapezioP(double ladoTP, double baseMaior, double baseMenor){
        return (ladoTP*2)+baseMaior+baseMenor; 
    }
    public double circuloP(double raio){
        return 2 * Math.PI * raio;
    }
    public double circuloA(double raioCO){
        return Math.PI * (raioCO * raioCO);
    }
    public double losangoP(double ladoL){
        return 4 * ladoL;
    }
    public double losangoA(double diagonalmenorL, double diagonalmaiorL){
        return (diagonalmaiorL*diagonalmenorL)/2;
    }
    public double paralelogramoP(double base, double ladoP){
        return (2 * base) + (2 * ladoP); 
    }
    public double paralelogramoA(double baseP, double alturaP){
        return baseP * alturaP;
    }
} 