package edu.patterns.structural.decorator;

public class MarshMellow extends CondimentDecorator {
    Beverage beverage;

    public MarshMellow(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", MarshMellow";
    }

    @Override
    public double cost() {
        return 25 + beverage.cost();
    }
}
