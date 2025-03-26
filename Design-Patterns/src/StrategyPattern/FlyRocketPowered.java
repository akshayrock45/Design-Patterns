package StrategyPattern;

public class FlyRocketPowered implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying with Rocket Powered");
    }
}
