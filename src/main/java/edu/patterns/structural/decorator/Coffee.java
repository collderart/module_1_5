package edu.patterns.structural.decorator;

public class Coffee extends Beverage {

    public Coffee() {
        description = "Coffee";
    }

    @Override
    public double cost() {
        return 60;
    }
}
