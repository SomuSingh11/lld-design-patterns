package creational.simplefactory.notification;

public class Main {
    public static void main(String[] args) {
        Notification email = NotificationFactory.getNotification("email");
        email.send("Welcome to our platform");

        Notification sms = NotificationFactory.getNotification("sms");
        sms.send("Your OTP is 1234");

        Notification push = NotificationFactory.getNotification("push");
        push.send("You have a new message");
    }
}
