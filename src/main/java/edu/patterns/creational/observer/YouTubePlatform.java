package edu.patterns.creational.observer;

import java.util.*;

public class YouTubePlatform implements Subject {
    private final List<Observer> subscribers = new ArrayList<>();
    Map<String, Set<String>> videos = new HashMap<>();
    private String channelName;
    private String videoTitle;

    public YouTubePlatform() {
        videos.put("Youtube", new HashSet<>(Set.of("First video")));
    }

    public void uploadVideo(String channelName, String videoTitle) {
        this.channelName = channelName;
        this.videoTitle = videoTitle;
        System.out.println("New video is uploaded: " + videoTitle + " on channel: " + channelName);
        videos.computeIfAbsent(channelName, s -> new HashSet<>()).add(videoTitle);
        videos.computeIfPresent(channelName, (channel, videos) -> {
            videos.add(videoTitle);
            return videos;
        });
        System.out.println("on channel: " + channelName + " Added video: " + videoTitle);
        stateChanged();
    }

    public void stateChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        subscribers.add(observer);
        System.out.println("New subscriber: " + observer.getObserverName());
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
        System.out.println("Removed subscriber: " + observer.getObserverName());
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update(channelName, videoTitle);
        }
    }
}
