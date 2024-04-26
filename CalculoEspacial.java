public class CalculoEspacial extends CalculoPlano {
    
    public double PrismaQuadradoV(){
        return quadradoA() * altura;
    }
    public static void main(String[] args) {
        CalculoEspacial calculo2 = new CalculoEspacial();
        double PrismaQuadradoV = calculo2.PrismaQuadradoV();

        System.out.println(PrismaQuadradoV);
    }
}
