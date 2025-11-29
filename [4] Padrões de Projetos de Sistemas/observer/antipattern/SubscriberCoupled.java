package observer.antipattern;

public class SubscriberCoupled {
    private String userName;

    public SubscriberCoupled(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void notifyNewVideo(String videoTitle) {
        System.out.println(userName + " (via acoplamento) viu novo vídeo: " + videoTitle);
    }
}