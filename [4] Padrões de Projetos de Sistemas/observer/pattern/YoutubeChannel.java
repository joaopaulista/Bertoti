package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<Observer> observers = new ArrayList<>();

    private String channelName;
    private String latestVideoTitle;

    public YoutubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestVideoTitle);
        }
    }

    public void uploadVideo(String title) {
        this.latestVideoTitle = title;
        System.out.println("\n[Canal " + channelName + "] enviou um novo vídeo: '" + title + "'");
        notifyObservers();
    }
}