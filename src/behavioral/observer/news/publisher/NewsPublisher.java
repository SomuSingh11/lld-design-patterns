package behavioral.observer.news.publisher;

import behavioral.observer.news.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher implements Publisher{
    private final List<Subscriber> subscribers = new ArrayList<>();
    private String mainState;

    @Override
    public void subscribe(Subscriber s){
        subscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s){
        subscribers.remove(s);
    }

    @Override
    public void notifySubscribers(){
        for(Subscriber s: subscribers){
            s.update(mainState);
        }
    }

    public void publishNews(String news){
        System.out.println("\nPublisher: New News -> " + news);

        this.mainState = news;   // update state
        notifySubscribers();    // notify all
    }
}
