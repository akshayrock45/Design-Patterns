package StrategyPattern;

public class MallardDuck extends Duck{

    //Constructor
    public MallardDuck()
    {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }
}
