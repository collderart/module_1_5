package edu.patterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        new Main.App(new MaseratiServiceNetwork()).run();
        new Main.App(new MercedesServiceNetwork()).run();
        System.out.println("Hello abstract factory!");
    }

    static class App {
        private final AutoServiceNetworkFactory factory;
        private final ServiceTeam serviceTeam;
        private final ServiceBox serviceBox;
        private final ServiceTools serviceTools;
        private final GuaranteeService guaranteeService;

        public App(AutoServiceNetworkFactory factory) {
            this.factory = factory;
            serviceTeam = factory.createServiceTeam();
            serviceBox = factory.createServiceBox();
            serviceTools = factory.createServiceTools();
            guaranteeService = factory.createGuaranteeService();
        }

        public void run() {
            serviceTeam.provideService();
            serviceBox.deployServiceBox();
            serviceTools.useServiceTools();
            guaranteeService.provideGuaranteeService();
        }
    }
}
