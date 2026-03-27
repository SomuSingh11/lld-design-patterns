package behavioral.observer.news.subscriber;

public class MobileAppSubscriber implements Subscriber{
    private final String name;

    public MobileAppSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String message){
        System.out.println(name + " (Mobile) received: " + message);
    }
}
