package edu.patterns.creational.abstractfactory;

public class MaseratiGuaranteeService implements GuaranteeService{
    @Override
    public void provideGuaranteeService() {
        System.out.println("Maserati guarantee service provided");
    }
}
