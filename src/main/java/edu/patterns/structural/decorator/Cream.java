package edu.patterns.structural.decorator;

public class Cream extends CondimentDecorator {
    Beverage beverage;

    public Cream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return 10 + beverage.cost();
    }
}
