package edu.patterns.behavioral.observer;

public interface Observer {
    void update(String channelName, String videoTitle);

    String getObserverName();
}
