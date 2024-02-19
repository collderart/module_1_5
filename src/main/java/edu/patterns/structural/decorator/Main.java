package edu.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello decorator!");

        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription()
                           + " " + coffee.cost());

        coffee = new Milk(coffee);
        coffee = new Sugar(coffee);
        coffee = new Sugar(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.cost());

        Beverage hotChocolate = new HotChocolate();
        System.out.println(hotChocolate.getDescription() + " " + hotChocolate.cost());
        hotChocolate = new Cream(hotChocolate);
        hotChocolate = new Sugar(hotChocolate);
        hotChocolate = new MarshMellow(hotChocolate);
        System.out.println(hotChocolate.getDescription() + " " + hotChocolate.cost());
    }
}
