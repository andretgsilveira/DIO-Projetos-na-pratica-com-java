package one.dio.gof.strategy;

public class TesteStrategy {

    public static void main(String[] args) {
        Robo robo = new Robo();

        Comportamento agressivo = new ComportamentoAgressivo();
        robo.setStrategy(agressivo);
        robo.strategy.mover();

        Comportamento normal = new ComportamentoNormal();
        robo.setStrategy(normal);
        robo.strategy.mover();

        Comportamento defensivo = new ComportamentoDefensivo();
        robo.setStrategy(defensivo);
        robo.strategy.mover();



    }

}
