package edu.patterns.behavioral.strategy;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...silence");
    }
}
