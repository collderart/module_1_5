package edu.patterns.creational.factorymethod;

public class UsersReport implements Report {
    @Override
    public void getReportResult() {
        System.out.println("This is users report result");
    }
}
