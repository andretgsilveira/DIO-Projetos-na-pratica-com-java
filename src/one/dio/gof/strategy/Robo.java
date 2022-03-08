package one.dio.gof.strategy;

public class Robo {

    public Comportamento strategy;

    public void setStrategy(Comportamento strategy){
        this.strategy = strategy;
    }

    public void mover(){
        strategy.mover();
    }

}
