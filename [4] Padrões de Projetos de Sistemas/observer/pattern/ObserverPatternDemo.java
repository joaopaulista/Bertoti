package observer.pattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        YoutubeChannel techChannel = new YoutubeChannel("TechReviews BR");

        Subscriber user1 = new Subscriber("João");
        Subscriber user2 = new Subscriber("Maria");
        Subscriber user3 = new Subscriber("Carlos");

        techChannel.registerObserver(user1);
        techChannel.registerObserver(user2);
        techChannel.registerObserver(user3);

        techChannel.uploadVideo("Review do iPhone 15");

        System.out.println("\n... Carlos cancelou a inscrição ...");
        techChannel.removeObserver(user3);

        techChannel.uploadVideo("Aprenda Java em 10 minutos");
    }
}