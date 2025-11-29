package observer.pattern;

public class Subscriber implements Observer {
    private String userName;

    public Subscriber(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("   🔔 Notificação para " + userName + ": Novo vídeo disponível -> " + videoTitle);
    }
}