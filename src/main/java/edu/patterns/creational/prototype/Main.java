package edu.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("prototype example");

        var ent1 = new ExampleEntityPrototype(1, "name", "address", 12345, "website");
        var ent2 = ent1.copy();

        System.out.println("entities are the same refs: " + (ent1 == ent2));
        System.out.println("entities are the same : " + (ent1.equals(ent2)));
    }


}
