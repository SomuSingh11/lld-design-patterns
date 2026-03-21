package creational.simplefactory.notification;

// Concrete implementation for Email
public class EmailNotification implements Notification{

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
