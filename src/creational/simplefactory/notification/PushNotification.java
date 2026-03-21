package creational.simplefactory.notification;

// Concrete implementation for Push notifications
public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending PUSH notification: " + message);
    }
}