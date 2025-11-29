package observer.antipattern;

public class YoutubeChannelCoupled {
    private SubscriberCoupled subscriber1;
    private SubscriberCoupled subscriber2;
    private SubscriberCoupled subscriber3;

    public void setSubscribers(SubscriberCoupled s1, SubscriberCoupled s2, SubscriberCoupled s3) {
        this.subscriber1 = s1;
        this.subscriber2 = s2;
        this.subscriber3 = s3;
    }

    public void uploadVideo(String title) {
        System.out.println("\n--- Upload Iniciado: " + title + " ---");

        if (subscriber1 != null) {
            subscriber1.notifyNewVideo(title);
        }

        if (subscriber2 != null) {
            subscriber2.notifyNewVideo(title);
        }

        if (subscriber3 != null) {
            subscriber3.notifyNewVideo(title);
        }
    }

    public void removeSubscriber(String name) {
        if (subscriber1 != null && subscriber1.getUserName().equals(name)) {
            subscriber1 = null;
            System.out.println("Removendo: " + name);
        } else if (subscriber2 != null && subscriber2.getUserName().equals(name)) {
            subscriber2 = null;
            System.out.println("Removendo: " + name);
        } else if (subscriber3 != null && subscriber3.getUserName().equals(name)) {
            subscriber3 = null;
            System.out.println("Removendo: " + name);
        }
    }
}