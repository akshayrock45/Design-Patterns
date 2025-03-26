package StrategyPattern;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a model Duck");
    }

    public ModelDuck()
    {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
}
