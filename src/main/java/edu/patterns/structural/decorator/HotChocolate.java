package edu.patterns.structural.decorator;

public class HotChocolate extends Beverage {

    public HotChocolate() {
        description = "Hot Chocolate";
    }

    @Override
    public double cost() {
        return 45;
    }
}
