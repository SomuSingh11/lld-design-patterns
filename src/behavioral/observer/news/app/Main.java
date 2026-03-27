package behavioral.observer.news.app;

import behavioral.observer.news.publisher.NewsPublisher;
import behavioral.observer.news.subscriber.EmailSubscriber;
import behavioral.observer.news.subscriber.MobileAppSubscriber;
import behavioral.observer.news.subscriber.Subscriber;

public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        Subscriber user1 = new MobileAppSubscriber("k4ge");
        Subscriber user2 = new EmailSubscriber("k4ge@gmail.com");

        publisher.subscribe(user1);
        publisher.subscribe(user2);

        publisher.publishNews("Observer Pattern Explained");
        publisher.publishNews("Update: Java LLD Mastery");

        publisher.unsubscribe(user1);

        publisher.publishNews("Only email users get the message");
    }
}
