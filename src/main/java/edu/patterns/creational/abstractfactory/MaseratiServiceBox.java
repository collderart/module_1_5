package edu.patterns.creational.abstractfactory;

public class MaseratiServiceBox implements ServiceBox{
    @Override
    public void deployServiceBox() {
        System.out.println("Deploying Maserati service box");
    }
}
