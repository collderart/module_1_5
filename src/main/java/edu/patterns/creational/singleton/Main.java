package edu.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton example");

        SingletonEntity ent1 = SingletonEntity.getInstance();
        SingletonEntity ent2 = SingletonEntity.getInstance();

        System.out.println("entities are the same: " + (ent1 == ent2));
    }


}
