package edu.patterns.creational.abstractfactory;

public class MercedesGuaranteeService implements GuaranteeService {
    @Override
    public void provideGuaranteeService() {
        System.out.println("Mercedes guarantee service provided");
    }
}
