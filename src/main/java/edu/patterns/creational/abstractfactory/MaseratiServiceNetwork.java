package edu.patterns.creational.abstractfactory;

public class MaseratiServiceNetwork implements AutoServiceNetworkFactory{
    @Override
    public ServiceBox createServiceBox() {
        return new MaseratiServiceBox();
    }

    @Override
    public ServiceTeam createServiceTeam() {
        return new MaseratiServiceTeam();
    }

    @Override
    public GuaranteeService createGuaranteeService() {
        return new MaseratiGuaranteeService();
    }

    @Override
    public ServiceTools createServiceTools() {
        return new MaseratiServiceTools();
    }
}
