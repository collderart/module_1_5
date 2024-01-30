package edu.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder Pattern Example!");
        ExampleEntity.Builder builder = new ExampleEntity.Builder();
        ExampleEntity entity = builder
                .withId(9)
                .withWebsite("new website")
                .withName("new name")
                .build();
        System.out.println(entity);
    }
}
