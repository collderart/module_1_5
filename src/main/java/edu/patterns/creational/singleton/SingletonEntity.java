package edu.patterns.creational.singleton;

public class SingletonEntity {
    private static SingletonEntity entity;
    private SingletonEntity(){}

   synchronized public static SingletonEntity getInstance() {
        if (entity == null) {
            entity = new SingletonEntity();
        }
       return entity;
   }
}
