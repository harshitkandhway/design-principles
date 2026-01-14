package org.hklearning.creational.factorymethod;

public class PushNotificationCreator extends NotificationCreator{
    @Override
    public Notification getNotificationCreator() {
        return new PushNotification();
    }
}
