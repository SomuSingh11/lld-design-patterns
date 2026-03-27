package behavioral.observer.news.publisher;

import behavioral.observer.news.subscriber.Subscriber;

public interface Publisher {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifySubscribers();
}
