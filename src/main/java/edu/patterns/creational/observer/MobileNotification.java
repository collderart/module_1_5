package edu.patterns.creational.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MobileNotification implements NotificationElement, Observer{
    Map<String, Set<String>> videos = new HashMap<>();
    public MobileNotification(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void pushNotification() {
        System.out.println("Notification sent to " + getObserverName());
    }

    @Override
    public void update(String channelName, String videoTitle) {
        videos.computeIfAbsent(channelName, s -> new HashSet<>()).add(videoTitle);
        videos.computeIfPresent(channelName, (channel, videos) -> {
            videos.add(videoTitle);
            return videos;
        });
        System.out.println("Updated videos in " + getObserverName() + " notification: \n" + videos);
        System.out.println();
        System.out.println();
        pushNotification();    }

    @Override
    public String getObserverName() {
        return "Mobile";
    }
}
