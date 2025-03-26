package StrategyPattern;

public class Main {

    public static void main(String[] args)
    {
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.performFly();

        //setting new behaviours for model duck

        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.setQuackBehaviour(new MuteQuack());
        modelDuck.performQuack();
        modelDuck.performFly();
    }
}
