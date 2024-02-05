package edu.patterns.creational.abstractfactory;

public class MercedesServiceNetwork implements AutoServiceNetworkFactory {
    @Override
    public ServiceBox createServiceBox() {
        return new MercedesServiceBox();
    }

    @Override
    public ServiceTeam createServiceTeam() {
        return new MercedesServiceTeam();
    }

    @Override
    public GuaranteeService createGuaranteeService() {
        return new MercedesGuaranteeService();
    }

    @Override
    public ServiceTools createServiceTools() {
        return new MercedesServiceTools();
    }
}
