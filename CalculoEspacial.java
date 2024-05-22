public class CalculoEspacial extends CalculoPlano {
    //criar switch para selecionar qual é a base
    double AreaBasePrisma;
    double AreaBaseTriangulo;

    public double PrismaV(){
        return AreaBasePrisma * altura;
    }
    public double PrismaAL(){
        return lado * altura * Nlados;
    }
    public double PrismaAT(){
        return AreaBasePrisma + PrismaAL();
    }
    public double ConeV(){
        return (Math.PI * (raio *raio) * altura)/3;
    }
    public double ConeAB(){
        return Math.PI * (raio*raio);
    }
    public double ConeAL(){
        return Math.PI*raio*geratiz;
    }
    public double CilindroV(){
        return Math.PI * (raio * raio) * altura;
    }
    public double CilindroAB(){
        return Math.PI* (raio * raio);
    }
    public double CilindroAL(){
        return (Math.PI*Math.PI)*raio*altura;
    }
    public double PiramideAL(){
        return trianguloA() * Nlados;
    }
    public double PiramideAT(){
        return PiramideAL() + AreaBaseTriangulo;
    }
    public double PirimideV(){
        return (AreaBaseTriangulo  * altura)/3;
    }
    public double EsferaAS(){
        return 4*Math.PI*(raio * raio);
    }
    public double EsferaV(){
        return (4/3)*Math.PI*(raio*raio*raio);
    }
    public double TroncoConeV(){
        return (Math.PI*altura*((raio*raio)+ raio + raio2+(raio2 * raio2))/3);
    }
    public double TroncoPiramideV(){
        return (altura/3)*(SuperficieBaseMaior +Math.sqrt(SuperficieBaseMaior*SuperficieBaseMenor)+SuperficieBaseMenor);
    }

    public static void main(String[] args) {
        CalculoEspacial calculo2 = new CalculoEspacial();
        double Prismav = calculo2.PrismaV();
        double PrismaAL = calculo2.PrismaAL();
        double PrismaAT = calculo2.PrismaAT();
        double ConeV = calculo2.ConeV();
        double ConeAB = calculo2.ConeAB();
        double ConeAL = calculo2.ConeAL();
        double CilindroV = calculo2.CilindroV();
        double CilindroAB = calculo2.CilindroAB();
        double CilindroAL = calculo2.CilindroAL();
        double EsferaAS = calculo2.EsferaAS();
        double EsferaV = calculo2.EsferaV();
        System.out.println(PrismaAL);
    }
}
