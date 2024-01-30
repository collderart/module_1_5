package edu.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Ducks!");
// can create any type of duck because of super class
        // если это плавает как утка и крякаяет как утка, значит это - утка
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.display();
        //now rubber duck can fly
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.performFly();
    }
}
