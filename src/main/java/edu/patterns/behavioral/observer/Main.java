package edu.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Observer!");
        YouTubePlatform youTubePlatform = new YouTubePlatform();
        WebNotification webNotification = new WebNotification(youTubePlatform);
        MobileNotification mobileNotification = new MobileNotification(youTubePlatform);
        MailNotification mailNotification = new MailNotification(youTubePlatform);

        System.out.println("Add new video");
        youTubePlatform.uploadVideo("Youtube", "Test video 1");
        youTubePlatform.uploadVideo("New Channel", "New test video");
        youTubePlatform.uploadVideo("Youtube", "Test video 2 to existing channel");

    }
}
