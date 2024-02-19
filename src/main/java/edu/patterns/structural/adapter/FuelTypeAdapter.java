package edu.patterns.structural.adapter;

public class FuelTypeAdapter {
    static GasolineFuel dieselToGasoline(DieselFuel diesel) {
        return new GasolineFuel() {
            @Override
            public void print() {
                System.out.println("Now it's gasoline!");
            }

            @Override
            public int capacity() {
                return diesel.capacity();
            }
        };
    }

    static DieselFuel gasolineToDiesel(GasolineFuel gasoline) {
        return new DieselFuel() {
            @Override
            public void print() {
                System.out.println("Now it's diesel!");
            }

            @Override
            public int capacity() {
                return gasoline.capacity();
            }
        };
    }

}
