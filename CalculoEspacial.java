public class CalculoEspacial extends CalculoPlano {
    //criar switch para selecionar qual é a base
    double AreaBasePrisma;

    public double PrismaV(){
        return AreaBasePrisma * altura;
    }
    public double PrismaAL(){
        return lado * altura * Nlados;
    }
    public double PrismaAT(){
        return AreaBasePrisma + PrismaAL();
    }
    public static void main(String[] args) {
        CalculoEspacial calculo2 = new CalculoEspacial();
        double Prismav = calculo2.PrismaV();
        double PrismaAL = calculo2.PrismaAL();
        System.out.println(PrismaAL);
    }
}
