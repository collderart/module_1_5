package edu.patterns.creational.observer;

public interface Observer {
    void update(String channelName, String videoTitle);
    String getObserverName();
}
