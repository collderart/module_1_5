package edu.patterns.creational.abstractfactory;

public class MercedesServiceBox implements ServiceBox{
    @Override
    public void deployServiceBox() {
        System.out.println("Deploying Mercedes service box");
    }
}
