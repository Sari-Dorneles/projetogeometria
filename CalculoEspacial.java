public class CalculoEspacial extends CalculoPlano {
    //criar switch para selecionar qual é a base
    
    double AreaBaseTriangulo;
    double AreaBasePiramide;

    public double PrismaV(double alturaP, double AreaBasePrisma){
        return AreaBasePrisma * alturaP;
    }
    public double PrismaAL(double ladoP2, double alturaP2, double NladosP2){
        return ladoP2 * alturaP2 * NladosP2;
    }
    public double PrismaAT(double ArealateralP, double AreaBasePrisma){
        return AreaBasePrisma + ArealateralP;
    }
    public double ConeV(double raioC, double alturaC){
        return (Math.PI * (raioC *raioC) * alturaC)/3;
    }
    public double ConeAB(double raioCO){
        return Math.PI * (raioCO *raioCO);
    }
    public double ConeAL(double raioC2, double geratriz){
        return Math.PI*raioC2*geratriz;
    }
    public double CilindroV(double raioC, double alturaC){
        return Math.PI * (raioC * raioC) * alturaC;
    }
    public double CilindroAB(double raioC){
        return Math.PI* (raioC * raioC);
    }
    public double CilindroAL(double raioC, double alturaC){
        return (Math.PI*Math.PI)*raioC* alturaC;
    }
    public double PiramideAL(double NladosPI2, double AreaTriangulos){
        return AreaTriangulos * NladosPI2;
    }
    public double PiramideAT(double piramideAL, double AreaBasePiramide){
        return piramideAL + AreaBasePiramide;
    }
    public double PiramideV(double alturaPI, double AreaBasePiramide){
        return (AreaBasePiramide  * alturaPI)/3;
    }
    public double EsferaAS(double raioE2){
        return 4*Math.PI*(raioE2 * raioE2);
    }
    public double EsferaV(double raioE){
        return (4/3)*Math.PI*(raioE*raioE*raioE);
    }
    public double TroncoConeV(double raioTC, double alturaTC, double raio2TC){
        return (Math.PI*alturaTC*((raioTC*raioTC)+ raioTC + raio2TC+(raio2TC * raio2TC))/3);
    }
    public double TroncoPiramideV(double alturaTPI, double SuperficieBaseMaior, double SuperficieBaseMenor){
        return (alturaTPI/3)*(SuperficieBaseMaior +Math.sqrt(SuperficieBaseMaior*SuperficieBaseMenor)+SuperficieBaseMenor);
    }
}