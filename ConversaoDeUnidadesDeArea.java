public class ConversaoDeUnidadesDeArea{
    static class MetroQuadrado{
        private final double conver = new PeQuadrado(10.76).valor;
        public double valor;
        public MetroQuadrado(double v){
            this.valor = conver * v;
        }
    }
    static class PeQuadrado{
        public PeQuadrado(double v){
            this.valor = v*conver;
        }
        private final double conver = 929;
        public double valor;
    }
    static class MilhaQuadrada{
        private final double conver = new Acre(640).valor;
        public double valor;
        public MilhaQuadrada(double v){
            this.valor = conver*v;
        }
    }
    static class Acre{
        private final double conver = new PeQuadrado(43.560).valor;
        public  final double valor;
        public Acre(double v){
            this.valor = conver*v;
        }
    }
    public static void main(String[] args){
        System.out.println(new MilhaQuadrada(1).valor);
    }
}

