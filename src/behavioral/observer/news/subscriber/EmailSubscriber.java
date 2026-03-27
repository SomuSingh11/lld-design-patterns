package behavioral.observer.news.subscriber;

public class EmailSubscriber implements Subscriber{
    private final String email;

    public EmailSubscriber(String email){
        this.email = email;
    }

    @Override
    public void update(String message){
        System.out.println(email + " (Email) received: " + message);
    }
}
