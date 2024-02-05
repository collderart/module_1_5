package edu.patterns.creational.abstractfactory;

public interface AutoServiceNetworkFactory {
    ServiceBox createServiceBox();

    ServiceTeam createServiceTeam();

    GuaranteeService createGuaranteeService();

    ServiceTools createServiceTools();
}
