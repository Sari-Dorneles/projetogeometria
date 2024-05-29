public class CalculoEspacial extends CalculoPlano {
    //criar switch para selecionar qual é a base
    double AreaBasePrisma;
    double AreaBaseTriangulo;

    public double PrismaV(double altura){
        return AreaBasePrisma * altura;
    }
    public double PrismaAL(double lado, double altura, double Nlados){
        return lado * altura * Nlados;
    }
    public double PrismaAT(double Arealateral){
        return AreaBasePrisma + Arealateral;
    }
    public double ConeV(double raio, double altura){
        return (Math.PI * (raio *raio) * altura)/3;
    }
    public double ConeAB(double raio){
        return Math.PI * (raio*raio);
    }
    public double ConeAL(double raio, double geratriz){
        return Math.PI*raio*geratriz;
    }
    public double CilindroV(double raio, double altura){
        return Math.PI * (raio * raio) * altura;
    }
    public double CilindroAB(double raio){
        return Math.PI* (raio * raio);
    }
    public double CilindroAL(double raio, double altura){
        return (Math.PI*Math.PI)*raio*altura;
    }
    public double PiramideAL(double Nlados, double AreaBasePrisma){
        return AreaBaseTriangulo * Nlados;
    }
    public double PiramideAT(double piramideAL){
        return piramideAL + AreaBaseTriangulo;
    }
    public double PirimideV(double altura){
        return (AreaBaseTriangulo  * altura)/3;
    }
    public double EsferaAS(double raio){
        return 4*Math.PI*(raio * raio);
    }
    public double EsferaV(double raio){
        return (4/3)*Math.PI*(raio*raio*raio);
    }
    public double TroncoConeV(double raio, double altura, double raio2){
        return (Math.PI*altura*((raio*raio)+ raio + raio2+(raio2 * raio2))/3);
    }
    public double TroncoPiramideV(double altura, double SuperficieBaseMaior, double SuperficieBaseMenor){
        return (altura/3)*(SuperficieBaseMaior +Math.sqrt(SuperficieBaseMaior*SuperficieBaseMenor)+SuperficieBaseMenor);
    }
}