package edu.patterns.creational.factorymethod;

public class OrdersReport implements Report {
    @Override
    public void getReportResult() {
        System.out.println("This is orders report result");
    }
}
