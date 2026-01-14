package org.hklearning.creational.factorymethod;

public class EmailNotificationCreator extends NotificationCreator{
    @Override
    public Notification getNotificationCreator() {
        return new EmailNotification();
    }
}
