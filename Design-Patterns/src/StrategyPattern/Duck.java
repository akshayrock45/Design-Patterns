package StrategyPattern;

public abstract class Duck {

    //Dependencies
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;


    //Constructor
    public Duck()
    {}

    public abstract void display();

    public void performFly()
    {
        flyBehaviour.fly();
    }

    public void performQuack()
    {
        quackBehaviour.quack();
    }

    public void swim()
    {
        System.out.println("all can Swim");
    }

    public void setFlyBehaviour(FlyBehaviour fb)
    {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb)
    {
        quackBehaviour = qb;
    }

}
