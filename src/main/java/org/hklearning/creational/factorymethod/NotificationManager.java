package org.hklearning.creational.factorymethod;

public class NotificationManager {
    public static void main(String[] args) {
        notifier(new EmailNotificationCreator());
        notifier(new SMSNotificationCreator());
        notifier(new PushNotificationCreator());

    }
    private static void notifier(NotificationCreator creator){
        creator.getNotification();
    }
}
