package edu.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello adapter!");
        var diesel = new DieselFuel() {
            @Override
            public void print() {
                System.out.println("Diesel fuel");
            }

            @Override
            public int capacity() {
                return 100;
            }
        };

        var toGasoline = FuelTypeAdapter.dieselToGasoline(diesel);
        toGasoline.print();
        diesel.print();
    }
}
