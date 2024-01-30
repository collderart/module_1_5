package edu.patterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello report!");
        ReportFactory factory = new ReportFactoryImpl();
        Report usersReport = factory.generateReport(ReportType.USER);
        usersReport.getReportResult();
    }
}
