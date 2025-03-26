package StrategyPattern;

public class FlyNoWay implements FlyBehaviour
{
    @Override
    public void fly() {
        System.out.println("Not Flying");
    }
}
