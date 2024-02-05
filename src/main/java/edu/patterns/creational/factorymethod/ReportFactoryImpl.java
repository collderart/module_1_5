package edu.patterns.creational.factorymethod;

public class ReportFactoryImpl implements ReportFactory {

    @Override
    public Report generateReport(ReportType reportType) {
        switch (reportType) {

            case UNDEFINED -> {
                throw new RuntimeException("Report type is unknown");
            }
            case ORDERS -> {
                return new OrdersReport();
            }
            case USER -> {
                return new UsersReport();
            }
            case SALARY -> {
            }
            case CLIENT -> {
            }
        }
        return null;
    }
}
