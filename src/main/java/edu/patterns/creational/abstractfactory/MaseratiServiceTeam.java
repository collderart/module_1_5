package edu.patterns.creational.abstractfactory;

public class MaseratiServiceTeam implements ServiceTeam {

    @Override
    public void provideService() {
        System.out.println("Maserati service team is ready to help you!");
    }
}
