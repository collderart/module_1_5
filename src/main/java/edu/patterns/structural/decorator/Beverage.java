package edu.patterns.structural.decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Beverage basicBeverage;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
