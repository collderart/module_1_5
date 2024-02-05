package edu.patterns.creational.prototype;

public record ExampleEntityPrototype(
        long id,
        String entityName,
        String entityAddress,
        long postalCode,
        String website
) {
    public ExampleEntityPrototype copy() {
        return new ExampleEntityPrototype(id, entityName, entityAddress, postalCode, website);
    }
}
