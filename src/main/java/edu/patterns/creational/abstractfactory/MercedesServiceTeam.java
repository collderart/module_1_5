package edu.patterns.creational.abstractfactory;

public class MercedesServiceTeam implements ServiceTeam {

    @Override
    public void provideService() {
        System.out.println("Mercedes service team is ready to help you!");
    }
}
