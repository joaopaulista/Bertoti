package observer.antipattern;

public class ObserverAntiPatternDemo {
    public static void main(String[] args) {
        YoutubeChannelCoupled channel = new YoutubeChannelCoupled();

        SubscriberCoupled s1 = new SubscriberCoupled("João");
        SubscriberCoupled s2 = new SubscriberCoupled("Maria");
        SubscriberCoupled s3 = new SubscriberCoupled("Carlos");

        channel.setSubscribers(s1, s2, s3);

        channel.uploadVideo("Como não programar em Java");

        channel.removeSubscriber("Maria");

        channel.uploadVideo("Entendendo Acoplamento");
    }
}